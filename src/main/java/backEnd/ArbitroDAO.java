
package backEnd;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArbitroDAO {

    private Connection getConnection() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/empresa_canchas";
        String username = "root";
        String password = "toor";
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    public void agregarArbitro(Arbitro arbitro) {
        String query = "INSERT INTO arbitros (nombre, apellido_paterno, apellido_materno, telefono, disponible) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, arbitro.getNombre());
            preparedStatement.setString(2, arbitro.getApellidoPaterno());
            preparedStatement.setString(3, arbitro.getApellidoMaterno());
            preparedStatement.setString(4, arbitro.getTelefono());
            preparedStatement.setInt(5, arbitro.isDisponible());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Arbitro> obtenerArbitros() {
        List<Arbitro> arbitros = new ArrayList<>();
        String query = "SELECT * FROM arbitros";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Arbitro arbitro = new Arbitro();
                arbitro.setIdArbitro(resultSet.getInt("id_arbitro"));
                arbitro.setNombre(resultSet.getString("nombre"));
                arbitro.setApellidoPaterno(resultSet.getString("apellido_paterno"));
                arbitro.setApellidoMaterno(resultSet.getString("apellido_materno"));
                arbitro.setTelefono(resultSet.getString("telefono"));
                arbitro.setDisponible(resultSet.getInt("disponible"));
                arbitros.add(arbitro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arbitros;
    }

    public Arbitro obtenerArbitroPorId(int idArbitro) {
        String query = "SELECT * FROM arbitros WHERE id_arbitro = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idArbitro);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    Arbitro arbitro = new Arbitro();
                    arbitro.setIdArbitro(resultSet.getInt("id_arbitro"));
                    arbitro.setNombre(resultSet.getString("nombre"));
                    arbitro.setApellidoPaterno(resultSet.getString("apellido_paterno"));
                    arbitro.setApellidoMaterno(resultSet.getString("apellido_materno"));
                    arbitro.setTelefono(resultSet.getString("telefono"));
                    arbitro.setDisponible(resultSet.getInt("disponible"));
                    return arbitro;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void actualizarArbitro(Arbitro arbitro) {
        String query = "UPDATE arbitros SET nombre = ?, apellido_paterno = ?, apellido_materno = ?, telefono = ?, disponible = ? WHERE id_arbitro = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, arbitro.getNombre());
            preparedStatement.setString(2, arbitro.getApellidoPaterno());
            preparedStatement.setString(3, arbitro.getApellidoMaterno());
            preparedStatement.setString(4, arbitro.getTelefono());
            preparedStatement.setInt(5, arbitro.isDisponible());
            preparedStatement.setInt(6, arbitro.getIdArbitro());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarArbitro(int idArbitro) {
        String query = "DELETE FROM arbitros WHERE id_arbitro = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idArbitro);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
