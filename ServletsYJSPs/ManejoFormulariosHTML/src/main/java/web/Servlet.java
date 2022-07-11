package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentarios = request.getParameter("comentarios");
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Resultados Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Resultados de los datos enviados: </h1>");
        
        out.print("<table border='1'>");
        out.print("<tr>");
        out.print("<td>");
        out.print("Usuario");
        out.print("</td>");
        out.print("<td>");
        out.print(usuario);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>Password</td><td>"+password+"</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Tecnologías");
        out.print("</td>");
        out.print("<td>");
        
        for(String tecnologia: tecnologias){
            out.print(tecnologia);
            out.print("/");
        }
        
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>Genero</td><td>"+genero+"</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>Ocupacion</td><td>"+ocupacion+"</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Musica");
        out.print("</td>");
        out.print("<td>");
        
        
        if(musica !=null){
        for(String music: musica){
            out.print(music);
            out.print("/");
        }
        
        }else{
            out.print("Valor no seleccionado.");
        }
        
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>Comentarios</td><td>"+comentarios+"</td>");
        out.print("</tr>");
        
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
        
    }
    
}
