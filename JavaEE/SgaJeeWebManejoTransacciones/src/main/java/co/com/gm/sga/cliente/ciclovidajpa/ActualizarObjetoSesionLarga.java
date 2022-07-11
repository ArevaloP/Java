
package co.com.gm.sga.cliente.ciclovidajpa;

import co.com.gm.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ActualizarObjetoSesionLarga {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPU");
        EntityManager em = emf.createEntityManager();
        //Instanciamos variables para la JPA para la comunicaion con la base de datos
        EntityTransaction tx = em.getTransaction();
        
        //Iniciamos la transaccion 1
        tx.begin();
        
        //Ejecutamos el SQL Select
        Persona persona1 = em.find(Persona.class, 1);
        
        log.debug("Objeto recuperado - " + persona1);
        
        //Modificamos los valores del Objeto
        persona1.setEmail("jjuarez@mial.com");
        persona1.setTelefono("3122587469");
        
        
        //Terminamos la transaccion
        tx.commit();
        
        //Objeto en estado de detached
        log.debug("Objeto modificado - " + persona1);
        
        //Cerramos el Objeto Entity Manager
        em.close();
    }
    
}
