
import java.util.Scanner;

public class SistemaCalificaciones {
    
    public static void main(String args[]){
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Se desea realizar un sistema de calificaciones. \nIngrese un numero del uno al 10: ");
        
        double nota = Double.parseDouble(consola.nextLine());
        String notaLetra = "Nota desconocida";
        
        if( nota >= 9 && nota <= 10){
            notaLetra = "A";
        } else if ( nota >= 8 && nota < 9 ){
            notaLetra = "B";
        } else if ( nota >= 7 && nota < 8 ){
            notaLetra = "C";
        } else if ( nota >= 6 && nota < 7 ){
            notaLetra = "D";
        } else if ( nota >= 0 && nota < 6 ){
            notaLetra = "F";
        } else {
            notaLetra = "Nota ingresada no valida...";
        }
        
        System.out.println(notaLetra);
        
    }
    
}
