package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        //1. Procesamos los parametros
        String accion = request.getParameter("accion");
        
        //2. Creamos los objetos JavaBeans.
        Rectangulo recRequest = new Rectangulo(1,2);
        Rectangulo recSession = new Rectangulo(3,4);
        Rectangulo recApplicattion = new Rectangulo(5,6);
        
        //3. Agregamos el JavaBean a algún alcance.
            //Revisamos la accion proporcionada.
        
        if("agregaVariables".equals(accion)){
            //Alcance de request
            request.setAttribute("rectanguloRequest", recRequest);
            
            //Alcance session
            HttpSession session = request.getSession();
            session.setAttribute("rectanguloSession", recSession);
            
            //Alcance applicattion
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloApplicattion", recApplicattion);
            
            //Agregamos un mensaje.
            request.setAttribute("mensaje", "Las Variables fueron agregadas.");
            
            //4. Redireccionamos al inicio index
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        } else if("listarVariables".equals(accion)){
            //4. Redireccionamos a la vista(JSP) seleccionada
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        }else{
            //4. Redireccionamos al inicio index
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
            //response.sendRedirect("index.jsp"); Tambnien es posible redireccionar de esta forma pero no se pude compartir inforamción del servlet como las variables request o response.
            
        }
        
    }
}
