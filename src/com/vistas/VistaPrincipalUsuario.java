package com.vistas;

import com.controladores.ControladorPrincipalUsuario;
import com.modelos.Genero;
import com.modelos.Libro;
import com.modelos.Usuario;
import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
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
        pnlUsuarios = new javax.swing.JPanel();
        pnlAdministradoresRound = new com.vistas.PanelRound();
        pnlBusquedaUsuario = new com.vistas.PanelRound();
        txtCedulaFiltroUsuarios = new javax.swing.JTextField();
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
        jLabel46.setText("Desde esta ventana se le permitira administrar todo lo referente a usuarios y gestion de prestamos");
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

        txtCedulaFiltroUsuarios.setBackground(new java.awt.Color(37, 42, 52));
        txtCedulaFiltroUsuarios.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtCedulaFiltroUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        txtCedulaFiltroUsuarios.setText("Filtrar por cédula");
        txtCedulaFiltroUsuarios.setBorder(null);
        txtCedulaFiltroUsuarios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCedulaFiltroUsuariosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFiltroUsuariosFocusLost(evt);
            }
        });
        txtCedulaFiltroUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaFiltroUsuariosKeyReleased(evt);
            }
        });
        pnlBusquedaUsuario.add(txtCedulaFiltroUsuarios);
        txtCedulaFiltroUsuarios.setBounds(10, 10, 660, 20);

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
        Cursor cursorHand52 = new Cursor(Cursor.HAND_CURSOR);
        btnRegistrarUsuario.setCursor(cursorHand52);
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
        bg.add(lblGestionUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 20));

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
        bg.add(tabUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, 30));

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
        lblGestionBiblioteca.setText("Gestión de Biblioteca");
        bg.add(lblGestionBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, 20));

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
        bg.add(tabLibrosRegistrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 180, 30));

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
		llenarTablaUsuarios();
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

        private void txtCedulaFiltroUsuariosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFiltroUsuariosFocusGained
			if (txtCedulaFiltroUsuarios.getText().equals("Filtrar por cédula")) {
				txtCedulaFiltroUsuarios.setText("");
			}
        }//GEN-LAST:event_txtCedulaFiltroUsuariosFocusGained

        private void txtCedulaFiltroUsuariosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFiltroUsuariosFocusLost
			if (txtCedulaFiltroUsuarios.getText().equals("")) {
				txtCedulaFiltroUsuarios.setText("Filtrar por cédula");
			}
        }//GEN-LAST:event_txtCedulaFiltroUsuariosFocusLost

        private void txtCedulaFiltroUsuariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaFiltroUsuariosKeyReleased
			if (!txtCedulaFiltroUsuarios.getText().equals("Filtrar por cédula")) {
				llenarTablaUsuarios();
			}
        }//GEN-LAST:event_txtCedulaFiltroUsuariosKeyReleased

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

	public void cambiarPanel() {
		pnlResumen.setVisible(false);
		pnlUsuarios.setVisible(false);
		pnlLibros.setVisible(false);
	}

	public void llenarTablaUsuarios() {
		DefaultTableModel modelo = new DefaultTableModel();
		ArrayList<Usuario> listaUsuarios = controlador.obtenerListaUsuarios();
		modelo.setColumnIdentifiers(new Object[]{"Cédula", "Nombre", "Apellidos", "Usuarios"});
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
		modelo.setColumnIdentifiers(new Object[]{"ISBN", "Titulo", "Autor", "Género", "Año de publicacion", "Unidades disponibles"});
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

	public void llenarCmbGeneros() {
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
		cmbGeneros.setModel(model);

		ArrayList<Genero> generos = controlador.obtenerListaGeneros();
		model.addElement("Seleccione un género"); // Agrega la opción predeterminada

		for (Genero genero : generos) {
			model.addElement(genero.getId() + " - " + genero.getNombre());
		}
	}

	private void filtrarTablaLibros() {
		int selectedIndex = cmbGeneros.getSelectedIndex();
		String isbn = txtIsbnFiltroLibro.getText();
		if (isbn.equals("Filtrar por ISBN") && selectedIndex == 0) {
			llenarTablaLibros(null, null);
		} else if (!isbn.equals("Filtrar por ISBN")) {
			llenarTablaLibros(isbn, null);
		} else if (selectedIndex != 0) {
			llenarTablaLibros(null, cmbGeneros.getSelectedItem().toString().split(" ")[0]);
		} else {
			llenarTablaLibros(isbn, cmbGeneros.getSelectedItem().toString().split(" ")[0]);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnGestionCuenta;
    private com.vistas.PanelRound btnRegistrarGenero;
    private com.vistas.PanelRound btnRegistrarLibro;
    private com.vistas.PanelRound btnRegistrarUsuario;
    private com.vistas.PanelRound btnSalir;
    private javax.swing.JComboBox<String> cmbGeneros;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblGestionBiblioteca;
    private javax.swing.JLabel lblGestionUsuarios;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistrar1;
    private javax.swing.JLabel lblRegistrar2;
    private javax.swing.JLabel lblRegistrar3;
    private javax.swing.JLabel lblResumen;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioLogeado;
    private com.vistas.PanelRound panelRound18;
    private com.vistas.PanelRound panelRound2;
    private com.vistas.PanelRound panelRound7;
    private com.vistas.PanelRound pnlAdministradoresRound;
    private com.vistas.PanelRound pnlBusquedaUsuario;
    private com.vistas.PanelRound pnlCategoriasRegistro;
    private javax.swing.JPanel pnlLibros;
    private com.vistas.PanelRound pnlLibrosRegistro;
    private javax.swing.JPanel pnlResumen;
    private javax.swing.JPanel pnlUsuarios;
    private javax.swing.JScrollPane scrlGeneros;
    private javax.swing.JScrollPane scrlLibros;
    private javax.swing.JScrollPane scrlUsuarios;
    private javax.swing.JLabel tabLibrosRegistrados;
    private javax.swing.JLabel tabResumen;
    private javax.swing.JLabel tabUsuarios;
    private com.vistas.Table tblGeneros;
    private com.vistas.Table tblLibros;
    private com.vistas.Table tblUsuarios;
    private javax.swing.JTextField txtCedulaFiltroUsuarios;
    private javax.swing.JTextField txtIsbnFiltroLibro;
    // End of variables declaration//GEN-END:variables

}
