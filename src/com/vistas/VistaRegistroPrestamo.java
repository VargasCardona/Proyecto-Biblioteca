package com.vistas;

import com.modelos.Usuario;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.table.DefaultTableModel;

public class VistaRegistroPrestamo extends javax.swing.JFrame {

	int xMouse, yMouse;
	ControladorRegistroCirugiaPersonal controlador;
	VistaPrincipalAdministrador vistaPrincipal;
	Quirofano quirofanoSeleccionado;
	Paciente pacienteSeleccionado;
	Medico medicoSeleccionado;

	boolean estanSelecionadosAmbos;

	public VistaRegistroPrestamo(VistaPrincipalAdministrador vistaPrincipal, Quirofano quirofanoSeleccionado) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.controlador = new ControladorRegistroCirugiaPersonal();
		this.vistaPrincipal = vistaPrincipal;
		this.quirofanoSeleccionado = quirofanoSeleccionado;
		this.estanSelecionadosAmbos = false;

		llenarTablaCirujanos();
		llenarTablaPacientes();

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
        tblCirujanos = new com.vistas.Table();
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
        tblPacientes = new com.vistas.Table();
        lblApellidosPaciente = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblNombrePaciente = new javax.swing.JLabel();
        lblCedulaPaciente = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblNombre10 = new javax.swing.JLabel();
        lblUnidades = new javax.swing.JLabel();

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

