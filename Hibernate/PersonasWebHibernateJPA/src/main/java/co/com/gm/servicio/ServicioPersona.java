package co.com.gm.servicio;

import co.com.gm.dao.PersonaDao;
import co.com.gm.domain.Persona;
import java.util.List;


public class ServicioPersona {
    
    private PersonaDao personaDao;
    
    public ServicioPersona(){
        personaDao = new PersonaDao();
    }
    
    public List<Persona> listar(){
        return personaDao.listar();
    }
    
    
    
}
