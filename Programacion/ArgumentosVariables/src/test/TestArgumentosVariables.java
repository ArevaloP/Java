package test;

public class TestArgumentosVariables {
    
    public static void main(String[] args) {
        
        imprimirNumeros(1,2,3,4,5);
        imprimirNumeros(6,7,8);
        
        variosParametros("Olga", 1,4,6);
        
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    public static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero = " + numeros[i]);
        }
    }
    
}
