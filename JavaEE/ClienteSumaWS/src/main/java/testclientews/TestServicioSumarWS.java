package testclientews;

import clientews.servicio.*;

public class TestServicioSumarWS {
    
    public static void main(String[] args) {
        ServicioSumarWS servicioSumar = new ServicioSumerImplService().getServicioSumerImplPort();
        System.out.println("Ejecutando Servicio Sumar WS...");
        int a = 6; 
        int b = 3;
        int resultado = servicioSumar.sumar(a, b);
        System.out.println("Resultado de la suma: " + resultado);
        System.out.println("Fin de Servicio Sumar WS");
    }
    
}
