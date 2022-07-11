
import java.util.Scanner;

public class MayorDeDosNumeros {
    
    public static void main(String args[]){
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Se desea comparar dos numeros. \nIngrese el primer numero: ");
        int numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = Integer.parseInt(consola.nextLine());
        
        var mayor = (numero1 > numero2) ? numero1 : numero2;
        
        System.out.println("El mayor de los numeros es = " + mayor);
        
    }
    
}
