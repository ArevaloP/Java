
package domain;

import java.util.Date;


public class Cliente extends Persona{
    
    private int idCliente;
    private boolean vip;
    private Date fechaRegistro;
    private static int contadorCliente;
    
    public Cliente( String nombre, char genero, int edad, String direccion, boolean vip, Date fechaRegistro ){
        super(nombre, genero, edad, direccion);
        this.vip = vip;
        this.fechaRegistro = fechaRegistro;
        this.idCliente = ++Cliente.contadorCliente;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", vip=").append(vip);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
