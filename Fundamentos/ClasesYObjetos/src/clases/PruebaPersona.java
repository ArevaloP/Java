
package clases;


public class PruebaPersona {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        persona1.nombre = "Georffrey";
        persona1.apellido = "Arevalo";
        persona1.desplegarInformacion();
        
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();
        
    }
    
}
