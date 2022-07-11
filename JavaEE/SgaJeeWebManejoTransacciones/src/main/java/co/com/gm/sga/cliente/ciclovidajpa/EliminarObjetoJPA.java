package co.com.gm.sga.cliente.ciclovidajpa;

import co.com.gm.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EliminarObjetoJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPU");
        EntityManager em = emf.createEntityManager();
        //Instanciamos variables para la JPA para la comunicaion con la base de datos
        EntityTransaction tx = em.getTransaction();

        //Iniciamos la transaccion 1
        tx.begin();

        //Ejecutamos SQL de Select
        Persona persona1 = em.find(Persona.class, 4);
        
        //Cerramos la transaccion 1
        tx.commit();
        
        //Objeto en estado detached
        log.debug("Objeto recuperado - " + persona1);

        //Iniciamos la transaccion 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        //Ejecutamos el SQL de Delete
        em.remove(em.merge(persona1));
        
        //Cerramos la transaccion 2
        tx2.commit();
        
        //Objeto en estado detached
        log.debug("Objeto eliminado - " + persona1);
        
        //Cerramos el Objeto Entity Manager
        em.close();
    }
}
