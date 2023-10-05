package com.vistas;

import com.controladores.ControladorRetornoPrestamo;
import com.modelos.Prestamo;
import com.utils.GeneralUtils;
import java.awt.Color;
import java.awt.Cursor;



public class VistaRetornoPrestamo extends javax.swing.JFrame {

	int xMouse, yMouse;
	ControladorRetornoPrestamo controlador;
	VistaPrincipalUsuario vistaPrincipal;
	Prestamo prestamoSeleccionado;

	public VistaRetornoPrestamo(VistaPrincipalUsuario vistaPrincipal, Prestamo prestamoSeleccionado) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.controlador = new ControladorRetornoPrestamo();
		this.prestamoSeleccionado = prestamoSeleccionado;
		this.vistaPrincipal = vistaPrincipal;

		lblId.setText(prestamoSeleccionado.getId());
		lblIsbn.setText(prestamoSeleccionado.getIsbnLibro());
		lblCedulaUsuario.setText(prestamoSeleccionado.getCedulaUsuario());
		lblFechaPrestamo.setText(GeneralUtils.convertirFechaString(prestamoSeleccionado.getFechaPrestamo()));
		lblFechaVencimiento.setText(GeneralUtils.convertirFechaString(prestamoSeleccionado.getFechaVencimiento()));
		lblFechaRetorno.setText((prestamoSeleccionado == null) ? GeneralUtils.convertirFechaString(prestamoSeleccionado.getFechaRetorno()) : " ");
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCerrar = new com.vistas.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnSalir = new com.vistas.PanelRound();
        jLabel30 = new javax.swing.JLabel();
        lblIsbn = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblNombre9 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblFechaPrestamo = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lblCedulaUsuario = new javax.swing.JLabel();
        lblFechaRetorno = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lblFechaVencimiento = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(24, 25, 32));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo.setText("Retornar Préstamo");
        bg.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 30));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setRoundBottomLeft(20);
        btnCerrar.setRoundBottomRight(20);
        btnCerrar.setRoundTopLeft(20);
        btnCerrar.setRoundTopRight(20);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        btnCerrar.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(24, 25, 32));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(24, 25, 32));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Retornar");
        btnCerrar.add(jLabel4);
        jLabel4.setBounds(0, 10, 280, 20);

        bg.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 280, 40));
        Cursor cursorHand6 = new Cursor(Cursor.HAND_CURSOR);
        btnCerrar.setCursor(cursorHand6);
        btnCerrar.setVisible(true);

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

        header.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 30));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("ISBN de Libro:");
        bg.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, -1));

        lblIsbn.setBackground(new java.awt.Color(255, 255, 255));
        lblIsbn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblIsbn.setForeground(new java.awt.Color(255, 255, 255));
        lblIsbn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIsbn.setText(" ");
        bg.add(lblIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 180, -1));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("ID de Préstamo:");
        bg.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 20));

        lblId.setBackground(new java.awt.Color(255, 255, 255));
        lblId.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblId.setText(" ");
        bg.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 170, -1));

        lblNombre9.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblNombre9.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombre9.setText("Detalles de Préstamo");
        bg.add(lblNombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 280, 30));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Fecha de Prestamo:");
        bg.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, -1));

        lblFechaPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaPrestamo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblFechaPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFechaPrestamo.setText(" ");
        bg.add(lblFechaPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 150, -1));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Cédula de Usuario:");
        bg.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, 20));

        lblCedulaUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblCedulaUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblCedulaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblCedulaUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCedulaUsuario.setText(" ");
        bg.add(lblCedulaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 150, -1));

        lblFechaRetorno.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaRetorno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblFechaRetorno.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaRetorno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFechaRetorno.setText(" ");
        bg.add(lblFechaRetorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 160, -1));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("Fecha de Vencimiento:");
        bg.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, 20));

        lblFechaVencimiento.setBackground(new java.awt.Color(255, 255, 255));
        lblFechaVencimiento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblFechaVencimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaVencimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFechaVencimiento.setText(" ");
        bg.add(lblFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 130, -1));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Fecha de Retorno:");
        bg.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
		btnCerrar.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
		btnCerrar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnCerrarMouseExited

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

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        controlador.devolverPrestamo(prestamoSeleccionado);
		
		this.dispose();
		vistaPrincipal.llenarTablaPrestamos();
		
		VistaNotificacion vista = new VistaNotificacion("Libro retornado de manera exitosa");
		vista.setVisible(true);
    }//GEN-LAST:event_btnCerrarMouseClicked

	    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
			this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.vistas.PanelRound btnCerrar;
    private com.vistas.PanelRound btnSalir;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCedulaUsuario;
    private javax.swing.JLabel lblFechaPrestamo;
    private javax.swing.JLabel lblFechaRetorno;
    private javax.swing.JLabel lblFechaVencimiento;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIsbn;
    private javax.swing.JLabel lblNombre9;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
