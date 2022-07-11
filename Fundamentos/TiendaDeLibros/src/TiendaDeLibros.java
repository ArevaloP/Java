
import java.util.Scanner;


public class TiendaDeLibros {
    
    public static void main (String args[]){
        
        Scanner consola = new Scanner(System.in);
        
        var monedaSimbolo = (char) 36;
        
        System.out.println("Ingrese el nombre del libro: ");
        String nombre = consola.nextLine();
        
        System.out.println("Ingrese el ID del libro: ");
        int idLibro = Integer.parseInt(consola.nextLine());
        
        System.out.println("Ingrese el precio del libro: ");
        double valorLibro = Double.parseDouble(consola.nextLine());
        
        System.out.println("¿El envio es gratuito?");
        boolean envioGratis = Boolean.parseBoolean(consola.nextLine());
        
        System.out.println("\n" + nombre + " #" + idLibro);
        System.out.println("\nPrecio: " + monedaSimbolo + valorLibro);
        System.out.println("\nEnvio gratuito: " + envioGratis);
        
    }

}
