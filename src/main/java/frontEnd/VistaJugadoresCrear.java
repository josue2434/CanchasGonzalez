/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontEnd;
import backEnd.Arbitro;
import backEnd.ArbitroDAO;
import backEnd.Equipo;
import backEnd.EquipoDAO;
import backEnd.Jugador;
import backEnd.JugadorDAO;
import backEnd.Utilidades;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class VistaJugadoresCrear extends javax.swing.JFrame {

    /**
     * Creates new form VistaPlantilla
     */
    public VistaJugadoresCrear() {
       initComponents();
       Utilidades.cargarLogo(this, "LOGOEMPRESA.png");
        
        try {
            
            EquipoDAO equipoDAO = new EquipoDAO();
            List <Equipo> equipos = equipoDAO.obtenerEquipos();
            
            for (Equipo equipo : equipos) {
                cmbIdEquipo.addItem(String.valueOf(equipo.getIdEquipo()));
            }
           
            cmbIdEquipo.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {

                        try {
                            String id = (String) cmbIdEquipo.getSelectedItem();
                            System.out.println(id);
                            Equipo equipo = equipoDAO.obtenerEquipoPorId(Integer.valueOf(id));
                            txtfNombreEquipo.setText(equipo.getNombre());
                        } catch (SQLException ex) {
                            System.out.println("Error al cargar los datos de equipo");
                        }
                    }
                }
            });

            }   catch (SQLException ex) {
                    Logger.getLogger(VistaJugadoresCrear.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogoEmpresa = new javax.swing.JLabel();
        btnCrearJugador = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblIdArbitro1 = new javax.swing.JLabel();
        lblNombres1 = new javax.swing.JLabel();
        lblApellidoPaterno1 = new javax.swing.JLabel();
        lblApellidoMaterno1 = new javax.swing.JLabel();
        lblNumeroCamiseta = new javax.swing.JLabel();
        lblPosicion = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblIdEquipo = new javax.swing.JLabel();
        txtfIdArbitro1 = new javax.swing.JTextField();
        txtfNombres = new javax.swing.JTextField();
        txtfApellidoPaterno = new javax.swing.JTextField();
        txtfApellidoMaterno = new javax.swing.JTextField();
        txtfNumeroCamiseta = new javax.swing.JTextField();
        txtfPosicion = new javax.swing.JTextField();
        txtfNombreEquipo = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        cmbIdEquipo = new javax.swing.JComboBox<>();
        txtfFechaNacimiento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CREAR ARBITRO");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        lblLogoEmpresa.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\LOGOEMPRESA.png")); // NOI18N
        getContentPane().add(lblLogoEmpresa);
        lblLogoEmpresa.setBounds(-40, 0, 180, 190);

        btnCrearJugador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCrearJugador.setText("CREAR JUGADOR");
        btnCrearJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearJugador);
        btnCrearJugador.setBounds(960, 600, 290, 70);

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(30, 630, 190, 70);

        lblIdArbitro1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIdArbitro1.setText("ID JUGADOR");
        getContentPane().add(lblIdArbitro1);
        lblIdArbitro1.setBounds(280, 80, 190, 40);

        lblNombres1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNombres1.setText("NOMBRES");
        getContentPane().add(lblNombres1);
        lblNombres1.setBounds(280, 150, 190, 40);

        lblApellidoPaterno1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblApellidoPaterno1.setText("APELLIDO  PATERNO");
        getContentPane().add(lblApellidoPaterno1);
        lblApellidoPaterno1.setBounds(280, 210, 250, 40);

        lblApellidoMaterno1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblApellidoMaterno1.setText("APELLIDO  MATERNO");
        getContentPane().add(lblApellidoMaterno1);
        lblApellidoMaterno1.setBounds(280, 280, 250, 40);

        lblNumeroCamiseta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNumeroCamiseta.setText("NUMERO CAMISETA");
        getContentPane().add(lblNumeroCamiseta);
        lblNumeroCamiseta.setBounds(280, 350, 250, 40);

        lblPosicion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPosicion.setText("POSICION");
        getContentPane().add(lblPosicion);
        lblPosicion.setBounds(280, 430, 250, 40);

        lblFechaNacimiento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblFechaNacimiento.setText("FECHA NACIMIENTO");
        getContentPane().add(lblFechaNacimiento);
        lblFechaNacimiento.setBounds(280, 490, 250, 40);

        lblIdEquipo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIdEquipo.setText("ID EQUIPO");
        getContentPane().add(lblIdEquipo);
        lblIdEquipo.setBounds(280, 550, 250, 40);

        txtfIdArbitro1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfIdArbitro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfIdArbitro1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtfIdArbitro1);
        txtfIdArbitro1.setBounds(600, 80, 330, 40);

        txtfNombres.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNombresActionPerformed(evt);
            }
        });
        getContentPane().add(txtfNombres);
        txtfNombres.setBounds(600, 140, 330, 40);

        txtfApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfApellidoPaternoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfApellidoPaterno);
        txtfApellidoPaterno.setBounds(600, 210, 330, 40);

        txtfApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfApellidoMaternoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfApellidoMaterno);
        txtfApellidoMaterno.setBounds(600, 280, 330, 40);

        txtfNumeroCamiseta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfNumeroCamiseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNumeroCamisetaActionPerformed(evt);
            }
        });
        getContentPane().add(txtfNumeroCamiseta);
        txtfNumeroCamiseta.setBounds(600, 350, 330, 40);

        txtfPosicion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfPosicionActionPerformed(evt);
            }
        });
        getContentPane().add(txtfPosicion);
        txtfPosicion.setBounds(600, 430, 330, 40);

        txtfNombreEquipo.setEditable(false);
        txtfNombreEquipo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfNombreEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNombreEquipoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfNombreEquipo);
        txtfNombreEquipo.setBounds(600, 550, 260, 40);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblTitulo.setText("JUGADORES");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(450, 0, 440, 80);

        cmbIdEquipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(cmbIdEquipo);
        cmbIdEquipo.setBounds(860, 550, 70, 40);

        txtfFechaNacimiento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfFechaNacimientoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfFechaNacimiento);
        txtfFechaNacimiento.setBounds(600, 490, 330, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearJugadorActionPerformed
        int idEquipo =  Integer.valueOf((String) cmbIdEquipo.getSelectedItem());
        System.out.println(idEquipo);
        
        String nombre = txtfNombres.getText();
        System.out.println(nombre);
        
        String apellidoPaterno = txtfApellidoPaterno.getText();
        System.out.println(apellidoPaterno);
        
        String apellidoMaterno = txtfApellidoMaterno.getText();
        System.out.println(apellidoMaterno);
        
         int numeroCamiseta = Integer.valueOf(txtfNumeroCamiseta.getText());
         System.out.println(numeroCamiseta);
         
         String posicion = txtfPosicion.getText();
         System.out.println(posicion);
         
         String fechaNacimiento = txtfFechaNacimiento.getText();
         System.out.println(fechaNacimiento);
         
        //CONFIRMACION DE CREAR
        int result = JOptionPane.showConfirmDialog(
                new JFrame(),
                "¿ESTAS SEGURO DE CREARLO?", 
                "CANCHASGONZALEZ - CONFIRMACION",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

        if(result == JOptionPane.YES_OPTION){
            System.out.println(1);
            
            Jugador jugador1 = new Jugador(idEquipo, nombre, apellidoPaterno, apellidoMaterno, numeroCamiseta, posicion, fechaNacimiento);
            System.out.println(jugador1);
          
            JugadorDAO jugadorDAO;
            try {
                jugadorDAO = new JugadorDAO();
                
                jugadorDAO.insertarJugador(jugador1);
            
                JOptionPane.showMessageDialog(null, "Se ha registrado el jugador (" + nombre + ") exitosmente.", "Canchas Gonzalez", JOptionPane.INFORMATION_MESSAGE);

                VistaJugadores vistaJugadores = new VistaJugadores();
                vistaJugadores.setVisible(true);
                dispose();
                
            } catch (SQLException ex) {
                Logger.getLogger(VistaJugadoresCrear.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
        }else if (result == JOptionPane.NO_OPTION){
            System.out.println(2);
           
        }else {
            System.out.println(3);
        }
        
    }//GEN-LAST:event_btnCrearJugadorActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VistaJugadores vistaJugadores = new VistaJugadores();
        vistaJugadores.setVisible(true);
        dispose();
            
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtfIdArbitro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfIdArbitro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfIdArbitro1ActionPerformed

    private void txtfNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNombresActionPerformed

    private void txtfApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfApellidoPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfApellidoPaternoActionPerformed

    private void txtfApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfApellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfApellidoMaternoActionPerformed

    private void txtfNumeroCamisetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNumeroCamisetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNumeroCamisetaActionPerformed

    private void txtfPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfPosicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfPosicionActionPerformed

    private void txtfNombreEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNombreEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNombreEquipoActionPerformed

    private void txtfFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfFechaNacimientoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaJugadoresCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaJugadoresCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaJugadoresCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaJugadoresCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaJugadoresCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearJugador;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbIdEquipo;
    private javax.swing.JLabel lblApellidoMaterno1;
    private javax.swing.JLabel lblApellidoPaterno1;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblIdArbitro1;
    private javax.swing.JLabel lblIdEquipo;
    private javax.swing.JLabel lblLogoEmpresa;
    private javax.swing.JLabel lblNombres1;
    private javax.swing.JLabel lblNumeroCamiseta;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtfApellidoMaterno;
    private javax.swing.JTextField txtfApellidoPaterno;
    private javax.swing.JTextField txtfFechaNacimiento;
    private javax.swing.JTextField txtfIdArbitro1;
    private javax.swing.JTextField txtfNombreEquipo;
    private javax.swing.JTextField txtfNombres;
    private javax.swing.JTextField txtfNumeroCamiseta;
    private javax.swing.JTextField txtfPosicion;
    // End of variables declaration//GEN-END:variables
}
