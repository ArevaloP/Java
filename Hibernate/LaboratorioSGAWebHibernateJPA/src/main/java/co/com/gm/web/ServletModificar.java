package co.com.gm.web;

import co.com.gm.domain.Alumno;
import co.com.gm.domain.Contacto;
import co.com.gm.domain.Domicilio;
import co.com.gm.servicio.ServicioAlumno;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idAlumnoS = request.getParameter("idAlumno");
        Integer idAlumno = Integer.parseInt(idAlumnoS);

        Alumno alumno = new Alumno(idAlumno);

        ServicioAlumno servicioAlumno = new ServicioAlumno();

        alumno = servicioAlumno.encontarAlumno(alumno);

        HttpSession session = request.getSession();
        session.setAttribute("alumno", alumno);
        request.getRequestDispatcher("/WEB-INF/modificarAlumno.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        HttpSession session = request.getSession();
        
        String modificar = request.getParameter("modificar");
        
        if (modificar != null) {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String calle = request.getParameter("calle");
            String numeroCalle = request.getParameter("numeroCalle");
            String pais = request.getParameter("pais");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");

            Alumno alumno = (Alumno) session.getAttribute("alumno");

            alumno.setNombre(nombre);
            alumno.setApellido(apellido);
            alumno.getDomicilio().setCalle(calle);
            alumno.getDomicilio().setNumeroCalle(numeroCalle);
            alumno.getDomicilio().setPais(pais);
            alumno.getContacto().setEmail(email);
            alumno.getContacto().setTelefono(telefono);

            
            servicioAlumno.guardarAlumno(alumno);
            
        }else{
            //Caso de eliminar
            String idAlumnoS = request.getParameter("idAlumno");
            Integer idAlumno = Integer.parseInt(idAlumnoS);
            Alumno alumno = new Alumno(idAlumno);
            servicioAlumno.eliminarAlumno(alumno);
        }

        session.removeAttribute("alumno");
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

}
