package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class ManejoPersonaTest {

    public static void main(String[] args) {
        
        Connection conn = null;
        
        try {
            conn = Conexion.getConnection();
            if(conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            PersonaDAO personaDao = new PersonaDAO(conn);
            
            Persona cambioPersona = new Persona(4, "Georffrey", "Arevalo", "garevalo@mail.com", "314800990");
            personaDao.actualizar(cambioPersona);
            
            Persona nuevaPersona = new Persona("Julio", "Pacheco", "jpacheco@mail.com", "312453678");
            personaDao.insertar(nuevaPersona);
            
            conn.commit();
            
            System.out.println("Se han modificado los valores en la base de datos.");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println(ex.getMessage());
            
            System.out.println("Entramos al rollback...");
            
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
                System.out.println(ex1.getMessage());
            }
            
        }

    }

}
