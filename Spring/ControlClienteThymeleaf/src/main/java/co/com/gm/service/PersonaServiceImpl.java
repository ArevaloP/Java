
package co.com.gm.service;

import co.com.gm.dao.PersonaDao;
import co.com.gm.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService{
    
    @Autowired
    private PersonaDao personaDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Persona> listarPersonas() {
        return  (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void guardarPersona(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminarPersona(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly=true)
    public Persona econtarPersona(Persona persona) {
        return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
    
    
    
}
