<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar JavaBeans Rectangulo</title>
    </head>
    <body>
        <h1>Agregar Valores Al Rectuangulo</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        <%-- Modificamos Los Atributos del JavaBeans Rectangulo --%>
        <br/>
        <br/>
        <% 
            int baseValor = 5;
            int alturaValor = 10;
        %>
        
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>"/>
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>"/>
        Nuevo Valor de Base: <%=baseValor%>
        <br/>
        Nuevo Valor de Altura: <%=alturaValor%>
        
        <br/>
        <a href="index.jsp">Regresar al inicio.</a>
    </body>
</html>
