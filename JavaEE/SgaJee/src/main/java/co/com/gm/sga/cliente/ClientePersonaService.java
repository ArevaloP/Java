package co.com.gm.sga.cliente;

import co.com.gm.sga.domain.Persona;
import co.com.gm.sga.services.PersonaServiceRemote;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;

public class ClientePersonaService {
    
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente.");
        
        try {
            Context jdni = new InitialContext();
            
            PersonaServiceRemote personaService = (PersonaServiceRemote) jdni.lookup("java:global/SgaJee-/PersonaServiceImpl");
            
            List<Persona> personas = personaService.listarPersonas();
            
            for(Persona persona: personas){
                System.out.println("persona = " + persona);
            }
            
            System.out.println("\nFin de la llamda EJB desde el cliente");
            
            
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
}
