
package palabrathis;


public class PalabraThis {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre = " + persona.nombre);
        System.out.println("persona apellido = " + persona.apellido);
        
    }
}

class Persona{
    
    String nombre, apellido;
    
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        
        System.out.println("Objeto persona desde le constructor = " + this);
        
        new Imprimir().imprimir(this);
    } 
}

class Imprimir {
    
    public void imprimir (Persona persona){
        System.out.println("Objeto persona desde la clase imprimir = " +  persona);
        System.out.println("Objeto imprimir desde la misma clase " + this);
    }
    
}
