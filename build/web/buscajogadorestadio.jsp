<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Busca de Jogador e Estádio</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>

        <link rel="stylesheet" type="text/css" href="css/estilojogadorestadio.css">
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
                        <li><a href="buscajogadorestadio.html">Busca Jogadores e Estadios</a></li>
                    </ul>
                </li>
                <li><a href="ajuda.html">Ajuda</a></li>
                <li><a href="sobre.html">Sobre</a></li>
                <li><a href="contato.html">Contato</a></li>
            </ul>
        </div>
        <form>
            <div class="Nome">
                <div class="input-group">
                    <span class="input-group-addon">Nome</span>
                    <input type="text" class="form-control" placeholder="Entre com o nome do jogador">
                </div>
            </div>


            <div class="Sobrenome">
                <div class="input-group">
                    <span class="input-group-addon">Sobrenome</span>
                    <input type="text" class="form-control" placeholder="Entre com o sobrenome do jogador">
                </div>
            </div>

            <div class="Apelido">
                <div class="input-group">
                    <span class="input-group-addon">Apelido</span>
                    <input type="text" class="form-control" placeholder="Entre com o apelido do jogador">
                </div>
            </div>

            <div class="Estadio">
                <div class="input-group">
                    <span class="input-group-addon">Estádio</span>
                    <input type="text" class="form-control" placeholder="Entre com o nome do estadio">
                </div>
            </div>
            <div class="busca">
                <button type="submit" class="btn btn-default">Buscar</button>
                <button class="btn btn-default" type="reset">Reset</button>
            </div>
        </form>

    </body>
</html>