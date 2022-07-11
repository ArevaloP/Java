
package operaciones;

public class Aritmetica {
    
    
    //Atributos
    int a, b;
    
    //Constructor
    public Aritmetica(){
        System.out.println("Constructor iniciado...");
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Constructor con argumentos...");
    }
    
    //Metodos
    public void sumar(){
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }
    
    
}
