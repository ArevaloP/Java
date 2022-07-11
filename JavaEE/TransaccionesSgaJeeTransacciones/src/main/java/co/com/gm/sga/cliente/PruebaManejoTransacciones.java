package co.com.gm.sga.cliente;

import co.com.gm.sga.domain.Persona;
import co.com.gm.sga.services.PersonaServiceRemote;
import javax.naming.*;
import org.apache.logging.log4j.*;

public class PruebaManejoTransacciones {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        try {
            Context jdni = new InitialContext();
            
            PersonaServiceRemote personaService = (PersonaServiceRemote) jdni.lookup("java:global/SgaJeeWebManejoTransacciones/PersonaServiceImpl!co.com.gm.sga.services.PersonaServiceRemote");
            
            log.debug("Iniciando prueba de Manejo Transaccional de Persona Service");
            
            //Buscar un objeto Persona
            Persona persona1 = personaService.encontarPersonaId(new Persona(1));
            
            log.debug("Persona recuperada - " + persona1);
            
            //Cambiar el apellido de la Persona
            persona1.setApellido("Perez");
            personaService.modificarPersona(persona1);
            
            log.debug("Objeto modificado - " + persona1);
            log.debug("Fin de la prueba Transaccion");
            
        } catch (NamingException ex) {
            log.debug(ex.getMessage());
        }
    }
    
}
