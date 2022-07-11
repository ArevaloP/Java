package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class ManejoPersonaTest {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        Persona personaNueva = new Persona(6, "Puala", "Pabon", "ppabon@mail.com", "3334445551");

        //Insertando valores en la base de datos.
//        int reg = personaDao.insertar(personaNueva);
//        System.out.println("Se han insertado " + reg + " personas.");

        //Actualizando valores en la base de datos.
//        int reg = personaDao.actualizar(personaNueva);
//        System.out.println("Se han actualizado " + reg + " personas.");
        
        
        //Eliminando valores en la base de datos.
        int reg = personaDao.eliminar(personaNueva);
        System.out.println("Se ha eliminado " + reg + " personas.");

        //Listando las personas de la base de datos.
        List<Persona> personas = personaDao.seleccionar();

        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

    }

}
