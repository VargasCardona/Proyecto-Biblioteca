package com.vistas;

import com.controladores.ControladorGestionPerfil;
import com.modelos.Usuario;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JFrame;

public class VistaGestionPerfil extends javax.swing.JFrame {

	int xMouse, yMouse;
	ControladorGestionPerfil controlador;
	Usuario usuarioActivo;
	JFrame vistaPrincipal;

	public VistaGestionPerfil(JFrame vistaPrincipal, Usuario usuarioActivo) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.controlador = new ControladorGestionPerfil();
		this.usuarioActivo = usuarioActivo;
		this.vistaPrincipal = vistaPrincipal;

		txtUsuario.setText(usuarioActivo.getUsuario());
		txtContrasenia.setText(usuarioActivo.getContrasenia());
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelRound6 = new com.vistas.PanelRound();
        txtUsuario = new javax.swing.JTextField();
        btnGuardarCambios = new com.vistas.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnSalir = new com.vistas.PanelRound();
        panelRound9 = new com.vistas.PanelRound();
        txtContrasenia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        txtUsuario.setBackground(new java.awt.Color(37, 42, 52));
        txtUsuario.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        panelRound6.add(txtUsuario);
        txtUsuario.setBounds(10, 10, 280, 20);

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

        bg.add(btnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 310, 40));
        Cursor cursorHand1 = new Cursor(Cursor.HAND_CURSOR);
        btnGuardarCambios.setCursor(cursorHand1);
        btnGuardarCambios.setVisible(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Contraseña");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 310, 30));

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

        panelRound9.setBackground(new java.awt.Color(37, 42, 52));
        panelRound9.setForeground(new java.awt.Color(57, 59, 70));
        panelRound9.setRoundBottomLeft(20);
        panelRound9.setRoundBottomRight(20);
        panelRound9.setRoundTopLeft(20);
        panelRound9.setRoundTopRight(20);
        panelRound9.setLayout(null);

        txtContrasenia.setBackground(new java.awt.Color(37, 42, 52));
        txtContrasenia.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasenia.setText("Contraseña");
        txtContrasenia.setBorder(null);
        txtContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseniaFocusLost(evt);
            }
        });
        txtContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseniaMousePressed(evt);
            }
        });
        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });
        panelRound9.add(txtContrasenia);
        txtContrasenia.setBounds(10, 10, 280, 20);

        bg.add(panelRound9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 310, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Gestionar Cuenta");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Usuario");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
			controlador.actualizarTabla(usuarioActivo.getUsuario(),txtUsuario.getText(), txtContrasenia.getText());

			this.dispose();
			vistaPrincipal.dispose();

			VistaAcceso vistaAcceso = new VistaAcceso();
			vistaAcceso.setVisible(true);

			VistaNotificacion vistaNotificacion = new VistaNotificacion("Cuenta editada");
			vistaNotificacion.setVisible(true);

		} catch (Exception e) {

			VistaNotificacion vista = new VistaNotificacion(e.getMessage());
			vista.setVisible(true);

		}
        }//GEN-LAST:event_btnGuardarCambiosMouseClicked

        private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
		if (txtUsuario.getText().equals("Nombres")) {
			txtUsuario.setText("");
		}
        }//GEN-LAST:event_txtUsuarioMousePressed

        private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
		if (txtUsuario.getText().equals("")) {
			txtUsuario.setText("Nombres");
		}
        }//GEN-LAST:event_txtUsuarioFocusLost

        private void txtContraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseniaFocusLost
		// TODO add your handling code here:
        }//GEN-LAST:event_txtContraseniaFocusLost

        private void txtContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseniaMousePressed
		// TODO add your handling code here:
        }//GEN-LAST:event_txtContraseniaMousePressed

        private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_txtContraseniaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.vistas.PanelRound btnGuardarCambios;
    private com.vistas.PanelRound btnSalir;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.vistas.PanelRound panelRound6;
    private com.vistas.PanelRound panelRound9;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
