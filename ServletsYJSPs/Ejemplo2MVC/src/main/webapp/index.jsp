<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo MVC 2</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Ejemplo MVC 2</h1>
        <br/>
        
        <div style="color: red">
            ${mensaje}
        </div>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador">
            Link al Servlet Controlador SIN Parametros.
        </a>
        <br/><br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregaVariables">
            Link al Servlet Controlador para agregar las variables.
        </a>
        <br/><br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">
            Link al Servlet Controlador para listar variables.
        </a>
    </body>
</html>