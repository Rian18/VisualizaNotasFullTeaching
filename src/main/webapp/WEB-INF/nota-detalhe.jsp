<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Notas dos alunos</title>
        <%@include file ="jspf/cabecalho.jspf"%>
       
        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        <script type="text/javascript">
            var dados = <%=request.getAttribute("alunosJson")%>;
            google.charts.load("current", {packages: ['corechart']});
            google.charts.setOnLoadCallback(drawChart);
            function drawChart() {


                var Combined = new Array();
                Combined[0] = ['Nomes', 'Notas'];
                for (var i = 0; i < dados.length; i++) {
                    Combined[i + 1] = [dados[i].nome,21];
                }
      //second parameter is false because first row is headers, not data.
                var table = google.visualization.arrayToDataTable(Combined, false);


                var view = new google.visualization.DataView(table);
                view.setColumns([0, 1,
                    {calc: "stringify",
                        sourceColumn: 1,
                        type: "string",
                        role: "annotation"},
                    2]);

                var options = {
                    title: "Médias dos Alunos da Turma",
                    width: 600,
                    height: 400,
                    bar: {groupWidth: "95%"},
                    legend: {position: "none"},
                };
                var chart = new google.visualization.ColumnChart(document.getElementById("columnchart_values"));
                chart.draw(view, options);
            }
        </script>
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <ul class="nav navbar-nav">

                </ul>
            </div>
        </nav>
        <div class="container">
            <div class="container">
                <h1>Notas da disciplina </h1>
            </div>
            <div class="container">
                <table class="table table-hover">
                    <thead>
                        <tr class="table-primary">
                            <th><center>Aluno</center></th>
                    <th><center>Nota</center></th>
                    </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="aluno" items="${turmaAlunos}">
                            <tr>
                                <td><center>${aluno.nome}</center></td> 
                        <td><center>${aluno.nota}</center></td> 
                        </tr>
                    </c:forEach>
                    </tbody>

                </table>
                Média da Turma: ${media} <br/>
                Menor Nota: ${menor.nome} <br/>
                Maior Nota: ${maior.nome} <br/>
                Mediana da Turma: ${maior.nome} <br/>
                Desvio Padrão das Notas da Turma: ${maior.nome} <br/>
                <table class="table table-hover">
                    <thead>
                        <tr class="table-primary">
                            <th><center>Aprovados</center></th>
                    <th><center>Notas</center></th>
                    </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="aprovado" items="${aprovados}">
                            <tr>
                                <td><center>${aprovado.nome}</center></td> 
                        <td><center>${aprovado.nota}</center></td> 
                        </tr>
                    </c:forEach>
                    </tbody>

                </table>
                <br/>
                <table class="table table-hover">
                    <thead>
                        <tr class="table-primary">
                            <th><center>Reprovados</center></th>
                    <th><center>Notas</center></th>
                    </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="reprovado" items="${reprovados}">
                            <tr>
                                <td><center>${reprovado.nome}</center></td> 
                        <td><center>${reprovado.nota}</center></td> 
                        </tr>
                    </c:forEach>
                    </tbody>

                </table>


            </div>

        </div>
     <div id="columnchart_values" style="width: 900px; height: 300px;"></div>
</body>

</html>