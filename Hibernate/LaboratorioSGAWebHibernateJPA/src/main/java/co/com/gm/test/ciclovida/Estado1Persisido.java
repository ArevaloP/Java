package co.com.gm.test.ciclovida;

import co.com.gm.domain.*;
import javax.persistence.*;


public class Estado1Persisido {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1. Estado Transitivo
        Contacto contacto = new Contacto();
        
        contacto.setEmail("clara@mal.com");
        contacto.setTelefono("11223366");
        
        
        //2. Persistimos el objeto
        em.getTransaction().begin();
        
        em.persist(contacto);
        
        
        em.getTransaction().commit();
        
        //3. Pasamos al estado de Detached
        System.out.println("contacto = " + contacto);
        
        
    }
}
