
package test;

import operaciones.Operaciones;


public class OperacionesPrueba {
    
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(10, 13);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(13.4, 2.5);
        System.out.println("resultado2 = " + resultado2);
    }
    
}
