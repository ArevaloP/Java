package test;

import domain.Persona;
import java.util.*;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class TestPersonaServiceRS {
    
    //Variables a utilizar
    private static final String URL_BASS = "http://localhost:8080/SgaJeeWebSeguridad/webservice";
    private static Client cliente;
    private static WebTarget webTarget;
    private static Persona persona;
    private static List<Persona> personas;
    private static Invocation.Builder invocationBuilder;
    private static Response response;
    
    public static void main(String[] args) {
        
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder().nonPreemptive().credentials("admin", "admin").build();
        
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.register(feature);
        
        
        cliente = ClientBuilder.newClient(clientConfig);
        
        //Vamos a leer un persona (Llamada el metodo get)
        webTarget = cliente.target(URL_BASS).path("/personas");
        
        //Proporcionamos un idPersona valido
        persona = webTarget.path("/1").request(MediaType.APPLICATION_XML).get(Persona.class);
        
        System.out.println("Persona recuperada - " +  persona);
        
        //Leer todas las personas (metodo get con readEntity de tipo List<>)
        personas = webTarget.request(MediaType.APPLICATION_XML).get(Response.class).readEntity(new GenericType<List<Persona>>(){});
        System.out.println("\nPersonas recuperadas");
        mostrar(personas);
        
        //Agregar una persona (metodo POST)
        Persona personaNueva = new Persona();
        personaNueva.setNombre("Carlos");
        personaNueva.setApellido("Miranda");
        personaNueva.setEmail("cmiranda8@mail.com");
        personaNueva.setTelefono("3125697456");
        
        invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
        response = invocationBuilder.post(Entity.entity(personaNueva, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println(response.getStatus());
        //Recuperamos la persona recien agregada para despues modificaarla y al final eliminarla
        Persona personaRecuperada = response.readEntity(Persona.class);
        System.out.println("Persona agregada - " +  personaRecuperada);
        
        //Modificamos la persona (method PUT)
        //persona recuperada anteriormente
        Persona personaModificar = personaRecuperada;
        personaModificar.setApellido("Ramirez");
        String pathId = "/" + personaModificar.getIdPersona();
        invocationBuilder = webTarget.path(pathId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.put(Entity.entity(personaModificar, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println("Respuesta - " + response.getStatus());
        System.out.println("Persona Modificada - " + response.readEntity(Persona.class));
        
        //Eliminar un persona (DELETE)
        //Persona recuperada anteriormente
        Persona personaEliminar = personaRecuperada;
        String pathEliminarId = "/" + personaEliminar.getIdPersona();
        invocationBuilder = webTarget.path(pathEliminarId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.delete();
        System.out.println("");
        System.out.println("Status - " + response.getStatus());
        System.out.println("Persona eliminada - " + personaEliminar);
        
    }
    
    private static void mostrar(Collection collections){
        for(Object collection: collections){
            System.out.println("Persona - " + collection);
        }
    }
    
}
