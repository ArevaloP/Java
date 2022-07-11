
package co.com.gm.service;

import co.com.gm.domain.Persona;
import java.util.List;


public interface PersonaService {
    
    public List<Persona> listarPersonas();
    public void guardarPersona(Persona persona);
    public void eliminarPersona(Persona persona);
    public Persona econtarPersona(Persona persona);
    
}
