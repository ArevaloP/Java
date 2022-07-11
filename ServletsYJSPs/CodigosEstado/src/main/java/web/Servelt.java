package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servelt extends HttpServlet{
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        String usuarioOk = "gjap";
        String passwordOk = "1008";
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        
        if(usuarioOk.equals(usuario) && passwordOk.equals(password)){
            out.print("<h1>");
            out.print("Datos correctos");
            out.print("<br/>");
            out.print("Usuario: "+usuario);
            out.print("<br/>");
            out.print("Password: "+password);
            out.print("</html>");
        }else{
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales no son correctas");
        }
        
        out.close();
        
    }
    
}
