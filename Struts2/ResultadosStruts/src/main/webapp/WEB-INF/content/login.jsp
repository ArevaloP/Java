<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="form.titulo" /></title>
    </head>
    <body>
        <h1> <s:text name="form.titulo" /> </h1>
        
        <s:form action="validarUsuario">
            <s:textfield key="form.user" name="usuario"/>
            <s:password key="form.password" name="password"/>
            <s:submit key="form.buttom" name="submit"/>
        </s:form>
        
    </body>
</html>
