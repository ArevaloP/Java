
package co.com.gm.sga.cliente.ciclovidajpa;

import co.com.gm.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;


public class EncontrarObjetoJPA {
    
     static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPU");
        EntityManager em = emf.createEntityManager();
        //Instanciamos variables para la JPA para la comunicaion con la base de datos
        EntityTransaction tx = em.getTransaction();
        
        //Iniciamos la transaccion
        tx.begin();
        
        //Ejecutar SQL Select
        Persona persona1 = em.find(Persona.class, 4);
        
        //Termina la transaccion
        tx.commit();
        
        //Objeto en estado de detached
        log.debug("Objeto recuperado: " + persona1);
        
        
        
        //Cerramos el Objeto Entity Manager
        em.close();
    }
    
}
