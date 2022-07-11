package test;

import dominio.Persona;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Georffrey", 5000.00, false);
//        System.out.println("persona1 nombre = " + persona1.getNombre());

        System.out.println("persona1 = " + persona1);

        persona1.setNombre("Georffrey Arevalo");
        System.out.println("persona1 = " + persona1.toString());

//        System.out.println("persona1 nombre modificado: " + persona1.getNombre());
//        System.out.println("persona1 sueldo = " + persona1.getSueldo());
//        System.out.println("persona1 eliminado = " + persona1.isEliminado());
        //Creamos otro objeto de tipo Persona
        
        Persona persona2 = new Persona("Julian", 1500.34, false);

        persona2.setNombre("Julian Prado");
        persona2.setSueldo(2000.00);
        persona2.setEliminado(true);

        System.out.println("persona2 = " + persona2);

//        System.out.println("persona2 nombre = " + persona2.getNombre());
//        System.out.println("persona2 sueldo = " + persona2.getSueldo());
//        System.out.println("persona2 eliminado = " + persona2.isEliminado());
    }

}
