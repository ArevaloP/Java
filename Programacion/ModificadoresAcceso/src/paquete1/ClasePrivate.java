package paquete1;

public class ClasePrivate {
    
    private String atributoPrivado = "Valor de atributo privado.";
    
    private ClasePrivate(){
        System.out.println("Constructor privado...");
    }
    
    public ClasePrivate(String atributo){
        this();
        System.out.println("Constructor publico...");
    }
    
    private void metodoPrivado(){
        System.out.println("Metodo privado...");
    }
    
    public String getAtributoPrivado(){
        return this.atributoPrivado;
    }
    
    public void setAtributoPrivado(String atributoPrivado){
        this.atributoPrivado = atributoPrivado;
    }
    
}
