package test;

import domain.Persona;

public class TestForEach {
    
    public static void main(String[] args) {
        int edades [] = {2, 4, 10, 31};
        
        for (int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Georffrey"), new Persona("Julian"), new Persona("Pedro")};
        
        for (Persona persona: personas){
            System.out.println("persona = " + persona);
        }
        
    }
    
}
