package co.com.gm.test.ciclovida;

import co.com.gm.domain.Contacto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado2RecuperarObjetoPersistente {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //Definimos la variable
        Contacto contacto = null;
        
        //Recuperamos un Objeto de la base de datos
        contacto = em.find(Contacto.class, 3);
        
        //Detached o separado de la base de datos
        System.out.println("contacto = " + contacto);
        
    }
    
    
}
