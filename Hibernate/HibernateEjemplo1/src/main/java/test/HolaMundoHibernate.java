package test;

import co.com.gm.domain.Persona;
import javax.persistence.*;
import java.util.List;

public class HolaMundoHibernate {
    
    public static void main(String[] args) {
        String hql = "SELECT p FROM Persona p";
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        EntityManager em = emf.createEntityManager();
        
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for(Persona persona: personas){
            System.out.println("Persona = " + persona);
        }
    }
    
}
