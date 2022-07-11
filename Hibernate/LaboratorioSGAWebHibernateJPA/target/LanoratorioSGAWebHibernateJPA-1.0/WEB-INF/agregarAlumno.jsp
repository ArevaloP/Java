<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Agregar Alumno</title>
    </head>
    <body>
        <h1>Agrgar Alumno</h1>
        
        <form name="form1" action="${pageContext.request.contextPath}/ServletAgregar" method="POST">
            
            Informacion Personal:
            <br/>
            Nombre: <input type="text" name="nombre"/>
            <br/>
            Apellido: <input type="text" name="apellido"/>
            <br/>
            <br/>
            
            Informacion de Domicilio:
            <br/>
            Calle: <input type="text" name="calle"/>
            <br/>
            Numero de la Calle: <input type="text" name="numeroCalle"/>
            <br/>
            País: <input type="text" name="pais"/>
            <br/>
            <br/>
            
            Información de Contacto
            <br/>
            Email: <input type="email" name="email"/>
            <br/>
            Teléfono: <input type="tel" name="telefono"/>
            
            <br/>
            <input type="submit" name="agregar" value="Agregar"/>
            
        </form>
        
    </body>
</html>
