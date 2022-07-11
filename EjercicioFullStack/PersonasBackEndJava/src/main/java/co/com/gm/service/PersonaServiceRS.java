
package co.com.gm.service;

import co.com.gm.data.PersonaDao;
import co.com.gm.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.Status;

@Stateless
@Path("/personas")
public class PersonaServiceRS {
    
    @Inject
    private PersonaDao personaDao;
    
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Persona> listarPersonas(){
        List<Persona> personas = this.personaDao.encontrarTodasPersonas();
        System.out.println("Personas encontradas: " + personas);
        return personas;
    }
    
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Persona encontrarPersona(@PathParam("id") Integer id){
        Persona persona = personaDao.ecnontrarPersona(new Persona(id));
        System.out.println("Persona encontrada: " + persona);
        return persona;
    }
    
    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Persona agregarPersona(Persona persona){
        personaDao.insertarPersona(persona);
        System.out.println("Persona agregada: " + persona);
        return persona;
    }
    
    @PUT
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response modificarPersona(@PathParam("id") Integer id, Persona personaModificada){
        Persona persona = personaDao.ecnontrarPersona(new Persona(id));
        if(persona != null){
            personaDao.actualizarPersona(personaModificada);
            System.out.println("Persona modificada: " +  personaModificada);
            return Response.ok().entity(personaModificada).build();
        }else{
            return Response.status(Status.NOT_FOUND).build();
        }
    }
    
    @DELETE
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response eliminarPersona(@PathParam("id") Integer id){
        personaDao.eliminarPersona(new Persona(id));
        System.out.println("Persona eliminada con le id: " + id);
        return Response.ok().build();
    }
}
