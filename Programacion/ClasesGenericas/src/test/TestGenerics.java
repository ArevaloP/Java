package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Double> objetoDouble = new ClaseGenerica(12.3);
        objetoDouble.obtenerClase();
        
        ClaseGenerica<Object> objetoObject = new ClaseGenerica(new Object());
        objetoObject.obtenerClase();
    }
}
