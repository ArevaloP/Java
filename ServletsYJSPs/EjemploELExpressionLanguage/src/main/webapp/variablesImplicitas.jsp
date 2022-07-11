
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL Y Variables Implicitas</title>
    </head>
    <body>
        <h1>EL Y Variables Implicitas<</h1>
        <br/>
        <ul>
            <li>Nombre de la aplicación: ${pageContext.request.contextPath}</li>
            <li>Navegador del Cliente: ${header["User-Agent"]}</li>
            <li>ID Session: ${cookie.JSESSIONID.value}</li>
            <li>Web Server: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor paraetro: ${param.usuario}</li>
        </ul>
        <br/>
        <a href="index.jsp">Volver al inicio.</a>

    </body>
</html>
