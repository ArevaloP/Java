
package test;

import domain.Persona;

public class PruebaPersona {
    
    private int contador;
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona ("Pedro");
        
        Persona persona2 = new Persona ("Maria");
        
        imprimir(persona1);
        imprimir(persona2);  
                
    }
    
    public static void imprimir (Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Juan"));
        return this.contador;
    }
    
}
