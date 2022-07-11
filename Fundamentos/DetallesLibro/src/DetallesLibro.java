
import java.util.Scanner;


public class DetallesLibro {
    
    public static void main (String args[]){
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del libro: ");
        var libro = consola.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        var autor = consola.nextLine();
        System.out.println(libro + " fue escrito por " + autor);
        
    }
    
}
