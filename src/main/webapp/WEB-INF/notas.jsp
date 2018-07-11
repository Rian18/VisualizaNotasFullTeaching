<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Notas dos alunos</title>
        <%@include file ="jspf/cabecalho.jspf"%>
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
                <h1>Notas das disciplinas </h1>
                <p> Nome do professor:</p>

 
            </div>
            <div class="container">
                <table class="table table-bordered">
                    <thead>
                    <tr class="table-primary">
                    <th><center>Disciplinas</center></th>
                    <th><center>Acessar Gráficos</center></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="turma" items="${turmaAlunos}">
                        <tr>
                        <td><center><a href="nota-detalhe.html?nome=${turma.disciplina}" >${turma.disciplina}</a></center></td> 
                        <td><center><a href="nota-grafico.html?nome=${turma.disciplina}" ><i class="fa fa-bar-chart" size="font-size:45px"></i></a></center></td> 
                       </tr>
                    </c:forEach>
                    </tbody>

                </table>
               
                <br/>


            </div>

        </div>
    </body>

</html>