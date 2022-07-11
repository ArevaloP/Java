package test;

import co.com.gm.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class ClienteEntidadTest {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Inicia la transaccion
        tx.begin();
        //No se debe especificar el ID de la base de datos
        
        Persona persona1 = new Persona("Maria", "Gutierrez", "mgutierrez@mail.com", "3253692587");
        log.debug("Objeto a persistir" + persona1);
        //Persistimo el objeto en la base de datos
        em.persist(persona1);
        //Terminamos la transaccion
        tx.commit();
        log.debug("Objeto persistido " + persona1);
        em.close();
    }
    
}
