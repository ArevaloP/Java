<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>Core JSTL(JSP Standart Tag Libary) </h1>
        <!-- Manipulacion de varibales -->
        <!-- Definimos la variable -->
        <c:set var="nombre" value="Eernesto" />
        <!-- Desplegamos el valor de la variable -->
        Variable nombre: <c:out value="${nombre}" />
        <br/>
        <br/>
        Variable utilizando código HTML:
        <c:out value="<h4>Hola Mundo!</h4>" escapeXml="false"/>
        <br/>
        <br/>
        <!-- Codigo condicionado, Uso de If -->
        <c:set var="bandera" value="true"/>
        <c:if test="${!bandera}">
            La bandera es verdadera.
        </c:if>
        <br/>
        <!-- Codigo condicionado, Uso de Switch -->
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    <br/>
                    La opcion seleccionada es 1
                </c:when>
                <c:when test="${param.opcion == 2}">
                    <br/>
                    La opcion seleccionada es 2
                </c:when>
                <c:otherwise>
                    <br/>
                    Opcion seleccionada desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
        <br/>
        <!-- Iteracion de un arreglo -->
        <%
            String nombres[] = {"Julian", "Arevalo", "Georffrey"};
            request.setAttribute("nombres", nombres);
        %>
        <br/>
        Lista de nombres: 
        <br/>
        <ul>
            <c:forEach var="persona" items="${nombres}">
                <li>${persona}</li>
            </c:forEach>
        </ul>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>

    </body>
</html>
