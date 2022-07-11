package test;

import paquete1.*;
import paquete2.*;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
        System.out.println("");
        ClaseHija claseHija = new ClaseHija();
        
        System.out.println("");
        ClasePrueba claseprueba = new ClasePrueba();
        claseprueba.metodoPruba();
        
    }
}
