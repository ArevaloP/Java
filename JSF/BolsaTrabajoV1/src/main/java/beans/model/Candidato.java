
package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.*;

@Named//Anotacion para que sea reconocido por el JSF
@RequestScoped//Alcande del Managed Beans en Request
public class Candidato {
    private String nombre;
    private String apellido;
    private String salarioDeseado;
    
    Logger log = LogManager.getRootLogger();
    
    //Constructores 
    public Candidato(){
        log.info("Creando Onjeto Candidato");
        this.setNombre("Introduce tu nombre.");
    }
    
    
    //Metodos Getter and Setter
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
        log.info("Modificando la propiedad de nombre: " + this.nombre);
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        log.info("Modificando la porpiedad de apellido: " + this.apellido);
    }

    public String getSalarioDeseado() {
        return salarioDeseado;
    }

    public void setSalarioDeseado(String salarioDeseado) {
        this.salarioDeseado = salarioDeseado;
        log.info("Modificando la propiedad de salario deseado: " + this.salarioDeseado);
    }
    
}
