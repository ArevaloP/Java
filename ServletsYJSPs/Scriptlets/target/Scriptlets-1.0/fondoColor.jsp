<!DOCTYPE html>
<%
    String fondo = request.getParameter("colorFondo");
    if(fondo == null || fondo.trim().equals("")){
        fondo = "white";
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Cambio De Color</title>
    </head>
    <body bgcolor="<%= fondo %>">
        <h1>Cambio De Color</h1>
        Color de fondo aplicado: <%= fondo %>
        <br>
        <a href="index.html">Volver al inicio.</a>
    </body>
</html>
