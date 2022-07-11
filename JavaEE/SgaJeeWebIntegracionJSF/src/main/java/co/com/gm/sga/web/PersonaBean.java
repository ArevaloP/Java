package co.com.gm.sga.web;

import co.com.gm.sga.domain.*;
import co.com.gm.sga.services.*;
import java.util.*;
import javax.annotation.*;
import javax.enterprise.context.*;
import javax.inject.*;
import org.apache.logging.log4j.*;
import org.primefaces.event.RowEditEvent;


@Named("personaBean")
@RequestScoped
public class PersonaBean {
    
    Logger log = LogManager.getRootLogger();
    
    @Inject
    private PersonaService personaService;
    
    private Persona personaSeleccionada;
    
    private List<Persona> personas;
    
    public PersonaBean(){
        log.debug("Iniciando Persona Bean");
    }
    
    @PostConstruct
    public void inicializar(){
        this.personas = personaService.listarPersonas();
        log.debug("Personas recuperadas en Managed Bean - " + this.personas);
        this.personaSeleccionada = new Persona();
    }
    
    public void editListener(RowEditEvent event){
        Persona persona = (Persona) event.getObject();
        
        this.personaService.modificarPersona(persona);
    }
    
    public void agregarPersona(){
        this.personaService.registrarPersona(personaSeleccionada);
        this.personas.add(personaSeleccionada);
        this.personaSeleccionada = null;
    }
    
    public void eliminarPersona(){
        this.personaService.eliminarPersona(personaSeleccionada);
        this.personas.remove(this.personaSeleccionada);
        this.personaSeleccionada = null;
    }
    
    public void reinciarPersonaSeleccionada(){
        this.personaSeleccionada = new Persona();
    }

    public List<Persona> getPersonas() {
        return this.personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Persona getPersonaSeleccionada() {
        return this.personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }
    
    
}
