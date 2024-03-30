/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package backEnd;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josue
 */
public class PoblarDB {

    public static void main(String[] args) {
       
        Arbitro arbitro1 = new Arbitro("Juan1", "Perez", "Gomez", "333021212", 1);
        Arbitro arbitro2 = new Arbitro("Juan2", "Perez", "Gomez", "333021212", 1);
        Arbitro arbitro3 = new Arbitro("Juan3", "Perez", "Gomez", "333021212", 1);
        
        Equipo equipo1 = new Equipo("Equipo1", "3322548521");
        Equipo equipo2 = new Equipo("Equipo1", "3322548521");
        Equipo equipo3 = new Equipo("Equipo1", "3322548521");
        Equipo equipo4 = new Equipo("Equipo1", "3322548521");
        Equipo equipo5 = new Equipo("Equipo1", "3322548521");

        Jugador jugador1 = new Jugador(1, "PEDRO","LOPEZ", "GOMEZ", 51, "PORTERO", "2000-12-03");
        Jugador jugador2 = new Jugador(1, "JUAN","AGUIRRE", "CAMACHO", 18, "DEFENSA", "2000-12-03");
        Jugador jugador3 = new Jugador(1, "HUGO","OROZCO", "ALDANA", 52, "DEFENSA", "2000-12-03");
        Jugador jugador4 = new Jugador(2, "JOSE","LOPEZ", "AVIÑA", 63, "MEDIO", "2000-12-03");
        Jugador jugador5 = new Jugador(2, "ALBERTO","SANCHEZ", "MARADONA", 12, "MEDIO", "2000-12-03");
        Jugador jugador6 = new Jugador(3, "LUIS","GONZALEZ", "GOMEZ", 11, "DELANTERO", "2000-12-03");
        Jugador jugador7 = new Jugador(3, "SEBASTIAN","JULIANO", "PEREZ", 96, "DELANTERO", "2000-12-03");
        
        Reserva reserva1 = new Reserva(1, 2, 1, "2024-03-29", 1, "VESPERTINO", true);
        Reserva reserva2 = new Reserva(1, 2, 1, "2024-03-30", 1, "MATUTINO", true);
        Reserva reserva3 = new Reserva(1, 2, 1, "2024-03-31", 1, "VESPERTINO", true);
        
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
            
            equipoDAO.insertarEquipo(equipo1);
            equipoDAO.insertarEquipo(equipo2);
            equipoDAO.insertarEquipo(equipo3);
            equipoDAO.insertarEquipo(equipo4);
            equipoDAO.insertarEquipo(equipo5);
            
            jugadorDAO.insertarJugador(jugador1);
            jugadorDAO.insertarJugador(jugador2);
            jugadorDAO.insertarJugador(jugador3);
            jugadorDAO.insertarJugador(jugador4);
            jugadorDAO.insertarJugador(jugador5);
            jugadorDAO.insertarJugador(jugador6);
            jugadorDAO.insertarJugador(jugador7);
            
            reservaDAO.insertarReserva(reserva1);
            reservaDAO.insertarReserva(reserva2);
            reservaDAO.insertarReserva(reserva3);
            
            //reservaDAO.actualizarReserva(reserva2, 3);
            //reservaDAO.borrarReserva(3);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PoblarDB.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }
}
