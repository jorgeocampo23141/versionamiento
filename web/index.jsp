<%-- 
    Document   : index
    Created on : 23/06/2015, 02:30:44 PM
    Author     : Jorge Armando Londoño Ocampo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ejemplo</title>
    </head>
    <body>
        <h1>datos</h1>
        
        <form action="guardar" method="POST">
            nombre:<input type="text" name="nombre"><br/>
            direcion:<input type="text" name="direcion"><br/>
            <input type="submit" value="guardar">
            <a href="mostrardatos">mostrar </a>
            
            
        </form>
    </body>
</html>
