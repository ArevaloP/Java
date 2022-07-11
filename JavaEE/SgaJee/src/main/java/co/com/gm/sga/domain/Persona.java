package co.com.gm.sga.domain;

import java.io.Serializable;



public class Persona implements Serializable{
    private static final long serialVersionUid = 1L;
    
    private int idPersna;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    public Persona(){
        
    }

    public Persona(int idPersna, String nombre, String apellido, String email, String telefono) {
        this.idPersna = idPersna;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdPersna() {
        return idPersna;
    }

    public void setIdPersna(int idPersna) {
        this.idPersna = idPersna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersna=").append(idPersna);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", email=").append(email);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
