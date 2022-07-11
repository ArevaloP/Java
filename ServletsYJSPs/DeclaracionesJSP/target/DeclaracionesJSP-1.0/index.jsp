<%-- Agregamos una declaracion de JSP. --%>
<%!
    //Declaramos una veriable con su método get.
    private String usuario = "Julian";
    public String getUsuario(){
        return this.usuario;
    }
    
    //Declaramos un contador de visitas.
    private int contadorVisitas = 1;
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Declaraciones JSP</title>
    </head>
    <body>
        <h1>Uso De Declaraciones Con JSP</h1>
        Valor del Usuario por medio del atributo: <%= this.usuario%>
        <br>
        Valor del Usuario por medio del método: <%= this.getUsuario() %>
        <br>
        Contador Visitas: <%= this.contadorVisitas++ %>
    </body>
</html>
