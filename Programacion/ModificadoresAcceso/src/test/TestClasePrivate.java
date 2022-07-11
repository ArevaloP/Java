package test;

import paquete1.ClasePrivate;

public class TestClasePrivate {
    public static void main(String[] args) {
        ClasePrivate clase1 = new ClasePrivate("Atributo");
        clase1.setAtributoPrivado("Cambio de atributo desde el metodo set");
        System.out.println("Valor de atributo privado = " + clase1.getAtributoPrivado());
    }
}
