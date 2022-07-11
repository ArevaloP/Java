package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        //Se declara una variable contador
        int contador = 0;
        
        //Obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();
        
        //Iteramos el arreglo para econtrar la cookie de contador 
        if(cookies != null){
            for(Cookie c: cookies){
                if(c.getName().equals("contadorVisitas")){
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }
        
        //Incrementamos el contador en 1
        contador++;
        
        //Creamos la cookie 
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));
        
        
        //La cookie solo se mantiene por una hora
        c.setMaxAge(3600);
        
        //Se añade la Cookie
        response.addCookie(c);
        
        //Mandamos la respuesta la navegador
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.print("Contador de visitas del cliente: " + contador);
    }
    
}
