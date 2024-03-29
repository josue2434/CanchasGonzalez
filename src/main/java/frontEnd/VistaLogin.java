/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontEnd;

/**
 *
 * @author josue
 */
public class VistaLogin extends javax.swing.JFrame {

    /**
     * Creates new form VistaPlantilla
     */
    public VistaLogin() {
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

        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtfEmail = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtpPassword = new javax.swing.JPasswordField();
        lblLogoEmpresa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblEmail.setText("EMAIL");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(210, 190, 110, 48);

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblPassword.setText("CONTRASEÑA");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(120, 330, 280, 40);

        txtfEmail.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        getContentPane().add(txtfEmail);
        txtfEmail.setBounds(560, 190, 330, 50);

        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnLogin.setText("INICIAR SESION");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(380, 480, 310, 80);

        txtpPassword.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtpPassword.setText("jPasswordField1");
        getContentPane().add(txtpPassword);
        txtpPassword.setBounds(560, 320, 330, 60);

        lblLogoEmpresa.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\LOGOEMPRESA.png")); // NOI18N
        getContentPane().add(lblLogoEmpresa);
        lblLogoEmpresa.setBounds(0, 0, 220, 180);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String email = txtfEmail.getText();
        String password = String.valueOf(txtpPassword.getPassword());
        System.out.println(email);
        System.out.println(password);
        
        VistaPrincipal vistaPrincipal = new VistaPrincipal();
        vistaPrincipal.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogoEmpresa;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtfEmail;
    private javax.swing.JPasswordField txtpPassword;
    // End of variables declaration//GEN-END:variables
}
