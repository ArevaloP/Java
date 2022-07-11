package co.com.gm.sga.web;

import co.com.gm.sga.domain.Persona;
import co.com.gm.sga.services.*;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/Personas")
public class PersonaServlet extends HttpServlet{
    
    @Inject
    PersonaService personaService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Persona> personas = personaService.listarPersonas();
        
        System.out.println("personas" + personas);
        
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("listadoPersonas.jsp").forward(request, response);
    }
    
}
