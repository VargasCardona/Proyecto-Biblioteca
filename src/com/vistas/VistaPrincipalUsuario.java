package com.vistas;

import com.controladores.ControladorPrincipalUsuario;
import com.modelos.Usuario;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        lblLogo = new javax.swing.JLabel();
        lblResumen = new javax.swing.JLabel();
        tabResumen = new javax.swing.JLabel();
        lblGestionUsuarios = new javax.swing.JLabel();
        tabUsuarios = new javax.swing.JLabel();
        lblUsuarioLogeado = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnGestionCuenta = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JLabel();

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
		llenarTablaUsuarios("");
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
		Usuario usuarioSeleccionado = null;
		
		ResultSet rs = controlador.consultarUsuario(cedula, true);
		Usuario usuarioEncontrado = new Usuario(null, null, null, null, null);
		
		try {
			if (rs.next()) {
				usuarioEncontrado.setCedula(rs.getString(1));
				usuarioEncontrado.setNombre(rs.getString(2));
				usuarioEncontrado.setApellidos(rs.getString(3));
				usuarioEncontrado.setUsuario(rs.getString(4));
				usuarioEncontrado.setContrasenia(rs.getString(5));
			}
		} catch (SQLException ex) {
			Logger.getLogger(VistaPrincipalUsuario.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		VistaGestionUsuario ventana = new VistaGestionUsuario(this, usuarioEncontrado, usuarioActivo.getCedula());
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
				llenarTablaUsuarios(txtCedulaFiltroUsuarios.getText());
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

	public void cambiarPanel() {
		pnlResumen.setVisible(false);
		pnlUsuarios.setVisible(false);
	}

	public void llenarTablaUsuarios(String filtroCedula) {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(new Object[]{"Cedula", "Nombre", "Apellidos", "Usuario"});
		ResultSet rs = null;
		tblUsuarios.setModel(modelo);

		if (filtroCedula.equals("")
				|| filtroCedula.equals("Filtrar por cédula")) {

			rs = controlador.listarTabla();
		} else {
			rs = controlador.buscarCoincidencias(filtroCedula);
		}

		try {
			ResultSetMetaData resultMetadata = (ResultSetMetaData) rs.getMetaData();
			int cantidadColumnas = resultMetadata.getColumnCount();

			Object[] filas = new Object[cantidadColumnas];
			while (rs.next()) {
				for (int i = 0; i < cantidadColumnas; i++) {
					filas[i] = rs.getObject(i + 1);
				}
				modelo.addRow(filas);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnGestionCuenta;
    private com.vistas.PanelRound btnRegistrarUsuario;
    private com.vistas.PanelRound btnSalir;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblGestionUsuarios;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistrar1;
    private javax.swing.JLabel lblResumen;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioLogeado;
    private com.vistas.PanelRound panelRound18;
    private com.vistas.PanelRound pnlAdministradoresRound;
    private com.vistas.PanelRound pnlBusquedaUsuario;
    private javax.swing.JPanel pnlResumen;
    private javax.swing.JPanel pnlUsuarios;
    private javax.swing.JScrollPane scrlUsuarios;
    private javax.swing.JLabel tabResumen;
    private javax.swing.JLabel tabUsuarios;
    private com.vistas.Table tblUsuarios;
    private javax.swing.JTextField txtCedulaFiltroUsuarios;
    // End of variables declaration//GEN-END:variables

}
