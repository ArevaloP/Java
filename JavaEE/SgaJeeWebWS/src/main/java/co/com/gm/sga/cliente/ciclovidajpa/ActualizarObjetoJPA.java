package co.com.gm.sga.cliente.ciclovidajpa;

import co.com.gm.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPU");
        EntityManager em = emf.createEntityManager();
        //Instanciamos variables para la JPA para la comunicaion con la base de datos
        EntityTransaction tx = em.getTransaction();
        
        //Iniciamos la transaccion 1
        tx.begin();
        
        //Ejectar SQL de tipo Select
        Persona persona1 = em.find(Persona.class, 1);
        
        //Termina la transaccion 1
        tx.commit();
        
        //Objeto en estado de detached
        log.debug("Objeto recuperado - " + persona1);
        
        //Modificamos los valores del objetos que deseemos
        persona1.setApellido("Juarez");
        
        //Iniciamos la transaccion 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();

        //Modificamos el objeto
        em.merge(persona1);
        
        //Terminamos la transaccion 2
        tx2.commit();
        
        //Objeto en estado de detached pero modificado
        log.debug("Objeto modificado - " + persona1);
        
        //Cerramos el Objeto Entity Manager
        em.close();
    }
    
}
