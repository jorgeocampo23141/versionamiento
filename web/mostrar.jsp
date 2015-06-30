<%-- 
    Document   : mostrar
    Created on : 23/06/2015, 04:18:29 PM
    Author     : Jorge Armando Londoño Ocampo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head> 
    <body>
        <h1>usuarios</h1>
        <c:forEach items="${datos}" var="dato">
            ${dato.nombre} ${dato.direcion}<br/>
            
            
        </c:forEach>
    </body>
</html>
 