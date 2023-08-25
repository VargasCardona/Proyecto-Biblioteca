package com.vistas;

import com.modelos.Usuario;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Nicolas Vargas Cardona
 */
public class VistaAcceso extends javax.swing.JFrame implements KeyListener {

	int xMouse, yMouse;

	public VistaAcceso() {
		initComponents();
		this.setLocationRelativeTo(this);
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

		txtUsuario.addKeyListener(this);
		txtContrasenia.addKeyListener(this);

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btnLogin = new com.vistas.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        panelRound1 = new com.vistas.PanelRound();
        txtUsuario = new javax.swing.JTextField();
        panelRound3 = new com.vistas.PanelRound();
        txtContrasenia = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnSalir = new com.vistas.PanelRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(24, 25, 32));
        bg.setPreferredSize(new java.awt.Dimension(800, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setRoundBottomLeft(20);
        btnLogin.setRoundBottomRight(20);
        btnLogin.setRoundTopLeft(20);
        btnLogin.setRoundTopRight(20);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(24, 25, 32));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 25, 32));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingresar");
        btnLogin.add(jLabel4);
        jLabel4.setBounds(0, 10, 310, 20);

        bg.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 310, 40));
        Cursor cursorHand = new Cursor(Cursor.HAND_CURSOR);
        btnLogin.setCursor(cursorHand);
        btnLogin.setVisible(true);

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
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        panelRound1.add(txtUsuario);
        txtUsuario.setBounds(10, 10, 280, 20);

        bg.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 310, 40));
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
        txtContrasenia.setBounds(10, 10, 280, 20);

        bg.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 310, 40));
        Cursor cursorText2= new Cursor(Cursor.TEXT_CURSOR);
        panelRound3.setCursor(cursorText2);
        panelRound3.setVisible(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Iniciar Sesión");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 40));

        btnRegistro.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistro.setText("Regístrese");
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistroMouseExited(evt);
            }
        });
        bg.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 80, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("¿No tiene una cuenta?");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 140, -1));

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

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 289));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
//        try {
//            Usuario usuario = controlador.validarLogin(txtUsuario.getText(), txtContrasenia.getText());
//
//            switch (usuario.getRol()) {
//                case Usuario.PACIENTE:
//                VistaPrincipalPaciente vistaPaciente = new VistaPrincipalPaciente((Paciente) usuario);
//                vistaPaciente.setVisible(true);
//                this.dispose();
//                break;
//
//                case Usuario.MEDICO:
//                VistaPrincipalMedico vistaMedico = new VistaPrincipalMedico((Medico) usuario);
//                vistaMedico.setVisible(true);
//                this.dispose();
//                break;
//
//                case Usuario.ENFERMERA:
//                VistaNotificacion vistaEnfermera = new VistaNotificacion("Rol no implementado");
//                vistaEnfermera.setVisible(true);
//                break;
//
//                case Usuario.ADMINISTRADOR:
//                VistaPrincipalAdministrador vistaAdministrador = new VistaPrincipalAdministrador((Administrador) usuario);
//                vistaAdministrador.setVisible(true);
//                this.dispose();
//                break;
//                default:
//                VistaNotificacion vistaDefault = new VistaNotificacion("Rol no implementado");
//                vistaDefault.setVisible(true);
//            }
//
//        } catch (ContraseniaIncorrectaException | UsuarioNoEncontradoException | CamposVaciosException e) {
//            VistaNotificacion vista = new VistaNotificacion(e.getMessage());
//            vista.setVisible(true);
//        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void txtContraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseniaFocusGained
	    if (String.valueOf(txtContrasenia.getPassword()).equals("Contraseña")) {
		    txtContrasenia.setText("");
		    txtContrasenia.setEchoChar('*');
	    }
    }//GEN-LAST:event_txtContraseniaFocusGained

    private void txtContraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseniaFocusLost
	    if (String.valueOf(txtContrasenia.getPassword()).equals("")) {
		    txtContrasenia.setText("Contraseña");
		    txtContrasenia.setEchoChar((char) 0);
	    }
    }//GEN-LAST:event_txtContraseniaFocusLost

	// Metodos encargados de placeholders
	private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtUsuarioMousePressed
		if (txtUsuario.getText().equals("Usuario")) {
			txtUsuario.setText("");
		}
	}// GEN-LAST:event_txtUsuarioMousePressed

	private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtUsuarioFocusLost
		if (txtUsuario.getText().equals("")) {
			txtUsuario.setText("Usuario");
		}
	}// GEN-LAST:event_txtUsuarioFocusLost

	private void txtContraseniaMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtContraseniaMousePressed
		if (txtContrasenia.getText().equals("Contraseña")) {
			txtContrasenia.setText("");
		}
	}// GEN-LAST:event_txtContraseniaMousePressed

	// Metodos encargados de cambios de color en Botones
	private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLoginMouseEntered
		btnLogin.setBackground(new Color(204, 204, 204));
	}// GEN-LAST:event_btnLoginMouseEntered

	private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnLoginMouseExited
		btnLogin.setBackground(new Color(255, 255, 255));
	}// GEN-LAST:event_btnLoginMouseExited

	private void btnRegistroMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnRegistroMouseEntered
		btnRegistro.setForeground(new Color(204, 204, 204));
	}// GEN-LAST:event_btnRegistroMouseEntered

	private void btnRegistroMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnRegistroMouseExited
		btnRegistro.setForeground(new Color(255, 255, 255));
	}// GEN-LAST:event_btnRegistroMouseExited

	private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnSalirMouseEntered
		btnSalir.setBackground(new Color(204, 204, 204));
	}// GEN-LAST:event_btnSalirMouseEntered

	private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnSalirMouseExited
		btnSalir.setBackground(new Color(255, 255, 255));
	}// GEN-LAST:event_btnSalirMouseExited

	// Metodos encargados de arrastrar la ventana
	private void headerMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_headerMousePressed
		xMouse = evt.getX();
		yMouse = evt.getY();
	}// GEN-LAST:event_headerMousePressed

	private void headerMouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_headerMouseDragged
		int x = evt.getXOnScreen();
		int y = evt.getYOnScreen();
		this.setLocation(x - xMouse, y - yMouse);
	}// GEN-LAST:event_headerMouseDragged

	//Metodos encargados de los Botones
	private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnSalirMouseClicked
		System.exit(0);
	}// GEN-LAST:event_btnSalirMouseClicked

	private void btnRegistroMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnRegistroMouseClicked
	}// GEN-LAST:event_btnRegistroMouseClicked

	/**
	 * @param args the command line arguments
	 */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.vistas.PanelRound btnLogin;
    private javax.swing.JLabel btnRegistro;
    private com.vistas.PanelRound btnSalir;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.vistas.PanelRound panelRound1;
    private com.vistas.PanelRound panelRound3;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			btnLoginMouseClicked(null);
		}
		txtUsuarioMousePressed(null);
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
