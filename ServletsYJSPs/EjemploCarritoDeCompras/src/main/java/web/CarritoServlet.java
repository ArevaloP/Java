package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        //Creamos o recuperamos el objeto HttpSession
        HttpSession sesion = request.getSession();

        //Recuperamos la lista de articulos agregados si es que existen
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //Verificamos si la lista existe
        if (articulos == null) {
            //Inicializamos la lista de articulos
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        //Procesamos el valor del formulario (Nuevo articulo)
        String articuloNuevo = request.getParameter("articulo");

        //Revisamos y agregamos el articulo nuevo
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        try ( PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de articulos</h1>");
            out.print("<br/>");
            //Iteramos los artculos del carrito
            articulos.forEach(articulo -> {
                out.print("<li>" + articulo + "</li>");
            });

            //Agregamos un link para volve al inicio
            out.print("<br/>");
            out.print("<a href='/EjemploCarritoDeCompras'>Regresar al inicio.</a>");
        }

    }

}
