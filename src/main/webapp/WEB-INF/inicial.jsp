
<%

    // int participanteCod = (Integer) request.getAttribute("participantecod");

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicial</title>
        <%@include file ="jspf/cabecalho.jspf"%>
    </head>

    <body style="background-color:green;">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <ul class="nav navbar-nav">
                </ul>
            </div>
        </nav>
        <div class="container text-center">
            <div class="container-fluid">
                <h1 style="color:white">Módulo de Gestão de notas</h1>
                <h3 style="color:gray">Disciplina de Teste de Software</h3>
            </div>
        </div>
          <div class="container text-center">
            <div class="container-fluid">
                    <i class="fa fa-edit" style="font-size:105px;color: white"></i>  
            </div>
                          <div class="container-fluid">

                 <a href="notas.html" class="btn btn-danger btn-lg"> Ver notas </a>
              
            </div>
        </div>
        <footer style="color: #c1c1c3; text-align: center;"  class="footer navbar-fixed-bottom">
            <p> © 2018 Copyright:Cássio Reis</p>
        </footer>
    </body>
</html>