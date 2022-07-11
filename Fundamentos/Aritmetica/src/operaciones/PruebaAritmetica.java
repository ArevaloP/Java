
package operaciones;


public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
        //Variables locales
        
        int a = 10, b = 9;
        miMetodo();
        
        
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(10, 7);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);
        
        
        
//        aritmetica1.a = 2;
//        aritmetica1.b = 3;
//        aritmetica1.sumar();
//        
//        int rPrueba = aritmetica1.sumarConRetorno();
//        System.out.println("rPrueba = " + rPrueba);
//        
//        rPrueba = aritmetica1.sumarConArgumentos(4, 20);
//        System.out.println("Suma de argumentos = " + rPrueba);
    }
    
    public static void miMetodo(){
        System.out.println("Metodo ejecutado...");
    }
    
}
