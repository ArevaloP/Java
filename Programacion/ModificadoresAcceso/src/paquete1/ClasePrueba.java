package paquete1;

public class ClasePrueba {
    
    private Clase1 clase1;
    
    public ClasePrueba(){
        this.clase1 = new Clase1("Pedro");
        this.clase1.metodoProtected();
    }
    
    
    public void metodoPruba(){
        this.clase1.atributoProtected = "Valor modificado en clase de mismo paquete";
        System.out.println("Atributo protected de la clase1 = " + this.clase1.atributoProtected);
    }
    
    
}
