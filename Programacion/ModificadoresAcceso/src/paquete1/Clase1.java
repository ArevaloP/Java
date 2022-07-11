package paquete1;

public class Clase1 {
    
    public String atributoPublico = "Valor de atributo publico";
    protected String atributoProtected = "Valor de atributo protected";
    
    protected Clase1(String valor){
        System.out.println("Constructor protected...");
    }
    
    public Clase1(){
        System.out.println("Constructor publico...");
    }
    
    protected void metodoProtected(){
        System.out.println("Metodo protected...");
    }
    
    public void metodoPublico(){
        System.out.println("Metodo publico...");
    }
    
}
