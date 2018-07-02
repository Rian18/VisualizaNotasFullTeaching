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
                Média: ${media} <br/>
                Menor: ${menor.nome} <br/>
                Maior: ${maior.nome} <br/>
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
    </body>

</html>