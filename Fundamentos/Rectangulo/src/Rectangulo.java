
import java.util.Scanner;


public class Rectangulo {
    
    public static void main (String args[]){
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Se desea calcular el area y el perimetro de un reactangulo. \n Ingrese la base del rectangulo: ");
        int base = Integer.parseInt(consola.nextLine());
        
        System.out.println("Ingrese la altura del rectangulo: ");
        int altura = Integer.parseInt(consola.nextLine());
        
        var area = base * altura;
        System.out.println("area = " + area);
        
        var perimetro = 2 * base + 2 * altura;
        System.out.println("perimetro = " + perimetro);
    }
    
}
