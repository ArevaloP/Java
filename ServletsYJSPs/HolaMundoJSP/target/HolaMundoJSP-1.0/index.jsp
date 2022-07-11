<%-- 
    Document   : index
    Created on : 26/04/2022, 01:24:15 PM
    Author     : Georffrey
--%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hola Mundo JSPs</title>
    </head>
    <body>
        <h1>Hola Mundo JSPs</h1>
        
        <ul>
            <li> <% out.print("Hola Mundo Con Scriplets."); %> </li>
            <li>${"Hola Mundo Con Expression Language (EL)."}</li>
            <li> <%= "Hola Mundo Con Expresiones." %> </li>
            <li> <c:out value="Hola Mundo Con JSTL."/> </li>
        </ul>

    </body>
</html>
