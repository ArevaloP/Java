
import java.util.Scanner;


public class TiposPrimitivos {
    
    public static void main(String args[]){
        //Tipos primitivos enteros: byte, short, int, long
        
        System.out.println("\n==== Enteros Byte ====");
        System.out.println("Valor minimo de byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte: " + Byte.MAX_VALUE);
        byte numeroByte = -100;
        System.out.println("Valor byte: " + numeroByte);
        
        System.out.println("\n==== Enteros Short ====");
        System.out.println("Valor minimo de short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de short: " + Short.MAX_VALUE);
        short numeroShort = (short)32768;
        System.out.println("Valor de short: " + numeroShort);
        
        System.out.println("\n==== Enteros Int ====");
        System.out.println("valor minimo de int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de int: " + Integer.MAX_VALUE);
        int numeroInt = (int)2147483648L;
        System.out.println("Valor de int: " + numeroInt);
        
        System.out.println("\n==== Enteros Long ====");
        System.out.println("Valor minimo de long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de long: " + Long.MAX_VALUE);
        long numeroLong = (long)9223372036854775808F;
        System.out.println("Valor de long: " + numeroLong);
        
        //Tipos primitivos flotantes: float y double
        
        System.out.println("\n==== Flotantes Float ====");
        System.out.println("Valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo de float: " + Float.MAX_VALUE);
        float numeroFloat = (float)101.9;
        System.out.println("Valor de float: " + numeroFloat);
        
        System.out.println("\n==== Flotantes Double ====");
        System.out.println("Valor minimo de double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo de double: " + Double.MAX_VALUE);
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("Valor de double: " + numeroDouble);
        
        System.out.println("\n==== Inferencia de tipos primitivos y tipo var ====");
        
        var numeroEntero3 = 10;
        System.out.println("numeroEntero = " + numeroEntero3);
        
        var numeroDouble3 = 10.0;
        System.out.println("numeroDouble3 = " + numeroDouble3);
        
        var numeroFloat3 = 10.0F;
        System.out.println("numeroFloat3 = " + numeroFloat3);
        
        
        System.out.println("\n==== Tipos Char ====");
        
        char miCaracter = 'q';
        System.out.println("miCaracter = " + miCaracter);
        
        char charSimbolo = '#';
        System.out.println("charSimbolo = " + charSimbolo);
        
        char charDecimal = 35;
        System.out.println("charDecimal = " + charDecimal);
        
        char charUnicode = '\u0023';
        System.out.println("charUnicode = " + charUnicode);
        
        System.out.println("\n==== Char con Var ====");
        var charDecimal2 = (char) 35;
        System.out.println("charDecimal2 = " + charDecimal2);
        
        var charSimbolo2 = '#';
        System.out.println("charSimbolo2 = " + charSimbolo2);
        
        var charUnicode2 = '\u0023';
        System.out.println("charUnicode2 = " + charUnicode2);
        
        System.out.println("\n==== Inferencia de Char con Int ====");
        int variableChar = '#';
        System.out.println("variableChar = " + variableChar);
        
        int variableChar2 = 'a';
        System.out.println("variableChar2 = " + variableChar2);
        
        int variableChar3 = 'A';
        System.out.println("variableChar3 = " + variableChar3);
        
        System.out.println("\n==== Boolean ====");
        boolean variableBoolean = true;
        System.out.println("variableBoolean = " + variableBoolean);
        
        boolean variableBooleanExpresion = 23 > 56;
        System.out.println("variableBooleanExpresion = " + variableBooleanExpresion);
        
        var varBolean = false;
        System.out.println("varBolean = " + varBolean);
        
        var varBooleanExpresion = 43<123;
        System.out.println("varBooleanExpresion = " + varBooleanExpresion);
        
        System.out.println("\n==== Conversion de tipos primitivos ====");
        
        //Convertir de String a int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        
        //Convertir de String a double
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        //Pedir un valor de consola y convertirlo a int
        var consola = new Scanner(System.in);
        System.out.println("Ingrese su edad por favor: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
        
        //Convertir de int a String
        var edadString = String.valueOf(10);
        System.out.println("edadString = " + edadString);
        
        //Extraer un caracter de un String
        var caracter = "Georffrey".charAt(2);
        System.out.println("caracter = " + caracter);
        
        //Pedir por consola un caracter, si se introduce una cadena se extrae el primer caracter
        System.out.println("Ingrese un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
    }
    
    
}
