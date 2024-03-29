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
public class Main {

    public static void main(String[] args) {
       
        //Arbitro arbitro1 = new Arbitro("Juan", "Perez", "Gomez", "333021212", 1);
        //System.out.println(arbitro1);
        
        //ArbitroDAO arbitroDAO = new ArbitroDAO();
        //arbitroDAO.agregarArbitro(arbitro1);
        
        Jugador jugador1 = new Jugador(3, "PEDRO","LOPEZ", "GOMEZ", 51, "PORTERO", "2000-12-03");
        Jugador jugador2 = new Jugador(3, "JUAN","AGUIRRE", "CAMACHO", 18, "DEFENSA", "2000-12-03");
        Jugador jugador3 = new Jugador(3, "HUGO","OROZCO", "ALDANA", 52, "DEFENSA", "2000-12-03");
        Jugador jugador4 = new Jugador(3, "JOSE","LOPEZ", "AVIÑA", 63, "MEDIO", "2000-12-03");
        Jugador jugador5 = new Jugador(3, "ALBERTO","SANCHEZ", "MARADONA", 12, "MEDIO", "2000-12-03");
        Jugador jugador6 = new Jugador(3, "LUIS","GONZALEZ", "GOMEZ", 11, "DELANTERO", "2000-12-03");
        Jugador jugador7 = new Jugador(3, "SEBASTIAN","JULIANO", "PEREZ", 96, "DELANTERO", "2000-12-03");
        
        System.out.println(jugador1);
        JugadorDAO jugadorDAO;
        try {
            jugadorDAO = new JugadorDAO();
            
            jugadorDAO.insertarJugador(jugador1);
            jugadorDAO.insertarJugador(jugador2);
            jugadorDAO.insertarJugador(jugador3);
            jugadorDAO.insertarJugador(jugador4);
            jugadorDAO.insertarJugador(jugador5);
            jugadorDAO.insertarJugador(jugador6);
            jugadorDAO.insertarJugador(jugador7);
            
            
            
            //jugadorDAO.insertarJugador(jugador1);
            //jugadorDAO.actualizarJugador(jugador1, 2);
            //jugadorDAO.eliminarJugador(3);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }
}
