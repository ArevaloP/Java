
public class Ciclos {
    
    public static void main (String args[]){
        
        System.out.println("==== For ====");
        for ( int contador = 0 ; contador < 3 ; contador++ ){
            System.out.println("contador = " + contador);
        }
        
        System.out.println("\n==== Break y Continue ====");
        
        for ( int contador = 0 ; contador < 3 ; contador++ ){
            if ( contador % 2 == 0 ){
                System.out.println("contador = " + contador);
                break; // Rompe el ciclo
            }
        }
        
        for ( int contador = 0 ; contador < 3 ; contador++ ){
            if ( contador % 2 != 0){
                continue;//Pasa a la siguinete iteracion, omitiendo la siguintes lineas del ciclo.
            }
            System.out.println("contador = " + contador);
        }
        
        System.out.println("\n==== Etiquetas ====");
        inicio:
        for ( int contador = 0 ; contador < 3 ; contador++ ){
            if ( contador % 2 != 0 ){
                continue inicio;
            }
            System.out.println("contador = " + contador);
            break inicio;
        }
        
        
        
        
        
        
        System.out.println("\n==== While ====");
        
        int contador = 0;
        while (contador < 3){
            System.out.println("contador = " + contador);
            contador++;
        }
        
        System.out.println("\n==== Do While ====");
        contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 3);
    }
    
}
