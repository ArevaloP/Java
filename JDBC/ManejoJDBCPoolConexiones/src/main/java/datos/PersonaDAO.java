package datos;

import domain.PersonaDTO;
import java.sql.*;
import java.util.*;

public class PersonaDAO implements IPersonaDAO{

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES (?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

    public PersonaDAO() {

    }

    public PersonaDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    @Override
    public List<PersonaDTO> seleccionar() throws SQLException {

        List<PersonaDTO> personas = new ArrayList<>();

        Connection conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
        PreparedStatement smtm = conn.prepareStatement(SQL_SELECT);
        ResultSet rs = smtm.executeQuery();

        while (rs.next()) {

            personas.add(new PersonaDTO(
                    rs.getInt("id_persona"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("email"),
                    rs.getString("telefono")
            )
            );

        }

        Conexion.close(rs);
        Conexion.close(smtm);
        if (this.conexionTransaccional == null) {
            Conexion.close(conn);
        }

        return personas;

    }

    @Override
    public int insertar(PersonaDTO persona) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            registros = stmt.executeUpdate();

        } finally {
            try {
                Conexion.close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                System.out.println(ex.getMessage());
            }

        }

        return registros;
    }

    @Override
    public int actualizar(PersonaDTO persona) throws SQLException {

        int registros = 0;

        Connection conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
        PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE);
        stmt.setString(1, persona.getNombre());
        stmt.setString(2, persona.getApellido());
        stmt.setString(3, persona.getEmail());
        stmt.setString(4, persona.getTelefono());
        stmt.setInt(5, persona.getIdPersona());
        registros = stmt.executeUpdate();

        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
            Conexion.close(conn);
        }

        return registros;

    }

    @Override
    public int eliminar(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdPersona());
            registros = stmt.executeUpdate();

        } finally {
            try {
                Conexion.close(stmt);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
                System.out.println(ex.getMessage());
            }
        }

        return registros;

    }

}
