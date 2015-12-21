<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Busca de Jogador</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="script.js"></script>
        <link rel="stylesheet" type="text/css" href="css/estilojogador.css">
    </head>
    <body>
        <div class="bs-example">
            <ul class="nav nav-pills">
                <li class="active"><a href="index.jsp">Home</a></li>              
                <li class="dropdown">
                    <a href="#" data-toggle="dropdown" class="dropdown-toggle">Buscar <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="buscajogador.jsp">Busca Jogador</a></li>
                        <li><a href="buscatime.html">Busca Time</a></li>
                        <li><a href="buscajogadorestadio.html">Busca Jogadores e Estadios</a></li>
                    </ul>
                </li>
                <li><a href="ajuda.html">Ajuda</a></li>
                <li><a href="Sobre.html">Sobre</a></li>
                <li><a href="Contato.html">Contato</a></li>
            </ul>
        </div>
        <form action="/JogadorController" method="post">
            <div class="Nome">
                <div class="input-group">
                    <span class="input-group-addon">Nome</span>
                    <input type="text" name="nome" value="null" class="form-control" placeholder="Entre com o nome do jogador">
                </div>
            </div>

            <div class="Sobrenome">
                <div class="input-group">
                    <span class="input-group-addon">Sobrenome</span>
                    <input type="text" name="sobrenome" value="null" class="form-control" placeholder="Entre com o sobrenome do jogador">
                </div>
            </div>

            <div class="Apelido">
                <div class="input-group">
                    <span class="input-group-addon">Apelido</span>
                    <input type="text" name="apelido" value="null" class="form-control" placeholder="Entre com o apelido do jogador">
                </div>
            </div>
            <div class="busca">
                <input type="submit" class="btn btn-default">Buscar/>
                <input class="btn btn-default" type="reset">Reset/>
            </div>
        </form>

    </body>
</html>
