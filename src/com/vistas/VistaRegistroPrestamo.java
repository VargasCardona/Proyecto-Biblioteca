package com.vistas;

import com.controladores.ControladorRegistroPrestamo;
import com.modelos.Libro;
import com.modelos.Usuario;
import com.utils.GeneralUtils;
import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

public class VistaRegistroPrestamo extends javax.swing.JFrame {

	int xMouse, yMouse;
	ControladorRegistroPrestamo controlador;
	VistaPrincipalUsuario vistaPrincipal;

	Usuario usuarioSeleccionado;
	Libro libroSeleccionado;

	boolean estanSeleccionadosAmbos;

	public VistaRegistroPrestamo(VistaPrincipalUsuario vistaPrincipal) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.controlador = new ControladorRegistroPrestamo();
		this.vistaPrincipal = vistaPrincipal;

		llenarTablaLibros();
		llenarTablaUsuarios();

		estanSeleccionadosAmbos = false;
		btnContinuar.setBackground(new Color(204, 204, 204));
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnContinuar = new com.vistas.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnSalir = new com.vistas.PanelRound();
        lblNombre4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        scrlMedicos = new javax.swing.JScrollPane();
        tblLibros = new com.vistas.Table();
        lblAutor = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblTituloLibro = new javax.swing.JLabel();
        lblPublicacion = new javax.swing.JLabel();
        lblIsbn = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblNombre7 = new javax.swing.JLabel();
        lblNombre8 = new javax.swing.JLabel();
        scrlMedicos2 = new javax.swing.JScrollPane();
        tblUsuarios = new com.vistas.Table();
        lblApellidosPaciente = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblNombrePaciente = new javax.swing.JLabel();
        lblCedulaPaciente = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblNombre10 = new javax.swing.JLabel();
        lblUnidades = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        panelRound13 = new com.vistas.PanelRound();
        cmbAnio = new javax.swing.JComboBox<>();
        cmbDia = new javax.swing.JComboBox<>();
        cmbMes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(24, 25, 32));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo.setText("Realizar Prestamo");
        bg.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 610, 30));

        btnContinuar.setBackground(new java.awt.Color(255, 255, 255));
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setRoundBottomLeft(20);
        btnContinuar.setRoundBottomRight(20);
        btnContinuar.setRoundTopLeft(20);
        btnContinuar.setRoundTopRight(20);
        btnContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContinuarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContinuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnContinuarMouseExited(evt);
            }
        });
        btnContinuar.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(24, 25, 32));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 25, 32));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Continuar");
        btnContinuar.add(jLabel4);
        jLabel4.setBounds(0, 10, 320, 20);

        bg.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, 320, 40));
        Cursor cursorHand6 = new Cursor(Cursor.HAND_CURSOR);
        btnContinuar.setCursor(cursorHand6);
        btnContinuar.setVisible(true);

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

        header.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 30));

        lblNombre4.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblNombre4.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre4.setText("Detalles del Libro");
        bg.add(lblNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 250, 40));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Unidades Disponibles:");
        bg.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, 20));

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Especialización"
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
        scrlMedicos.setViewportView(tblLibros);

        bg.add(scrlMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 330, 220));

        lblAutor.setBackground(new java.awt.Color(255, 255, 255));
        lblAutor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblAutor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAutor.setText(" ");
        bg.add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 180, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Isbn:");
        bg.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        lblTituloLibro.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloLibro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblTituloLibro.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloLibro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTituloLibro.setText(" ");
        bg.add(lblTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 180, 20));

        lblPublicacion.setBackground(new java.awt.Color(255, 255, 255));
        lblPublicacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblPublicacion.setForeground(new java.awt.Color(255, 255, 255));
        lblPublicacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPublicacion.setText(" ");
        bg.add(lblPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 120, 20));

        lblIsbn.setBackground(new java.awt.Color(255, 255, 255));
        lblIsbn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblIsbn.setForeground(new java.awt.Color(255, 255, 255));
        lblIsbn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIsbn.setText(" ");
        bg.add(lblIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 190, -1));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Autor:");
        bg.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Título:");
        bg.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Año Publicación:");
        bg.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, 20));

        lblNombre7.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblNombre7.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre7.setText("Libros Disponibles");
        bg.add(lblNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 40));

        lblNombre8.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblNombre8.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre8.setText("Detalles del Usuario");
        bg.add(lblNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 230, 40));

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellidos"
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
        scrlMedicos2.setViewportView(tblUsuarios);

        bg.add(scrlMedicos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 330, 210));

        lblApellidosPaciente.setBackground(new java.awt.Color(255, 255, 255));
        lblApellidosPaciente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblApellidosPaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidosPaciente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblApellidosPaciente.setText(" ");
        bg.add(lblApellidosPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 460, 170, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Cédula:");
        bg.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, -1));

        lblNombrePaciente.setBackground(new java.awt.Color(255, 255, 255));
        lblNombrePaciente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNombrePaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblNombrePaciente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombrePaciente.setText(" ");
        bg.add(lblNombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 430, 170, 20));

        lblCedulaPaciente.setBackground(new java.awt.Color(255, 255, 255));
        lblCedulaPaciente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblCedulaPaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblCedulaPaciente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCedulaPaciente.setText(" ");
        bg.add(lblCedulaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 490, 180, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Apellidos:");
        bg.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, -1));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Nombres:");
        bg.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        lblNombre10.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblNombre10.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre10.setText("Usuarios Registrados");
        bg.add(lblNombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 260, 40));

        lblUnidades.setBackground(new java.awt.Color(255, 255, 255));
        lblUnidades.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblUnidades.setForeground(new java.awt.Color(255, 255, 255));
        lblUnidades.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUnidades.setText(" ");
        bg.add(lblUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 90, 20));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Fecha de Retorno");
        bg.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 130, 40));

        panelRound13.setBackground(new java.awt.Color(37, 42, 52));
        panelRound13.setForeground(new java.awt.Color(57, 59, 70));
        panelRound13.setRoundBottomLeft(20);
        panelRound13.setRoundBottomRight(20);
        panelRound13.setRoundTopLeft(20);
        panelRound13.setRoundTopRight(20);
        panelRound13.setLayout(null);

        cmbAnio.setBackground(new java.awt.Color(37, 42, 52));
        cmbAnio.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        cmbAnio.setForeground(new java.awt.Color(255, 255, 255));
        cmbAnio.setMaximumRowCount(5);
        cmbAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AAAA", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        cmbAnio.setToolTipText("");
        cmbAnio.setBorder(null);
        cmbAnio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRound13.add(cmbAnio);
        cmbAnio.setBounds(140, 10, 70, 20);

        cmbDia.setBackground(new java.awt.Color(37, 42, 52));
        cmbDia.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        cmbDia.setForeground(new java.awt.Color(255, 255, 255));
        cmbDia.setMaximumRowCount(5);
        cmbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbDia.setToolTipText("");
        cmbDia.setBorder(null);
        cmbDia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRound13.add(cmbDia);
        cmbDia.setBounds(10, 10, 50, 20);

        cmbMes.setBackground(new java.awt.Color(37, 42, 52));
        cmbMes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        cmbMes.setForeground(new java.awt.Color(255, 255, 255));
        cmbMes.setMaximumRowCount(5);
        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cmbMes.setToolTipText("");
        cmbMes.setBorder(null);
        cmbMes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRound13.add(cmbMes);
        cmbMes.setBounds(70, 10, 60, 20);

        bg.add(panelRound13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	// Metodos encargados de cambios de color en Botones

	private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
		btnSalir.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
		btnSalir.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseEntered
		btnContinuar.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnContinuarMouseEntered

    private void btnContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseExited
		if (!estanSeleccionadosAmbos) {
			return;
		}

		btnContinuar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnContinuarMouseExited

	// Metodos encargados de arrastrar la ventana

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
		xMouse = evt.getX();
		yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
		int x = evt.getXOnScreen();
		int y = evt.getYOnScreen();
		this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

	// Metodos encargados de los Botones

    private void btnContinuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseClicked
		try {
			if (!estanSeleccionadosAmbos) {
				return;
			}

			Calendar fechaRetorno = GeneralUtils.convertirStringFecha(String.valueOf(cmbAnio.getSelectedItem())
					+ "-" + String.valueOf(cmbMes.getSelectedItem())
					+ "-" + String.valueOf(cmbDia.getSelectedItem()));

			controlador.registrarPrestamo(lblIsbn.getText(), lblCedulaPaciente.getText(), fechaRetorno, true);
                        vistaPrincipal.controlador.insertarRegistro(vistaPrincipal.usuarioActivo.getCedula(),
                        "Registro de préstamo");
                        
			this.dispose();
			vistaPrincipal.llenarTablaPrestamos();

			VistaNotificacion vista = new VistaNotificacion("Préstamo registrado exitosamente");
			vista.setVisible(true);

		} catch (Exception e) {
			VistaNotificacion vista = new VistaNotificacion(e.getMessage());
			vista.setVisible(true);
		}
    }//GEN-LAST:event_btnContinuarMouseClicked

	    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
			this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

        private void tblLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibrosMouseClicked

			String isbn = String.valueOf(tblLibros.getValueAt(tblLibros.getSelectedRow(), 0));
			this.libroSeleccionado = controlador.obtenerLibro(isbn);

			lblTituloLibro.setText(libroSeleccionado.getTitulo());
			lblAutor.setText(libroSeleccionado.getAutor());
			lblIsbn.setText(libroSeleccionado.getISBN());
			lblPublicacion.setText(libroSeleccionado.getAnioPublicacion());
			lblUnidades.setText(String.valueOf(libroSeleccionado.getUnidadesDisponibles()));

			if (usuarioSeleccionado != null && libroSeleccionado != null) {
				estanSeleccionadosAmbos = true;
				btnContinuar.setBackground(new Color(255, 255, 255));
			}

        }//GEN-LAST:event_tblLibrosMouseClicked

        private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
			String cedula = String.valueOf(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 0));
			this.usuarioSeleccionado = controlador.obtenerUsuario(cedula);

			lblNombrePaciente.setText(usuarioSeleccionado.getNombre());
			lblApellidosPaciente.setText(usuarioSeleccionado.getApellidos());
			lblCedulaPaciente.setText(usuarioSeleccionado.getCedula());

			if (usuarioSeleccionado != null && libroSeleccionado != null) {
				estanSeleccionadosAmbos = true;
				btnContinuar.setBackground(new Color(255, 255, 255));
			}
        }//GEN-LAST:event_tblUsuariosMouseClicked

	private void llenarTablaLibros() {
		DefaultTableModel modelo = new DefaultTableModel();
		ArrayList<Libro> listaLibros = controlador.obtenerListaLibros();
		modelo.setColumnIdentifiers(new Object[]{"Isbn", "Título", "Unidades"});
		tblLibros.setModel(modelo);

		for (Libro libro : listaLibros) {

			modelo.addRow(new Object[]{
				libro.getISBN(),
				libro.getTitulo(),
				libro.getUnidadesDisponibles()});

		}

	}

	private void llenarTablaUsuarios() {
		DefaultTableModel modelo = new DefaultTableModel();
		ArrayList<Usuario> listaUsuarios = controlador.obtenerListaUsuarios();
		modelo.setColumnIdentifiers(new Object[]{"Cedula", "Nombre", "Apellidos"});
		tblUsuarios.setModel(modelo);

		for (Usuario usuario : listaUsuarios) {

			modelo.addRow(new Object[]{
				usuario.getCedula(),
				usuario.getNombre(),
				usuario.getApellidos()});

		}

	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.vistas.PanelRound btnContinuar;
    private com.vistas.PanelRound btnSalir;
    private javax.swing.JComboBox<String> cmbAnio;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblApellidosPaciente;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCedulaPaciente;
    private javax.swing.JLabel lblIsbn;
    private javax.swing.JLabel lblNombre10;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JLabel lblNombre7;
    private javax.swing.JLabel lblNombre8;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblPublicacion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloLibro;
    private javax.swing.JLabel lblUnidades;
    private com.vistas.PanelRound panelRound13;
    private javax.swing.JScrollPane scrlMedicos;
    private javax.swing.JScrollPane scrlMedicos2;
    private com.vistas.Table tblLibros;
    private com.vistas.Table tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
