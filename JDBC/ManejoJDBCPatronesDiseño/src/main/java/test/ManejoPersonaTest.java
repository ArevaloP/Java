package test;

import datos.*;
import domain.PersonaDTO;
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
            IPersonaDAO personaDao = new PersonaDAO(conn);
            
            List<PersonaDTO> personas = personaDao.seleccionar();
            
            personas.forEach(persona -> {
                System.out.println("persona = " + persona);
            });
            
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
