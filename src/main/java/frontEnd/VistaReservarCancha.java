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
import backEnd.Reserva;
import backEnd.ReservaDAO;
import backEnd.Utilidades;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author josue
 */
public class VistaReservarCancha extends javax.swing.JFrame {

    // Atributos
    public CustomDatePicker datePicker;
    public Reserva reservaTemporal;
    /**
     * Creates new form VistaPlantilla
     */
    
    public VistaReservarCancha(){
        initComponents();
    }
    
    public VistaReservarCancha(String fecha) {
        initComponents();
        Utilidades.cargarLogo(this, "LOGOEMPRESA.png");
        
        this.reservaTemporal = new Reserva();

        this.datePicker = new CustomDatePicker();
        jpFecha.add(datePicker, BorderLayout.CENTER);
        jpFecha.setVisible(true);
        
        lblFechaSeleccionada.setText(fecha);
       
        try {
            
            
            EquipoDAO equipoDAO = new EquipoDAO();
            List <Equipo> equipos = equipoDAO.obtenerEquipos();
            
            ArbitroDAO arbitroDAO = new ArbitroDAO();
            List <Arbitro> arbitros = arbitroDAO.obtenerArbitros();
            
            ReservaDAO reservaDAO = new ReservaDAO();
            List <Reserva> reservasPorFecha = reservaDAO.obtenerReservasPorFecha(fecha);
            System.out.println(reservasPorFecha);
            
            if(!reservasPorFecha.get(0).isDisponible()){
                btnInfoM1.setBackground(Color.RED);
                btnInfoM1.setForeground(Color.WHITE);
            }else{
                btnInfoM1.setBackground(Utilidades.VERDE);
                btnInfoM1.setForeground(Color.WHITE);
            }
            btnInfoM1.setText(reservasPorFecha.get(0).isDisponible() ? "✅" : "❌" );
            lblRM1.setText( String.valueOf( reservasPorFecha.get(0).getIdReserva() ));
            lblLM1.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(0).getIdEquipoLocal() )));
            lblVM1.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(0).getIdEquipoVisitante())));
            lblAM1.setText( String.valueOf( arbitroDAO.obtenerArbitroPorId(reservasPorFecha.get(0).getIdArbitro())));
            
            
            if(!reservasPorFecha.get(1).isDisponible()){
                btnInfoM2.setBackground(Color.RED);
                btnInfoM2.setForeground(Color.WHITE);
            }else{
                btnInfoM2.setBackground(Utilidades.VERDE);
                btnInfoM2.setForeground(Color.WHITE);
            }
            btnInfoM2.setText(reservasPorFecha.get(1).isDisponible() ? "✅" : "❌" );
            lblRM2.setText( String.valueOf( reservasPorFecha.get(1).getIdReserva() ));
            lblLM2.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(1).getIdEquipoLocal() )));
            lblVM2.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(1).getIdEquipoVisitante())));
            lblAM2.setText( String.valueOf( arbitroDAO.obtenerArbitroPorId(reservasPorFecha.get(1).getIdArbitro())));
            
            
            if(!reservasPorFecha.get(2).isDisponible()){
                btnInfoM3.setBackground(Color.RED);
                btnInfoM3.setForeground(Color.WHITE);
            }else{
                btnInfoM3.setBackground(Utilidades.VERDE);
                btnInfoM3.setForeground(Color.WHITE);
            }
            btnInfoM3.setText(reservasPorFecha.get(2).isDisponible() ? "✅" : "❌" );
            lblRM3.setText( String.valueOf( reservasPorFecha.get(2).getIdReserva() ));
            lblLM3.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(2).getIdEquipoLocal() )));
            lblVM3.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(2).getIdEquipoVisitante())));
            lblAM3.setText( String.valueOf( arbitroDAO.obtenerArbitroPorId(reservasPorFecha.get(2).getIdArbitro())));
            
            if(!reservasPorFecha.get(3).isDisponible()){
                btnInfoM4.setBackground(Color.RED);
                btnInfoM4.setForeground(Color.WHITE);
            }else{
                btnInfoM4.setBackground(Utilidades.VERDE);
                btnInfoM4.setForeground(Color.WHITE);
            }
            btnInfoM4.setText(reservasPorFecha.get(3).isDisponible() ? "✅" : "❌" );
            lblRM4.setText( String.valueOf( reservasPorFecha.get(3).getIdReserva() ));
            lblLM4.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(3).getIdEquipoLocal() )));
            lblVM4.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(3).getIdEquipoVisitante())));
            lblAM4.setText( String.valueOf( arbitroDAO.obtenerArbitroPorId(reservasPorFecha.get(3).getIdArbitro())));
            
            if(!reservasPorFecha.get(4).isDisponible()){
                btnInfoM5.setBackground(Color.RED);
                btnInfoM5.setForeground(Color.WHITE);
            }else{
                btnInfoM5.setBackground(Utilidades.VERDE);
                btnInfoM5.setForeground(Color.WHITE);
            }
            btnInfoM5.setText(reservasPorFecha.get(4).isDisponible() ? "✅" : "❌" );
            lblRM5.setText( String.valueOf( reservasPorFecha.get(4).getIdReserva() ));
            lblLM5.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(4).getIdEquipoLocal() )));
            lblVM5.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(4).getIdEquipoVisitante())));
            lblAM5.setText( String.valueOf( arbitroDAO.obtenerArbitroPorId(reservasPorFecha.get(4).getIdArbitro())));
            
            if(!reservasPorFecha.get(5).isDisponible()){
                btnInfoV1.setBackground(Color.RED);
                btnInfoV1.setForeground(Color.WHITE);
            }else{
                btnInfoV1.setBackground(Utilidades.VERDE);
                btnInfoV1.setForeground(Color.WHITE);
            }
            btnInfoV1.setText(reservasPorFecha.get(5).isDisponible() ? "✅" : "❌" );
            lblRV1.setText( String.valueOf( reservasPorFecha.get(5).getIdReserva() ));
            lblLV1.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(5).getIdEquipoLocal() )));
            lblVV1.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(5).getIdEquipoVisitante())));
            lblAV1.setText( String.valueOf( arbitroDAO.obtenerArbitroPorId(reservasPorFecha.get(5).getIdArbitro())));
            
            
            if(!reservasPorFecha.get(6).isDisponible()){
                btnInfoV2.setBackground(Color.RED);
                btnInfoV2.setForeground(Color.WHITE);
            }else{
                btnInfoV2.setBackground(Utilidades.VERDE);
                btnInfoV2.setForeground(Color.WHITE);
            }
            btnInfoV2.setText(reservasPorFecha.get(6).isDisponible() ? "✅" : "❌" );
            lblRV2.setText( String.valueOf( reservasPorFecha.get(6).getIdReserva() ));
            lblLV2.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(6).getIdEquipoLocal() )));
            lblVV2.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(6).getIdEquipoVisitante())));
            lblAV2.setText( String.valueOf( arbitroDAO.obtenerArbitroPorId(reservasPorFecha.get(6).getIdArbitro())));
            
            if(!reservasPorFecha.get(7).isDisponible()){
                btnInfoV3.setBackground(Color.RED);
                btnInfoV3.setForeground(Color.WHITE);
            }else{
                btnInfoV3.setBackground(Utilidades.VERDE);
                btnInfoV3.setForeground(Color.WHITE);
            }
            btnInfoV3.setText(reservasPorFecha.get(7).isDisponible() ? "✅" : "❌" );
            lblRV3.setText( String.valueOf( reservasPorFecha.get(7).getIdReserva() ));
            lblLV3.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(7).getIdEquipoLocal() )));
            lblVV3.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(7).getIdEquipoVisitante())));
            lblAV3.setText( String.valueOf( arbitroDAO.obtenerArbitroPorId(reservasPorFecha.get(7).getIdArbitro())));

            if(!reservasPorFecha.get(8).isDisponible()){
                btnInfoV4.setBackground(Color.RED);
                btnInfoV4.setForeground(Color.WHITE);
            }else{
                btnInfoV4.setBackground(Utilidades.VERDE);
                btnInfoV4.setForeground(Color.WHITE);
            }
            btnInfoV4.setText(reservasPorFecha.get(8).isDisponible() ? "✅" : "❌" );
            lblRV4.setText( String.valueOf( reservasPorFecha.get(8).getIdReserva() ));
            lblLV4.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(8).getIdEquipoLocal() )));
            lblVV4.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(8).getIdEquipoVisitante())));
            lblAV4.setText( String.valueOf( arbitroDAO.obtenerArbitroPorId(reservasPorFecha.get(8).getIdArbitro())));
 
            if(!reservasPorFecha.get(9).isDisponible()){
                btnInfoV5.setBackground(Color.RED);
                btnInfoV5.setForeground(Color.WHITE);
            }else{
                btnInfoV5.setBackground(Utilidades.VERDE);
                btnInfoV5.setForeground(Color.WHITE);
            }        
            
            btnInfoV5.setText(reservasPorFecha.get(9).isDisponible() ? "✅" : "❌" );
            lblRV5.setText( String.valueOf( reservasPorFecha.get(9).getIdReserva() ));
            lblLV5.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(9).getIdEquipoLocal() )));
            lblVV5.setText( String.valueOf( equipoDAO.obtenerEquipoPorId(reservasPorFecha.get(9).getIdEquipoVisitante())));
            lblAV5.setText( String.valueOf( arbitroDAO.obtenerArbitroPorId(reservasPorFecha.get(9).getIdArbitro())));
            
            for (Equipo equipo : equipos) {
                cmbIdEquipoLocal.addItem(String.valueOf(equipo.getIdEquipo()));
                cmbIdEquipoVisitante.addItem(String.valueOf(equipo.getIdEquipo()));
            }
            
            for (Arbitro arbitro : arbitros) {
                cmbIdArbitro.addItem(String.valueOf(arbitro.getIdArbitro()));
            }
           
            cmbIdEquipoLocal.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {

                        try {
                            String id = (String) cmbIdEquipoLocal.getSelectedItem();
                            System.out.println(id);
                            Equipo equipo = equipoDAO.obtenerEquipoPorId(Integer.valueOf(id));
                            txtfIdEquipoLocal.setText(equipo.getNombre());
                        } catch (SQLException ex) {
                            System.out.println("Error al cargar los datos de equipo");
                        }
                    }
                }
            });
            
            cmbIdEquipoVisitante.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {

                        try {
                            String id = (String) cmbIdEquipoVisitante.getSelectedItem();
                            System.out.println(id);
                            Equipo equipo = equipoDAO.obtenerEquipoPorId(Integer.valueOf(id));
                            txtfIdEquipoVisitante.setText(equipo.getNombre());
                        } catch (SQLException ex) {
                            System.out.println("Error al cargar los datos de equipo");
                        }
                    }
                }
            });
            
            cmbIdArbitro.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {

                        String id = (String) cmbIdArbitro.getSelectedItem();
                        System.out.println(id);
                        Arbitro arbitro = arbitroDAO.obtenerArbitroPorId(Integer.valueOf(id));
                        txtfIdArbitro.setText(arbitro.getNombre() + " " +arbitro.getApellidoPaterno() + " " + arbitro.getApellidoMaterno());
                    }
                }
            });
            

            }   catch (SQLException ex) {
                    Logger.getLogger(VistaReservarCancha.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        cmbIdArbitro.setSelectedIndex(-1);
        cmbIdArbitro.setSelectedIndex(-0);
        cmbIdEquipoLocal.setSelectedIndex(-1);
        cmbIdEquipoLocal.setSelectedIndex(0);
        cmbIdEquipoVisitante.setSelectedIndex(-1);
        cmbIdEquipoVisitante.setSelectedIndex(0);
        cmbIdArbitro.setSelectedIndex(-1);
        cmbIdArbitro.setSelectedIndex(0);
        
    }    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        lblRM1 = new javax.swing.JLabel();
        lblRM2 = new javax.swing.JLabel();
        lblRM3 = new javax.swing.JLabel();
        lblRM4 = new javax.swing.JLabel();
        lblRM5 = new javax.swing.JLabel();
        lblRV1 = new javax.swing.JLabel();
        lblRV2 = new javax.swing.JLabel();
        lblRV3 = new javax.swing.JLabel();
        lblRV4 = new javax.swing.JLabel();
        lblRV5 = new javax.swing.JLabel();
        jpFecha = new javax.swing.JPanel();
        lblIdArbitro = new javax.swing.JLabel();
        txtfIdArbitro = new javax.swing.JTextField();
        cmbIdArbitro = new javax.swing.JComboBox<>();
        lblIdEquipoVisitante = new javax.swing.JLabel();
        txtfIdEquipoVisitante = new javax.swing.JTextField();
        cmbIdEquipoVisitante = new javax.swing.JComboBox<>();
        lblIdEquipoLocal = new javax.swing.JLabel();
        txtfIdEquipoLocal = new javax.swing.JTextField();
        cmbIdEquipoLocal = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        btnDisponibilidad = new javax.swing.JButton();
        btnInfoM1 = new javax.swing.JButton();
        btnInfoM2 = new javax.swing.JButton();
        btnInfoM3 = new javax.swing.JButton();
        btnInfoM4 = new javax.swing.JButton();
        btnInfoM5 = new javax.swing.JButton();
        lblM1 = new javax.swing.JLabel();
        lblM2 = new javax.swing.JLabel();
        lblM3 = new javax.swing.JLabel();
        lblM4 = new javax.swing.JLabel();
        lblM5 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lblTM = new javax.swing.JLabel();
        btnInfoV1 = new javax.swing.JButton();
        btnInfoV2 = new javax.swing.JButton();
        btnInfoV3 = new javax.swing.JButton();
        btnInfoV4 = new javax.swing.JButton();
        btnInfoV5 = new javax.swing.JButton();
        lblM6 = new javax.swing.JLabel();
        lblM7 = new javax.swing.JLabel();
        lblM8 = new javax.swing.JLabel();
        lblM9 = new javax.swing.JLabel();
        lblM10 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lblTV = new javax.swing.JLabel();
        lblFechaSeleccionada = new javax.swing.JLabel();
        lblLM1 = new javax.swing.JLabel();
        lblLM2 = new javax.swing.JLabel();
        lblLM3 = new javax.swing.JLabel();
        lblLM4 = new javax.swing.JLabel();
        lblLM5 = new javax.swing.JLabel();
        lblLV1 = new javax.swing.JLabel();
        lblLV2 = new javax.swing.JLabel();
        lblLV3 = new javax.swing.JLabel();
        lblLV4 = new javax.swing.JLabel();
        lblLV5 = new javax.swing.JLabel();
        lblVM1 = new javax.swing.JLabel();
        lblVM2 = new javax.swing.JLabel();
        lblVM3 = new javax.swing.JLabel();
        lblVM4 = new javax.swing.JLabel();
        lblVM5 = new javax.swing.JLabel();
        lblVV1 = new javax.swing.JLabel();
        lblVV2 = new javax.swing.JLabel();
        lblVV3 = new javax.swing.JLabel();
        lblVV4 = new javax.swing.JLabel();
        lblVV5 = new javax.swing.JLabel();
        lblValidacion = new javax.swing.JLabel();
        lblAM1 = new javax.swing.JLabel();
        lblAM2 = new javax.swing.JLabel();
        lblAM3 = new javax.swing.JLabel();
        lblAM4 = new javax.swing.JLabel();
        lblAM5 = new javax.swing.JLabel();
        lblAV5 = new javax.swing.JLabel();
        lblAV4 = new javax.swing.JLabel();
        lblAV3 = new javax.swing.JLabel();
        lblAV2 = new javax.swing.JLabel();
        lblAV1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblEncabezado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESERVAR CANCHAS");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(690, 0, 40, 170);

        lblRM1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRM1.setForeground(new java.awt.Color(51, 51, 51));
        lblRM1.setText("RESERVA #");
        getContentPane().add(lblRM1);
        lblRM1.setBounds(180, 330, 140, 20);

        lblRM2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRM2.setForeground(new java.awt.Color(51, 51, 51));
        lblRM2.setText("RESERVA #");
        getContentPane().add(lblRM2);
        lblRM2.setBounds(410, 330, 140, 20);

        lblRM3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRM3.setForeground(new java.awt.Color(51, 51, 51));
        lblRM3.setText("RESERVA #");
        getContentPane().add(lblRM3);
        lblRM3.setBounds(630, 330, 140, 20);

        lblRM4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRM4.setForeground(new java.awt.Color(51, 51, 51));
        lblRM4.setText("RESERVA #");
        getContentPane().add(lblRM4);
        lblRM4.setBounds(840, 330, 140, 20);

        lblRM5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRM5.setForeground(new java.awt.Color(51, 51, 51));
        lblRM5.setText("RESERVA #");
        getContentPane().add(lblRM5);
        lblRM5.setBounds(1040, 330, 140, 20);

        lblRV1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRV1.setForeground(new java.awt.Color(51, 51, 51));
        lblRV1.setText("RESERVA #");
        getContentPane().add(lblRV1);
        lblRV1.setBounds(170, 570, 140, 20);

        lblRV2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRV2.setForeground(new java.awt.Color(51, 51, 51));
        lblRV2.setText("RESERVA #");
        getContentPane().add(lblRV2);
        lblRV2.setBounds(400, 570, 140, 20);

        lblRV3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRV3.setForeground(new java.awt.Color(51, 51, 51));
        lblRV3.setText("RESERVA #");
        getContentPane().add(lblRV3);
        lblRV3.setBounds(620, 570, 140, 20);

        lblRV4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRV4.setForeground(new java.awt.Color(51, 51, 51));
        lblRV4.setText("RESERVA #");
        getContentPane().add(lblRV4);
        lblRV4.setBounds(830, 570, 140, 20);

        lblRV5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRV5.setForeground(new java.awt.Color(51, 51, 51));
        lblRV5.setText("RESERVA #");
        getContentPane().add(lblRV5);
        lblRV5.setBounds(1030, 570, 140, 20);

        jpFecha.setBackground(new java.awt.Color(51, 51, 51));
        jpFecha.setBorder(new javax.swing.border.MatteBorder(null));
        jpFecha.setForeground(new java.awt.Color(255, 255, 204));
        getContentPane().add(jpFecha);
        jpFecha.setBounds(220, 10, 350, 40);

        lblIdArbitro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblIdArbitro.setForeground(new java.awt.Color(255, 255, 255));
        lblIdArbitro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdArbitro.setText("ARBITRO");
        getContentPane().add(lblIdArbitro);
        lblIdArbitro.setBounds(720, 110, 130, 40);

        txtfIdArbitro.setEditable(false);
        txtfIdArbitro.setBackground(new java.awt.Color(255, 255, 255));
        txtfIdArbitro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfIdArbitro.setForeground(new java.awt.Color(51, 51, 51));
        txtfIdArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfIdArbitroActionPerformed(evt);
            }
        });
        getContentPane().add(txtfIdArbitro);
        txtfIdArbitro.setBounds(930, 110, 260, 40);

        cmbIdArbitro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbIdArbitro.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cmbIdArbitro);
        cmbIdArbitro.setBounds(860, 110, 70, 40);

        lblIdEquipoVisitante.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblIdEquipoVisitante.setForeground(new java.awt.Color(255, 255, 255));
        lblIdEquipoVisitante.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdEquipoVisitante.setText("VISITANTE");
        getContentPane().add(lblIdEquipoVisitante);
        lblIdEquipoVisitante.setBounds(720, 60, 130, 40);

        txtfIdEquipoVisitante.setEditable(false);
        txtfIdEquipoVisitante.setBackground(new java.awt.Color(255, 255, 255));
        txtfIdEquipoVisitante.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfIdEquipoVisitante.setForeground(new java.awt.Color(51, 51, 51));
        txtfIdEquipoVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfIdEquipoVisitanteActionPerformed(evt);
            }
        });
        getContentPane().add(txtfIdEquipoVisitante);
        txtfIdEquipoVisitante.setBounds(930, 60, 260, 40);

        cmbIdEquipoVisitante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbIdEquipoVisitante.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cmbIdEquipoVisitante);
        cmbIdEquipoVisitante.setBounds(860, 60, 70, 40);

        lblIdEquipoLocal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblIdEquipoLocal.setForeground(new java.awt.Color(255, 255, 255));
        lblIdEquipoLocal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdEquipoLocal.setText("LOCAL");
        getContentPane().add(lblIdEquipoLocal);
        lblIdEquipoLocal.setBounds(760, 10, 90, 40);

        txtfIdEquipoLocal.setEditable(false);
        txtfIdEquipoLocal.setBackground(new java.awt.Color(255, 255, 255));
        txtfIdEquipoLocal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtfIdEquipoLocal.setForeground(new java.awt.Color(51, 51, 51));
        txtfIdEquipoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfIdEquipoLocalActionPerformed(evt);
            }
        });
        getContentPane().add(txtfIdEquipoLocal);
        txtfIdEquipoLocal.setBounds(930, 10, 260, 40);

        cmbIdEquipoLocal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbIdEquipoLocal.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cmbIdEquipoLocal);
        cmbIdEquipoLocal.setBounds(860, 10, 70, 40);

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 170, 1160, 10);

        btnDisponibilidad.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDisponibilidad.setForeground(new java.awt.Color(51, 51, 51));
        btnDisponibilidad.setText("VER DISPONIBILIDAD");
        btnDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisponibilidadActionPerformed(evt);
            }
        });
        getContentPane().add(btnDisponibilidad);
        btnDisponibilidad.setBounds(250, 90, 300, 60);

        btnInfoM1.setBackground(new java.awt.Color(51, 153, 0));
        btnInfoM1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnInfoM1.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoM1.setIconTextGap(0);
        btnInfoM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoM1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfoM1);
        btnInfoM1.setBounds(220, 250, 60, 50);

        btnInfoM2.setBackground(new java.awt.Color(51, 153, 0));
        btnInfoM2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnInfoM2.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoM2.setIconTextGap(0);
        btnInfoM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoM2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfoM2);
        btnInfoM2.setBounds(450, 250, 60, 50);

        btnInfoM3.setBackground(new java.awt.Color(51, 153, 0));
        btnInfoM3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnInfoM3.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoM3.setIconTextGap(0);
        btnInfoM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoM3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfoM3);
        btnInfoM3.setBounds(670, 250, 60, 50);

        btnInfoM4.setBackground(new java.awt.Color(51, 153, 0));
        btnInfoM4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnInfoM4.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoM4.setIconTextGap(0);
        btnInfoM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoM4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfoM4);
        btnInfoM4.setBounds(880, 250, 60, 50);

        btnInfoM5.setBackground(new java.awt.Color(51, 153, 0));
        btnInfoM5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnInfoM5.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoM5.setIconTextGap(0);
        btnInfoM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoM5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfoM5);
        btnInfoM5.setBounds(1080, 250, 60, 50);

        lblM1.setForeground(new java.awt.Color(51, 51, 51));
        lblM1.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\cancha.png")); // NOI18N
        getContentPane().add(lblM1);
        lblM1.setBounds(180, 200, 150, 150);

        lblM2.setForeground(new java.awt.Color(51, 51, 51));
        lblM2.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\cancha.png")); // NOI18N
        getContentPane().add(lblM2);
        lblM2.setBounds(410, 200, 150, 150);

        lblM3.setForeground(new java.awt.Color(51, 51, 51));
        lblM3.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\cancha.png")); // NOI18N
        getContentPane().add(lblM3);
        lblM3.setBounds(630, 200, 150, 150);

        lblM4.setForeground(new java.awt.Color(51, 51, 51));
        lblM4.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\cancha.png")); // NOI18N
        getContentPane().add(lblM4);
        lblM4.setBounds(840, 200, 150, 150);

        lblM5.setForeground(new java.awt.Color(51, 51, 51));
        lblM5.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\cancha.png")); // NOI18N
        getContentPane().add(lblM5);
        lblM5.setBounds(1040, 200, 150, 150);

        lbl2.setBackground(new java.awt.Color(153, 153, 153));
        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl2.setForeground(new java.awt.Color(51, 51, 51));
        lbl2.setText("CANCHA 1");
        getContentPane().add(lbl2);
        lbl2.setBounds(190, 180, 130, 32);

        lbl3.setBackground(new java.awt.Color(153, 153, 153));
        lbl3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl3.setForeground(new java.awt.Color(51, 51, 51));
        lbl3.setText("CANCHA 2");
        getContentPane().add(lbl3);
        lbl3.setBounds(420, 180, 130, 32);

        lbl4.setBackground(new java.awt.Color(153, 153, 153));
        lbl4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl4.setForeground(new java.awt.Color(51, 51, 51));
        lbl4.setText("CANCHA 3");
        getContentPane().add(lbl4);
        lbl4.setBounds(640, 180, 130, 32);

        lbl5.setBackground(new java.awt.Color(153, 153, 153));
        lbl5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl5.setForeground(new java.awt.Color(51, 51, 51));
        lbl5.setText("CANCHA 4");
        getContentPane().add(lbl5);
        lbl5.setBounds(850, 180, 130, 32);

        lbl6.setBackground(new java.awt.Color(153, 153, 153));
        lbl6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl6.setForeground(new java.awt.Color(51, 51, 51));
        lbl6.setText("CANCHA 5");
        getContentPane().add(lbl6);
        lbl6.setBounds(1050, 180, 130, 32);

        lblTM.setBackground(new java.awt.Color(153, 153, 153));
        lblTM.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTM.setForeground(new java.awt.Color(102, 102, 102));
        lblTM.setText("MATUTINO");
        getContentPane().add(lblTM);
        lblTM.setBounds(20, 250, 130, 32);

        btnInfoV1.setBackground(new java.awt.Color(51, 153, 0));
        btnInfoV1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnInfoV1.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoV1.setIconTextGap(0);
        btnInfoV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoV1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfoV1);
        btnInfoV1.setBounds(210, 490, 60, 50);

        btnInfoV2.setBackground(new java.awt.Color(51, 153, 0));
        btnInfoV2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnInfoV2.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoV2.setIconTextGap(0);
        btnInfoV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoV2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfoV2);
        btnInfoV2.setBounds(440, 490, 60, 50);

        btnInfoV3.setBackground(new java.awt.Color(51, 153, 0));
        btnInfoV3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnInfoV3.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoV3.setIconTextGap(0);
        btnInfoV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoV3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfoV3);
        btnInfoV3.setBounds(660, 490, 60, 50);

        btnInfoV4.setBackground(new java.awt.Color(51, 153, 0));
        btnInfoV4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnInfoV4.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoV4.setIconTextGap(0);
        btnInfoV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoV4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfoV4);
        btnInfoV4.setBounds(870, 490, 60, 50);

        btnInfoV5.setBackground(new java.awt.Color(51, 153, 0));
        btnInfoV5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnInfoV5.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoV5.setIconTextGap(0);
        btnInfoV5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoV5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfoV5);
        btnInfoV5.setBounds(1070, 490, 60, 50);

        lblM6.setForeground(new java.awt.Color(51, 51, 51));
        lblM6.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\cancha.png")); // NOI18N
        getContentPane().add(lblM6);
        lblM6.setBounds(170, 440, 150, 150);

        lblM7.setForeground(new java.awt.Color(0, 0, 102));
        lblM7.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\cancha.png")); // NOI18N
        getContentPane().add(lblM7);
        lblM7.setBounds(400, 440, 150, 150);

        lblM8.setForeground(new java.awt.Color(0, 0, 102));
        lblM8.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\cancha.png")); // NOI18N
        getContentPane().add(lblM8);
        lblM8.setBounds(620, 440, 150, 150);

        lblM9.setForeground(new java.awt.Color(0, 0, 102));
        lblM9.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\cancha.png")); // NOI18N
        getContentPane().add(lblM9);
        lblM9.setBounds(830, 440, 150, 150);

        lblM10.setForeground(new java.awt.Color(0, 0, 102));
        lblM10.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\cancha.png")); // NOI18N
        getContentPane().add(lblM10);
        lblM10.setBounds(1030, 440, 150, 150);

        lbl7.setBackground(new java.awt.Color(153, 153, 153));
        lbl7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl7.setForeground(new java.awt.Color(51, 51, 51));
        lbl7.setText("CANCHA 1");
        getContentPane().add(lbl7);
        lbl7.setBounds(180, 420, 130, 32);

        lbl8.setBackground(new java.awt.Color(153, 153, 153));
        lbl8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl8.setForeground(new java.awt.Color(51, 51, 51));
        lbl8.setText("CANCHA 2");
        getContentPane().add(lbl8);
        lbl8.setBounds(410, 420, 130, 32);

        lbl9.setBackground(new java.awt.Color(153, 153, 153));
        lbl9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl9.setForeground(new java.awt.Color(51, 51, 51));
        lbl9.setText("CANCHA 3");
        getContentPane().add(lbl9);
        lbl9.setBounds(630, 420, 130, 32);

        lbl10.setBackground(new java.awt.Color(153, 153, 153));
        lbl10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl10.setForeground(new java.awt.Color(51, 51, 51));
        lbl10.setText("CANCHA 4");
        getContentPane().add(lbl10);
        lbl10.setBounds(840, 420, 130, 32);

        lbl11.setBackground(new java.awt.Color(153, 153, 153));
        lbl11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl11.setForeground(new java.awt.Color(51, 51, 51));
        lbl11.setText("CANCHA 5");
        getContentPane().add(lbl11);
        lbl11.setBounds(1040, 420, 130, 32);

        lblTV.setBackground(new java.awt.Color(153, 153, 153));
        lblTV.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTV.setForeground(new java.awt.Color(102, 102, 102));
        lblTV.setText("VESPERTINO");
        getContentPane().add(lblTV);
        lblTV.setBounds(10, 490, 150, 32);

        lblFechaSeleccionada.setBackground(new java.awt.Color(153, 153, 153));
        lblFechaSeleccionada.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFechaSeleccionada.setForeground(new java.awt.Color(255, 51, 51));
        lblFechaSeleccionada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblFechaSeleccionada);
        lblFechaSeleccionada.setBounds(10, 190, 160, 40);

        lblLM1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLM1.setForeground(new java.awt.Color(0, 51, 102));
        lblLM1.setText("LOCAL");
        getContentPane().add(lblLM1);
        lblLM1.setBounds(180, 350, 140, 20);

        lblLM2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLM2.setForeground(new java.awt.Color(0, 51, 102));
        lblLM2.setText("LOCAL");
        getContentPane().add(lblLM2);
        lblLM2.setBounds(410, 350, 140, 20);

        lblLM3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLM3.setForeground(new java.awt.Color(0, 51, 102));
        lblLM3.setText("LOCAL");
        getContentPane().add(lblLM3);
        lblLM3.setBounds(630, 350, 140, 20);

        lblLM4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLM4.setForeground(new java.awt.Color(0, 51, 102));
        lblLM4.setText("LOCAL");
        getContentPane().add(lblLM4);
        lblLM4.setBounds(840, 350, 140, 20);

        lblLM5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLM5.setForeground(new java.awt.Color(0, 51, 102));
        lblLM5.setText("LOCAL");
        getContentPane().add(lblLM5);
        lblLM5.setBounds(1040, 350, 140, 20);

        lblLV1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLV1.setForeground(new java.awt.Color(0, 0, 102));
        lblLV1.setText("LOCAL");
        getContentPane().add(lblLV1);
        lblLV1.setBounds(170, 590, 140, 20);

        lblLV2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLV2.setForeground(new java.awt.Color(0, 0, 102));
        lblLV2.setText("LOCAL");
        getContentPane().add(lblLV2);
        lblLV2.setBounds(400, 590, 140, 20);

        lblLV3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLV3.setForeground(new java.awt.Color(0, 0, 102));
        lblLV3.setText("LOCAL");
        getContentPane().add(lblLV3);
        lblLV3.setBounds(620, 590, 140, 20);

        lblLV4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLV4.setForeground(new java.awt.Color(0, 0, 102));
        lblLV4.setText("LOCAL");
        getContentPane().add(lblLV4);
        lblLV4.setBounds(830, 590, 140, 20);

        lblLV5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLV5.setForeground(new java.awt.Color(0, 0, 102));
        lblLV5.setText("LOCAL");
        getContentPane().add(lblLV5);
        lblLV5.setBounds(1030, 590, 140, 20);

        lblVM1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVM1.setForeground(new java.awt.Color(0, 51, 102));
        lblVM1.setText("VISITANTE");
        getContentPane().add(lblVM1);
        lblVM1.setBounds(180, 370, 140, 20);

        lblVM2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVM2.setForeground(new java.awt.Color(0, 51, 102));
        lblVM2.setText("VISITANTE");
        getContentPane().add(lblVM2);
        lblVM2.setBounds(410, 370, 140, 20);

        lblVM3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVM3.setForeground(new java.awt.Color(0, 51, 102));
        lblVM3.setText("VISITANTE");
        getContentPane().add(lblVM3);
        lblVM3.setBounds(630, 370, 140, 20);

        lblVM4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVM4.setForeground(new java.awt.Color(0, 51, 102));
        lblVM4.setText("VISITANTE");
        getContentPane().add(lblVM4);
        lblVM4.setBounds(840, 370, 140, 20);

        lblVM5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVM5.setForeground(new java.awt.Color(0, 51, 102));
        lblVM5.setText("VISITANTE");
        getContentPane().add(lblVM5);
        lblVM5.setBounds(1040, 370, 140, 20);

        lblVV1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVV1.setForeground(new java.awt.Color(0, 0, 102));
        lblVV1.setText("VISITANTE");
        getContentPane().add(lblVV1);
        lblVV1.setBounds(170, 610, 140, 20);

        lblVV2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVV2.setForeground(new java.awt.Color(0, 0, 102));
        lblVV2.setText("VISITANTE");
        getContentPane().add(lblVV2);
        lblVV2.setBounds(400, 610, 140, 20);

        lblVV3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVV3.setForeground(new java.awt.Color(0, 0, 102));
        lblVV3.setText("VISITANTE");
        getContentPane().add(lblVV3);
        lblVV3.setBounds(620, 610, 140, 20);

        lblVV4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVV4.setForeground(new java.awt.Color(0, 0, 102));
        lblVV4.setText("VISITANTE");
        getContentPane().add(lblVV4);
        lblVV4.setBounds(830, 610, 140, 20);

        lblVV5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVV5.setForeground(new java.awt.Color(0, 0, 102));
        lblVV5.setText("VISITANTE");
        getContentPane().add(lblVV5);
        lblVV5.setBounds(1030, 610, 140, 20);
        getContentPane().add(lblValidacion);
        lblValidacion.setBounds(700, 0, 520, 170);

        lblAM1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAM1.setForeground(new java.awt.Color(0, 51, 102));
        lblAM1.setText("ARBITRO");
        getContentPane().add(lblAM1);
        lblAM1.setBounds(180, 390, 140, 20);

        lblAM2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAM2.setForeground(new java.awt.Color(0, 51, 102));
        lblAM2.setText("ARBITRO");
        getContentPane().add(lblAM2);
        lblAM2.setBounds(410, 390, 140, 20);

        lblAM3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAM3.setForeground(new java.awt.Color(0, 51, 102));
        lblAM3.setText("ARBITRO");
        getContentPane().add(lblAM3);
        lblAM3.setBounds(630, 390, 140, 20);

        lblAM4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAM4.setForeground(new java.awt.Color(0, 51, 102));
        lblAM4.setText("ARBITRO");
        getContentPane().add(lblAM4);
        lblAM4.setBounds(840, 390, 140, 20);

        lblAM5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAM5.setForeground(new java.awt.Color(0, 51, 102));
        lblAM5.setText("ARBITRO");
        getContentPane().add(lblAM5);
        lblAM5.setBounds(1040, 390, 140, 20);

        lblAV5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAV5.setForeground(new java.awt.Color(0, 0, 102));
        lblAV5.setText("ARBITRO");
        getContentPane().add(lblAV5);
        lblAV5.setBounds(1030, 630, 140, 20);

        lblAV4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAV4.setForeground(new java.awt.Color(0, 0, 102));
        lblAV4.setText("ARBITRO");
        getContentPane().add(lblAV4);
        lblAV4.setBounds(830, 630, 140, 20);

        lblAV3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAV3.setForeground(new java.awt.Color(0, 0, 102));
        lblAV3.setText("ARBITRO");
        getContentPane().add(lblAV3);
        lblAV3.setBounds(620, 630, 140, 20);

        lblAV2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAV2.setForeground(new java.awt.Color(0, 0, 102));
        lblAV2.setText("ARBITRO");
        getContentPane().add(lblAV2);
        lblAV2.setBounds(400, 630, 140, 20);

        lblAV1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAV1.setForeground(new java.awt.Color(0, 0, 102));
        lblAV1.setText("ARBITRO");
        getContentPane().add(lblAV1);
        lblAV1.setBounds(170, 630, 140, 20);

        lblFondo.setBackground(new java.awt.Color(153, 153, 153));
        lblFondo.setForeground(new java.awt.Color(102, 102, 102));
        lblFondo.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\fondo1.png")); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 170, 1280, 550);

        lblLogo.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\LOGOEMPRESA.png")); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(-20, 0, 230, 170);

        lblEncabezado.setIcon(new javax.swing.ImageIcon("C:\\Imagenes\\FONDOC.jpg")); // NOI18N
        getContentPane().add(lblEncabezado);
        lblEncabezado.setBounds(0, 0, 1280, 170);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfIdEquipoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfIdEquipoLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfIdEquipoLocalActionPerformed

    private void txtfIdEquipoVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfIdEquipoVisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfIdEquipoVisitanteActionPerformed

    private void txtfIdArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfIdArbitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfIdArbitroActionPerformed

    private void btnDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisponibilidadActionPerformed
        
        
        String selectedDate = this.datePicker.getSelectedDate();
        System.out.println("Fecha seleccionada: " + selectedDate);
        
        lblFechaSeleccionada.setText(selectedDate );
        
        VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(selectedDate);
        vistaReservarCancha.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnDisponibilidadActionPerformed

    public int obtenerDatosReserva(int numeroCancha, String horario, boolean disponible, JLabel lblIdReserva){
        
        try {
            this.reservaTemporal.setNumeroCancha(numeroCancha);
            this.reservaTemporal.setHorario(horario);
            this.reservaTemporal.setDisponible( disponible );
            this.reservaTemporal.setIdReserva(Integer.parseInt( lblIdReserva.getText()) );
            this.reservaTemporal.setIdEquipoLocal(Integer.parseInt(cmbIdEquipoLocal.getSelectedItem().toString()));
            this.reservaTemporal.setIdEquipoVisitante(Integer.parseInt(cmbIdEquipoVisitante.getSelectedItem().toString()));
            this.reservaTemporal.setIdArbitro(Integer.parseInt(cmbIdArbitro.getSelectedItem().toString()));
            this.reservaTemporal.setFechaReserva( lblFechaSeleccionada.getText());
            
            if(this.reservaTemporal.getIdArbitro() == 1 ||
               this.reservaTemporal.getIdEquipoLocal()== 1 ||
               this.reservaTemporal.getIdEquipoVisitante() == 1
            ){
                lblValidacion.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
                JOptionPane.showMessageDialog(null, "SELECCIONA UN EQUIPO LOCAL, VISITANTE Y UN ARBITRO", "Canchas Gonzalez", JOptionPane.ERROR_MESSAGE);
                return 0;
            }
            
            lblValidacion.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
            return 1;
        } catch (Exception e) {
            lblValidacion.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
            JOptionPane.showMessageDialog(null, "SELECCIONA UN EQUIPO LOCAL, VISITANTE Y UN ARBITRO", "Canchas Gonzalez", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    
    private void btnInfoM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoM1ActionPerformed
        int numeroCancha = 1;
        int numeroReserva = Integer.parseInt(lblRM1.getText());
        String turno = "MATUTINO";
        String fechaSeleccionada = lblFechaSeleccionada.getText();

        // Si esta disponible
        if(btnInfoM1.getText().equals("✅")){
            
            if(obtenerDatosReserva( numeroCancha, turno, false, lblRM1) == 1){
                ReservaDAO reservaDAO = new ReservaDAO();
                reservaDAO.actualizarReserva(reservaTemporal, this.reservaTemporal.getIdReserva());
                
                VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(this.reservaTemporal.getFechaReserva());
                vistaReservarCancha.setVisible(true);
                dispose();
            }
            
        }else{
            Reserva reserva = new Reserva(1, 1, 1, fechaSeleccionada, numeroCancha, turno, true);
            
            ReservaDAO reservaDAO = new ReservaDAO();
            reservaDAO.actualizarReserva(reserva, numeroReserva);
            
            VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(fechaSeleccionada);
            vistaReservarCancha.setVisible(true);
            dispose();
  
        }
        
        System.out.println(this.reservaTemporal);
    }//GEN-LAST:event_btnInfoM1ActionPerformed

    private void btnInfoM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoM2ActionPerformed
         
        int numeroCancha = 2;
        int numeroReserva = Integer.parseInt(lblRM2.getText());
        String turno = "MATUTINO";
        String fechaSeleccionada = lblFechaSeleccionada.getText();

        // Si esta disponible
        if(btnInfoM2.getText().equals("✅")){
            
            if(obtenerDatosReserva( numeroCancha, turno, false, lblRM2) == 1){
                ReservaDAO reservaDAO = new ReservaDAO();
                reservaDAO.actualizarReserva(reservaTemporal, this.reservaTemporal.getIdReserva());
                
                VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(this.reservaTemporal.getFechaReserva());
                vistaReservarCancha.setVisible(true);
                dispose();
            }
            
        }else{
            Reserva reserva = new Reserva(1, 1, 1, fechaSeleccionada, numeroCancha, turno, true);
            
            ReservaDAO reservaDAO = new ReservaDAO();
            reservaDAO.actualizarReserva(reserva, numeroReserva);
            
            VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(fechaSeleccionada);
            vistaReservarCancha.setVisible(true);
            dispose();
  
        }
        
        
    }//GEN-LAST:event_btnInfoM2ActionPerformed

    private void btnInfoM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoM3ActionPerformed
        int numeroCancha = 3;
        int numeroReserva = Integer.parseInt(lblRM3.getText());
        String turno = "MATUTINO";
        String fechaSeleccionada = lblFechaSeleccionada.getText();

        // Si esta disponible
        if(btnInfoM3.getText().equals("✅")){
            
            if(obtenerDatosReserva( numeroCancha, turno, false, lblRM3) == 1){
                ReservaDAO reservaDAO = new ReservaDAO();
                reservaDAO.actualizarReserva(reservaTemporal, this.reservaTemporal.getIdReserva());
                
                VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(this.reservaTemporal.getFechaReserva());
                vistaReservarCancha.setVisible(true);
                dispose();
            }
            
        }else{
            Reserva reserva = new Reserva(1, 1, 1, fechaSeleccionada, numeroCancha, turno, true);
            
            ReservaDAO reservaDAO = new ReservaDAO();
            reservaDAO.actualizarReserva(reserva, numeroReserva);
            
            VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(fechaSeleccionada);
            vistaReservarCancha.setVisible(true);
            dispose();
  
        }
    }//GEN-LAST:event_btnInfoM3ActionPerformed

    private void btnInfoM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoM4ActionPerformed
        int numeroCancha = 4;
        int numeroReserva = Integer.parseInt(lblRM4.getText());
        String turno = "MATUTINO";
        String fechaSeleccionada = lblFechaSeleccionada.getText();

        // Si esta disponible
        if(btnInfoM4.getText().equals("✅")){
            
            if(obtenerDatosReserva( numeroCancha, turno, false, lblRM4) == 1){
                ReservaDAO reservaDAO = new ReservaDAO();
                reservaDAO.actualizarReserva(reservaTemporal, this.reservaTemporal.getIdReserva());
                
                VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(this.reservaTemporal.getFechaReserva());
                vistaReservarCancha.setVisible(true);
                dispose();
            }
            
        }else{
            Reserva reserva = new Reserva(1, 1, 1, fechaSeleccionada, numeroCancha, turno, true);
            
            ReservaDAO reservaDAO = new ReservaDAO();
            reservaDAO.actualizarReserva(reserva, numeroReserva);
            
            VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(fechaSeleccionada);
            vistaReservarCancha.setVisible(true);
            dispose();
  
        }
    }//GEN-LAST:event_btnInfoM4ActionPerformed

    private void btnInfoM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoM5ActionPerformed
        int numeroCancha = 5;
        int numeroReserva = Integer.parseInt(lblRM5.getText());
        String turno = "MATUTINO";
        String fechaSeleccionada = lblFechaSeleccionada.getText();

        // Si esta disponible
        if(btnInfoM5.getText().equals("✅")){
            
            if(obtenerDatosReserva( numeroCancha, turno, false, lblRM5) == 1){
                ReservaDAO reservaDAO = new ReservaDAO();
                reservaDAO.actualizarReserva(reservaTemporal, this.reservaTemporal.getIdReserva());
                
                VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(this.reservaTemporal.getFechaReserva());
                vistaReservarCancha.setVisible(true);
                dispose();
            }
            
        }else{
            Reserva reserva = new Reserva(1, 1, 1, fechaSeleccionada, numeroCancha, turno, true);
            
            ReservaDAO reservaDAO = new ReservaDAO();
            reservaDAO.actualizarReserva(reserva, numeroReserva);
            
            VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(fechaSeleccionada);
            vistaReservarCancha.setVisible(true);
            dispose();
  
        }
    }//GEN-LAST:event_btnInfoM5ActionPerformed

    private void btnInfoV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoV1ActionPerformed
        int numeroCancha = 1;
        int numeroReserva = Integer.parseInt(lblRV1.getText());
        String turno = "VESPERTINO";
        String fechaSeleccionada = lblFechaSeleccionada.getText();

        // Si esta disponible
        if(btnInfoV1.getText().equals("✅")){
            
            if(obtenerDatosReserva( numeroCancha, turno, false, lblRV1) == 1){
                ReservaDAO reservaDAO = new ReservaDAO();
                reservaDAO.actualizarReserva(reservaTemporal, this.reservaTemporal.getIdReserva());
                
                VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(this.reservaTemporal.getFechaReserva());
                vistaReservarCancha.setVisible(true);
                dispose();
            }
            
        }else{
            Reserva reserva = new Reserva(1, 1, 1, fechaSeleccionada, numeroCancha, turno, true);
            
            ReservaDAO reservaDAO = new ReservaDAO();
            reservaDAO.actualizarReserva(reserva, numeroReserva);
            
            VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(fechaSeleccionada);
            vistaReservarCancha.setVisible(true);
            dispose();
  
        }
    }//GEN-LAST:event_btnInfoV1ActionPerformed

    private void btnInfoV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoV2ActionPerformed
        int numeroCancha = 2;
        int numeroReserva = Integer.parseInt(lblRV2.getText());
        String turno = "VESPERTINO";
        String fechaSeleccionada = lblFechaSeleccionada.getText();

        // Si esta disponible
        if(btnInfoV2.getText().equals("✅")){
            
            if(obtenerDatosReserva( numeroCancha, turno, false, lblRV2) == 1){
                ReservaDAO reservaDAO = new ReservaDAO();
                reservaDAO.actualizarReserva(reservaTemporal, this.reservaTemporal.getIdReserva());
                
                VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(this.reservaTemporal.getFechaReserva());
                vistaReservarCancha.setVisible(true);
                dispose();
            }
            
        }else{
            Reserva reserva = new Reserva(1, 1, 1, fechaSeleccionada, numeroCancha, turno, true);
            
            ReservaDAO reservaDAO = new ReservaDAO();
            reservaDAO.actualizarReserva(reserva, numeroReserva);
            
            VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(fechaSeleccionada);
            vistaReservarCancha.setVisible(true);
            dispose();
  
        }
    }//GEN-LAST:event_btnInfoV2ActionPerformed

    private void btnInfoV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoV3ActionPerformed
        int numeroCancha = 3;
        int numeroReserva = Integer.parseInt(lblRV3.getText());
        String turno = "VESPERTINO";
        String fechaSeleccionada = lblFechaSeleccionada.getText();

        // Si esta disponible
        if(btnInfoV3.getText().equals("✅")){
            
            if(obtenerDatosReserva( numeroCancha, turno, false, lblRV3) == 1){
                ReservaDAO reservaDAO = new ReservaDAO();
                reservaDAO.actualizarReserva(reservaTemporal, this.reservaTemporal.getIdReserva());
                
                VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(this.reservaTemporal.getFechaReserva());
                vistaReservarCancha.setVisible(true);
                dispose();
            }
            
        }else{
            Reserva reserva = new Reserva(1, 1, 1, fechaSeleccionada, numeroCancha, turno, true);
            
            ReservaDAO reservaDAO = new ReservaDAO();
            reservaDAO.actualizarReserva(reserva, numeroReserva);
            
            VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(fechaSeleccionada);
            vistaReservarCancha.setVisible(true);
            dispose();
  
        }
    }//GEN-LAST:event_btnInfoV3ActionPerformed

    private void btnInfoV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoV4ActionPerformed
        int numeroCancha = 4;
        int numeroReserva = Integer.parseInt(lblRV4.getText());
        String turno = "VESPERTINO";
        String fechaSeleccionada = lblFechaSeleccionada.getText();

        // Si esta disponible
        if(btnInfoV4.getText().equals("✅")){
            
            if(obtenerDatosReserva( numeroCancha, turno, false, lblRV4) == 1){
                ReservaDAO reservaDAO = new ReservaDAO();
                reservaDAO.actualizarReserva(reservaTemporal, this.reservaTemporal.getIdReserva());
                
                VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(this.reservaTemporal.getFechaReserva());
                vistaReservarCancha.setVisible(true);
                dispose();
            }
            
        }else{
            Reserva reserva = new Reserva(1, 1, 1, fechaSeleccionada, numeroCancha, turno, true);
            
            ReservaDAO reservaDAO = new ReservaDAO();
            reservaDAO.actualizarReserva(reserva, numeroReserva);
            
            VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(fechaSeleccionada);
            vistaReservarCancha.setVisible(true);
            dispose();
  
        }
    }//GEN-LAST:event_btnInfoV4ActionPerformed

    private void btnInfoV5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoV5ActionPerformed
        int numeroCancha = 5;
        int numeroReserva = Integer.parseInt(lblRV5.getText());
        String turno = "VESPERTINO";
        String fechaSeleccionada = lblFechaSeleccionada.getText();

        // Si esta disponible
        if(btnInfoV5.getText().equals("✅")){
            
            if(obtenerDatosReserva( numeroCancha, turno, false, lblRV5) == 1){
                ReservaDAO reservaDAO = new ReservaDAO();
                reservaDAO.actualizarReserva(reservaTemporal, this.reservaTemporal.getIdReserva());
                
                VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(this.reservaTemporal.getFechaReserva());
                vistaReservarCancha.setVisible(true);
                dispose();
            }
            
        }else{
            Reserva reserva = new Reserva(1, 1, 1, fechaSeleccionada, numeroCancha, turno, true);
            
            ReservaDAO reservaDAO = new ReservaDAO();
            reservaDAO.actualizarReserva(reserva, numeroReserva);
            
            VistaReservarCancha vistaReservarCancha = new VistaReservarCancha(fechaSeleccionada);
            vistaReservarCancha.setVisible(true);
            dispose();
  
        }
    }//GEN-LAST:event_btnInfoV5ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaReservarCancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaReservarCancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaReservarCancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaReservarCancha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaReservarCancha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisponibilidad;
    private javax.swing.JButton btnInfoM1;
    private javax.swing.JButton btnInfoM2;
    private javax.swing.JButton btnInfoM3;
    private javax.swing.JButton btnInfoM4;
    private javax.swing.JButton btnInfoM5;
    private javax.swing.JButton btnInfoV1;
    private javax.swing.JButton btnInfoV2;
    private javax.swing.JButton btnInfoV3;
    private javax.swing.JButton btnInfoV4;
    private javax.swing.JButton btnInfoV5;
    private javax.swing.JComboBox<String> cmbIdArbitro;
    private javax.swing.JComboBox<String> cmbIdEquipoLocal;
    private javax.swing.JComboBox<String> cmbIdEquipoVisitante;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpFecha;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblAM1;
    private javax.swing.JLabel lblAM2;
    private javax.swing.JLabel lblAM3;
    private javax.swing.JLabel lblAM4;
    private javax.swing.JLabel lblAM5;
    private javax.swing.JLabel lblAV1;
    private javax.swing.JLabel lblAV2;
    private javax.swing.JLabel lblAV3;
    private javax.swing.JLabel lblAV4;
    private javax.swing.JLabel lblAV5;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblFechaSeleccionada;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIdArbitro;
    private javax.swing.JLabel lblIdEquipoLocal;
    private javax.swing.JLabel lblIdEquipoVisitante;
    private javax.swing.JLabel lblLM1;
    private javax.swing.JLabel lblLM2;
    private javax.swing.JLabel lblLM3;
    private javax.swing.JLabel lblLM4;
    private javax.swing.JLabel lblLM5;
    private javax.swing.JLabel lblLV1;
    private javax.swing.JLabel lblLV2;
    private javax.swing.JLabel lblLV3;
    private javax.swing.JLabel lblLV4;
    private javax.swing.JLabel lblLV5;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblM1;
    private javax.swing.JLabel lblM10;
    private javax.swing.JLabel lblM2;
    private javax.swing.JLabel lblM3;
    private javax.swing.JLabel lblM4;
    private javax.swing.JLabel lblM5;
    private javax.swing.JLabel lblM6;
    private javax.swing.JLabel lblM7;
    private javax.swing.JLabel lblM8;
    private javax.swing.JLabel lblM9;
    private javax.swing.JLabel lblRM1;
    private javax.swing.JLabel lblRM2;
    private javax.swing.JLabel lblRM3;
    private javax.swing.JLabel lblRM4;
    private javax.swing.JLabel lblRM5;
    private javax.swing.JLabel lblRV1;
    private javax.swing.JLabel lblRV2;
    private javax.swing.JLabel lblRV3;
    private javax.swing.JLabel lblRV4;
    private javax.swing.JLabel lblRV5;
    private javax.swing.JLabel lblTM;
    private javax.swing.JLabel lblTV;
    private javax.swing.JLabel lblVM1;
    private javax.swing.JLabel lblVM2;
    private javax.swing.JLabel lblVM3;
    private javax.swing.JLabel lblVM4;
    private javax.swing.JLabel lblVM5;
    private javax.swing.JLabel lblVV1;
    private javax.swing.JLabel lblVV2;
    private javax.swing.JLabel lblVV3;
    private javax.swing.JLabel lblVV4;
    private javax.swing.JLabel lblVV5;
    private javax.swing.JLabel lblValidacion;
    private javax.swing.JTextField txtfIdArbitro;
    private javax.swing.JTextField txtfIdEquipoLocal;
    private javax.swing.JTextField txtfIdEquipoVisitante;
    // End of variables declaration//GEN-END:variables
}
