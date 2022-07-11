package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/SessionsServlet")
public class SessionsServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession sesion = request.getSession();
        
        String titulo = null;
        
        //Pedimos el atributo contadorVisitas a la seison
        
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        
        //Preguntamos si el contador es uno, si así es, es la primera vz que vistas nuestro sitio Web
        if(contadorVisitas == null){
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez a nuestro sitio web";
        }else{
            contadorVisitas++;
            titulo = "Bienvenido nuevamente";
        }
        
        //Agregamos el nuevo valor de contadorVisitas a la seison
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        
        //mandamos la respuesta al cliente
        PrintWriter out = response.getWriter();
        out.print("Cntidad de veces de acceso al recurso: " + contadorVisitas);
        out.print("<br/>");
        out.print("ID sesion: " + sesion.getId());
        out.print("<br/>");
        out.print("Mensaje: " + titulo);
        out.close();
    }
    
}
