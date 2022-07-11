
package co.com.gm.test.ciclovida;

import co.com.gm.domain.Contacto;
import javax.persistence.*;

public class Estado4EliminarObjeto {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //Definimos la variable
        Contacto contacto = null;
        
        //Iniciamos una transaccion
        em.getTransaction().begin();
        
        //Recuperamos un Objeto de la base de datos
        contacto = em.find(Contacto.class, 3);
        
        //3. remove
        em.remove(em.merge(contacto));
        
        em.getTransaction().commit();
        
        //Transitivo
        System.out.println("contacto = " + contacto);
    }
}
