
package test;

import domain.Persona;


public class TestFinal {
    
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        
        //No es posible porque el atributo es marcado como final.
//        Persona.MI_CONSTANTE = 19;

        System.out.println("Constante: " + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        
        // No es posible asignar una nueva referencia de objeto, ya que se declaro persona1 como final
        //persona1 = new Persona();
        
        //Si es posible cambiar los atributos internos del objeto.
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        
        persona1.setNombre("Carlos");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        
    }
    
}
