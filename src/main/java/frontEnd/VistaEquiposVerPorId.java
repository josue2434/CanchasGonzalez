/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontEnd;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class VistaEquiposVerPorId extends javax.swing.JFrame {

    /**
     * Creates new form VistaPlantilla
     */
    public VistaEquiposVerPorId() {
        initComponents();
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
        btnRegresar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lbLTelefono = new javax.swing.JLabel();
        txtfNombre = new javax.swing.JTextField();
        txtfTelefono = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArbitros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CREAR ARBITRO");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        lblLogoEmpresa.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\LOGOEMPRESA.png")); // NOI18N
        getContentPane().add(lblLogoEmpresa);
        lblLogoEmpresa.setBounds(-40, 0, 180, 190);

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(30, 630, 190, 70);

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNombre.setText("NOMBRE");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(340, 100, 230, 20);

        lbLTelefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbLTelefono.setText("TELEFONO");
        getContentPane().add(lbLTelefono);
        lbLTelefono.setBounds(880, 100, 290, 20);

        txtfNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtfNombre);
        txtfNombre.setBounds(220, 140, 380, 40);

        txtfTelefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfTelefono);
        txtfTelefono.setBounds(790, 140, 380, 40);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblTitulo.setText("EQUIPOS");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(540, -10, 440, 80);

        tblArbitros.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tblArbitros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID EQUIPO", "ID JUGADOR", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "NUMERO CAMISETA", "POSICION", "FECHA NACIMINETO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblArbitros.setEnabled(false);
        jScrollPane1.setViewportView(tblArbitros);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 210, 1170, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
     VistaEquipos vistaEquipos = new VistaEquipos();
     vistaEquipos.setVisible(true);
     dispose();
            
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNombreActionPerformed

    private void txtfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaEquiposVerPorId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEquiposVerPorId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEquiposVerPorId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEquiposVerPorId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaEquiposVerPorId().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLTelefono;
    private javax.swing.JLabel lblLogoEmpresa;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblArbitros;
    private javax.swing.JTextField txtfNombre;
    private javax.swing.JTextField txtfTelefono;
    // End of variables declaration//GEN-END:variables
}