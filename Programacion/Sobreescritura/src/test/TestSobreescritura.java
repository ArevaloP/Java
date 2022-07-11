package test;

import domain.*;

public class TestSobreescritura {

    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Pedro", 2000);
        imprimir(empleado);
        
        Gerente gerente1 = new Gerente("Juan", 3000, "Sistemas");
        imprimir(gerente1);
        
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerInformacion());
    }
    
}
