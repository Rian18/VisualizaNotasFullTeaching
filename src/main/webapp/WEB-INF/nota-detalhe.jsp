<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Notas dos alunos</title>
        <%@include file ="jspf/cabecalho.jspf"%>
        <link rel="stylesheet" href="style.css" />
  <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.css">
  <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
  <script src="//cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
  <script src="//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.min.js"></script>
        
        
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
                <table class="table table table-striped" >
                <thead>
                    <tr>
                       <tr class="table-primary" style="background-color: black ;color: white ">
                            <th><center>Aluno</center></th>
                    <th><center>Nota</center></th>
                    </tr>
                </thead>
                <tbody>
                     <tr><c:forEach var="aluno" items="${turmaAlunos}">
                    
                        <td><center>${aluno.nome}</center></td> 
                        <td><center>${aluno.nota}</center></td> 
                    </tr>   
                    </c:forEach>
                    </tbody>

                </table>
                <div class="container" >
                <h3> Relatório da turma</h3>    
                
                Média da Turma: ${media} <br/>
                Menor Nota: ${menor.nome} <br/>
                Maior Nota: ${maior.nome} <br/>
                Mediana da Turma: ${mediana} <br/>
                Desvio Padrão das Notas da Turma: ${desvioPadrao} <br/>
                </div>
                <br/>
                  <div class="container" >
                 <table class="table table table-striped" >
                <thead>
                    <tr>
                       <tr class="table-primary" style="background-color: blue ;color: white ">
                            <th><center>Aprovados</center></th>
                    <th><center>Notas</center></th>
                    </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="aprovado" items="${aprovados}">
                            <tr style="background-color: #75BDED ;color: black ">
                                <td ><center>${aprovado.nome}</center></td> 
                        <td><center>${aprovado.nota}</center></td> 
                        </tr>
                    </c:forEach>
                    </tbody>

                </table>
                      
                      
                  </div>
                <hr>
                <br/>
                <table class="table table-hover">
                    <thead>
                        <tr class="table-primary" style="background-color: red ;color: black ">
                            <th><center>Reprovados</center></th>
                    <th><center>Notas</center></th>
                    </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="reprovado" items="${reprovados}">
                            <tr style="background-color: #F88181 ;color: black ">
                                <td><center>${reprovado.nome}</center></td> 
                        <td><center>${reprovado.nota}</center></td> 
                        </tr>
                    </c:forEach>
                    </tbody>

                </table>


            </div>

        </div>

                <div class="container" >                    
                   
                        <div class="panel-heading">
                        Nota x Aluno
                                </div>
                        <div class="panel-body">
                          <div id="bar-example"></div>
                        </div>
                    </div>            
                
            </div>
        </div>
    </div>

    
    
    </body>

     <script language="JavaScript" type="text/javascript">
         var dados = <%=request.getAttribute("alunosJson")%>
        Morris.Bar({
          element: 'bar-example',
          data:  dados,
          xkey: 'nome',
          ykeys: ['nota'],
          labels: ['Nota']
        });

 </script>    
</html>

