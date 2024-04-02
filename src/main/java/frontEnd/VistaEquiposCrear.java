/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontEnd;
import backEnd.Arbitro;
import backEnd.ArbitroDAO;
import backEnd.Equipo;
import backEnd.EquipoDAO;
import backEnd.Utilidades;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class VistaEquiposCrear extends javax.swing.JFrame {

    /**
     * Creates new form VistaPlantilla
     */
    public VistaEquiposCrear() {
        initComponents();
        Utilidades.cargarLogo(this, "LOGOEMPRESA.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearEquipo = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lbLTelefono = new javax.swing.JLabel();
        txtfNombre = new javax.swing.JTextField();
        txtfTelefono = new javax.swing.JTextField();
        btnRegresar2 = new javax.swing.JButton();
        lblIcono = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblLogoEmpresa = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        lblAside = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CREAR EQUIPO");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        btnCrearEquipo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCrearEquipo.setText("CREAR EQUIPO");
        btnCrearEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEquipoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearEquipo);
        btnCrearEquipo.setBounds(480, 500, 290, 70);

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("NOMBRE");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(420, 140, 400, 40);

        lbLTelefono.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbLTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLTelefono.setText("TELEFONO");
        getContentPane().add(lbLTelefono);
        lbLTelefono.setBounds(420, 300, 400, 40);

        txtfNombre.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtfNombre);
        txtfNombre.setBounds(420, 210, 400, 60);

        txtfTelefono.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        txtfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfTelefono);
        txtfTelefono.setBounds(420, 380, 400, 60);

        btnRegresar2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegresar2.setText("REGRESAR");
        btnRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar2);
        btnRegresar2.setBounds(30, 600, 190, 70);

        lblIcono.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\equipos.png")); // NOI18N
        getContentPane().add(lblIcono);
        lblIcono.setBounds(900, 210, 340, 250);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("EQUIPO");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(0, 320, 250, 80);

        lblLogoEmpresa.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\LOGOEMPRESA.png")); // NOI18N
        getContentPane().add(lblLogoEmpresa);
        lblLogoEmpresa.setBounds(20, 80, 180, 190);

        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\fondo1.png")); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(250, 0, 1030, 720);

        lblAside.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\FONDOC.jpg")); // NOI18N
        getContentPane().add(lblAside);
        lblAside.setBounds(0, 0, 1290, 730);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEquipoActionPerformed
        
         
        String nombre = txtfNombre.getText();
        System.out.println(nombre);
        
        String telefono = txtfTelefono.getText();
        System.out.println(telefono);
        
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
            
            Equipo equipo1 = new Equipo(nombre, telefono);
            System.out.println(equipo1);
            
            
            EquipoDAO equipoDAO = new EquipoDAO();
            try {
                equipoDAO.insertarEquipo(equipo1);
                
                JOptionPane.showMessageDialog(null, "Se ha registrado el equipo (" + nombre + ") exitosmente.", "Canchas Gonzalez", JOptionPane.INFORMATION_MESSAGE);
    
                VistaEquipos vistaEquipos = new VistaEquipos();
                vistaEquipos.setVisible(true);
                dispose();
                
            } catch (SQLException ex) {
                Logger.getLogger(VistaEquiposCrear.class.getName()).log(Level.SEVERE, null, ex);
                
                JOptionPane.showMessageDialog(null, "No se pudo registrar el equipo (" + nombre + ") exitosmente.", "Canchas Gonzalez", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
            
           //label.setText("You selected: Yes");
        }else if (result == JOptionPane.NO_OPTION){
            System.out.println(2);
           //label.setText("You selected: No");
        }else {
            System.out.println(3);
        }
    }//GEN-LAST:event_btnCrearEquipoActionPerformed

    private void txtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNombreActionPerformed

    private void txtfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfTelefonoActionPerformed

    private void btnRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar2ActionPerformed
        // TODO add your handling code here:
        VistaEquipos vistaEquipos = new VistaEquipos();
        vistaEquipos.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresar2ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaEquiposCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEquiposCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEquiposCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEquiposCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new VistaEquiposCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearEquipo;
    private javax.swing.JButton btnRegresar2;
    private javax.swing.JLabel lbLTelefono;
    private javax.swing.JLabel lblAside;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblLogoEmpresa;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtfNombre;
    private javax.swing.JTextField txtfTelefono;
    // End of variables declaration//GEN-END:variables
}
