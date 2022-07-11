/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.gm.sga.cliente.cascade;

import co.com.gm.sga.domain.*;
import javax.persistence.*;
import org.apache.logging.log4j.*;

/**
 *
 * @author Georffrey
 */
public class PersistenciaCascadaJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Iniciamos la transaccion
        tx.begin();
        
        //Creamos un objeto de tipo Persona
        //Objeto en estado transitivo
        Persona persona1 = new Persona("Hugo", "Hernandez", "hhernandez@mail.com", "3125896478");
        
        //Creamos el objeto Usuario relacionado con el objeto Persona creado
        Usuario usuario1 = new Usuario("hhernandez", "123", persona1);
        
        //Persistimos el objeto Usuario
        em.persist(usuario1);
        
        //Hacemos Commit
        tx.commit();
        
        //Objetos en estado detached
        log.debug("Perosana persisitido - " + persona1);
        log.debug("Usuario persistido - " + usuario1);
        
        //Cerramos el Entity Manager
        em.close();
    }
    
}
