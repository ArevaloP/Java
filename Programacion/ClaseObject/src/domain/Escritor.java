package domain;

public class Escritor extends Empleado{
    
    private final TipoEscritura tipoEscritura;
    
    public Escritor (String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Escritor{");
        sb.append("tipoEscritura=").append(tipoEscritura);
        sb.append(" ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    @Override
    public String obtenerInformacion(){
        return super.obtenerInformacion() + ", Tipo de escritura: " + this.tipoEscritura;
    }
    
    
    
}
