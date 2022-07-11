package datos;

import domain.Usuario;
import java.sql.*;
import java.util.*;

public class UsuarioDAO {

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (user, password) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET user = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";

    public UsuarioDAO() {

    }

    public UsuarioDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<Usuario> seleccionar() throws SQLException {

        List<Usuario> usuarios = new ArrayList<>();

        Connection conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConexion();
        PreparedStatement stmt = conn.prepareStatement(SQL_SELECT);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            usuarios.add(new Usuario(
                    rs.getInt("id_usuario"),
                    rs.getString("user"),
                    rs.getString("password")
            ));
        }

        Conexion.close(rs);
        Conexion.close(stmt);

        if (this.conexionTransaccional == null) {
            Conexion.close(conn);
        }

        return usuarios;

    }

    public int insertar(Usuario usuario) throws SQLException {
        int registros = 0;

        Connection conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConexion();
        PreparedStatement stmt = conn.prepareStatement(SQL_INSERT);

        if (usuario.getUser() != null && usuario.getPassword() != null) {
            stmt.setString(1, usuario.getUser());
            stmt.setString(2, usuario.getPassword());
            registros = stmt.executeUpdate();
        } else {
            System.out.println("El usuario o contraseña no puede ser vacios.");
        }

        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
            Conexion.close(conn);
        }

        return registros;

    }

    public int actualizar(Usuario usuario) throws SQLException {
        int registros = 0;

        Connection conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConexion();
        PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE);

        if (usuario.getUser() != null && usuario.getPassword() != null) {
            stmt.setString(1, usuario.getUser());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
        } else {
            System.out.println("El usuario o la contraseña no pueden ser vacio. ");
        }

        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
            Conexion.close(conn);
        }

        return registros;

    }

    public int eliminar(Usuario usuario) throws SQLException {
        int registros = 0;

        Connection conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConexion();
        PreparedStatement stmt = conn.prepareStatement(SQL_DELETE);
        stmt.setInt(1, usuario.getIdUsuario());
        registros = stmt.executeUpdate();

        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
            Conexion.close(conn);
        }

        return registros;

    }

}
