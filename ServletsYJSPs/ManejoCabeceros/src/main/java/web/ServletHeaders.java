package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")
public class ServletHeaders extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        String methodHttp = request.getMethod();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Respuesta Cabeceros</title>");
        out.print("</head>");
        
        out.print("<body>");
        out.print("<h1>Headers HTTP</h1>");
        out.print("<br>");
        out.print("Metodo: "+methodHttp);
        
        out.print("<br>");
        out.print("URI: "+request.getRequestURI());
        
        //Imripmir todos los cabeceros
        out.print("<br>");
        out.print("<br>");
        Enumeration cabecerosNombres = request.getHeaderNames();
        
        while(cabecerosNombres.hasMoreElements()){
            String cabeceroNombre = (String) cabecerosNombres.nextElement();
            out.print("<b>"+cabeceroNombre+":</b> ");
            out.print(request.getHeader(cabeceroNombre));
            out.print("<br>");
        }
        out.print("</body>");
        
        out.print("</html>");
        
    }
    
}
