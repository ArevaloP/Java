package paquete2;

import paquete1.Clase1;

public class ClaseHija extends Clase1 {

    public ClaseHija(){
        super("Pedro");
        this.atributoProtected = "Atributo protected de la clase 1 modificado";
        System.out.println("Atributo protected = " + this.atributoProtected);
        this.metodoProtected();
    }
    
}
