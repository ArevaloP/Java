
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Leer Los Valores Del JavaBeans</title>
    </head>
    <body>
        <h1>Leer Los Valores Del Rectangulo</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        <br/>
        Valor de la Base: <jsp:getProperty name="rectangulo" property="base" />
        <br/>
        Valor de la Altura: <jsp:getProperty name="rectangulo" property="altura" />
        <br/>
        Valor del Área: <jsp:getProperty name="rectangulo" property="area" />
        <br/>
        
        
        <a href="index.jsp">Regresar al inicio.</a>
    </body>
</html>
