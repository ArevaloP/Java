package co.com.gm.sga.services;

import co.com.gm.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Juan", "Perez", "jperez@mail.com", "3123589658"));
        personas.add(new Persona(2, "Marta", "Suarez", "msuarez@mail.com", "3253698547"));
        return personas;
    }

    @Override
    public Persona encontarPersonaId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
    }

    @Override
    public void modificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPersona(Persona persona) {
    }
    
}
