
import java.util.Scanner;

//Java Class
public class HolaMundo {
    public static void main(String args[]){
        System.out.println("Hola Mundo de Java");
        
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        //Inferencia de tipos con la palabra var
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVaruableCadena2 = "String Var";
        System.out.println(miVaruableCadena2);
        
        //Formas de Definir una variable en Java 
        var miVariable = 1;
        var _miVaruable = 2;
        var $miVariable = 3;
        var ámiVariable = 4; //No es recomendable usar acentos.
        var miVariable2 = 5;
        
        //Concatenación
        var usuario = "Pablo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j);
        System.out.println(i + j + usuario);
        System.out.println(usuario + i + j);
        System.out.println(usuario + (i + j));
        
        System.out.println("\n");
        
        //Caracteres especiales
        var nombre = "Paola";
        
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
        
        //Introducir datos por teclado con la clase scanner
        
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner (System.in);
        
        var nombreIngresado = consola.nextLine();
        System.out.println("nombreIngresado = " + nombreIngresado);
        System.out.println("Ingrese el titulo: ");
        var tituloIngresado = consola.nextLine();
        System.out.println("Resultado: " + tituloIngresado + " " + nombreIngresado);
    }
}
