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
                <p> Nome do professor:</p>

 
            </div>
            <div class="container">
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th> Nota dos alunos:</th>
                            <th> Acessar gráficos:  </th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                    <td><a href="nota-detalhe.html" >Física </a></td>
                    <td><a href="nota-grafico.html" ><i class="fa fa-bar-chart" size="font-size:45px"></i></a> </td>
                    </tr>
                    </tbody>
                </table>
                <br/>


            </div>

        </div>
    </body>

</html>