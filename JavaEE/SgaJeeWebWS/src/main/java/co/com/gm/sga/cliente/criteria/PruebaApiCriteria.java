package co.com.gm.sga.cliente.criteria;

import co.com.gm.sga.domain.*;
import java.util.*;
import javax.persistence.*;
import javax.persistence.criteria.*;
import org.apache.logging.log4j.*;

public class PruebaApiCriteria {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPU");
        EntityManager em = emf.createEntityManager();
        
        CriteriaBuilder cb = null;
        CriteriaQuery<Persona> criteriaQuery = null;
        Root<Persona> fromPersona = null;
        TypedQuery<Persona> query = null;
        Persona persona = null;
        List<Persona> personas = null;
        
        //Query utilizando el API de criteria
        //1. Consulta de todas las Personas
        
        //El objeto Entity Manager crea una instancia de Criteria Builder
        cb = em.getCriteriaBuilder();
        
        //Se crea un Objeto Criteria Query
        criteriaQuery = cb.createQuery(Persona.class);
        
        //Creamos la raiz del Query
        fromPersona = criteriaQuery.from(Persona.class);
        
        //Seleccionamos lo necesario del from
        criteriaQuery.select(fromPersona);
        
        //Creamos el query typeSafe
        query = em.createQuery(criteriaQuery);
        
        //Ejecutamos la consulta
        personas = query.getResultList();
        
        //mostrar(personas);
       
        
        //Consulta de la persona por id = 1
        log.debug("\n2-a. Consulta de la persona con id = 1");
        cb = em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona).where(cb.equal(fromPersona.get("idPersona"), 1));
        persona = em.createQuery(criteriaQuery).getSingleResult();
        log.debug("Persona - " + persona);
        
        
        //Consulta de la persona por id = 1
        //Predicado
        log.debug("\n2-b. Consulta de la persona con id = 1 con Predicados");
        cb = em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona);
        
        //La clase predicate nos permite agregar varios criterios dinamicamente
        List<Predicate> criterios = new ArrayList<Predicate>();
        
        //Verificamos si tenemos criterios por agregar
        Integer idPersonaParam = 1;
        ParameterExpression<Integer> parameter = cb.parameter(Integer.class, "idPersona");
        criterios.add( cb.equal(fromPersona.get("idPersona"), parameter) );
        
        //Se agregan los criterios
        if(criterios.isEmpty()){
            throw new RuntimeException("Sin criterios");
        }else if(criterios.size() == 1){
            criteriaQuery.where(criterios.get(0));
        }else{
            criteriaQuery.where(cb.and(criterios.toArray(new Predicate[0])));
        }
        
        query = em.createQuery(criteriaQuery);
        query.setParameter("idPersona", idPersonaParam);
        
        //Se ejecuta el query
        persona = query.getSingleResult();
        log.debug(persona);
        
    }
    
    private static void mostrar(Collection collections){
        for(Object collection: collections){
            log.debug(collection);
        }
    }
    
}
