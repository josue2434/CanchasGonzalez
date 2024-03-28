package backEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EquipoDAO {
    // Datos de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/empresa_canchas";
    private static final String USER = "root";
    private static final String PASSWORD = "toor";

    // Método para obtener la conexión a la base de datos
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Método para insertar un equipo en la base de datos
    public int insertarEquipo(Equipo equipo) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("INSERT INTO equipos (nombre, telefono) VALUES (?, ?)")) {
            statement.setString(1, equipo.getNombre());
            statement.setString(2, equipo.getTelefono());
            statement.executeUpdate();
            return 1;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Método para actualizar un equipo en la base de datos
    public int actualizarEquipo(Equipo equipo, int idEquipo) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("UPDATE equipos SET nombre = ?, telefono = ? WHERE id_equipo = ?")) {
            statement.setString(1, equipo.getNombre());
            statement.setString(2, equipo.getTelefono());
            statement.setInt(3, idEquipo);
            statement.executeUpdate();
            return 1;
        }catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Método para eliminar un equipo de la base de datos
    public int eliminarEquipo(int idEquipo) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("DELETE FROM equipos WHERE id_equipo = ?")) {
            statement.setInt(1, idEquipo);
            statement.executeUpdate();
            return 1;
        }catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Método para obtener todos los equipos de la base de datos
    public List<Equipo> obtenerEquipos() throws SQLException {
        List<Equipo> equipos = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM equipos");
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Equipo equipo = new Equipo();
                equipo.setIdEquipo(resultSet.getInt("id_equipo"));
                equipo.setNombre(resultSet.getString("nombre"));
                equipo.setTelefono(resultSet.getString("telefono"));
                equipos.add(equipo);
            }
        }
        return equipos;
    }

    // Método para obtener un equipo por su ID
    public Equipo obtenerEquipoPorId(int idEquipo) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM equipos WHERE id_equipo = ?")) {
            statement.setInt(1, idEquipo);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Equipo equipo = new Equipo();
                    equipo.setIdEquipo(resultSet.getInt("id_equipo"));
                    equipo.setNombre(resultSet.getString("nombre"));
                    equipo.setTelefono(resultSet.getString("telefono"));
                    return equipo;
                }
            }
        }
        return null;
    }
}

