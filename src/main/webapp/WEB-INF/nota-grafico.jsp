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
      google.charts.load('current', {'packages':['bar']});
      google.charts.setOnLoadCallback(drawStuff);

      function drawStuff() {
       var data = new google.visualization.DataTable();
                data.addColumn('string', 'Alunos');
                data.addColumn('number', 'Notas');
                $.each(dados, function (i, dados)
                {
                    var nomeAluno = dados.nomeAluno;
                    var notaFinal = dados.notaFinal;
                    data.addRows([[nomeAluno, notaFinal]]);
                });

        var options = {
          title: 'Chess opening moves',
          width: 900,
          legend: { position: 'none' },
          chart: { title: 'Chess opening moves',
                   subtitle: 'popularity by percentage' },
          bars: 'horizontal', // Required for Material Bar Charts.
          axes: {
            x: {
              0: { side: 'top', label: 'Percentage'} // Top x-axis.
            }
          },
          bar: { groupWidth: "90%" }
        };

        var chart = new google.charts.Bar(document.getElementById('top_x_div'));
        chart.draw(data, options);
      };
    </script>
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <ul class="nav navbar-nav">

                </ul>
            </div>
        </nav>
   
                <h1> Análises da disciplina </h1>
           
            Teste
            
       
                 <div id="top_x_div" style="width: 900px; height: 500px;"></div>
                Teste
         

    
    </body>

</html>