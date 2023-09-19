package com.vistas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VistaNotificacion extends javax.swing.JFrame implements KeyListener {

	int xMouse, yMouse;

	public VistaNotificacion(String mensaje) {
		initComponents();
		this.setLocationRelativeTo(this);
		this.addKeyListener(this);
		ubicarMensaje(mensaje);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        btnEntendido = new com.vistas.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnSalir = new com.vistas.PanelRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(24, 25, 32));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Alerta");
        bg.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 340, 30));

        lblMensaje.setBackground(new java.awt.Color(255, 255, 255));
        lblMensaje.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("{Mensaje}");
        lblMensaje.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        bg.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 340, 30));

        btnEntendido.setBackground(new java.awt.Color(255, 255, 255));
        btnEntendido.setForeground(new java.awt.Color(255, 255, 255));
        btnEntendido.setRoundBottomLeft(20);
        btnEntendido.setRoundBottomRight(20);
        btnEntendido.setRoundTopLeft(20);
        btnEntendido.setRoundTopRight(20);
        btnEntendido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntendidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntendidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntendidoMouseExited(evt);
            }
        });
        btnEntendido.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(24, 25, 32));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 25, 32));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Entiendo");
        btnEntendido.add(jLabel4);
        jLabel4.setBounds(0, 10, 260, 20);

        bg.add(btnEntendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 260, 40));
        Cursor cursorHand = new Cursor(Cursor.HAND_CURSOR);
        btnEntendido.setCursor(cursorHand);
        btnEntendido.setVisible(true);

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

        header.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
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

    private void btnEntendidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntendidoMouseEntered
		btnEntendido.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnEntendidoMouseEntered

    private void btnEntendidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntendidoMouseExited
		btnEntendido.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEntendidoMouseExited

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

    private void btnEntendidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntendidoMouseClicked
		this.dispose();
    }//GEN-LAST:event_btnEntendidoMouseClicked

	    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
			this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

	// Metodos extra 
	private void ubicarMensaje(String mensaje) {
		lblMensaje.setText(mensaje);
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.vistas.PanelRound btnEntendido;
    private com.vistas.PanelRound btnSalir;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblMensaje;
    // End of variables declaration//GEN-END:variables

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_ENTER) {
			this.dispose();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
