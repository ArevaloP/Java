package test;

public class TestAutoboxingUnboxing {
    
    public static void main(String[] args) {
        //Clases envolventes de tipos primitivos
        /*
            int - Integer
            long - Long
            byte - Byte
            short - Short
            float - Float
            double - Double
            char - Character
            boolean - Boolean
        */
        
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero double = " + entero.doubleValue());
        
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
        
        Double flotante = 2.5;
        System.out.println("flotante = " + flotante);
        System.out.println("flotante en cadena de caracteres = " + flotante.toString());
        
        double flotante2 = flotante;
        System.out.println("flotante2 = " + flotante2);
        flotante2 = entero;
        System.out.println("flotante2 = " + flotante2);
    }
    
}
