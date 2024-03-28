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
        
        Jugador jugador1 = new Jugador(2, "PEDRO","LOPEZ", "GOMEZ", 51, "MEDIO", "2000-12-03");
        System.out.println(jugador1);
        JugadorDAO jugadorDAO;
        try {
            jugadorDAO = new JugadorDAO();
            //jugadorDAO.insertarJugador(jugador1);
            //jugadorDAO.actualizarJugador(jugador1, 2);
            //jugadorDAO.eliminarJugador(3);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }
}
