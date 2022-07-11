package test;

import co.com.gm.sga.domain.Persona;
import com.sun.enterprise.security.ee.auth.login.ProgrammaticLogin;
import java.util.List;

import javax.naming.*;
import co.com.gm.sga.services.PersonaServiceRemote;

public class ClientePersonaService {
    
    public static void main(String[] args) {
        System.out.println("Inciando llamda al EJB desde el cliente");
        
        
        String authFile = "login.conf";
        System.setProperty("java.security.auth.login.config", authFile);
        ProgrammaticLogin programaticLogin = new ProgrammaticLogin();
        programaticLogin.login("admin", "admin".toCharArray());
        
        try {
            Context jdni = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jdni.lookup("java:global/SgaJeeWebSeguridad/PersonaServiceImpl!co.com.gm.sga.services.PersonaServiceRemote");
            
            List<Persona> personas = personaService.listarPersonas();
            
            for(Persona persona: personas){
                System.out.println("Persona - " + persona);
            }
            System.out.println("\nFin de la llama del EJB desde el cliente.");
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
}
