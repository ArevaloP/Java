package test;

import domain.*;

public class TestClaseObject {
    
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Julian", 2000);
        
        Empleado empleado2 = new Empleado("Julian", 2000);
        
        if (empleado1 == empleado2){
            System.out.println("Tienen la misma referencia de memoria");
        } else {
            System.out.println("Tienen diferente referencia de memoria");
        }
        
        if (empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los objetos son diferentes en contenido");
        }
        
        if ( empleado1.hashCode() == empleado2.hashCode() ){
            System.out.println("Los objetos son iguales con su hashCode");
        } else {
            System.out.println("Los objetos son diferentes en hashCode");
        }
        
    }
    
}
