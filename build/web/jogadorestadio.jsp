<%@page import="br.com.CopaNews.Entidades.JogadorEstadio"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script type="text/javascript" language="javascript" src="js/jquery.dataTables.js"></script>
        <script type="text/javascript" language="javascript" src="js/jquery-DT-pagination.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('#example').dataTable({
                    "bSort": false, // Disable sorting
                    "bInfo": false,
                    "iDisplayLength": 10, //records per page
                    "sDom": "t<'row'<'col-md-6'i><'col-md-6'p>>",
                    "sPaginationType": "bootstrap"
                });
            });
        </script>
        <link rel="stylesheet" type="text/css" href="css/estilojogadorestadio.css">
        <title>Resultado</title>
    </head>
    <body>

        <div class="bs-example">
            <ul class="nav nav-pills">
                <li class="active"><a href="index.jsp">Home</a></li>                
                <li class="dropdown">
                    <a href="#" data-toggle="dropdown" class="dropdown-toggle">Buscar <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="buscajogador.html">Busca Jogador</a></li>
                        <li><a href="buscatime.html">Busca Time</a></li>
                        <li><a href="buscajogadorestadio.html">Busca Jogadores e Estádios</a></li>
                    </ul>
                </li>
                <li><a href="ajuda.html">Ajuda</a></li>
                <li><a href="sobre.html">Sobre</a></li>
                <li><a href="contato.html">Contato</a></li>
            </ul>
        </div>
        <div class=jumbotron>
            <ol class="breadcrumb">
                <li><a href="index.jsp">Home</a></li>
                <li><a href="buscajogadorestadio.html">Busca de Jogadores e Estádios</a></li>
                <li class="active">Resultado</li>
            </ol>
            
            <div class="panel panel-default">
                <div class="panel-heading container">Times</div>
                <table class="table" id="example">
                    <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Sobrenome</th>
                        <th>Apelido</th>
                        <th>Estadio</th>
                    </tr>
                    </thead>
                    <tbody>
                    <%List<JogadorEstadio> lista = (List<JogadorEstadio>) request.getAttribute("jogadorestadio");
                    for (JogadorEstadio je : lista) {%>                   
                    <tr>
                        <td><%=je.getNome()%></td>
                        <td><%=je.getSobrenome()%></td>
                        <td><%=je.getApelido()%></td>
                        <td><%=je.getEstadio()%></td>
                    </tr>
                    <%}%>
                    </tbody>
                </table>
            </div>           
        </div>
    </body>
</html>