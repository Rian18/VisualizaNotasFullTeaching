<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th> Alunos:</th>
                            <th> Nota  </th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Aluno 01</td>
                            <td>70</td>
                        </tr>
                        <tr>
                            <td>Aluno 02 </td>
                            <td>80</td>
                        </tr>
                        <tr>
                            <td>Aluno 03</td>
                            <td>50</td>
                        </tr>
                        <tr>
                            <td>Aluno 04</td>
                            <td>40</td>
                        </tr>
                        <tr>
                            <td>Aluno 05</td>
                            <td>30</td>
                        </tr>
                    </tbody>
                </table>
                <br/>


            </div>

        </div>
    </body>

</html>