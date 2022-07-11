package co.com.gm.sga.cliente.ciclovidajpa;

import co.com.gm.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;



public class PersistirObjetoJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPU");
        EntityManager em = emf.createEntityManager();
        //Instanciamos variables para la JPA para la comunicaion con la base de datos
        EntityTransaction tx = em.getTransaction();
        
        //Creamos un Objeto
        //Objeto en estado Transitivo
        Persona persona1 = new Persona("Pedro", "Luna", "pluna@mail.com", "3125896547");
        
        //Iniciamos la transaccion
        tx.begin();
        
        //Ejecutamos el SQL
        em.persist(persona1);
        
        log.debug("Objeto persistido - sin commit: " + persona1);
        
        //Hacemos commit/rollback para que se guarden los objetos en la base de datos
        tx.commit();
        
        //Objecto en estado de detached
        log.debug("Objeto persistido - en estado detached: " + persona1);
        
        //Cerramos el Objeto Entity Manager
        em.close();
    }
    
}
