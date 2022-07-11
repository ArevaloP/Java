package co.com.gm.sga.web;

import co.com.gm.sga.domain.*;
import co.com.gm.sga.services.*;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/Personas")
public class PersonaServlet extends HttpServlet {

    @Inject
    PersonaService personaService;
    
    @Inject
    UsuarioService usuarioService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case ("personas"):
                    List<Persona> personas = personaService.listarPersonas();
                    System.out.println("personas" + personas);
                    request.setAttribute("personas", personas);
                    request.getRequestDispatcher("listadoPersonas.jsp").forward(request, response);
                    break;
                case("usuarios"):
                    
                    List<Usuario> usuarios = usuarioService.listarUsuarios();
                    System.out.println("usuarios = " + usuarios);
                    request.setAttribute("usaurios", usuarios);
                    request.getRequestDispatcher("listadoUsuarios.jsp").forward(request, response);
                    
                    break;
            }
        }else{
            response.sendRedirect("index.html");
        }

    }

}
