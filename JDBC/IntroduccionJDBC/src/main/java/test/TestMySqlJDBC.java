package test;

import java.sql.*;

public class TestMySqlJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        
        try {
            // Class.forName("com.sql.cj.jdbc.Driver"); Puede encintrarse una conexion así.
            Connection conexion = DriverManager.getConnection(url,"root","admin");
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT * FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            
            //El método next devuelve si hay una siguiente columna por iterar
            
            while(resultado.next()){
                System.out.print("Id_Persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Email: " + resultado.getString("email"));
                System.out.print(" Télefono: " + resultado.getString("telefono"));
                System.out.println("");
            }
            
            resultado.close();
            instruccion.close();
            conexion.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println(ex.getMessage());
        }
        
    }
    
}
