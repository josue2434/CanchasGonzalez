package backEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {

    private final String url = "jdbc:mysql://localhost:3306/empresa_canchas";
    private final String user = "root"; // 
    private final String password = "toor";

    // Consultas SQL
    private static final String INSERT_RESERVA_SQL = "INSERT INTO reservas (id_equipo_local, id_equipo_visitante, id_arbitro, fecha_reserva, numero_cancha, horario, disponible) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_RESERVA_BY_ID_SQL = "SELECT * FROM reservas WHERE id_reserva=?";
    private static final String SELECT_ALL_RESERVAS_SQL = "SELECT * FROM reservas";
    private static final String DELETE_RESERVA_SQL = "DELETE FROM reservas WHERE id_reserva=?";
    private static final String UPDATE_RESERVA_SQL = "UPDATE reservas SET id_equipo_local=?, id_equipo_visitante=?, id_arbitro=?, fecha_reserva=?, numero_cancha=?, horario=?, disponible=? WHERE id_reserva=?";

    public ReservaDAO() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void insertarReserva(Reserva reserva) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_RESERVA_SQL)) {
            preparedStatement.setInt(1, reserva.getIdEquipoLocal());
            preparedStatement.setInt(2, reserva.getIdEquipoVisitante());
            preparedStatement.setInt(3, reserva.getIdArbitro());
            preparedStatement.setString(4, reserva.getFechaReserva());
            preparedStatement.setInt(5, reserva.getNumeroCancha());
            preparedStatement.setString(6, reserva.getHorario());
            preparedStatement.setBoolean(7, reserva.isDisponible());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Reserva obtenerReserva(int idReserva) {
        Reserva reserva = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_RESERVA_BY_ID_SQL)) {
            preparedStatement.setInt(1, idReserva);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int idEquipoLocal = rs.getInt("id_equipo_local");
                int idEquipoVisitante = rs.getInt("id_equipo_visitante");
                int idArbitro = rs.getInt("id_arbitro");
                String fechaReserva = rs.getString("fecha_reserva");
                int numeroCancha = rs.getInt("numero_cancha");
                String horario = rs.getString("horario");
                boolean disponible = rs.getBoolean("disponible");
                reserva = new Reserva(idEquipoLocal, idEquipoVisitante, idArbitro, fechaReserva, numeroCancha, horario, disponible);
                reserva.setIdReserva(idReserva);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reserva;
    }

    public List<Reserva> seleccionarTodasReservas() {
        List<Reserva> reservas = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_RESERVAS_SQL)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int idReserva = rs.getInt("id_reserva");
                int idEquipoLocal = rs.getInt("id_equipo_local");
                int idEquipoVisitante = rs.getInt("id_equipo_visitante");
                int idArbitro = rs.getInt("id_arbitro");
                String fechaReserva = rs.getString("fecha_reserva");
                int numeroCancha = rs.getInt("numero_cancha");
                String horario = rs.getString("horario");
                boolean disponible = rs.getBoolean("disponible");
                Reserva reserva = new Reserva(idEquipoLocal, idEquipoVisitante, idArbitro, fechaReserva, numeroCancha, horario, disponible);
                reserva.setIdReserva(idReserva);
                reservas.add(reserva);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reservas;
    }

    public int borrarReserva(int idReserva) {
        
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_RESERVA_SQL)) {
            statement.setInt(1, idReserva);
            statement.executeUpdate();
            return 1;
        } catch (SQLException e) {
            return 0;
        }

    }

    public int actualizarReserva(Reserva reserva, int idReserva) {

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_RESERVA_SQL)) {
            statement.setInt(1, reserva.getIdEquipoLocal());
            statement.setInt(2, reserva.getIdEquipoVisitante());
            statement.setInt(3, reserva.getIdArbitro());
            statement.setString(4, reserva.getFechaReserva());
            statement.setInt(5, reserva.getNumeroCancha());
            statement.setString(6, reserva.getHorario());
            statement.setBoolean(7, reserva.isDisponible());
            statement.setInt(8, idReserva);
            statement.executeUpdate();
            return 1;
        } catch (SQLException e) {
            return 0;
        }
    }
}
