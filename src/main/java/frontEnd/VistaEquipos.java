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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josue
 */
public class VistaEquipos extends javax.swing.JFrame {

    /**
     * Creates new form VistaPlantilla
     */
    public VistaEquipos() {
        initComponents();
        
        Utilidades.cargarLogo(this, "LOGOEMPRESA.png");
        
        DefaultTableModel model = (DefaultTableModel) tblEquipos.getModel();


        EquipoDAO equipoDAO = new EquipoDAO();

        // Obtener todos los productos
        List<Equipo> equipos;
        try {
            equipos = equipoDAO.obtenerEquipos();
            
            System.out.println("Todos los Equipos:");
            for (Equipo equipo : equipos) {

                model.addRow(new Object[]{
                   equipo.getIdEquipo(),
                   equipo.getNombre(),
                   equipo.getTelefono()
                });
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(VistaEquipos.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipos = new javax.swing.JTable();
        btnVisualizar = new javax.swing.JButton();
        btnCrear1 = new javax.swing.JButton();
        btnActualizar1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblIcono = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        lblAside = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        tblEquipos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID EQUIPO", "NOMBRE", "TELEFONO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblEquipos.setColumnSelectionAllowed(true);
        tblEquipos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblEquipos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 110, 750, 500);

        btnVisualizar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnVisualizar.setText("VISUALIZAR");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVisualizar);
        btnVisualizar.setBounds(970, 270, 230, 40);

        btnCrear1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCrear1.setText("CREAR");
        btnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrear1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear1);
        btnCrear1.setBounds(970, 180, 220, 40);

        btnActualizar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnActualizar1.setText("ACTUALIZAR");
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar1);
        btnActualizar1.setBounds(970, 350, 230, 40);

        btnEliminar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEliminar1.setText("ELIMINAR");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar1);
        btnEliminar1.setBounds(970, 420, 230, 40);

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(40, 630, 190, 70);

        lblIcono.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\equipos.png")); // NOI18N
        getContentPane().add(lblIcono);
        lblIcono.setBounds(910, 410, 340, 380);

        lblLogo.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\LOGOEMPRESA.png")); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(970, 0, 230, 170);

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("EQUIPOS");
        getContentPane().add(lblTitulo1);
        lblTitulo1.setBounds(70, 20, 750, 60);

        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\fondo1.png")); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 880, 730);

        lblAside.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\FONDOC.jpg")); // NOI18N
        getContentPane().add(lblAside);
        lblAside.setBounds(880, 0, 400, 730);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrear1ActionPerformed
        // TODO add your handling code here:
        VistaEquiposCrear vistaEquiposCrear = new VistaEquiposCrear();
        vistaEquiposCrear.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCrear1ActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        
        int selectedRow = tblEquipos.getSelectedRow();

        if(selectedRow != -1){
            int idEquipo = (int) tblEquipos.getValueAt(selectedRow, 0);
            System.out.println(idEquipo);

            VistaEquiposVerPorId vistaEquiposVerPorId  = new VistaEquiposVerPorId(idEquipo);
            vistaEquiposVerPorId.setVisible(true);
            dispose();
        }else{
             JOptionPane.showMessageDialog(null, "Por favor selecciona un equipo");
        }
        
         
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
        
        int selectedRow = tblEquipos.getSelectedRow();

        if(selectedRow != -1){
            int idEquipo = (int) tblEquipos.getValueAt(selectedRow, 0);
            System.out.println(idEquipo);

            VistaEquiposActualizar vistaEquiposActualizar  = new VistaEquiposActualizar(idEquipo);
            vistaEquiposActualizar.setVisible(true);
            dispose();
        }else{
             JOptionPane.showMessageDialog(null, "Por favor selecciona un equipo");
        }
        
        
    }//GEN-LAST:event_btnActualizar1ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        int selectedRow = tblEquipos.getSelectedRow();

        if(selectedRow != -1){
            int idEquipo = (int) tblEquipos.getValueAt(selectedRow, 0);
            System.out.println(idEquipo);
            
            //CONFIRMACION PARA ELIMINAR
        
         int result = JOptionPane.showConfirmDialog(
                new JFrame(),
                "¿ESTAS SEGURO DE ELIMINAR ESTE REGISTRO?", 
                "CANCHASGONZALEZ - CONFIRMACION",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

            if(result == JOptionPane.YES_OPTION){
                System.out.println(1);
                
                EquipoDAO equipoDAO = new EquipoDAO();
                int id;
                try {
                    id = equipoDAO.eliminarEquipo(idEquipo);
                    
                    if (id != 0){
                   JOptionPane.showMessageDialog(null, "Se ha eliminado el  equipo exitosamente.", "Canchas Gonzalez", JOptionPane.INFORMATION_MESSAGE);

                    VistaEquipos vistaEquipos = new VistaEquipos();
                    vistaEquipos.setVisible(true);
                    dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar el equipo, vuelve a intentar.", "Canchas Gonzalez", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(VistaEquipos.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el equipo, vuelve a intentar.", "Canchas Gonzalez", JOptionPane.INFORMATION_MESSAGE);
                }
                
                
                

                
               //label.setText("You selected: Yes");
            }else if (result == JOptionPane.NO_OPTION){
                System.out.println(2);
               //label.setText("You selected: No");
            }else {
                System.out.println(3);
            }

        }else{
             JOptionPane.showMessageDialog(null, "Por favor selecciona un arbitro");
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VistaPrincipal vistaPrincipal = new VistaPrincipal();
        vistaPrincipal.setVisible(true);
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
            java.util.logging.Logger.getLogger(VistaEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnCrear1;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAside;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JTable tblEquipos;
    // End of variables declaration//GEN-END:variables
}
