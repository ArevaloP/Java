
package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named//Anotacion para que sea reconocido por el JSF
@RequestScoped//Alcande del Managed Beans en Request
public class Candidato {
    private String nombre = "Introduce tu nombre";
    
    public Candidato(){
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}
