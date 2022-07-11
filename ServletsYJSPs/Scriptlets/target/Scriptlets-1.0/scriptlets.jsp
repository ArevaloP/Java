<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scriptlets</title>
    </head>
    <body>
        <h1>Scriptles</h1>
        <%-- Scriptlets para enviar información al navegador --%>
        <% 
            out.print("Saludos desde un Scriptlets.");
        %>
        <br>
        <%-- Scriptlets para manipular los objetos implicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("Nombre de la aplicacion: " + nombreAplicacion);
        %>
        <br>
        <%-- Scriptlets con codigo condicionado --%>
        <%
            if(session != null && session.isNew()){
        %>
        La Sesion SI Es Nueva
        <%
            }else if(session != null){
        %>
        La Sesion NO Es Nueva
        <% 
            }
        %>
        <br>
        <a href="index.html">Volver al inicio.</a>
    </body>
</html>
