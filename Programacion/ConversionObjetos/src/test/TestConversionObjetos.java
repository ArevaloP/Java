package test;

import domain.*;

public class TestConversionObjetos {
    
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 1000, TipoEscritura.MODERNA);
        //System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerInformacion()); // Se tiene en cuenta el metodo de la clase hija
        
        //DownCasting
        //( (Escritor) empleado ).getTipoEscritura(); Una sintaxis
        Escritor escritor = (Escritor) empleado;
        System.out.println("escritor = " + escritor.getTipoEscritura());
        
        //UpCasting no es necesario indicar el tipo a que se va a convertir o asignar
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerInformacion());
        
        
    }
    
}
