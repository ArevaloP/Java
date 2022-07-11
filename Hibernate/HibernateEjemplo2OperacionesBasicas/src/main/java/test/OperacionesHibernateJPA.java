package test;

import co.com.gm.dao.PersonaDao;
import co.com.gm.domain.Persona;

public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        PersonaDao personaDao = new PersonaDao();
        
        personaDao.listar();
        
        Persona persona = new Persona();
        persona.setIdPersona(11);
        persona = personaDao.encontrarPorId(persona);
//        
//        persona.setApellido("Tellez");
//        persona.setEmail("ctellez@mail.com");
//        
//        personaDao.modificar(persona);
        personaDao.eliminar(persona);
        personaDao.listar();
        
    }
    
    
}
