package com.vistas;

import com.controladores.ControladorRegistroUsuario;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class VistaRegistroUsuario extends javax.swing.JFrame implements KeyListener {

	int xMouse, yMouse;
	ControladorRegistroUsuario controlador;
	JFrame vistaPrincipal;

	public VistaRegistroUsuario(JFrame vistaPrincipal) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.controlador = new ControladorRegistroUsuario();
		this.vistaPrincipal = vistaPrincipal;
		txtNombre.addKeyListener(this);
		txtContraseniaConfirmacion.addKeyListener(this);

//		if (vistaPrincipal instanceof VistaPrincipalAdministrador) {
//			btnLoginPersonal.setVisible(false);
//		}

	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelRound7 = new com.vistas.PanelRound();
        txtIdentificacion = new javax.swing.JTextField();
        panelRound6 = new com.vistas.PanelRound();
        txtNombre = new javax.swing.JTextField();
        panelRound4 = new com.vistas.PanelRound();
        txtContraseniaConfirmacion = new javax.swing.JPasswordField();
        btnRegistrar = new com.vistas.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        panelRound1 = new com.vistas.PanelRound();
        txtUsuario = new javax.swing.JTextField();
        panelRound3 = new com.vistas.PanelRound();
        txtContrasenia = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnSalir = new com.vistas.PanelRound();
        btnLoginPersonal = new javax.swing.JLabel();
        panelRound8 = new com.vistas.PanelRound();
        txtApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(24, 25, 32));
        bg.setPreferredSize(new java.awt.Dimension(800, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound7.setBackground(new java.awt.Color(37, 42, 52));
        panelRound7.setForeground(new java.awt.Color(57, 59, 70));
        panelRound7.setRoundBottomLeft(20);
        panelRound7.setRoundBottomRight(20);
        panelRound7.setRoundTopLeft(20);
        panelRound7.setRoundTopRight(20);
        panelRound7.setLayout(null);

        txtIdentificacion.setBackground(new java.awt.Color(37, 42, 52));
        txtIdentificacion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtIdentificacion.setForeground(new java.awt.Color(255, 255, 255));
        txtIdentificacion.setText("Número de cédula");
        txtIdentificacion.setBorder(null);
        txtIdentificacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdentificacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdentificacionFocusLost(evt);
            }
        });
        panelRound7.add(txtIdentificacion);
        txtIdentificacion.setBounds(10, 10, 280, 20);

        bg.add(panelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 310, 40));
        Cursor cursorText8= new Cursor(Cursor.TEXT_CURSOR);
        panelRound7.setCursor(cursorText8);
        panelRound7.setVisible(true);

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

        panelRound4.setBackground(new java.awt.Color(37, 42, 52));
        panelRound4.setForeground(new java.awt.Color(57, 59, 70));
        panelRound4.setRoundBottomLeft(20);
        panelRound4.setRoundBottomRight(20);
        panelRound4.setRoundTopLeft(20);
        panelRound4.setRoundTopRight(20);
        panelRound4.setLayout(null);

        txtContraseniaConfirmacion.setBackground(new java.awt.Color(37, 42, 52));
        txtContraseniaConfirmacion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtContraseniaConfirmacion.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseniaConfirmacion.setText("Repita la Contraseña");
        txtContraseniaConfirmacion.setBorder(null);
        txtContraseniaConfirmacion.setEchoChar((char)0);
        txtContraseniaConfirmacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseniaConfirmacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseniaConfirmacionFocusLost(evt);
            }
        });
        panelRound4.add(txtContraseniaConfirmacion);
        txtContraseniaConfirmacion.setBounds(10, 10, 280, 20);

        bg.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 310, 40));
        Cursor cursorText3= new Cursor(Cursor.TEXT_CURSOR);
        panelRound4.setCursor(cursorText3);
        panelRound4.setVisible(true);

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setRoundBottomLeft(20);
        btnRegistrar.setRoundBottomRight(20);
        btnRegistrar.setRoundTopLeft(20);
        btnRegistrar.setRoundTopRight(20);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        btnRegistrar.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(24, 25, 32));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 25, 32));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registrar");
        btnRegistrar.add(jLabel4);
        jLabel4.setBounds(70, 10, 160, 20);

        bg.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 310, 40));
        Cursor cursorHand = new Cursor(Cursor.HAND_CURSOR);
        btnRegistrar.setCursor(cursorHand);
        btnRegistrar.setVisible(true);

        panelRound1.setBackground(new java.awt.Color(37, 42, 52));
        panelRound1.setForeground(new java.awt.Color(57, 59, 70));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(null);

        txtUsuario.setBackground(new java.awt.Color(37, 42, 52));
        txtUsuario.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        panelRound1.add(txtUsuario);
        txtUsuario.setBounds(10, 10, 280, 20);

        bg.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 310, 40));
        Cursor cursorText1= new Cursor(Cursor.TEXT_CURSOR);
        panelRound1.setCursor(cursorText1);
        panelRound1.setVisible(true);

        panelRound3.setBackground(new java.awt.Color(37, 42, 52));
        panelRound3.setForeground(new java.awt.Color(57, 59, 70));
        panelRound3.setRoundBottomLeft(20);
        panelRound3.setRoundBottomRight(20);
        panelRound3.setRoundTopLeft(20);
        panelRound3.setRoundTopRight(20);
        panelRound3.setLayout(null);

        txtContrasenia.setBackground(new java.awt.Color(37, 42, 52));
        txtContrasenia.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasenia.setText("Contraseña");
        txtContrasenia.setBorder(null);
        txtContrasenia.setEchoChar((char)0);
        txtContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseniaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseniaFocusLost(evt);
            }
        });
        panelRound3.add(txtContrasenia);
        txtContrasenia.setBounds(10, 10, 280, 23);

        bg.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 310, 40));
        Cursor cursorText2= new Cursor(Cursor.TEXT_CURSOR);
        panelRound3.setCursor(cursorText2);
        panelRound3.setVisible(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Registro de Usuarios");
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

        btnLoginPersonal.setBackground(new java.awt.Color(255, 255, 255));
        btnLoginPersonal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnLoginPersonal.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLoginPersonal.setText("¿Ya tiene una cuenta?");
        btnLoginPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginPersonalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginPersonalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginPersonalMouseExited(evt);
            }
        });
        bg.add(btnLoginPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, -1, 40));

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
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });
        panelRound8.add(txtApellidos);
        txtApellidos.setBounds(10, 10, 280, 20);

        bg.add(panelRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 310, 40));
        Cursor cursorText5= new Cursor(Cursor.TEXT_CURSOR);
        panelRound7.setCursor(cursorText5);
        panelRound7.setVisible(true);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Confirmación de Contraseña");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 310, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Nombres");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Apellidos");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 310, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Cédula");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 310, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Usuario");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 310, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Contraseña");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 310, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
			if (txtApellidos.getText().equals("")) {
				txtApellidos.setText("Apellidos");
			}
        }//GEN-LAST:event_txtApellidosFocusLost

        private void btnLoginPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginPersonalMouseExited
			btnLoginPersonal.setForeground(new Color(255, 255, 255));
        }//GEN-LAST:event_btnLoginPersonalMouseExited

        private void btnLoginPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginPersonalMouseEntered
			btnLoginPersonal.setForeground(new Color(204, 204, 204));
        }//GEN-LAST:event_btnLoginPersonalMouseEntered

        private void btnLoginPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginPersonalMouseClicked
			VistaAcceso ventana = new VistaAcceso();
			ventana.setVisible(true);
			this.dispose();
        }//GEN-LAST:event_btnLoginPersonalMouseClicked

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

        private void txtContraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseniaFocusLost
			if (String.valueOf(txtContrasenia.getPassword()).equals("")) {
				txtContrasenia.setText("Contraseña");
				txtContrasenia.setEchoChar((char) 0);
			}
        }//GEN-LAST:event_txtContraseniaFocusLost

        private void txtContraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseniaFocusGained
			if (String.valueOf(txtContrasenia.getPassword()).equals("Contraseña")) {
				txtContrasenia.setText("");
				txtContrasenia.setEchoChar('*');
			}
        }//GEN-LAST:event_txtContraseniaFocusGained

        private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
			if (txtUsuario.getText().equals("")) {
				txtUsuario.setText("Usuario");
			}
        }//GEN-LAST:event_txtUsuarioFocusLost

        private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
			btnRegistrar.setBackground(new Color(255, 255, 255));
        }//GEN-LAST:event_btnRegistrarMouseExited

	// Metodos encargados de cambios de color en Botones

        private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
			btnRegistrar.setBackground(new Color(204, 204, 204));
        }//GEN-LAST:event_btnRegistrarMouseEntered

        private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
			try {
				controlador.registrarUsuario(txtNombre.getText(),
						txtApellidos.getText(),
						txtIdentificacion.getText(),
						txtUsuario.getText(),
						String.valueOf(txtContrasenia.getPassword()),
						String.valueOf(txtContraseniaConfirmacion.getPassword()));

				this.dispose();

				VistaNotificacion vista = new VistaNotificacion("Usuario Registrado");
				vista.setVisible(true);

			} catch (Exception e) {
				VistaNotificacion vista = new VistaNotificacion(e.getMessage());
				vista.setVisible(true);

			} 
        }//GEN-LAST:event_btnRegistrarMouseClicked

        private void txtContraseniaConfirmacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseniaConfirmacionFocusLost
			if (String.valueOf(txtContraseniaConfirmacion.getPassword()).equals("")) {
				txtContraseniaConfirmacion.setText("Repita la Contraseña");
				txtContraseniaConfirmacion.setEchoChar((char) 0);
			}
        }//GEN-LAST:event_txtContraseniaConfirmacionFocusLost

        private void txtContraseniaConfirmacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseniaConfirmacionFocusGained
			if (String.valueOf(txtContraseniaConfirmacion.getPassword()).equals("Repita la Contraseña")) {
				txtContraseniaConfirmacion.setText("");
				txtContraseniaConfirmacion.setEchoChar('*');
			}
        }//GEN-LAST:event_txtContraseniaConfirmacionFocusGained

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

        private void txtIdentificacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdentificacionFocusLost
			if (txtIdentificacion.getText().equals("")) {
				txtIdentificacion.setText("Número de cédula");
			}
        }//GEN-LAST:event_txtIdentificacionFocusLost

        private void txtApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusGained
			if (txtApellidos.getText().equals("Apellidos")) {
				txtApellidos.setText("");
			}
        }//GEN-LAST:event_txtApellidosFocusGained

        private void txtIdentificacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdentificacionFocusGained
			if (txtIdentificacion.getText().equals("Número de cédula")) {
				txtIdentificacion.setText("");
			}
        }//GEN-LAST:event_txtIdentificacionFocusGained

        private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
			if (txtUsuario.getText().equals("Usuario")) {
				txtUsuario.setText("");
			}

        }//GEN-LAST:event_txtUsuarioFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btnLoginPersonal;
    private com.vistas.PanelRound btnRegistrar;
    private com.vistas.PanelRound btnSalir;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.vistas.PanelRound panelRound1;
    private com.vistas.PanelRound panelRound3;
    private com.vistas.PanelRound panelRound4;
    private com.vistas.PanelRound panelRound6;
    private com.vistas.PanelRound panelRound7;
    private com.vistas.PanelRound panelRound8;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JPasswordField txtContraseniaConfirmacion;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			btnRegistrarMouseClicked(null);
		}
		txtNombreMousePressed(null);
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
