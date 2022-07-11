package testclientews;

import clientews.servicio.*;
import java.util.List;

public class TestPersonaServiceWS {
    
    public static void main(String[] args) {
        PersonaServiceWS personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        System.out.println("Ejecutando servicio listar persona WS...");
        
        List<Persona> personas = personaService.listarPersonas();
        
        for(Persona persona: personas){
            System.out.println("persona = " + persona.getIdPersona() + ", Nombre: " + persona.getNombre()
                    + ", Apellido: " + persona.getApellido()+ ", Email: " + persona.getEmail());
            
        }
        
        System.out.println("Fin del servicio...");
    }
    
}
