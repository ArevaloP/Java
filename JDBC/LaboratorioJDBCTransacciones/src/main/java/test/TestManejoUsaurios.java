package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoUsaurios {

    public static void main(String[] args) {
        
        Connection conn = null;
        
        try {
            conn = Conexion.getConexion();
            
            if(conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }
            
            UsuarioDAO usuarioDao = new UsuarioDAO(conn);
            
            Usuario cambioUsaurio = new Usuario(3, "georffrey.arevalo", "123");
            usuarioDao.actualizar(cambioUsaurio);
            
            Usuario nuevoUsaurio = new Usuario("elian.arevalo", "123");
            usuarioDao.insertar(nuevoUsaurio);
            
            conn.commit();
            
            System.out.println("Se ha ingresado valores en la base de datos.");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            
            System.out.println("Entrando al rollback...");
            
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                ex.printStackTrace();
                System.out.println(ex.getMessage());
            }
            
        }
        
    }
    
}
