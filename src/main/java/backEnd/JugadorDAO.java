package backEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class JugadorDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/empresa_canchas";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "toor";

    private Connection connection;

    public JugadorDAO() throws SQLException {
        this.connection = obtenerConexion();
    }

    private Connection obtenerConexion() throws SQLException {
        Connection conexion = null;
        try {
            Properties props = new Properties();
            props.setProperty("user", USUARIO);
            props.setProperty("password", CONTRASEÑA);
            conexion = DriverManager.getConnection(URL, props);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            throw e;
        }
        return conexion;
    }

    public void cerrarConexion() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public int insertarJugador(Jugador jugador) throws SQLException {
        String query = "INSERT INTO jugadores (id_equipo, nombre, apellido_paterno, apellido_materno, numero_camiseta, posicion, fecha_nacimiento) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, jugador.getIdEquipo());
            statement.setString(2, jugador.getNombre());
            statement.setString(3, jugador.getApellidoPaterno());
            statement.setString(4, jugador.getApellidoMaterno());
            statement.setInt(5, jugador.getNumeroCamiseta());
            statement.setString(6, jugador.getPosicion());
            statement.setString(7, jugador.getFechaNacimiento());
            statement.executeUpdate();
            return 1;
            
        }
        catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public List<Jugador> obtenerJugadores() throws SQLException {
        List<Jugador> jugadores = new ArrayList<>();
        String query = "SELECT * FROM jugadores";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Jugador jugador = new Jugador();
                    jugador.setIdJugador(resultSet.getInt("id_jugador"));
                    jugador.setIdEquipo(resultSet.getInt("id_equipo"));
                    jugador.setNombre(resultSet.getString("nombre"));
                    jugador.setApellidoPaterno(resultSet.getString("apellido_paterno"));
                    jugador.setApellidoMaterno(resultSet.getString("apellido_materno"));
                    jugador.setNumeroCamiseta(resultSet.getInt("numero_camiseta"));
                    jugador.setPosicion(resultSet.getString("posicion"));
                    jugador.setFechaNacimiento(resultSet.getString("fecha_nacimiento"));
                    jugadores.add(jugador);
                }
            }
        }
        return jugadores;
    }

    public Jugador obtenerJugador(int idJugador) throws SQLException {
        String query = "SELECT * FROM jugadores WHERE id_jugador = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idJugador);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Jugador jugador = new Jugador();
                    jugador.setIdJugador(resultSet.getInt("id_jugador"));
                    jugador.setIdEquipo(resultSet.getInt("id_equipo"));
                    jugador.setNombre(resultSet.getString("nombre"));
                    jugador.setApellidoPaterno(resultSet.getString("apellido_paterno"));
                    jugador.setApellidoMaterno(resultSet.getString("apellido_materno"));
                    jugador.setNumeroCamiseta(resultSet.getInt("numero_camiseta"));
                    jugador.setPosicion(resultSet.getString("posicion"));
                    jugador.setFechaNacimiento(resultSet.getString("fecha_nacimiento"));
                    return jugador;
                }
            }
        }
        return null;
    }

    public int actualizarJugador(Jugador jugador, int idJugador) throws SQLException {
        String query = "UPDATE jugadores SET id_equipo = ?, nombre = ?, apellido_paterno = ?, apellido_materno = ?, numero_camiseta = ?, posicion = ?, fecha_nacimiento = ? WHERE id_jugador = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, jugador.getIdEquipo());
            statement.setString(2, jugador.getNombre());
            statement.setString(3, jugador.getApellidoPaterno());
            statement.setString(4, jugador.getApellidoMaterno());
            statement.setInt(5, jugador.getNumeroCamiseta());
            statement.setString(6, jugador.getPosicion());
            statement.setString(7, jugador.getFechaNacimiento());
            statement.setInt(8, idJugador);
            statement.executeUpdate();
            return 1;
        }catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int eliminarJugador(int idJugador) throws SQLException {
        String query = "DELETE FROM jugadores WHERE id_jugador = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idJugador);
            statement.executeUpdate();
            return 1;
        }catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public List<Jugador> obtenerJugadoresPorIDEquipo(int idEquipo) throws SQLException {
    List<Jugador> jugadores = new ArrayList<>();
    String query = "SELECT * FROM jugadores WHERE id_equipo = ?";
    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setInt(1, idEquipo);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Jugador jugador = new Jugador();
                jugador.setIdJugador(resultSet.getInt("id_jugador"));
                jugador.setIdEquipo(resultSet.getInt("id_equipo"));
                jugador.setNombre(resultSet.getString("nombre"));
                jugador.setApellidoPaterno(resultSet.getString("apellido_paterno"));
                jugador.setApellidoMaterno(resultSet.getString("apellido_materno"));
                jugador.setNumeroCamiseta(resultSet.getInt("numero_camiseta"));
                jugador.setPosicion(resultSet.getString("posicion"));
                jugador.setFechaNacimiento(resultSet.getString("fecha_nacimiento"));
                jugadores.add(jugador);
            }
        }
    }
    return jugadores;
}

    
}
