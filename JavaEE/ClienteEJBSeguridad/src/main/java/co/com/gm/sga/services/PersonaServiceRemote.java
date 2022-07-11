
package co.com.gm.sga.services;

import co.com.gm.sga.domain.Persona;
import java.util.List;

public interface PersonaServiceRemote {
    
    public List<Persona> listarPersonas();
    
    public Persona encontarPersonaId(Persona persona);
    
    public Persona encontrarPersonaEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
}
