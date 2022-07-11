package co.com.gm.actions;

import co.com.gm.model.*;
import com.opensymphony.xwork2.*;
import org.apache.logging.log4j.*;




public class PersonasAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(PersonasAction.class);
    
    private Persona persona;
    
    @Override
    public String execute(){
        if(this.persona != null){
            log.info("\n");
            log.info("Persona - " + persona);
        }else{
            log.info("Persona con valor nulo");
        }
        
        return SUCCESS;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
}
