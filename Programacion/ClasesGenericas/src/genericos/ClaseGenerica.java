package genericos;

public class ClaseGenerica<T> {
    
    private T objeto;
    
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerClase(){
        System.out.println("La T es de tipo: " + this.objeto.getClass().getSimpleName());
    }
    
}
