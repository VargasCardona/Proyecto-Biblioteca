package com.vistas;

import com.controladores.ControladorPrincipalUsuario;
import com.modelos.Genero;
import com.modelos.Libro;
import com.modelos.Prestamo;
import com.modelos.Usuario;
import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VistaPrincipalUsuario extends javax.swing.JFrame {

	int xMouse, yMouse;
	Usuario usuarioActivo;
	ControladorPrincipalUsuario controlador;

	public VistaPrincipalUsuario(Usuario usuarioActivo) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.usuarioActivo = usuarioActivo;
		controlador = new ControladorPrincipalUsuario();

		lblUsuario.setText(usuarioActivo.getUsuario());
		lblNombre.setText(usuarioActivo.getNombre());
		lblApellidos.setText(usuarioActivo.getApellidos());
		lblCedula.setText(usuarioActivo.getCedula());

		cambiarPanel();
		pnlResumen.setVisible(true);
	}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnSalir = new com.vistas.PanelRound();
        pnlResumen = new javax.swing.JPanel();
        panelRound18 = new com.vistas.PanelRound();
        jLabel33 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pnlRegistros = new javax.swing.JPanel();
        pnlAdministradoresRound2 = new com.vistas.PanelRound();
        pnlBusquedaUsuario2 = new com.vistas.PanelRound();
        txtIdRegistro = new javax.swing.JTextField();
        label6 = new javax.swing.JLabel();
        scrlUsuarios2 = new javax.swing.JScrollPane();
        tblRegistros = new com.vistas.Table();
        pnlUsuarios = new javax.swing.JPanel();
        pnlAdministradoresRound = new com.vistas.PanelRound();
        pnlBusquedaUsuario = new com.vistas.PanelRound();
        txtIdPrestamoFiltro = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        btnRegistrarUsuario = new com.vistas.PanelRound();
        lblRegistrar1 = new javax.swing.JLabel();
        scrlUsuarios = new javax.swing.JScrollPane();
        tblUsuarios = new com.vistas.Table();
        pnlLibros = new javax.swing.JPanel();
        pnlLibrosRegistro = new com.vistas.PanelRound();
        scrlLibros = new javax.swing.JScrollPane();
        tblLibros = new com.vistas.Table();
        panelRound2 = new com.vistas.PanelRound();
        txtIsbnFiltroLibro = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        panelRound7 = new com.vistas.PanelRound();
        cmbGeneros = new javax.swing.JComboBox<>();
        btnRegistrarLibro = new com.vistas.PanelRound();
        lblRegistrar2 = new javax.swing.JLabel();
        pnlCategoriasRegistro = new com.vistas.PanelRound();
        scrlGeneros = new javax.swing.JScrollPane();
        tblGeneros = new com.vistas.Table();
        label2 = new javax.swing.JLabel();
        btnRegistrarGenero = new com.vistas.PanelRound();
        lblRegistrar3 = new javax.swing.JLabel();
        pnlBuscador = new javax.swing.JPanel();
        pnlLibrosRegistro1 = new com.vistas.PanelRound();
        scrlLibros1 = new javax.swing.JScrollPane();
        tblBuscador = new com.vistas.Table();
        panelRound3 = new com.vistas.PanelRound();
        txtFiltroTermino = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        panelRound8 = new com.vistas.PanelRound();
        cmbxBuscador = new javax.swing.JComboBox<>();
        pnlPrestamos = new javax.swing.JPanel();
        pnlAdministradoresRound1 = new com.vistas.PanelRound();
        pnlBusquedaUsuario1 = new com.vistas.PanelRound();
        txtIdFiltroPrestamos = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        btnRegistrarPrestamo = new com.vistas.PanelRound();
        lblRegistrar4 = new javax.swing.JLabel();
        scrlUsuarios1 = new javax.swing.JScrollPane();
        tblPrestamos = new com.vistas.Table();
        pnlInformes = new javax.swing.JPanel();
        pnlLibrosRegistro2 = new com.vistas.PanelRound();
        scrlLibros2 = new javax.swing.JScrollPane();
        tblUsuariosInformes = new com.vistas.Table();
        label5 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lblCedulaInforme = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelRound15 = new com.vistas.PanelRound();
        cmbInformeGeneralInicioAnio = new javax.swing.JComboBox<>();
        cmbInformeGeneralInicioDia = new javax.swing.JComboBox<>();
        cmbInformeGeneralInicioMes = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        panelRound16 = new com.vistas.PanelRound();
        cmbInformeGeneralFinalAnio = new javax.swing.JComboBox<>();
        cmbInformeGeneralFinalDia = new javax.swing.JComboBox<>();
        cmbInformeGeneralFinalMes = new javax.swing.JComboBox<>();
        btnGenerarInformeGeneral = new com.vistas.PanelRound();
        lblRegistrar7 = new javax.swing.JLabel();
        panelRound9 = new com.vistas.PanelRound();
        cmbTipoInforme = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        btnEliminarSeleccion = new com.vistas.PanelRound();
        lblRegistrar8 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblResumen = new javax.swing.JLabel();
        tabResumen = new javax.swing.JLabel();
        lblGestionUsuarios = new javax.swing.JLabel();
        tabUsuarios = new javax.swing.JLabel();
        lblUsuarioLogeado = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnGestionCuenta = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JLabel();
        lblGestionBiblioteca = new javax.swing.JLabel();
        tabLibrosRegistrados = new javax.swing.JLabel();
        lblGestionBiblioteca1 = new javax.swing.JLabel();
        tabPrestamosRegistrados = new javax.swing.JLabel();
        tabBuscador = new javax.swing.JLabel();
        lblGestionBiblioteca2 = new javax.swing.JLabel();
        tabInformes = new javax.swing.JLabel();
        tabAcciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(951, 628));
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(24, 25, 32));
        bg.setMaximumSize(new java.awt.Dimension(1080, 670));
        bg.setMinimumSize(new java.awt.Dimension(1080, 670));
        bg.setName(""); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(1080, 670));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(24, 25, 32));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setRoundBottomLeft(50);
        btnSalir.setRoundBottomRight(50);
        btnSalir.setRoundTopLeft(50);
        btnSalir.setRoundTopRight(50);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        header.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 940, 30));

        pnlResumen.setBackground(new java.awt.Color(35, 36, 47));
        pnlResumen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound18.setBackground(new java.awt.Color(24, 25, 32));
        panelRound18.setRoundBottomLeft(10);
        panelRound18.setRoundBottomRight(10);
        panelRound18.setRoundTopLeft(10);
        panelRound18.setRoundTopRight(10);
        panelRound18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Bienvenido a OmniSync");
        panelRound18.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 380, 40));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setText("Desde esta ventana se le permitira administrar todo lo referente a usuarios y gestion de préstamos");
        panelRound18.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 660, 40));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setText("Algunas funcionalidades aun se encuentran en desarrollo, disculpe las molestias");
        panelRound18.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 540, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Detalles de Usuario");
        panelRound18.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 330, 40));

        lblCedula.setBackground(new java.awt.Color(255, 255, 255));
        lblCedula.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedula.setText("{Cédula}");
        panelRound18.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Cédula:");
        panelRound18.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 30));

        lblNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("{Nombre}");
        panelRound18.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 30));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Nombre:");
        panelRound18.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        lblApellidos.setBackground(new java.awt.Color(255, 255, 255));
        lblApellidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidos.setText("{Apellido}");
        panelRound18.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 30));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Apellidos:");
        panelRound18.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        pnlResumen.add(panelRound18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 580));

        bg.add(pnlResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 720, 600));

        pnlRegistros.setBackground(new java.awt.Color(35, 36, 47));
        pnlRegistros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAdministradoresRound2.setBackground(new java.awt.Color(24, 25, 32));
        pnlAdministradoresRound2.setRoundBottomLeft(10);
        pnlAdministradoresRound2.setRoundBottomRight(10);
        pnlAdministradoresRound2.setRoundTopLeft(10);
        pnlAdministradoresRound2.setRoundTopRight(10);
        pnlAdministradoresRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBusquedaUsuario2.setBackground(new java.awt.Color(37, 42, 52));
        pnlBusquedaUsuario2.setForeground(new java.awt.Color(57, 59, 70));
        pnlBusquedaUsuario2.setRoundBottomLeft(20);
        pnlBusquedaUsuario2.setRoundBottomRight(20);
        pnlBusquedaUsuario2.setRoundTopLeft(20);
        pnlBusquedaUsuario2.setRoundTopRight(20);
        pnlBusquedaUsuario2.setLayout(null);

        txtIdRegistro.setBackground(new java.awt.Color(37, 42, 52));
        txtIdRegistro.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtIdRegistro.setForeground(new java.awt.Color(255, 255, 255));
        txtIdRegistro.setText("Filtrar por Cédula");
        txtIdRegistro.setBorder(null);
        txtIdRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdRegistroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdRegistroFocusLost(evt);
            }
        });
        txtIdRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdRegistroKeyReleased(evt);
            }
        });
        pnlBusquedaUsuario2.add(txtIdRegistro);
        txtIdRegistro.setBounds(10, 10, 660, 20);

        pnlAdministradoresRound2.add(pnlBusquedaUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 680, 40));

        label6.setBackground(new java.awt.Color(255, 255, 255));
        label6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label6.setText("Historial de Acciones");
        pnlAdministradoresRound2.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 30));

        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellidos", "Usuario"
            }
        ));
        tblRegistros.setFocusable(false);
        tblRegistros.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        tblRegistros.getTableHeader().setResizingAllowed(false);
        tblRegistros.getTableHeader().setReorderingAllowed(false);
        tblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistrosMouseClicked(evt);
            }
        });
        scrlUsuarios2.setViewportView(tblRegistros);

        pnlAdministradoresRound2.add(scrlUsuarios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 680, 470));

        pnlRegistros.add(pnlAdministradoresRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 580));

        bg.add(pnlRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 720, 600));

        pnlUsuarios.setBackground(new java.awt.Color(35, 36, 47));
        pnlUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAdministradoresRound.setBackground(new java.awt.Color(24, 25, 32));
        pnlAdministradoresRound.setRoundBottomLeft(10);
        pnlAdministradoresRound.setRoundBottomRight(10);
        pnlAdministradoresRound.setRoundTopLeft(10);
        pnlAdministradoresRound.setRoundTopRight(10);
        pnlAdministradoresRound.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBusquedaUsuario.setBackground(new java.awt.Color(37, 42, 52));
        pnlBusquedaUsuario.setForeground(new java.awt.Color(57, 59, 70));
        pnlBusquedaUsuario.setRoundBottomLeft(20);
        pnlBusquedaUsuario.setRoundBottomRight(20);
        pnlBusquedaUsuario.setRoundTopLeft(20);
        pnlBusquedaUsuario.setRoundTopRight(20);
        pnlBusquedaUsuario.setLayout(null);

        txtIdPrestamoFiltro.setBackground(new java.awt.Color(37, 42, 52));
        txtIdPrestamoFiltro.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtIdPrestamoFiltro.setForeground(new java.awt.Color(255, 255, 255));
        txtIdPrestamoFiltro.setText("Filtrar por Cédula");
        txtIdPrestamoFiltro.setBorder(null);
        txtIdPrestamoFiltro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdPrestamoFiltroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdPrestamoFiltroFocusLost(evt);
            }
        });
        txtIdPrestamoFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdPrestamoFiltroKeyReleased(evt);
            }
        });
        pnlBusquedaUsuario.add(txtIdPrestamoFiltro);
        txtIdPrestamoFiltro.setBounds(10, 10, 660, 20);

        pnlAdministradoresRound.add(pnlBusquedaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 680, 40));

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label.setText("Usuarios Registrados");
        pnlAdministradoresRound.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 30));

        btnRegistrarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarUsuario.setRoundBottomLeft(20);
        btnRegistrarUsuario.setRoundBottomRight(20);
        btnRegistrarUsuario.setRoundTopLeft(20);
        btnRegistrarUsuario.setRoundTopRight(20);
        btnRegistrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarUsuarioMouseExited(evt);
            }
        });
        btnRegistrarUsuario.setLayout(null);

        lblRegistrar1.setBackground(new java.awt.Color(24, 25, 32));
        lblRegistrar1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblRegistrar1.setForeground(new java.awt.Color(24, 25, 32));
        lblRegistrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar1.setText("Registrar Usuario");
        btnRegistrarUsuario.add(lblRegistrar1);
        lblRegistrar1.setBounds(0, 10, 210, 20);

        pnlAdministradoresRound.add(btnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 210, 40));
        Cursor cursorHand58 = new Cursor(Cursor.HAND_CURSOR);
        btnRegistrarUsuario.setCursor(cursorHand58);
        btnRegistrarUsuario.setVisible(true);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellidos", "Usuario"
            }
        ));
        tblUsuarios.setFocusable(false);
        tblUsuarios.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        tblUsuarios.getTableHeader().setResizingAllowed(false);
        tblUsuarios.getTableHeader().setReorderingAllowed(false);
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        scrlUsuarios.setViewportView(tblUsuarios);

        pnlAdministradoresRound.add(scrlUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 680, 420));

        pnlUsuarios.add(pnlAdministradoresRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 580));

        bg.add(pnlUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 720, 600));

        pnlLibros.setBackground(new java.awt.Color(35, 36, 47));
        pnlLibros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLibrosRegistro.setBackground(new java.awt.Color(24, 25, 32));
        pnlLibrosRegistro.setRoundBottomLeft(10);
        pnlLibrosRegistro.setRoundBottomRight(10);
        pnlLibrosRegistro.setRoundTopLeft(10);
        pnlLibrosRegistro.setRoundTopRight(10);
        pnlLibrosRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellidos", "Usuario", "Cargo"
            }
        ));
        tblLibros.setFocusable(false);
        tblLibros.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        tblLibros.getTableHeader().setResizingAllowed(false);
        tblLibros.getTableHeader().setReorderingAllowed(false);
        tblLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibrosMouseClicked(evt);
            }
        });
        scrlLibros.setViewportView(tblLibros);

        pnlLibrosRegistro.add(scrlLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 680, 150));

        panelRound2.setBackground(new java.awt.Color(37, 42, 52));
        panelRound2.setForeground(new java.awt.Color(57, 59, 70));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);
        panelRound2.setLayout(null);

        txtIsbnFiltroLibro.setBackground(new java.awt.Color(37, 42, 52));
        txtIsbnFiltroLibro.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtIsbnFiltroLibro.setForeground(new java.awt.Color(255, 255, 255));
        txtIsbnFiltroLibro.setText("Filtrar por ISBN");
        txtIsbnFiltroLibro.setBorder(null);
        txtIsbnFiltroLibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIsbnFiltroLibroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIsbnFiltroLibroFocusLost(evt);
            }
        });
        txtIsbnFiltroLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnFiltroLibroActionPerformed(evt);
            }
        });
        txtIsbnFiltroLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIsbnFiltroLibroKeyReleased(evt);
            }
        });
        panelRound2.add(txtIsbnFiltroLibro);
        txtIsbnFiltroLibro.setBounds(10, 10, 290, 20);

        pnlLibrosRegistro.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 40));

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label1.setText("Libros Registrados");
        pnlLibrosRegistro.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 30));

        panelRound7.setBackground(new java.awt.Color(37, 42, 52));
        panelRound7.setForeground(new java.awt.Color(57, 59, 70));
        panelRound7.setRoundBottomLeft(20);
        panelRound7.setRoundBottomRight(20);
        panelRound7.setRoundTopLeft(20);
        panelRound7.setRoundTopRight(20);
        panelRound7.setLayout(null);

        cmbGeneros.setBackground(new java.awt.Color(37, 42, 52));
        cmbGeneros.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cmbGeneros.setForeground(new java.awt.Color(255, 255, 255));
        cmbGeneros.setMaximumRowCount(5);
        cmbGeneros.setToolTipText("");
        cmbGeneros.setBorder(null);
        cmbGeneros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbGeneros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGenerosItemStateChanged(evt);
            }
        });
        panelRound7.add(cmbGeneros);
        cmbGeneros.setBounds(10, 10, 340, 20);

        pnlLibrosRegistro.add(panelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 360, 40));

        btnRegistrarLibro.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarLibro.setRoundBottomLeft(20);
        btnRegistrarLibro.setRoundBottomRight(20);
        btnRegistrarLibro.setRoundTopLeft(20);
        btnRegistrarLibro.setRoundTopRight(20);
        btnRegistrarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarLibroMouseExited(evt);
            }
        });
        btnRegistrarLibro.setLayout(null);

        lblRegistrar2.setBackground(new java.awt.Color(24, 25, 32));
        lblRegistrar2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblRegistrar2.setForeground(new java.awt.Color(24, 25, 32));
        lblRegistrar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar2.setText("Registrar Libro");
        btnRegistrarLibro.add(lblRegistrar2);
        lblRegistrar2.setBounds(0, 10, 210, 20);

        pnlLibrosRegistro.add(btnRegistrarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 210, 40));
        Cursor cursorHand54 = new Cursor(Cursor.HAND_CURSOR);
        btnRegistrarLibro.setCursor(cursorHand54);
        btnRegistrarLibro.setVisible(true);

        pnlLibros.add(pnlLibrosRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 310));

        pnlCategoriasRegistro.setBackground(new java.awt.Color(24, 25, 32));
        pnlCategoriasRegistro.setRoundBottomLeft(10);
        pnlCategoriasRegistro.setRoundBottomRight(10);
        pnlCategoriasRegistro.setRoundTopLeft(10);
        pnlCategoriasRegistro.setRoundTopRight(10);
        pnlCategoriasRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblGeneros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Género", "Nombre"
            }
        ));
        tblGeneros.setFocusable(false);
        tblGeneros.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        tblGeneros.getTableHeader().setResizingAllowed(false);
        tblGeneros.getTableHeader().setReorderingAllowed(false);
        tblGeneros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGenerosMouseClicked(evt);
            }
        });
        scrlGeneros.setViewportView(tblGeneros);

        pnlCategoriasRegistro.add(scrlGeneros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 680, 150));

        label2.setBackground(new java.awt.Color(255, 255, 255));
        label2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label2.setText("Géneros Existentes");
        pnlCategoriasRegistro.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 30));

        btnRegistrarGenero.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarGenero.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarGenero.setRoundBottomLeft(20);
        btnRegistrarGenero.setRoundBottomRight(20);
        btnRegistrarGenero.setRoundTopLeft(20);
        btnRegistrarGenero.setRoundTopRight(20);
        btnRegistrarGenero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarGeneroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarGeneroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarGeneroMouseExited(evt);
            }
        });
        btnRegistrarGenero.setLayout(null);

        lblRegistrar3.setBackground(new java.awt.Color(24, 25, 32));
        lblRegistrar3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblRegistrar3.setForeground(new java.awt.Color(24, 25, 32));
        lblRegistrar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar3.setText("Registrar Género");
        btnRegistrarGenero.add(lblRegistrar3);
        lblRegistrar3.setBounds(0, 10, 210, 20);

        pnlCategoriasRegistro.add(btnRegistrarGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 210, 40));
        Cursor cursorHand50 = new Cursor(Cursor.HAND_CURSOR);
        btnRegistrarLibro.setCursor(cursorHand50);
        btnRegistrarLibro.setVisible(true);

        pnlLibros.add(pnlCategoriasRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 700, 260));

        bg.add(pnlLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 720, 600));

        pnlBuscador.setBackground(new java.awt.Color(35, 36, 47));
        pnlBuscador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLibrosRegistro1.setBackground(new java.awt.Color(24, 25, 32));
        pnlLibrosRegistro1.setRoundBottomLeft(10);
        pnlLibrosRegistro1.setRoundBottomRight(10);
        pnlLibrosRegistro1.setRoundTopLeft(10);
        pnlLibrosRegistro1.setRoundTopRight(10);
        pnlLibrosRegistro1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblBuscador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellidos", "Usuario", "Cargo"
            }
        ));
        tblBuscador.setFocusable(false);
        tblBuscador.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        tblBuscador.getTableHeader().setResizingAllowed(false);
        tblBuscador.getTableHeader().setReorderingAllowed(false);
        tblBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscadorMouseClicked(evt);
            }
        });
        scrlLibros1.setViewportView(tblBuscador);

        pnlLibrosRegistro1.add(scrlLibros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 680, 470));

        panelRound3.setBackground(new java.awt.Color(37, 42, 52));
        panelRound3.setForeground(new java.awt.Color(57, 59, 70));
        panelRound3.setRoundBottomLeft(20);
        panelRound3.setRoundBottomRight(20);
        panelRound3.setRoundTopLeft(20);
        panelRound3.setRoundTopRight(20);
        panelRound3.setLayout(null);

        txtFiltroTermino.setBackground(new java.awt.Color(37, 42, 52));
        txtFiltroTermino.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtFiltroTermino.setForeground(new java.awt.Color(255, 255, 255));
        txtFiltroTermino.setText("Filtrar por término");
        txtFiltroTermino.setBorder(null);
        txtFiltroTermino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFiltroTerminoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFiltroTerminoFocusLost(evt);
            }
        });
        txtFiltroTermino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroTerminoActionPerformed(evt);
            }
        });
        txtFiltroTermino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroTerminoKeyReleased(evt);
            }
        });
        panelRound3.add(txtFiltroTermino);
        txtFiltroTermino.setBounds(10, 10, 290, 20);

        pnlLibrosRegistro1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 40));

        label4.setBackground(new java.awt.Color(255, 255, 255));
        label4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label4.setText("Buscador Avanzado");
        pnlLibrosRegistro1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 30));

        panelRound8.setBackground(new java.awt.Color(37, 42, 52));
        panelRound8.setForeground(new java.awt.Color(57, 59, 70));
        panelRound8.setRoundBottomLeft(20);
        panelRound8.setRoundBottomRight(20);
        panelRound8.setRoundTopLeft(20);
        panelRound8.setRoundTopRight(20);
        panelRound8.setLayout(null);

        cmbxBuscador.setBackground(new java.awt.Color(37, 42, 52));
        cmbxBuscador.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cmbxBuscador.setForeground(new java.awt.Color(255, 255, 255));
        cmbxBuscador.setMaximumRowCount(5);
        cmbxBuscador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un atributo", "ISBN", "Título", "Autor", "Género", "Año de publicación" }));
        cmbxBuscador.setToolTipText("");
        cmbxBuscador.setBorder(null);
        cmbxBuscador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbxBuscador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbxBuscadorItemStateChanged(evt);
            }
        });
        panelRound8.add(cmbxBuscador);
        cmbxBuscador.setBounds(10, 10, 340, 20);

        pnlLibrosRegistro1.add(panelRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 360, 40));

        pnlBuscador.add(pnlLibrosRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 580));

        bg.add(pnlBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 720, 600));

        pnlPrestamos.setBackground(new java.awt.Color(35, 36, 47));
        pnlPrestamos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAdministradoresRound1.setBackground(new java.awt.Color(24, 25, 32));
        pnlAdministradoresRound1.setRoundBottomLeft(10);
        pnlAdministradoresRound1.setRoundBottomRight(10);
        pnlAdministradoresRound1.setRoundTopLeft(10);
        pnlAdministradoresRound1.setRoundTopRight(10);
        pnlAdministradoresRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBusquedaUsuario1.setBackground(new java.awt.Color(37, 42, 52));
        pnlBusquedaUsuario1.setForeground(new java.awt.Color(57, 59, 70));
        pnlBusquedaUsuario1.setRoundBottomLeft(20);
        pnlBusquedaUsuario1.setRoundBottomRight(20);
        pnlBusquedaUsuario1.setRoundTopLeft(20);
        pnlBusquedaUsuario1.setRoundTopRight(20);
        pnlBusquedaUsuario1.setLayout(null);

        txtIdFiltroPrestamos.setBackground(new java.awt.Color(37, 42, 52));
        txtIdFiltroPrestamos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtIdFiltroPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        txtIdFiltroPrestamos.setText("Filtrar por ID");
        txtIdFiltroPrestamos.setBorder(null);
        txtIdFiltroPrestamos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdFiltroPrestamosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFiltroPrestamosFocusLost(evt);
            }
        });
        txtIdFiltroPrestamos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdFiltroPrestamosKeyReleased(evt);
            }
        });
        pnlBusquedaUsuario1.add(txtIdFiltroPrestamos);
        txtIdFiltroPrestamos.setBounds(10, 10, 660, 20);

        pnlAdministradoresRound1.add(pnlBusquedaUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 680, 40));

        label3.setBackground(new java.awt.Color(255, 255, 255));
        label3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label3.setText("Préstamos Registrados");
        pnlAdministradoresRound1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 30));

        btnRegistrarPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPrestamo.setRoundBottomLeft(20);
        btnRegistrarPrestamo.setRoundBottomRight(20);
        btnRegistrarPrestamo.setRoundTopLeft(20);
        btnRegistrarPrestamo.setRoundTopRight(20);
        btnRegistrarPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarPrestamoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarPrestamoMouseExited(evt);
            }
        });
        btnRegistrarPrestamo.setLayout(null);

        lblRegistrar4.setBackground(new java.awt.Color(24, 25, 32));
        lblRegistrar4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblRegistrar4.setForeground(new java.awt.Color(24, 25, 32));
        lblRegistrar4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar4.setText("Registrar Préstamo");
        btnRegistrarPrestamo.add(lblRegistrar4);
        lblRegistrar4.setBounds(0, 10, 210, 20);

        pnlAdministradoresRound1.add(btnRegistrarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 210, 40));
        Cursor cursorHand52 = new Cursor(Cursor.HAND_CURSOR);
        btnRegistrarUsuario.setCursor(cursorHand52);
        btnRegistrarUsuario.setVisible(true);

        tblPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Fecha de Vencimiento", "Libro", "Usuario Responsable"
            }
        ));
        tblPrestamos.setFocusable(false);
        tblPrestamos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        tblPrestamos.getTableHeader().setResizingAllowed(false);
        tblPrestamos.getTableHeader().setReorderingAllowed(false);
        tblPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPrestamosMouseClicked(evt);
            }
        });
        scrlUsuarios1.setViewportView(tblPrestamos);

        pnlAdministradoresRound1.add(scrlUsuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 680, 420));

        pnlPrestamos.add(pnlAdministradoresRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 580));

        bg.add(pnlPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 720, 600));

        pnlInformes.setBackground(new java.awt.Color(35, 36, 47));
        pnlInformes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLibrosRegistro2.setBackground(new java.awt.Color(24, 25, 32));
        pnlLibrosRegistro2.setRoundBottomLeft(10);
        pnlLibrosRegistro2.setRoundBottomRight(10);
        pnlLibrosRegistro2.setRoundTopLeft(10);
        pnlLibrosRegistro2.setRoundTopRight(10);
        pnlLibrosRegistro2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblUsuariosInformes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellidos", "Usuario", "Cargo"
            }
        ));
        tblUsuariosInformes.setFocusable(false);
        tblUsuariosInformes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        tblUsuariosInformes.getTableHeader().setResizingAllowed(false);
        tblUsuariosInformes.getTableHeader().setReorderingAllowed(false);
        tblUsuariosInformes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosInformesMouseClicked(evt);
            }
        });
        scrlLibros2.setViewportView(tblUsuariosInformes);

        pnlLibrosRegistro2.add(scrlLibros2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 380, 520));

        label5.setBackground(new java.awt.Color(255, 255, 255));
        label5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label5.setText("Informes Generales");
        pnlLibrosRegistro2.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 30));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("Cédula de Usuario:");
        pnlLibrosRegistro2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 120, 20));

        lblCedulaInforme.setBackground(new java.awt.Color(255, 255, 255));
        lblCedulaInforme.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblCedulaInforme.setForeground(new java.awt.Color(255, 255, 255));
        lblCedulaInforme.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCedulaInforme.setText("No seleccionado");
        pnlLibrosRegistro2.add(lblCedulaInforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 160, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Fecha de Inicio");
        pnlLibrosRegistro2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 280, 30));

        panelRound15.setBackground(new java.awt.Color(37, 42, 52));
        panelRound15.setForeground(new java.awt.Color(57, 59, 70));
        panelRound15.setRoundBottomLeft(20);
        panelRound15.setRoundBottomRight(20);
        panelRound15.setRoundTopLeft(20);
        panelRound15.setRoundTopRight(20);
        panelRound15.setLayout(null);

        cmbInformeGeneralInicioAnio.setBackground(new java.awt.Color(37, 42, 52));
        cmbInformeGeneralInicioAnio.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        cmbInformeGeneralInicioAnio.setForeground(new java.awt.Color(255, 255, 255));
        cmbInformeGeneralInicioAnio.setMaximumRowCount(5);
        cmbInformeGeneralInicioAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AAAA", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        cmbInformeGeneralInicioAnio.setToolTipText("");
        cmbInformeGeneralInicioAnio.setBorder(null);
        cmbInformeGeneralInicioAnio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRound15.add(cmbInformeGeneralInicioAnio);
        cmbInformeGeneralInicioAnio.setBounds(180, 10, 80, 20);

        cmbInformeGeneralInicioDia.setBackground(new java.awt.Color(37, 42, 52));
        cmbInformeGeneralInicioDia.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        cmbInformeGeneralInicioDia.setForeground(new java.awt.Color(255, 255, 255));
        cmbInformeGeneralInicioDia.setMaximumRowCount(5);
        cmbInformeGeneralInicioDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbInformeGeneralInicioDia.setToolTipText("");
        cmbInformeGeneralInicioDia.setBorder(null);
        cmbInformeGeneralInicioDia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRound15.add(cmbInformeGeneralInicioDia);
        cmbInformeGeneralInicioDia.setBounds(20, 10, 50, 20);

        cmbInformeGeneralInicioMes.setBackground(new java.awt.Color(37, 42, 52));
        cmbInformeGeneralInicioMes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        cmbInformeGeneralInicioMes.setForeground(new java.awt.Color(255, 255, 255));
        cmbInformeGeneralInicioMes.setMaximumRowCount(5);
        cmbInformeGeneralInicioMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cmbInformeGeneralInicioMes.setToolTipText("");
        cmbInformeGeneralInicioMes.setBorder(null);
        cmbInformeGeneralInicioMes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRound15.add(cmbInformeGeneralInicioMes);
        cmbInformeGeneralInicioMes.setBounds(100, 10, 60, 20);

        pnlLibrosRegistro2.add(panelRound15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 290, 40));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Fecha de Finalización");
        pnlLibrosRegistro2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 280, 30));

        panelRound16.setBackground(new java.awt.Color(37, 42, 52));
        panelRound16.setForeground(new java.awt.Color(57, 59, 70));
        panelRound16.setRoundBottomLeft(20);
        panelRound16.setRoundBottomRight(20);
        panelRound16.setRoundTopLeft(20);
        panelRound16.setRoundTopRight(20);
        panelRound16.setLayout(null);

        cmbInformeGeneralFinalAnio.setBackground(new java.awt.Color(37, 42, 52));
        cmbInformeGeneralFinalAnio.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        cmbInformeGeneralFinalAnio.setForeground(new java.awt.Color(255, 255, 255));
        cmbInformeGeneralFinalAnio.setMaximumRowCount(5);
        cmbInformeGeneralFinalAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AAAA", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        cmbInformeGeneralFinalAnio.setToolTipText("");
        cmbInformeGeneralFinalAnio.setBorder(null);
        cmbInformeGeneralFinalAnio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRound16.add(cmbInformeGeneralFinalAnio);
        cmbInformeGeneralFinalAnio.setBounds(180, 10, 80, 20);

        cmbInformeGeneralFinalDia.setBackground(new java.awt.Color(37, 42, 52));
        cmbInformeGeneralFinalDia.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        cmbInformeGeneralFinalDia.setForeground(new java.awt.Color(255, 255, 255));
        cmbInformeGeneralFinalDia.setMaximumRowCount(5);
        cmbInformeGeneralFinalDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbInformeGeneralFinalDia.setToolTipText("");
        cmbInformeGeneralFinalDia.setBorder(null);
        cmbInformeGeneralFinalDia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRound16.add(cmbInformeGeneralFinalDia);
        cmbInformeGeneralFinalDia.setBounds(20, 10, 50, 20);

        cmbInformeGeneralFinalMes.setBackground(new java.awt.Color(37, 42, 52));
        cmbInformeGeneralFinalMes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        cmbInformeGeneralFinalMes.setForeground(new java.awt.Color(255, 255, 255));
        cmbInformeGeneralFinalMes.setMaximumRowCount(5);
        cmbInformeGeneralFinalMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cmbInformeGeneralFinalMes.setToolTipText("");
        cmbInformeGeneralFinalMes.setBorder(null);
        cmbInformeGeneralFinalMes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRound16.add(cmbInformeGeneralFinalMes);
        cmbInformeGeneralFinalMes.setBounds(100, 10, 60, 20);

        pnlLibrosRegistro2.add(panelRound16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 290, 40));

        btnGenerarInformeGeneral.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerarInformeGeneral.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarInformeGeneral.setRoundBottomLeft(20);
        btnGenerarInformeGeneral.setRoundBottomRight(20);
        btnGenerarInformeGeneral.setRoundTopLeft(20);
        btnGenerarInformeGeneral.setRoundTopRight(20);
        btnGenerarInformeGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarInformeGeneralMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarInformeGeneralMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarInformeGeneralMouseExited(evt);
            }
        });
        btnGenerarInformeGeneral.setLayout(null);

        lblRegistrar7.setBackground(new java.awt.Color(24, 25, 32));
        lblRegistrar7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblRegistrar7.setForeground(new java.awt.Color(24, 25, 32));
        lblRegistrar7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar7.setText("Generar Informe");
        btnGenerarInformeGeneral.add(lblRegistrar7);
        lblRegistrar7.setBounds(0, 10, 290, 20);

        pnlLibrosRegistro2.add(btnGenerarInformeGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 290, 40));
        Cursor cursorHand102 = new Cursor(Cursor.HAND_CURSOR);
        btnRegistrarLibro.setCursor(cursorHand102);
        btnRegistrarLibro.setVisible(true);

        panelRound9.setBackground(new java.awt.Color(37, 42, 52));
        panelRound9.setForeground(new java.awt.Color(57, 59, 70));
        panelRound9.setRoundBottomLeft(20);
        panelRound9.setRoundBottomRight(20);
        panelRound9.setRoundTopLeft(20);
        panelRound9.setRoundTopRight(20);
        panelRound9.setLayout(null);

        cmbTipoInforme.setBackground(new java.awt.Color(37, 42, 52));
        cmbTipoInforme.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cmbTipoInforme.setForeground(new java.awt.Color(255, 255, 255));
        cmbTipoInforme.setMaximumRowCount(5);
        cmbTipoInforme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo de informe", "Prestamos Realizados", "Devoluciones realizadas", "Prestamos Retrasados" }));
        cmbTipoInforme.setToolTipText("");
        cmbTipoInforme.setBorder(null);
        cmbTipoInforme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbTipoInforme.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoInformeItemStateChanged(evt);
            }
        });
        panelRound9.add(cmbTipoInforme);
        cmbTipoInforme.setBounds(10, 10, 270, 20);

        pnlLibrosRegistro2.add(panelRound9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 290, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Tipo de Informe");
        pnlLibrosRegistro2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 360, 30));

        btnEliminarSeleccion.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarSeleccion.setRoundBottomLeft(20);
        btnEliminarSeleccion.setRoundBottomRight(20);
        btnEliminarSeleccion.setRoundTopLeft(20);
        btnEliminarSeleccion.setRoundTopRight(20);
        btnEliminarSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarSeleccionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarSeleccionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarSeleccionMouseExited(evt);
            }
        });
        btnEliminarSeleccion.setLayout(null);

        lblRegistrar8.setBackground(new java.awt.Color(24, 25, 32));
        lblRegistrar8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblRegistrar8.setForeground(new java.awt.Color(24, 25, 32));
        lblRegistrar8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrar8.setText("Quitar mi selección");
        btnEliminarSeleccion.add(lblRegistrar8);
        lblRegistrar8.setBounds(0, 10, 290, 20);

        pnlLibrosRegistro2.add(btnEliminarSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 290, 40));
        Cursor cursorHand122 = new Cursor(Cursor.HAND_CURSOR);
        btnRegistrarLibro.setCursor(cursorHand122);
        btnRegistrarLibro.setVisible(true);

        pnlInformes.add(pnlLibrosRegistro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 580));

        bg.add(pnlInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 720, 600));

        lblLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblLogo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLogo.setText("OmniSync");
        bg.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 30));

        lblResumen.setBackground(new java.awt.Color(255, 255, 255));
        lblResumen.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblResumen.setForeground(new java.awt.Color(255, 255, 255));
        lblResumen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblResumen.setText("Resumen");
        bg.add(lblResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, -1));

        tabResumen.setBackground(new java.awt.Color(255, 255, 255));
        tabResumen.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        tabResumen.setForeground(new java.awt.Color(255, 255, 255));
        tabResumen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tabResumen.setText("Resumen General");
        tabResumen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabResumen.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tabResumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResumenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabResumenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabResumenMouseExited(evt);
            }
        });
        bg.add(tabResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 30));

        lblGestionUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        lblGestionUsuarios.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblGestionUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGestionUsuarios.setText("Gestión de Usuarios");
        bg.add(lblGestionUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 180, 20));

        tabUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        tabUsuarios.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        tabUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        tabUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tabUsuarios.setText("Usuarios");
        tabUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tabUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabUsuariosMouseExited(evt);
            }
        });
        bg.add(tabUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, 30));

        lblUsuarioLogeado.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuarioLogeado.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lblUsuarioLogeado.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarioLogeado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuarioLogeado.setText("Usuario:");
        bg.add(lblUsuarioLogeado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 70, 20));

        lblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setText("{Usuario}");
        bg.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 130, 20));

        btnGestionCuenta.setBackground(new java.awt.Color(255, 255, 255));
        btnGestionCuenta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnGestionCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionCuenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGestionCuenta.setText("Gestionar Cuenta");
        btnGestionCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGestionCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionCuentaMouseExited(evt);
            }
        });
        bg.add(btnGestionCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 180, 20));

        btnCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
        });
        bg.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 180, 30));

        lblGestionBiblioteca.setBackground(new java.awt.Color(255, 255, 255));
        lblGestionBiblioteca.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblGestionBiblioteca.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGestionBiblioteca.setText("Gestión de Préstamos");
        bg.add(lblGestionBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 180, 20));

        tabLibrosRegistrados.setBackground(new java.awt.Color(255, 255, 255));
        tabLibrosRegistrados.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        tabLibrosRegistrados.setForeground(new java.awt.Color(255, 255, 255));
        tabLibrosRegistrados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tabLibrosRegistrados.setText("Libros Registrados");
        tabLibrosRegistrados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabLibrosRegistrados.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tabLibrosRegistrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLibrosRegistradosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabLibrosRegistradosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabLibrosRegistradosMouseExited(evt);
            }
        });
        bg.add(tabLibrosRegistrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 180, 30));

        lblGestionBiblioteca1.setBackground(new java.awt.Color(255, 255, 255));
        lblGestionBiblioteca1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblGestionBiblioteca1.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionBiblioteca1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGestionBiblioteca1.setText("Gestión de Biblioteca");
        bg.add(lblGestionBiblioteca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 180, 20));

        tabPrestamosRegistrados.setBackground(new java.awt.Color(255, 255, 255));
        tabPrestamosRegistrados.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        tabPrestamosRegistrados.setForeground(new java.awt.Color(255, 255, 255));
        tabPrestamosRegistrados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tabPrestamosRegistrados.setText("Préstamos Registrados");
        tabPrestamosRegistrados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabPrestamosRegistrados.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tabPrestamosRegistrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPrestamosRegistradosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabPrestamosRegistradosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabPrestamosRegistradosMouseExited(evt);
            }
        });
        bg.add(tabPrestamosRegistrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 180, 30));

        tabBuscador.setBackground(new java.awt.Color(255, 255, 255));
        tabBuscador.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        tabBuscador.setForeground(new java.awt.Color(255, 255, 255));
        tabBuscador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tabBuscador.setText("Buscador Avanzado");
        tabBuscador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabBuscador.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tabBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabBuscadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabBuscadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabBuscadorMouseExited(evt);
            }
        });
        bg.add(tabBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, 30));

        lblGestionBiblioteca2.setBackground(new java.awt.Color(255, 255, 255));
        lblGestionBiblioteca2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblGestionBiblioteca2.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionBiblioteca2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGestionBiblioteca2.setText("Informes");
        bg.add(lblGestionBiblioteca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 180, 20));

        tabInformes.setBackground(new java.awt.Color(255, 255, 255));
        tabInformes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        tabInformes.setForeground(new java.awt.Color(255, 255, 255));
        tabInformes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tabInformes.setText("Generación de Informes");
        tabInformes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabInformes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tabInformes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabInformesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabInformesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabInformesMouseExited(evt);
            }
        });
        bg.add(tabInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 180, 30));

        tabAcciones.setBackground(new java.awt.Color(255, 255, 255));
        tabAcciones.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        tabAcciones.setForeground(new java.awt.Color(255, 255, 255));
        tabAcciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tabAcciones.setText("Historial de Acciones");
        tabAcciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabAcciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tabAcciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAccionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabAccionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabAccionesMouseExited(evt);
            }
        });
        bg.add(tabAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 632, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	// Metodos Generales (Funcionalidad y Pestañas)

	private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
		System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

	private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
		VistaAcceso ventana = new VistaAcceso();
		ventana.setVisible(true);
		this.dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

	private void tabResumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResumenMouseClicked
		cambiarPanel();
		pnlResumen.setVisible(true);
    }//GEN-LAST:event_tabResumenMouseClicked

	private void tabUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabUsuariosMouseClicked
		llenarTablaUsuarios(txtIdPrestamoFiltro.getText());
		cambiarPanel();
		pnlUsuarios.setVisible(true);
    }//GEN-LAST:event_tabUsuariosMouseClicked

	// Metodos encargados de cambios de color en Componentes

	private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
		btnSalir.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
		btnSalir.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnSalirMouseExited

	private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
		btnCerrarSesion.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
		btnCerrarSesion.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnCerrarSesionMouseExited

	// Metodos encargados de arrastrar la ventana
	private void headerMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_headerMousePressed
		xMouse = evt.getX();
		yMouse = evt.getY();
	}

	private void headerMouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_headerMouseDragged
		int x = evt.getXOnScreen();
		int y = evt.getYOnScreen();
		this.setLocation(x - xMouse, y - yMouse);
	}
        private void tabResumenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResumenMouseEntered
			tabResumen.setForeground(new Color(204, 204, 204));
        }//GEN-LAST:event_tabResumenMouseEntered

        private void tabResumenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResumenMouseExited
			tabResumen.setForeground(new Color(255, 255, 255));
        }//GEN-LAST:event_tabResumenMouseExited

        private void tabUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabUsuariosMouseEntered
			tabUsuarios.setForeground(new Color(204, 204, 204));
        }//GEN-LAST:event_tabUsuariosMouseEntered

        private void tabUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabUsuariosMouseExited
			tabUsuarios.setForeground(new Color(255, 255, 255));
        }//GEN-LAST:event_tabUsuariosMouseExited

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
		String cedula = (String) tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 0);
		Usuario usuarioSeleccionado = controlador.consultarUsuario(cedula, true);

		VistaGestionUsuario ventana = new VistaGestionUsuario(this, usuarioSeleccionado);
		ventana.setVisible(true);
    }//GEN-LAST:event_tblUsuariosMouseClicked

        private void txtIdPrestamoFiltroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdPrestamoFiltroFocusGained
			if (txtIdPrestamoFiltro.getText().equals("Filtrar por Cédula")) {
				txtIdPrestamoFiltro.setText("");
			}
        }//GEN-LAST:event_txtIdPrestamoFiltroFocusGained

        private void txtIdPrestamoFiltroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdPrestamoFiltroFocusLost
			if (txtIdPrestamoFiltro.getText().equals("")) {
				txtIdPrestamoFiltro.setText("Filtrar por Cédula");
			}
        }//GEN-LAST:event_txtIdPrestamoFiltroFocusLost

        private void txtIdPrestamoFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPrestamoFiltroKeyReleased
                        llenarTablaUsuarios(txtIdPrestamoFiltro.getText());
        }//GEN-LAST:event_txtIdPrestamoFiltroKeyReleased

        private void btnRegistrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioMouseClicked
			VistaRegistroUsuario vista = new VistaRegistroUsuario(this);
			vista.setVisible(true);
        }//GEN-LAST:event_btnRegistrarUsuarioMouseClicked

        private void btnRegistrarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioMouseEntered
			// TODO add your handling code here:
        }//GEN-LAST:event_btnRegistrarUsuarioMouseEntered

        private void btnRegistrarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioMouseExited
			// TODO add your handling code here:
        }//GEN-LAST:event_btnRegistrarUsuarioMouseExited

        private void btnGestionCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionCuentaMouseClicked
			VistaGestionPerfil vista = new VistaGestionPerfil(this, usuarioActivo);
			vista.setVisible(true);
        }//GEN-LAST:event_btnGestionCuentaMouseClicked

        private void btnGestionCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionCuentaMouseEntered
			btnGestionCuenta.setForeground(new Color(204, 204, 204));
        }//GEN-LAST:event_btnGestionCuentaMouseEntered

        private void btnGestionCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionCuentaMouseExited
			btnGestionCuenta.setForeground(new Color(255, 255, 255));
        }//GEN-LAST:event_btnGestionCuentaMouseExited

    private void tblLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibrosMouseClicked
		String isbn = (String) tblLibros.getValueAt(tblLibros.getSelectedRow(), 0);
		Libro libroSeleccionado = controlador.consultarLibro(isbn);

		VistaGestionLibro ventana = new VistaGestionLibro(this, libroSeleccionado);
		ventana.setVisible(true);
    }//GEN-LAST:event_tblLibrosMouseClicked

    private void txtIsbnFiltroLibroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIsbnFiltroLibroFocusGained
		if (txtIsbnFiltroLibro.getText().equals("Filtrar por ISBN")) {
			txtIsbnFiltroLibro.setText("");
		}
    }//GEN-LAST:event_txtIsbnFiltroLibroFocusGained

    private void txtIsbnFiltroLibroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIsbnFiltroLibroFocusLost
		if (txtIsbnFiltroLibro.getText().equals("")) {
			txtIsbnFiltroLibro.setText("Filtrar por ISBN");
		}
    }//GEN-LAST:event_txtIsbnFiltroLibroFocusLost

    private void txtIsbnFiltroLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIsbnFiltroLibroKeyReleased
		filtrarTablaLibros();
    }//GEN-LAST:event_txtIsbnFiltroLibroKeyReleased

    private void btnRegistrarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarLibroMouseClicked
		VistaRegistroLibro vista = new VistaRegistroLibro(this);
		vista.setVisible(true);
    }//GEN-LAST:event_btnRegistrarLibroMouseClicked

    private void btnRegistrarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarLibroMouseEntered
		btnRegistrarLibro.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnRegistrarLibroMouseEntered

    private void btnRegistrarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarLibroMouseExited
		btnRegistrarLibro.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnRegistrarLibroMouseExited

    private void cmbGenerosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGenerosItemStateChanged
		filtrarTablaLibros();
    }//GEN-LAST:event_cmbGenerosItemStateChanged

    private void tabLibrosRegistradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLibrosRegistradosMouseClicked
		cambiarPanel();
		pnlLibros.setVisible(true);
		llenarTablaLibros(null, null);
		llenarCmbGeneros();
		llenarTablaGeneros();
    }//GEN-LAST:event_tabLibrosRegistradosMouseClicked

    private void tabLibrosRegistradosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLibrosRegistradosMouseEntered
		tabLibrosRegistrados.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_tabLibrosRegistradosMouseEntered

    private void tabLibrosRegistradosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLibrosRegistradosMouseExited
		tabLibrosRegistrados.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_tabLibrosRegistradosMouseExited

    private void tblGenerosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGenerosMouseClicked
		String id = (String) tblGeneros.getValueAt(tblGeneros.getSelectedRow(), 0);
		Genero generoSeleccionado = controlador.consultarGenero(id);

		VistaGestionGenero ventana = new VistaGestionGenero(this, generoSeleccionado);
		ventana.setVisible(true);
    }//GEN-LAST:event_tblGenerosMouseClicked

    private void btnRegistrarGeneroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarGeneroMouseClicked
		VistaRegistroGenero vista = new VistaRegistroGenero(this);
		vista.setVisible(true);
    }//GEN-LAST:event_btnRegistrarGeneroMouseClicked

    private void btnRegistrarGeneroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarGeneroMouseEntered
		btnRegistrarGenero.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnRegistrarGeneroMouseEntered

    private void btnRegistrarGeneroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarGeneroMouseExited
		btnRegistrarGenero.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnRegistrarGeneroMouseExited

    private void txtIsbnFiltroLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnFiltroLibroActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_txtIsbnFiltroLibroActionPerformed

    private void tabPrestamosRegistradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPrestamosRegistradosMouseClicked
		cambiarPanel();
		llenarTablaPrestamos();
		pnlPrestamos.setVisible(true);
    }//GEN-LAST:event_tabPrestamosRegistradosMouseClicked

    private void tabPrestamosRegistradosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPrestamosRegistradosMouseEntered
		tabPrestamosRegistrados.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_tabPrestamosRegistradosMouseEntered

    private void tabPrestamosRegistradosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPrestamosRegistradosMouseExited
		tabPrestamosRegistrados.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_tabPrestamosRegistradosMouseExited

    private void txtIdFiltroPrestamosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFiltroPrestamosFocusGained
		if (txtIdFiltroPrestamos.getText().equals("Filtrar por ID")) {
			txtIdFiltroPrestamos.setText("");
		}
    }//GEN-LAST:event_txtIdFiltroPrestamosFocusGained

    private void txtIdFiltroPrestamosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFiltroPrestamosFocusLost
		if (txtIdFiltroPrestamos.getText().equals("")) {
			txtIdFiltroPrestamos.setText("Filtrar por ID");
		}
    }//GEN-LAST:event_txtIdFiltroPrestamosFocusLost

    private void txtIdFiltroPrestamosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdFiltroPrestamosKeyReleased
		llenarTablaPrestamos();
    }//GEN-LAST:event_txtIdFiltroPrestamosKeyReleased

    private void btnRegistrarPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPrestamoMouseClicked
		VistaRegistroPrestamo vista = new VistaRegistroPrestamo(this);
		vista.setVisible(true);
    }//GEN-LAST:event_btnRegistrarPrestamoMouseClicked

    private void btnRegistrarPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPrestamoMouseEntered
		btnRegistrarPrestamo.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnRegistrarPrestamoMouseEntered

    private void btnRegistrarPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarPrestamoMouseExited
		btnRegistrarPrestamo.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnRegistrarPrestamoMouseExited

    private void tblPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPrestamosMouseClicked
		String id = (String) tblPrestamos.getValueAt(tblPrestamos.getSelectedRow(), 0);
		Prestamo prestamoSeleccionado = controlador.consultarPrestamo(id);

		VistaRetornoPrestamo ventana = new VistaRetornoPrestamo(this, prestamoSeleccionado);
		ventana.setVisible(true);
    }//GEN-LAST:event_tblPrestamosMouseClicked

    private void tabBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBuscadorMouseClicked
		cambiarPanel();
		llenarTablaLibrosFiltro();
		pnlBuscador.setVisible(true);
    }//GEN-LAST:event_tabBuscadorMouseClicked

    private void tabBuscadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBuscadorMouseEntered
		tabBuscador.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_tabBuscadorMouseEntered

    private void tabBuscadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBuscadorMouseExited
		tabBuscador.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_tabBuscadorMouseExited

    private void tblBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscadorMouseClicked
		// TODO add your handling code here:
    }//GEN-LAST:event_tblBuscadorMouseClicked

    private void txtFiltroTerminoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroTerminoFocusGained
		if (txtFiltroTermino.getText().equals("Filtrar por término")) {
			txtFiltroTermino.setText("");
		}
    }//GEN-LAST:event_txtFiltroTerminoFocusGained

    private void txtFiltroTerminoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroTerminoFocusLost
		if (txtFiltroTermino.getText().equals("")) {
			txtFiltroTermino.setText("Filtrar por término");
		}
    }//GEN-LAST:event_txtFiltroTerminoFocusLost

    private void txtFiltroTerminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroTerminoActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroTerminoActionPerformed

    private void txtFiltroTerminoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroTerminoKeyReleased
		llenarTablaLibrosFiltro();
    }//GEN-LAST:event_txtFiltroTerminoKeyReleased

    private void cmbxBuscadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbxBuscadorItemStateChanged
		llenarTablaLibrosFiltro();
    }//GEN-LAST:event_cmbxBuscadorItemStateChanged

    private void tabInformesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabInformesMouseClicked
		cambiarPanel();
		llenarTablaInformes();
		pnlInformes.setVisible(true);
    }//GEN-LAST:event_tabInformesMouseClicked

    private void tabInformesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabInformesMouseEntered
		tabInformes.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_tabInformesMouseEntered

    private void tabInformesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabInformesMouseExited
		tabInformes.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_tabInformesMouseExited

    private void tblUsuariosInformesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosInformesMouseClicked
		String cedula = (String) tblUsuariosInformes.getValueAt(tblUsuariosInformes.getSelectedRow(), 0);
		lblCedulaInforme.setText(cedula);
    }//GEN-LAST:event_tblUsuariosInformesMouseClicked

    private void cmbTipoInformeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoInformeItemStateChanged
    }//GEN-LAST:event_cmbTipoInformeItemStateChanged

    private void btnGenerarInformeGeneralMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarInformeGeneralMouseExited
		btnGenerarInformeGeneral.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGenerarInformeGeneralMouseExited

    private void btnGenerarInformeGeneralMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarInformeGeneralMouseEntered
		btnGenerarInformeGeneral.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnGenerarInformeGeneralMouseEntered

    private void btnGenerarInformeGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarInformeGeneralMouseClicked
		try {
			controlador.generarInformeGeneral(lblCedulaInforme.getText(), (String) cmbTipoInforme.getSelectedItem(),
					String.valueOf(cmbInformeGeneralInicioAnio.getSelectedItem())
					+ "-" + String.valueOf(cmbInformeGeneralInicioMes.getSelectedItem())
					+ "-" + String.valueOf(cmbInformeGeneralInicioDia.getSelectedItem()),
					String.valueOf(cmbInformeGeneralFinalAnio.getSelectedItem())
					+ "-" + String.valueOf(cmbInformeGeneralFinalMes.getSelectedItem())
					+ "-" + String.valueOf(cmbInformeGeneralFinalDia.getSelectedItem()));
			controlador.insertarRegistro(usuarioActivo.getCedula(), "Generación de informe");
		} catch (Exception e) {
			VistaNotificacion vista = new VistaNotificacion(e.getMessage());
			vista.setVisible(true);
		}
    }//GEN-LAST:event_btnGenerarInformeGeneralMouseClicked

    private void btnEliminarSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarSeleccionMouseClicked
		if (lblCedulaInforme.getText().equals("No seleccionado")) {
			VistaNotificacion vista = new VistaNotificacion("No se ha seleccionado un usuario");
			vista.setVisible(true);
		} else {
			lblCedulaInforme.setText("No seleccionado");
		}
    }//GEN-LAST:event_btnEliminarSeleccionMouseClicked

    private void btnEliminarSeleccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarSeleccionMouseEntered
		btnEliminarSeleccion.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnEliminarSeleccionMouseEntered

    private void btnEliminarSeleccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarSeleccionMouseExited
		btnEliminarSeleccion.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEliminarSeleccionMouseExited

    private void tabAccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAccionesMouseClicked
		cambiarPanel();
		pnlRegistros.setVisible(true);
		llenarTablaAcciones("placeholder");
    }//GEN-LAST:event_tabAccionesMouseClicked

    private void tabAccionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAccionesMouseEntered
		tabAcciones.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_tabAccionesMouseEntered

    private void tabAccionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAccionesMouseExited
		tabAcciones.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_tabAccionesMouseExited

    private void txtIdRegistroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdRegistroFocusGained
		if (txtIdRegistro.getText().equals("Filtrar por Cédula")) {
			txtIdRegistro.setText("");
		}
    }//GEN-LAST:event_txtIdRegistroFocusGained

    private void txtIdRegistroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdRegistroFocusLost
		if (txtIdRegistro.getText().equals("")) {
			txtIdRegistro.setText("Filtrar por Cédula");
		}
    }//GEN-LAST:event_txtIdRegistroFocusLost

    private void txtIdRegistroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdRegistroKeyReleased
		llenarTablaAcciones(txtIdRegistro.getText());
    }//GEN-LAST:event_txtIdRegistroKeyReleased

    private void tblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrosMouseClicked
		// TODO add your handling code here:
    }//GEN-LAST:event_tblRegistrosMouseClicked

	public void cambiarPanel() {
		pnlResumen.setVisible(false);
		pnlRegistros.setVisible(false);
		pnlUsuarios.setVisible(false);
		pnlLibros.setVisible(false);
		pnlBuscador.setVisible(false);
		pnlPrestamos.setVisible(false);
		pnlInformes.setVisible(false);
	}

	public void llenarTablaUsuarios(String where) {
		DefaultTableModel modelo = new DefaultTableModel();
		ArrayList<Usuario> listaUsuarios = controlador.obtenerListaUsuarios(where);
		modelo.setColumnIdentifiers(new Object[]{"Cédula", "Nombre", "Apellidos", "Usuario"});
		tblUsuarios.setModel(modelo);

		for (Usuario usuarioAlmacenado : listaUsuarios) {
			modelo.addRow(new Object[]{
				usuarioAlmacenado.getCedula(),
				usuarioAlmacenado.getNombre(),
				usuarioAlmacenado.getApellidos(),
				usuarioAlmacenado.getUsuario()
			});
		}
	}

	public void llenarTablaLibros(String isbn, String idGenero) {
		DefaultTableModel modelo = new DefaultTableModel();
		ArrayList<Libro> listaLibros = controlador.obtenerListaLibros(isbn, idGenero);
		modelo.setColumnIdentifiers(new Object[]{"ISBN", "Título", "Autor", "Género", "Año de publicación", "Unidades disponibles"});
		tblLibros.setModel(modelo);

		for (Libro generoAlmacenado : listaLibros) {
			modelo.addRow(new Object[]{
				generoAlmacenado.getISBN(),
				generoAlmacenado.getTitulo(),
				generoAlmacenado.getAutor(),
				generoAlmacenado.getGenero(),
				generoAlmacenado.getAnioPublicacion(),
				generoAlmacenado.getUnidadesDisponibles(),});
		}
	}

	public void llenarTablaLibrosFiltro() {
		String atributo = cmbxBuscador.getSelectedItem().toString();
		String valor = txtFiltroTermino.getText();

		DefaultTableModel modelo = new DefaultTableModel();
		ArrayList<Libro> listaLibros = controlador.obtenerListaLibrosFiltro(atributo, valor);
		modelo.setColumnIdentifiers(new Object[]{"ISBN", "Título", "Autor", "Género", "Año de publicación", "Unidades disponibles"});
		tblBuscador.setModel(modelo);

		for (Libro generoAlmacenado : listaLibros) {
			modelo.addRow(new Object[]{
				generoAlmacenado.getISBN(),
				generoAlmacenado.getTitulo(),
				generoAlmacenado.getAutor(),
				generoAlmacenado.getGenero(),
				generoAlmacenado.getAnioPublicacion(),
				generoAlmacenado.getUnidadesDisponibles(),});
		}
	}

	public void llenarTablaGeneros() {
		DefaultTableModel modelo = new DefaultTableModel();
		ArrayList<Genero> listaGeneros = controlador.obtenerListaGeneros();
		modelo.setColumnIdentifiers(new Object[]{"ID Género", "Nombre"});
		tblGeneros.setModel(modelo);

		for (Genero generoAlmacenado : listaGeneros) {
			modelo.addRow(new Object[]{
				generoAlmacenado.getId(),
				generoAlmacenado.getNombre()
			});
		}
	}

	public void llenarTablaInformes() {
		DefaultTableModel modelo = new DefaultTableModel();
		ArrayList<Usuario> listaUsuarios = controlador.obtenerListaUsuarios();
		modelo.setColumnIdentifiers(new Object[]{"Cédula", "Nombre", "Apellidos"});
		tblUsuariosInformes.setModel(modelo);

		for (Usuario usuarioAlmacenado : listaUsuarios) {
			modelo.addRow(new Object[]{
				usuarioAlmacenado.getCedula(),
				usuarioAlmacenado.getNombre(),
				usuarioAlmacenado.getApellidos()
			});
		}
	}

	public void llenarTablaAcciones(String where) {
		tblRegistros.setModel(controlador.obtenerTablaRegistros(where));
	}

	public void llenarTablaPrestamos() {
		String id = txtIdFiltroPrestamos.getText();
		tblPrestamos.setModel(controlador.obtenerListaPrestamos(id));
	}

	public void llenarCmbGeneros() {
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
		cmbGeneros.setModel(model);

		ArrayList<Genero> generos = controlador.obtenerListaGeneros();
		model.addElement("Todos los géneros"); // Agrega la opción predeterminada

		for (Genero genero : generos) {
			model.addElement(genero.getId() + " - " + genero.getNombre());
		}
	}

	private void filtrarTablaLibros() {
		int selectedIndex = cmbGeneros.getSelectedIndex();
		String isbn = txtIsbnFiltroLibro.getText();
		if (isbn.equals("Filtrar por ISBN") && selectedIndex == 0) {
			llenarTablaLibros(null, null);
		} else if (!isbn.equals("Filtrar por ISBN") && selectedIndex == 0) {
			llenarTablaLibros(isbn, null);
		} else if (isbn.equals("Filtrar por ISBN") && selectedIndex != 0) {
			llenarTablaLibros(null, cmbGeneros.getSelectedItem().toString().split(" ")[0]);
		} else {
			llenarTablaLibros(isbn, cmbGeneros.getSelectedItem().toString().split(" ")[0]);
		}
	}

        public String getTxtIdPrestamoFiltroText() {
            return txtIdPrestamoFiltro.getText();
        }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btnCerrarSesion;
    private com.vistas.PanelRound btnEliminarSeleccion;
    private com.vistas.PanelRound btnGenerarInformeGeneral;
    private javax.swing.JLabel btnGestionCuenta;
    private com.vistas.PanelRound btnRegistrarGenero;
    private com.vistas.PanelRound btnRegistrarLibro;
    private com.vistas.PanelRound btnRegistrarPrestamo;
    private com.vistas.PanelRound btnRegistrarUsuario;
    private com.vistas.PanelRound btnSalir;
    private javax.swing.JComboBox<String> cmbGeneros;
    private javax.swing.JComboBox<String> cmbInformeGeneralFinalAnio;
    private javax.swing.JComboBox<String> cmbInformeGeneralFinalDia;
    private javax.swing.JComboBox<String> cmbInformeGeneralFinalMes;
    private javax.swing.JComboBox<String> cmbInformeGeneralInicioAnio;
    private javax.swing.JComboBox<String> cmbInformeGeneralInicioDia;
    private javax.swing.JComboBox<String> cmbInformeGeneralInicioMes;
    private javax.swing.JComboBox<String> cmbTipoInforme;
    private javax.swing.JComboBox<String> cmbxBuscador;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCedulaInforme;
    private javax.swing.JLabel lblGestionBiblioteca;
    private javax.swing.JLabel lblGestionBiblioteca1;
    private javax.swing.JLabel lblGestionBiblioteca2;
    private javax.swing.JLabel lblGestionUsuarios;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistrar1;
    private javax.swing.JLabel lblRegistrar2;
    private javax.swing.JLabel lblRegistrar3;
    private javax.swing.JLabel lblRegistrar4;
    private javax.swing.JLabel lblRegistrar7;
    private javax.swing.JLabel lblRegistrar8;
    private javax.swing.JLabel lblResumen;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioLogeado;
    private com.vistas.PanelRound panelRound15;
    private com.vistas.PanelRound panelRound16;
    private com.vistas.PanelRound panelRound18;
    private com.vistas.PanelRound panelRound2;
    private com.vistas.PanelRound panelRound3;
    private com.vistas.PanelRound panelRound7;
    private com.vistas.PanelRound panelRound8;
    private com.vistas.PanelRound panelRound9;
    private com.vistas.PanelRound pnlAdministradoresRound;
    private com.vistas.PanelRound pnlAdministradoresRound1;
    private com.vistas.PanelRound pnlAdministradoresRound2;
    private javax.swing.JPanel pnlBuscador;
    private com.vistas.PanelRound pnlBusquedaUsuario;
    private com.vistas.PanelRound pnlBusquedaUsuario1;
    private com.vistas.PanelRound pnlBusquedaUsuario2;
    private com.vistas.PanelRound pnlCategoriasRegistro;
    private javax.swing.JPanel pnlInformes;
    private javax.swing.JPanel pnlLibros;
    private com.vistas.PanelRound pnlLibrosRegistro;
    private com.vistas.PanelRound pnlLibrosRegistro1;
    private com.vistas.PanelRound pnlLibrosRegistro2;
    private javax.swing.JPanel pnlPrestamos;
    private javax.swing.JPanel pnlRegistros;
    private javax.swing.JPanel pnlResumen;
    private javax.swing.JPanel pnlUsuarios;
    private javax.swing.JScrollPane scrlGeneros;
    private javax.swing.JScrollPane scrlLibros;
    private javax.swing.JScrollPane scrlLibros1;
    private javax.swing.JScrollPane scrlLibros2;
    private javax.swing.JScrollPane scrlUsuarios;
    private javax.swing.JScrollPane scrlUsuarios1;
    private javax.swing.JScrollPane scrlUsuarios2;
    private javax.swing.JLabel tabAcciones;
    private javax.swing.JLabel tabBuscador;
    private javax.swing.JLabel tabInformes;
    private javax.swing.JLabel tabLibrosRegistrados;
    private javax.swing.JLabel tabPrestamosRegistrados;
    private javax.swing.JLabel tabResumen;
    private javax.swing.JLabel tabUsuarios;
    private com.vistas.Table tblBuscador;
    private com.vistas.Table tblGeneros;
    private com.vistas.Table tblLibros;
    private com.vistas.Table tblPrestamos;
    private com.vistas.Table tblRegistros;
    private com.vistas.Table tblUsuarios;
    private com.vistas.Table tblUsuariosInformes;
    private javax.swing.JTextField txtFiltroTermino;
    private javax.swing.JTextField txtIdFiltroPrestamos;
    private javax.swing.JTextField txtIdPrestamoFiltro;
    private javax.swing.JTextField txtIdRegistro;
    private javax.swing.JTextField txtIsbnFiltroLibro;
    // End of variables declaration//GEN-END:variables

}
