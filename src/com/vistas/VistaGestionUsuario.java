package com.vistas;

import com.controladores.ControladorGestionUsuario;
import com.excepciones.CamposVaciosException;
import com.modelos.Usuario;
import java.awt.Color;
import java.awt.Cursor;

public class VistaGestionUsuario extends javax.swing.JFrame {

	int xMouse, yMouse;
	ControladorGestionUsuario controlador;
	Usuario usuarioSeleccionado;
	VistaPrincipalUsuario vistaPrincipal;

	public VistaGestionUsuario(VistaPrincipalUsuario vista, Usuario usuario) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.controlador = new ControladorGestionUsuario();
		this.usuarioSeleccionado = usuario;
		this.vistaPrincipal = vista;

		lblCedula.setText(String.valueOf(usuarioSeleccionado.getCedula()));
		txtNombre.setText(usuarioSeleccionado.getNombre());
		txtApellidos.setText(usuarioSeleccionado.getApellidos());
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelRound6 = new com.vistas.PanelRound();
        txtNombre = new javax.swing.JTextField();
        btnGuardarCambios = new com.vistas.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnSalir = new com.vistas.PanelRound();
        panelRound8 = new com.vistas.PanelRound();
        txtApellidos = new javax.swing.JTextField();
        btnEliminarPaciente = new com.vistas.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(24, 25, 32));
        bg.setPreferredSize(new java.awt.Dimension(800, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound6.setBackground(new java.awt.Color(37, 42, 52));
        panelRound6.setForeground(new java.awt.Color(57, 59, 70));
        panelRound6.setRoundBottomLeft(20);
        panelRound6.setRoundBottomRight(20);
        panelRound6.setRoundTopLeft(20);
        panelRound6.setRoundTopRight(20);
        panelRound6.setLayout(null);

        txtNombre.setBackground(new java.awt.Color(37, 42, 52));
        txtNombre.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("Nombres");
        txtNombre.setBorder(null);
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        panelRound6.add(txtNombre);
        txtNombre.setBounds(10, 10, 280, 20);

        bg.add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 310, 40));
        Cursor cursorText4= new Cursor(Cursor.TEXT_CURSOR);
        panelRound6.setCursor(cursorText4);
        panelRound6.setVisible(true);

        btnGuardarCambios.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setRoundBottomLeft(20);
        btnGuardarCambios.setRoundBottomRight(20);
        btnGuardarCambios.setRoundTopLeft(20);
        btnGuardarCambios.setRoundTopRight(20);
        btnGuardarCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarCambiosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarCambiosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarCambiosMouseExited(evt);
            }
        });
        btnGuardarCambios.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(24, 25, 32));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 25, 32));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Guardar Cambios");
        btnGuardarCambios.add(jLabel4);
        jLabel4.setBounds(70, 10, 160, 20);

        bg.add(btnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 310, 40));
        Cursor cursorHand1 = new Cursor(Cursor.HAND_CURSOR);
        btnGuardarCambios.setCursor(cursorHand1);
        btnGuardarCambios.setVisible(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Gestionar Usuario");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 40));

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

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 30));

        panelRound8.setBackground(new java.awt.Color(37, 42, 52));
        panelRound8.setForeground(new java.awt.Color(57, 59, 70));
        panelRound8.setRoundBottomLeft(20);
        panelRound8.setRoundBottomRight(20);
        panelRound8.setRoundTopLeft(20);
        panelRound8.setRoundTopRight(20);
        panelRound8.setLayout(null);

        txtApellidos.setBackground(new java.awt.Color(37, 42, 52));
        txtApellidos.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos.setText("Apellidos");
        txtApellidos.setBorder(null);
        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        txtApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidosMousePressed(evt);
            }
        });
        panelRound8.add(txtApellidos);
        txtApellidos.setBounds(10, 10, 280, 20);

        bg.add(panelRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 310, 40));

        btnEliminarPaciente.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarPaciente.setRoundBottomLeft(20);
        btnEliminarPaciente.setRoundBottomRight(20);
        btnEliminarPaciente.setRoundTopLeft(20);
        btnEliminarPaciente.setRoundTopRight(20);
        btnEliminarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarPacienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarPacienteMouseExited(evt);
            }
        });
        btnEliminarPaciente.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(24, 25, 32));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(24, 25, 32));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Eliminar Usuario");
        btnEliminarPaciente.add(jLabel5);
        jLabel5.setBounds(70, 10, 160, 20);

        bg.add(btnEliminarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 310, 40));
        Cursor cursorHand2 = new Cursor(Cursor.HAND_CURSOR);
        btnEliminarPaciente.setCursor(cursorHand2);
        btnEliminarPaciente.setVisible(true);

        lblCedula.setBackground(new java.awt.Color(255, 255, 255));
        lblCedula.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedula.setText("{Cédula}");
        bg.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Usuario con Cédula:");
        bg.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void txtApellidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidosMousePressed
			if (txtApellidos.getText().equals("Apellidos")) {
				txtApellidos.setText("");
			}
        }//GEN-LAST:event_txtApellidosMousePressed

        private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
			if (txtApellidos.getText().equals("")) {
				txtApellidos.setText("Apellidos");
			}
        }//GEN-LAST:event_txtApellidosFocusLost

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

        private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
			btnSalir.setBackground(new Color(255, 255, 255));
        }//GEN-LAST:event_btnSalirMouseExited

        private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
			btnSalir.setBackground(new Color(204, 204, 204));
        }//GEN-LAST:event_btnSalirMouseEntered

	//Metodos encargados de los Botones

        private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
			this.dispose();
        }//GEN-LAST:event_btnSalirMouseClicked

        private void btnGuardarCambiosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCambiosMouseExited
			btnGuardarCambios.setBackground(new Color(255, 255, 255));
        }//GEN-LAST:event_btnGuardarCambiosMouseExited

	// Metodos encargados de cambios de color en Botones

        private void btnGuardarCambiosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCambiosMouseEntered
			btnGuardarCambios.setBackground(new Color(204, 204, 204));
        }//GEN-LAST:event_btnGuardarCambiosMouseEntered

        private void btnGuardarCambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCambiosMouseClicked

			try {
				controlador.actualizarTabla(txtNombre.getText(),
						txtApellidos.getText(),
						usuarioSeleccionado.getCedula());

				this.dispose();

				vistaPrincipal.llenarTablaUsuarios("");

				VistaNotificacion vista = new VistaNotificacion("Usuario editado");
				vista.setVisible(true);

			} catch (CamposVaciosException e) {

				VistaNotificacion vista = new VistaNotificacion(e.getMessage());
				vista.setVisible(true);

			}
        }//GEN-LAST:event_btnGuardarCambiosMouseClicked

        private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
			if (txtNombre.getText().equals("Nombres")) {
				txtNombre.setText("");
			}
        }//GEN-LAST:event_txtNombreMousePressed

        private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
			if (txtNombre.getText().equals("")) {
				txtNombre.setText("Nombres");
			}
        }//GEN-LAST:event_txtNombreFocusLost

        private void btnEliminarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarPacienteMouseClicked

			controlador.eliminarTabla(String.valueOf(usuarioSeleccionado.getCedula()));

			this.dispose();
			vistaPrincipal.llenarTablaUsuarios("");

			VistaNotificacion vista = new VistaNotificacion("Usuario eliminado del sistema");
			vista.setVisible(true);
        }//GEN-LAST:event_btnEliminarPacienteMouseClicked

        private void btnEliminarPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarPacienteMouseEntered
			btnEliminarPaciente.setBackground(new Color(204, 204, 204));
        }//GEN-LAST:event_btnEliminarPacienteMouseEntered

        private void btnEliminarPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarPacienteMouseExited
			btnEliminarPaciente.setBackground(new Color(255, 255, 255));
        }//GEN-LAST:event_btnEliminarPacienteMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.vistas.PanelRound btnEliminarPaciente;
    private com.vistas.PanelRound btnGuardarCambios;
    private com.vistas.PanelRound btnSalir;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCedula;
    private com.vistas.PanelRound panelRound6;
    private com.vistas.PanelRound panelRound8;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
