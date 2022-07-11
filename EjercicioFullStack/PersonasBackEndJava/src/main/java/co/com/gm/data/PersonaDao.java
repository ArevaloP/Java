
package co.com.gm.data;

import co.com.gm.domain.Persona;
import java.util.List;


public interface PersonaDao {
    
    public List<Persona> encontrarTodasPersonas();
    
    public Persona ecnontrarPersona(Persona persona);
    
    public void insertarPersona(Persona persona);
    
    public void actualizarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
}
