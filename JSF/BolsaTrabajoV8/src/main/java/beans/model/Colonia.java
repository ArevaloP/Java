package beans.model;

public class Colonia {
    
    private int coloniaId;
    private String nombre;
    private int codigoPostal;
    
    public Colonia(){
        
    }
    
    public Colonia(int coloniaId, String nombre, int codigoPostal){
        this.coloniaId = coloniaId;
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getColoniaId() {
        return this.coloniaId;
    }

    public void setColoniaId(int coloniaId) {
        this.coloniaId = coloniaId;
    }
    
    
    
}
