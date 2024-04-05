/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package backEnd;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josue
 */
public class LlenarReservas {

    public static void main(String[] args) {
       
        Arbitro arbitro1 = new Arbitro("N/A", "N/A", "N/A", "0", 1);
        Arbitro arbitro2 = new Arbitro("Juan", "Perez", "Gomez", "3330212172", 1);
        Arbitro arbitro3 = new Arbitro("Miguel", "Perez", "Gomez", "3330212812", 1);
        Arbitro arbitro4 = new Arbitro("Elena", "Martinez", "Garcia", "3367890126", 1);
        Arbitro arbitro5 = new Arbitro("Carlos", "Fernandez", "Lopez", "3345678904", 1);
        Arbitro arbitro6 = new Arbitro("Javier", "Lopez", "Sanchez", "3334567892", 1);
        
        Equipo equipo1 = new Equipo("N/A", "0");
        Equipo equipo2 = new Equipo("LEONES NEGROS", "3330619846");
        Equipo equipo3 = new Equipo("Real Madrid", "3351234567");
        Equipo equipo4 = new Equipo("Manchester United", "3359876543");
        Equipo equipo5 = new Equipo("FC Barcelona", "3352345678");
        Equipo equipo6= new Equipo("Bayern Munich", "3352345647");

        Jugador jugador1 = new Jugador(1, "PEDRO","LOPEZ", "GOMEZ", 51, "PORTERO", "2000-12-03");
        Jugador jugador2 = new Jugador(2, "JUAN","AGUIRRE", "CAMACHO", 18, "DEFENSA", "2000-12-03");
        Jugador jugador3 = new Jugador(2, "HUGO","OROZCO", "ALDANA", 52, "DEFENSA", "2000-12-03");
        Jugador jugador4 = new Jugador(2, "JOSE","LOPEZ", "AVIÑA", 63, "MEDIO", "2000-12-03");
        Jugador jugador5 = new Jugador(3, "ALBERTO","SANCHEZ", "MARADONA", 12, "MEDIO", "2000-12-03");
        Jugador jugador6 = new Jugador(3, "LUIS","GONZALEZ", "GOMEZ", 11, "DELANTERO", "2000-12-03");
        Jugador jugador7 = new Jugador(3, "SEBASTIAN","JULIANO", "PEREZ", 96, "DELANTERO", "2000-12-03");
        

        ArbitroDAO arbitroDAO;
        EquipoDAO equipoDAO;
        JugadorDAO jugadorDAO;
        ReservaDAO reservaDAO;
        
        try {
            
            arbitroDAO = new ArbitroDAO();
            equipoDAO = new EquipoDAO();
            jugadorDAO = new JugadorDAO();
            reservaDAO = new ReservaDAO();

            
            arbitroDAO.agregarArbitro(arbitro1);
            arbitroDAO.agregarArbitro(arbitro2);
            arbitroDAO.agregarArbitro(arbitro3);
            arbitroDAO.agregarArbitro(arbitro4);
            arbitroDAO.agregarArbitro(arbitro5);
            arbitroDAO.agregarArbitro(arbitro6);
            
            equipoDAO.insertarEquipo(equipo1);
            equipoDAO.insertarEquipo(equipo2);
            equipoDAO.insertarEquipo(equipo3);
            equipoDAO.insertarEquipo(equipo4);
            equipoDAO.insertarEquipo(equipo5);
            equipoDAO.insertarEquipo(equipo6);
            
            jugadorDAO.insertarJugador(jugador1);
            jugadorDAO.insertarJugador(jugador2);
            jugadorDAO.insertarJugador(jugador3);
            jugadorDAO.insertarJugador(jugador4);
            jugadorDAO.insertarJugador(jugador5);
            jugadorDAO.insertarJugador(jugador6);
            jugadorDAO.insertarJugador(jugador7);
            

            LocalDate fechaInicio = LocalDate.of(2024, 1, 1); // Fecha de inicio
            LocalDate fechaFin = LocalDate.of(2030, 12, 31);   // Fecha de fin

            // Recorrer cada día dentro del rango de fechas
            for (LocalDate fecha = fechaInicio; fecha.isBefore(fechaFin.plusDays(1)); fecha = fecha.plusDays(1)) {
                
                Reserva reservaM1 = new Reserva(1, 1, 1, "", 1, "VESPERTINO", true);
                reservaM1.setFechaReserva(fecha.toString());
                Reserva reservaM2 = new Reserva(1, 1, 1, "", 2, "VESPERTINO", true);
                reservaM2.setFechaReserva(fecha.toString());
                Reserva reservaM3 = new Reserva(1, 1, 1, "", 3, "VESPERTINO", true);
                reservaM3.setFechaReserva(fecha.toString());
                Reserva reservaM4 = new Reserva(1, 1, 1, "", 4, "VESPERTINO", true);
                reservaM4.setFechaReserva(fecha.toString());
                Reserva reservaM5 = new Reserva(1, 1, 1, "", 5, "VESPERTINO", true);
                reservaM5.setFechaReserva(fecha.toString());

                Reserva reservaV1 = new Reserva(1, 1, 1, "", 1, "MATUTINO", true);
                reservaV1.setFechaReserva(fecha.toString());
                Reserva reservaV2 = new Reserva(1, 1, 1, "", 2, "MATUTINO", true);
                reservaV2.setFechaReserva(fecha.toString());
                Reserva reservaV3 = new Reserva(1, 1, 1, "", 3, "MATUTINO", true);
                reservaV3.setFechaReserva(fecha.toString());
                Reserva reservaV4 = new Reserva(1, 1, 1, "", 4, "MATUTINO", true);
                reservaV4.setFechaReserva(fecha.toString());
                Reserva reservaV5 = new Reserva(1, 1, 1, "", 5, "MATUTINO", true);
                reservaV5.setFechaReserva(fecha.toString());

                reservaDAO.insertarReserva(reservaM1);
                reservaDAO.insertarReserva(reservaM2);
                reservaDAO.insertarReserva(reservaM3);
                reservaDAO.insertarReserva(reservaM4);
                reservaDAO.insertarReserva(reservaM5);

                reservaDAO.insertarReserva(reservaV1);
                reservaDAO.insertarReserva(reservaV2);
                reservaDAO.insertarReserva(reservaV3);
                reservaDAO.insertarReserva(reservaV4);
                reservaDAO.insertarReserva(reservaV5);
                
            
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LlenarReservas.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
