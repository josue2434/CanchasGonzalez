/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontEnd;
import backEnd.Arbitro;
import backEnd.ArbitroDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class VistaArbitrosCrear extends javax.swing.JFrame {

    /**
     * Creates new form VistaPlantilla
     */
    public VistaArbitrosCrear() {
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

        lblNombres1 = new javax.swing.JLabel();
        lblApellidoPaterno1 = new javax.swing.JLabel();
        lblApellidoMaterno1 = new javax.swing.JLabel();
        lblTelefono1 = new javax.swing.JLabel();
        cmbDisponible = new javax.swing.JComboBox<>();
        lblTelefono2 = new javax.swing.JLabel();
        txtfTelefono = new javax.swing.JTextField();
        txtfNombres = new javax.swing.JTextField();
        txtfApellidoPaterno = new javax.swing.JTextField();
        txtfApellidoMaterno = new javax.swing.JTextField();
        lblLogoEmpresa = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnCrearArbitro = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CREAR ARBITRO");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        lblNombres1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNombres1.setText("NOMBRES");
        getContentPane().add(lblNombres1);
        lblNombres1.setBounds(270, 210, 190, 40);

        lblApellidoPaterno1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblApellidoPaterno1.setText("APELLIDO  PATERNO");
        getContentPane().add(lblApellidoPaterno1);
        lblApellidoPaterno1.setBounds(270, 270, 250, 40);

        lblApellidoMaterno1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblApellidoMaterno1.setText("APELLIDO  MATERNO");
        getContentPane().add(lblApellidoMaterno1);
        lblApellidoMaterno1.setBounds(270, 340, 250, 40);

        lblTelefono1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTelefono1.setText("TELEFONO");
        getContentPane().add(lblTelefono1);
        lblTelefono1.setBounds(270, 410, 250, 40);

        cmbDisponible.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbDisponible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));
        getContentPane().add(cmbDisponible);
        cmbDisponible.setBounds(590, 480, 330, 50);

        lblTelefono2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTelefono2.setText("DISPONIBLE");
        getContentPane().add(lblTelefono2);
        lblTelefono2.setBounds(270, 490, 250, 40);

        txtfTelefono.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfTelefono);
        txtfTelefono.setBounds(590, 410, 330, 40);

        txtfNombres.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNombresActionPerformed(evt);
            }
        });
        getContentPane().add(txtfNombres);
        txtfNombres.setBounds(590, 200, 330, 40);

        txtfApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfApellidoPaternoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfApellidoPaterno);
        txtfApellidoPaterno.setBounds(590, 270, 330, 40);

        txtfApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfApellidoMaternoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfApellidoMaterno);
        txtfApellidoMaterno.setBounds(590, 340, 330, 40);

        lblLogoEmpresa.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\LOGOEMPRESA.png")); // NOI18N
        getContentPane().add(lblLogoEmpresa);
        lblLogoEmpresa.setBounds(-40, 0, 180, 190);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblTitulo.setText("ARBITROS");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(450, 0, 440, 80);

        btnCrearArbitro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCrearArbitro.setText("CREAR ARBITRO");
        btnCrearArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArbitroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearArbitro);
        btnCrearArbitro.setBounds(960, 600, 290, 70);

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(30, 630, 190, 70);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfTelefonoActionPerformed

    private void txtfNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNombresActionPerformed

    private void txtfApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfApellidoPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfApellidoPaternoActionPerformed

    private void txtfApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfApellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfApellidoMaternoActionPerformed

    private void btnCrearArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArbitroActionPerformed
        // TODO add your handling code here:
        String nombre = txtfNombres.getText();
        System.out.println(nombre);
        
        String apellidoPaterno = txtfApellidoPaterno.getText();
        System.out.println(apellidoPaterno);
        
        String apellidoMaterno = txtfApellidoMaterno.getText();
        System.out.println(apellidoMaterno);
        
         String telefono = txtfTelefono.getText();
        System.out.println(telefono);
        
         int disponible =  cmbDisponible.getSelectedIndex();
        System.out.println(disponible);
        
        
        
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
            Arbitro arbitro1 = new Arbitro(nombre, apellidoPaterno, apellidoMaterno, telefono, disponible);
            System.out.println(arbitro1);
          
            ArbitroDAO arbitroDAO = new ArbitroDAO();
            arbitroDAO.agregarArbitro(arbitro1);
            
            JOptionPane.showMessageDialog(null, "Se ha registrado el arbitro (" + nombre + ") exitosmente.", "Canchas Gonzalez", JOptionPane.INFORMATION_MESSAGE);
    
            VistaArbitros vistaArbitros = new VistaArbitros();
            vistaArbitros.setVisible(true);
            dispose();
           //label.setText("You selected: Yes");
        }else if (result == JOptionPane.NO_OPTION){
            System.out.println(2);
           //label.setText("You selected: No");
        }else {
            System.out.println(3);
        }
        
    }//GEN-LAST:event_btnCrearArbitroActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VistaArbitros vistaArbitros = new VistaArbitros();
        vistaArbitros.setVisible(true);
        dispose();
            
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaArbitrosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaArbitrosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaArbitrosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaArbitrosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaArbitrosCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearArbitro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbDisponible;
    private javax.swing.JLabel lblApellidoMaterno1;
    private javax.swing.JLabel lblApellidoPaterno1;
    private javax.swing.JLabel lblLogoEmpresa;
    private javax.swing.JLabel lblNombres1;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JLabel lblTelefono2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtfApellidoMaterno;
    private javax.swing.JTextField txtfApellidoPaterno;
    private javax.swing.JTextField txtfNombres;
    private javax.swing.JTextField txtfTelefono;
    // End of variables declaration//GEN-END:variables
}
