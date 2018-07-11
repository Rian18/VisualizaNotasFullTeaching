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
            var dados = <%=request.getAttribute("colaboradoresJson")%>;
            google.charts.load("current", {packages: ["corechart"]});
            google.charts.setOnLoadCallback(drawChart);
            function drawChart() {

                var data = new google.visualization.DataTable();
                data.addColumn('string', 'Contribuidores');
                data.addColumn('number', 'Commits');
                foreach(dados, function (i, dados)
                {
                    var nome = dados.nome;
                    var nota = dados.nota;
                    data.addRows([[nome, nota]]);
                });
                var options = {
                    title: 'Commits por Contribuidor',
                    is3D: true,
                };
                var chart = new google.visualization.PieChart(document.getElementById('piechart'));
                chart.draw(data, options);
            }
            ;
        </script>
        
        <script type="text/javascript">
    google.charts.load("current", {packages:['corechart']});
    google.charts.setOnLoadCallback(drawChart);
    function drawChart() {
      var data = google.visualization.arrayToDataTable([
        ["Element", "Density", { role: "style" } ],
        ["Copper", 8.94, "#b87333"],
        ["Silver", 10.49, "silver"],
        ["Gold", 19.30, "gold"],
        ["Platinum", 21.45, "color: #e5e4e2"]
      ]);

      var view = new google.visualization.DataView(data);
      view.setColumns([0, 1,
                       { calc: "stringify",
                         sourceColumn: 1,
                         type: "string",
                         role: "annotation" },
                       2]);

      var options = {
        title: "Médias dos Alunos da Turma",
        width: 600,
        height: 400,
        bar: {groupWidth: "95%"},
        legend: { position: "none" },
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

        <h1> Análises da disciplina </h1>

        Teste


        <!-- Identify where the chart should be drawn. -->
       <div id="piechart" style="width: 500px; height:300px;"></div>
        Teste



    </body>

</html>