package co.com.gm.sga.cliente.asociaciones;

import co.com.gm.sga.domain.*;
import java.util.List;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ClienteAsociacionesJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPU");
        EntityManager em = emf.createEntityManager();
        
        List<Persona> personas =  em.createNamedQuery("Persona.findAll").getResultList();
        
        //Cerramos la transaccion
        em.close();
        
        for(Persona persona: personas){
            log.debug("Persona - " + persona);
            //Recuperamos el Usuario de cada persona
            for(Usuario usuario: persona.getUsuarioList()){
                log.debug("Usuarios - " + usuario);
            }
        }
        
    }
    
}
