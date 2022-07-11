
package operacionesCaja;


public class Caja {
    
    double ancho, profundo, alto;
    
    public Caja(){
        
    }
    
    public Caja (double ancho, double profundo, double alto){
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    
    public double calcularVolumen(){
        return this.alto*this.ancho*this.profundo;
    }
    
}
