<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Modificar Alumno</title>
    </head>
    <body>
        <h1>Modificar Alumno</h1>
        
        <form name="form1" action="${pageContext.request.contextPath}/ServletModificar" method="POST">
            
            <input type="hidden" name="idAlumno" value="${alumno.idAlumno}"/>
            
            Informacion Personal:
            <br/>
            Nombre: <input type="text" name="nombre" value="${alumno.nombre}"/>
            <br/>
            Apellido: <input type="text" name="apellido" value="${alumno.apellido}"/>
            <br/>
            <br/>
            
            Informacion de Domicilio:
            <br/>
            Calle: <input type="text" name="calle" value="${alumno.domicilio.calle}"/>
            <br/>
            Numero de la Calle: <input type="text" name="numeroCalle" value="${alumno.domicilio.numeroCalle}"/>
            <br/>
            País: <input type="text" name="pais" value="${alumno.domicilio.pais}"/>
            <br/>
            <br/>
            
            Información de Contacto
            <br/>
            Email: <input type="email" name="email" value="${alumno.contacto.email}"/>
            <br/>
            Teléfono: <input type="tel" name="telefono" value="${alumno.contacto.telefono}"/>
            
            <br/>
            <input type="submit" name="modificar" value="Guardar"/>
            |
            <input type="submit" name="eliminar" value="Eliminar"/>
            
        </form>
        
    </body>
</html>
