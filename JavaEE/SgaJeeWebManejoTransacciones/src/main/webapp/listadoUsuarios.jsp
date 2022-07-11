<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Usuairos</title>
    </head>
    <body>
        <h1>Listado de Usuarios</h1>
        <br/>
        <ul>
            <c:forEach items="${usaurios}" var="usuario">
                <li> ${usuario.idUsuario} ${usuario.username} ${usuario.persona.idPersona} </li>
            </c:forEach>
        </ul>

    </body>
</html>
