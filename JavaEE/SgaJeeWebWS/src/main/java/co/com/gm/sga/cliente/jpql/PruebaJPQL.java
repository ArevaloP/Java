package co.com.gm.sga.cliente.jpql;

import co.com.gm.sga.domain.*;
import java.util.*;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PruebaJPQL {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        String jpql = null;
        Query query = null;
        List<Persona> personas = null;
        Persona persona = null;
        Iterator iter = null;
        Object[] tupla = null;
        List<String> nombres = null;
        List<Usuario> usuarios = null;
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPU");
        EntityManager em = emf.createEntityManager();
        
        //Ejecutamos la consulta, todos los objetos de tipo persona
        log.debug("\n1. Cosnulta de todas la personas. ");
        jpql = "select p from Persona p";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        
        
        //Consulta de la Persona con id = 1
        log.debug("\n2. Consulta de la Persona con id = 1. ");
        jpql = "select p from Persona p where p.idPersona = 1";
        persona = (Persona) em.createQuery(jpql).getSingleResult();
        //log.debug(persona);
        
        
        //Consulta de Objeto Persona por nombre
        log.debug("\n3. Consulta al Objeto Persona por nombre");
        jpql = "select p from Persona p where p.nombre = 'Karla'";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        
        //Consultar datos indiviudales, se crea un arreglo que es una tupla de tipo Object de tres columnas
        log.debug("\n4. Consulta de datos individuales, arreglo de tipo Object de 3 columnas");
        jpql = "select p.nombre as Nombre, p.apellido as Apellido, p.email as Email from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while(iter.hasNext()){
            tupla = (Object[]) iter.next();
            String nombre = (String) tupla[0];
            String apellido = (String) tupla[1];
            String email = (String) tupla[2];
            //log.debug("Nombre: " + nombre + " Apellido: " + apellido + " Email: " + email);
        }
        
        //Obtiene el Objeto Persona y el id, se crea un arreglo de tipo Object con dos columnas
        log.debug("\n5. Consulta de datos individuales, arreglo de tipo Object de 2 columnas");
        jpql = "select p, p.idPersona from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while(iter.hasNext()){
            tupla = (Object[]) iter.next();
            persona = (Persona) tupla[0];
            int idPersona = (int) tupla[1];
            //log.debug("Objeto Persona: " + persona);
            //log.debug("ID Persona: " + idPersona);
        }
        
        
        //Consulta de todas las Personas
        log.debug("\n6. Consulta de todos los Objeto Persona solo con id. ");
        jpql = "select new co.com.gm.sga.domain.Persona(p.idPersona) from Persona p ";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        
        //Regresa el valor minimo y maximo del idPersona, resultados escalables
        log.debug("\n7.Consulta del valor minimo y maximo del idPersona, resultados escalables ");
        jpql = "select min(p.idPersona) as MinId, max(p.idPersona) as MaxId, count(p.idPersona) as Contador from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while(iter.hasNext()){
            tupla = (Object[]) iter.next();
            Integer idMin = (Integer) tupla[0];
            Integer idMax = (Integer) tupla[1];
            Long count = (Long) tupla[2];
            //log.debug("Id min: " + idMin + " id max: " + idMax + " Total elementos: " + count);
        }
        
        //Cuenta los nombres de las Personas que son distintos
        log.debug("\n8. Consulta que cuenta los nombres de las Personas que son distintos");
        jpql = "select count(distinct p.nombre) from Persona p";
        Long contador = (long) em.createQuery(jpql).getSingleResult();
        //log.debug("Numero de personas con nombre distinto: " + contador);
        
        
        //Concatena y convierte en mayuscula el nombre y el apellido.
        log.debug("\n9. Consulta que concatena y convierte en mayuscula el nombre y el apellido. ");
        jpql = "select CONCAT (p.nombre, ' ', p.apellido) as Nombre from Persona p";
        nombres = em.createQuery(jpql).getResultList();
        for(String nombreCompleto: nombres){
            //log.debug("Nombre completo: " + nombreCompleto);
        }
        
        //Obtiene el Objeto Persona con id igual al parametro parociaonado
        log.debug("\n10. Consulta que obtiene el Objeto Persona con id igual al parametro parociaonado. ");
        int idPersona = 5;
        jpql = "select p from Persona p where p.idPersona = :id";
        query = em.createQuery(jpql);
        query.setParameter("id", idPersona);
        persona = (Persona) query.getSingleResult();
        log.debug(persona);
        
        
        //Obtiene las personas que contengan una letra a en el nombre indepednientemente si es mayuscula o miniscula
        log.debug("\n11. Consulta que Obtiene las personas que contengan una letra a en el nombre indepednientemente si es mayuscula o miniscula. ");
        jpql = "select p from Persona p where upper(p.nombre) like(:parametro)";
        String parametro = "%ar%";
        query = em.createQuery(jpql);
        query.setParameter("parametro", parametro);
        personas = query.getResultList();
        mostrarPersonas(personas);
        
        
        //Uso de between
        log.debug("\n12. Uso de between. ");
        jpql = "select p from Persona p where p.idPersona between 1 and 2";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        //Uso del ordenamiento
        log.debug("\n13. Uso de ordenamietno. ");
        jpql = "select p from Persona p where p.idPersona > 1 order by p.nombre desc, p.apellido desc";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        
        //Uso de subqueries
        log.debug("\n14. Uso de subqueries. ");
        jpql = "select p from Persona p where p.idPersona in (select min(p1.idPersona) from Persona p1)";
        personas = em.createQuery(jpql).getResultList();
        //mostrarPersonas(personas);
        
        
        //Uso de join con Lazy Loading
        log.debug("\n15. Uso de join con Lazy Loading ");
        jpql = "select u from Usuario u join u.persona p";
        usuarios = em.createQuery(jpql).getResultList();
        //mostrarPersonas(usuarios);
        
       
        //Uso de left join con Eager Loading
        log.debug("\n15. Uso de left join con Eager Loading ");
        jpql = "select u from Usuario u left join fetch u.persona p";
        usuarios = em.createQuery(jpql).getResultList();
        mostrarPersonas(usuarios);
        
    }   

    private static void mostrarPersonas(Collection personas) {
        
        for(Object persona: personas){
            log.debug(persona);
        }
        
    }
    
    
    
}
