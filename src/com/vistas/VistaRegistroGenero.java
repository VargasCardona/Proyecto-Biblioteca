package com.vistas;

import com.controladores.ControladorRegistroGenero;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VistaRegistroGenero extends javax.swing.JFrame implements KeyListener {

	int xMouse, yMouse;
	ControladorRegistroGenero controlador;
	VistaPrincipalUsuario vistaPrincipal;

	public VistaRegistroGenero(VistaPrincipalUsuario vistaPrincipal) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.controlador = new ControladorRegistroGenero();
		this.vistaPrincipal = vistaPrincipal;
		txtNombre.addKeyListener(this);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelRound6 = new com.vistas.PanelRound();
        txtNombre = new javax.swing.JTextField();
        btnRegistrar = new com.vistas.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnSalir = new com.vistas.PanelRound();
        jLabel6 = new javax.swing.JLabel();

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
        txtNombre.setText("Nombre");
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

        bg.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 310, 40));
        Cursor cursorHand = new Cursor(Cursor.HAND_CURSOR);
        btnRegistrar.setCursor(cursorHand);
        btnRegistrar.setVisible(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Registro de Género");
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

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Nombre");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
			btnRegistrar.setBackground(new Color(255, 255, 255));
        }//GEN-LAST:event_btnRegistrarMouseExited

	// Metodos encargados de cambios de color en Botones

        private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
			btnRegistrar.setBackground(new Color(204, 204, 204));
        }//GEN-LAST:event_btnRegistrarMouseEntered

        private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
			try {
				controlador.registrarGenero(txtNombre.getText());
                                vistaPrincipal.controlador.insertarRegistro(vistaPrincipal.usuarioActivo.getCedula(),
                                    "Registro de género");
                                
				this.dispose();

				vistaPrincipal.llenarTablaGeneros();
                                vistaPrincipal.llenarCmbGeneros();
                                        
				VistaNotificacion vista = new VistaNotificacion("Género Registrado");
				vista.setVisible(true);

			} catch (Exception e) {
				VistaNotificacion vista = new VistaNotificacion(e.getMessage());
				vista.setVisible(true);

			}
        }//GEN-LAST:event_btnRegistrarMouseClicked

        private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
			if (txtNombre.getText().equals("Nombre")) {
				txtNombre.setText("");
			}
        }//GEN-LAST:event_txtNombreMousePressed

        private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
			if (txtNombre.getText().equals("")) {
				txtNombre.setText("Nombre");
			}
        }//GEN-LAST:event_txtNombreFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.vistas.PanelRound btnRegistrar;
    private com.vistas.PanelRound btnSalir;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private com.vistas.PanelRound panelRound6;
    private javax.swing.JTextField txtNombre;
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