        bg.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 320, 40));
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

        tblCirujanos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Especialización"
            }
        ));
        tblCirujanos.setFocusable(false);
        tblCirujanos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        tblCirujanos.getTableHeader().setResizingAllowed(false);
        tblCirujanos.getTableHeader().setReorderingAllowed(false);
        tblCirujanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCirujanosMouseClicked(evt);
            }
        });
        scrlMedicos.setViewportView(tblCirujanos);

        bg.add(scrlMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 330, 220));

        lblAutor.setBackground(new java.awt.Color(255, 255, 255));
        lblAutor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblAutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAutor.setText(" ");
        bg.add(lblAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 40, -1));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Isbn:");
        bg.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        lblTituloLibro.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloLibro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblTituloLibro.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloLibro.setText(" ");
        bg.add(lblTituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 40, 20));

        lblPublicacion.setBackground(new java.awt.Color(255, 255, 255));
        lblPublicacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblPublicacion.setForeground(new java.awt.Color(255, 255, 255));
        lblPublicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPublicacion.setText(" ");
        bg.add(lblPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, 20));

        lblIsbn.setBackground(new java.awt.Color(255, 255, 255));
        lblIsbn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblIsbn.setForeground(new java.awt.Color(255, 255, 255));
        lblIsbn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIsbn.setText(" ");
        bg.add(lblIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 40, -1));

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

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellidos"
            }
        ));
        tblPacientes.setFocusable(false);
        tblPacientes.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        tblPacientes.getTableHeader().setResizingAllowed(false);
        tblPacientes.getTableHeader().setReorderingAllowed(false);
        tblPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPacientesMouseClicked(evt);
            }
        });
        scrlMedicos2.setViewportView(tblPacientes);

        bg.add(scrlMedicos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 330, 210));

        lblApellidosPaciente.setBackground(new java.awt.Color(255, 255, 255));
        lblApellidosPaciente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblApellidosPaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidosPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidosPaciente.setText(" ");
        bg.add(lblApellidosPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, -1, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Cédula:");
        bg.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, -1));

        lblNombrePaciente.setBackground(new java.awt.Color(255, 255, 255));
        lblNombrePaciente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblNombrePaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblNombrePaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombrePaciente.setText(" ");
        bg.add(lblNombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, 20));

        lblCedulaPaciente.setBackground(new java.awt.Color(255, 255, 255));
        lblCedulaPaciente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblCedulaPaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblCedulaPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedulaPaciente.setText(" ");
        bg.add(lblCedulaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

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
        lblUnidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUnidades.setText(" ");
        bg.add(lblUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
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
	    if (!estanSelecionadosAmbos) {
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
	    if (!estanSelecionadosAmbos) {
		    return;
	    }

	    if (pacienteSeleccionado.getCedula().equals(medicoSeleccionado.getCedula())) {
		    VistaNotificacion vista = new VistaNotificacion("El cirujano no puede un paciente");
		    vista.setVisible(true);
		    return;
	    }

	    VistaRegistroCirugiaHorario vista = new VistaRegistroCirugiaHorario(vistaPrincipal, pacienteSeleccionado, medicoSeleccionado, quirofanoSeleccionado);
	    vista.setVisible(true);

	    this.dispose();

    }//GEN-LAST:event_btnContinuarMouseClicked

	    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
		    this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

        private void tblCirujanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCirujanosMouseClicked

		String cedula = String.valueOf(tblCirujanos.getValueAt(tblCirujanos.getSelectedRow(), 0));
		this.medicoSeleccionado = controlador.buscarCirujano(cedula);

		lblTituloLibro.setText(medicoSeleccionado.getNombre());
		lblAutor.setText(medicoSeleccionado.getApellidos());
		lblIsbn.setText(String.valueOf(medicoSeleccionado.getCedula()));
		lblPublicacion.setText(medicoSeleccionado.getEspecializacion());

		lblJornada.setText(Utilidades.convertirHoraString(medicoSeleccionado.getInicioJornada()) + " - "
			+ Utilidades.convertirHoraString(medicoSeleccionado.getFinalJornada()));

		lblDiasLibres.setText((medicoSeleccionado.getDiaLibre() == null) ? "No Registrado" : Utilidades.convertirFechaString(medicoSeleccionado.getDiaLibre()));

		if (pacienteSeleccionado != null && medicoSeleccionado != null) {
			estanSelecionadosAmbos = true;
			btnContinuar.setBackground(new Color(255, 255, 255));
		}

        }//GEN-LAST:event_tblCirujanosMouseClicked

        private void tblPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacientesMouseClicked
		String cedula = String.valueOf(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 0));
		this.pacienteSeleccionado = controlador.buscarPaciente(cedula);

		lblNombrePaciente.setText(pacienteSeleccionado.getNombre());
		lblApellidosPaciente.setText(pacienteSeleccionado.getApellidos());
		lblCedulaPaciente.setText(String.valueOf(pacienteSeleccionado.getCedula()));

		if (pacienteSeleccionado != null && medicoSeleccionado != null) {
			estanSelecionadosAmbos = true;
			btnContinuar.setBackground(new Color(255, 255, 255));
		}
        }//GEN-LAST:event_tblPacientesMouseClicked

	private void llenarTablaCirujanos() {
		DefaultTableModel modelo = new DefaultTableModel();
		ListaGenerica<Usuario> listaPersonalMedico = controlador.getListaCirujanos();
		modelo.setColumnIdentifiers(new Object[]{"Cedula", "Nombre", "Especialización"});
		tblCirujanos.setModel(modelo);

		for (Usuario personalAlmacenado : listaPersonalMedico) {

			modelo.addRow(new Object[]{
				personalAlmacenado.getCedula(),
				personalAlmacenado.getNombre(),
				((Medico) personalAlmacenado).getEspecializacion()});

		}

	}

	private void llenarTablaPacientes() {
		DefaultTableModel modelo = new DefaultTableModel();
		ListaGenerica<Paciente> listaPersonalMedico = controlador.getListaPacientes();
		modelo.setColumnIdentifiers(new Object[]{"Cedula", "Nombre", "Apellidos"});
		tblPacientes.setModel(modelo);

		for (Usuario personalAlmacenado : listaPersonalMedico) {

			modelo.addRow(new Object[]{
				personalAlmacenado.getCedula(),
				personalAlmacenado.getNombre(),
				personalAlmacenado.getApellidos()});

		}

	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.vistas.PanelRound btnContinuar;
    private com.vistas.PanelRound btnSalir;
    private javax.swing.JPanel header;
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
    private javax.swing.JScrollPane scrlMedicos;
    private javax.swing.JScrollPane scrlMedicos2;
    private com.vistas.Table tblCirujanos;
    private com.vistas.Table tblPacientes;
    // End of variables declaration//GEN-END:variables
}
