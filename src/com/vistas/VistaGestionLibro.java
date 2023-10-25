package com.vistas;

import com.controladores.ControladorGestionLibro;
import com.controladores.ControladorPrincipalUsuario;
import com.modelos.Genero;
import com.modelos.Libro;
import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class VistaGestionLibro extends javax.swing.JFrame {

	int xMouse, yMouse;
	ControladorGestionLibro controladorLibro;
	ControladorPrincipalUsuario controladorPrincipal;
	VistaPrincipalUsuario vistaPrincipal;
	Libro libroSeleccionado;

	public VistaGestionLibro(VistaPrincipalUsuario vista, Libro libroSeleccionado) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.controladorLibro = new ControladorGestionLibro();
		this.controladorPrincipal = new ControladorPrincipalUsuario();
		this.vistaPrincipal = vista;
		this.libroSeleccionado = libroSeleccionado;

		lblIsbn.setText(libroSeleccionado.getISBN());
		txtTitulo.setText(libroSeleccionado.getTitulo());
		txtAutor.setText(libroSeleccionado.getAutor());

		llenarCmbGeneros();
		
		int index = 0;
		for (int i = 0; i < cmbGeneros.getItemCount(); i++) {
			if (cmbGeneros.getItemAt(i).startsWith(libroSeleccionado.getGenero())) {
				index = i;
				break;
			}
		}
		cmbGeneros.setSelectedIndex(index);

		txtPublicacion.setText(libroSeleccionado.getAnioPublicacion());
		txtUnidades.setText(String.valueOf(libroSeleccionado.getUnidadesDisponibles()));
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btnGuardarCambios = new com.vistas.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnSalir = new com.vistas.PanelRound();
        btnEliminarLibro = new com.vistas.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        lblIsbn = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        panelRound6 = new com.vistas.PanelRound();
        txtTitulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        panelRound7 = new com.vistas.PanelRound();
        txtAutor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        panelRound8 = new com.vistas.PanelRound();
        cmbGeneros = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        panelRound10 = new com.vistas.PanelRound();
        txtPublicacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        panelRound11 = new com.vistas.PanelRound();
        txtUnidades = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(24, 25, 32));
        bg.setPreferredSize(new java.awt.Dimension(800, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        bg.add(btnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 310, 40));
        Cursor cursorHand1 = new Cursor(Cursor.HAND_CURSOR);
        btnGuardarCambios.setCursor(cursorHand1);
        btnGuardarCambios.setVisible(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Gestionar Libro");
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

        btnEliminarLibro.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarLibro.setRoundBottomLeft(20);
        btnEliminarLibro.setRoundBottomRight(20);
        btnEliminarLibro.setRoundTopLeft(20);
        btnEliminarLibro.setRoundTopRight(20);
        btnEliminarLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarLibroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarLibroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarLibroMouseExited(evt);
            }
        });
        btnEliminarLibro.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(24, 25, 32));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(24, 25, 32));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Eliminar Libro");
        btnEliminarLibro.add(jLabel5);
        jLabel5.setBounds(70, 10, 160, 20);

        bg.add(btnEliminarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 310, 40));
        Cursor cursorHand2 = new Cursor(Cursor.HAND_CURSOR);
        btnEliminarLibro.setCursor(cursorHand2);
        btnEliminarLibro.setVisible(true);

        lblIsbn.setBackground(new java.awt.Color(255, 255, 255));
        lblIsbn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblIsbn.setForeground(new java.awt.Color(255, 255, 255));
        lblIsbn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIsbn.setText("{ISBN}");
        bg.add(lblIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Libro con ISBN:");
        bg.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        panelRound6.setBackground(new java.awt.Color(37, 42, 52));
        panelRound6.setForeground(new java.awt.Color(57, 59, 70));
        panelRound6.setRoundBottomLeft(20);
        panelRound6.setRoundBottomRight(20);
        panelRound6.setRoundTopLeft(20);
        panelRound6.setRoundTopRight(20);
        panelRound6.setLayout(null);

        txtTitulo.setBackground(new java.awt.Color(37, 42, 52));
        txtTitulo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Título");
        txtTitulo.setBorder(null);
        txtTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTituloFocusLost(evt);
            }
        });
        txtTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTituloMousePressed(evt);
            }
        });
        panelRound6.add(txtTitulo);
        txtTitulo.setBounds(10, 10, 280, 20);

        bg.add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 310, 40));
        Cursor cursorText24= new Cursor(Cursor.TEXT_CURSOR);
        panelRound6.setCursor(cursorText24);
        panelRound6.setVisible(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Título");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 310, 30));

        panelRound7.setBackground(new java.awt.Color(37, 42, 52));
        panelRound7.setForeground(new java.awt.Color(57, 59, 70));
        panelRound7.setRoundBottomLeft(20);
        panelRound7.setRoundBottomRight(20);
        panelRound7.setRoundTopLeft(20);
        panelRound7.setRoundTopRight(20);
        panelRound7.setLayout(null);

        txtAutor.setBackground(new java.awt.Color(37, 42, 52));
        txtAutor.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtAutor.setForeground(new java.awt.Color(255, 255, 255));
        txtAutor.setText("Autor");
        txtAutor.setBorder(null);
        txtAutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAutorFocusLost(evt);
            }
        });
        txtAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtAutorMousePressed(evt);
            }
        });
        panelRound7.add(txtAutor);
        txtAutor.setBounds(10, 10, 280, 20);

        bg.add(panelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 310, 40));
        Cursor cursorText423= new Cursor(Cursor.TEXT_CURSOR);
        panelRound6.setCursor(cursorText423);
        panelRound6.setVisible(true);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Nombre de Autor");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 310, 30));

        panelRound8.setBackground(new java.awt.Color(37, 42, 52));
        panelRound8.setForeground(new java.awt.Color(57, 59, 70));
        panelRound8.setRoundBottomLeft(20);
        panelRound8.setRoundBottomRight(20);
        panelRound8.setRoundTopLeft(20);
        panelRound8.setRoundTopRight(20);
        panelRound8.setLayout(null);

        cmbGeneros.setBackground(new java.awt.Color(37, 42, 52));
        cmbGeneros.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cmbGeneros.setForeground(new java.awt.Color(255, 255, 255));
        cmbGeneros.setMaximumRowCount(5);
        cmbGeneros.setToolTipText("");
        cmbGeneros.setBorder(null);
        cmbGeneros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRound8.add(cmbGeneros);
        cmbGeneros.setBounds(10, 10, 280, 20);

        bg.add(panelRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 310, 40));
        Cursor cursorText43= new Cursor(Cursor.TEXT_CURSOR);
        panelRound6.setCursor(cursorText43);
        panelRound6.setVisible(true);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Género");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 310, 30));

        panelRound10.setBackground(new java.awt.Color(37, 42, 52));
        panelRound10.setForeground(new java.awt.Color(57, 59, 70));
        panelRound10.setRoundBottomLeft(20);
        panelRound10.setRoundBottomRight(20);
        panelRound10.setRoundTopLeft(20);
        panelRound10.setRoundTopRight(20);
        panelRound10.setLayout(null);

        txtPublicacion.setBackground(new java.awt.Color(37, 42, 52));
        txtPublicacion.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtPublicacion.setForeground(new java.awt.Color(255, 255, 255));
        txtPublicacion.setText("Año de Publicación");
        txtPublicacion.setBorder(null);
        txtPublicacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPublicacionFocusLost(evt);
            }
        });
        txtPublicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPublicacionMousePressed(evt);
            }
        });
        panelRound10.add(txtPublicacion);
        txtPublicacion.setBounds(10, 10, 280, 20);

        bg.add(panelRound10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 310, 40));
        Cursor cursorText44= new Cursor(Cursor.TEXT_CURSOR);
        panelRound6.setCursor(cursorText44);
        panelRound6.setVisible(true);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Año de Publicación");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 310, 30));

        panelRound11.setBackground(new java.awt.Color(37, 42, 52));
        panelRound11.setForeground(new java.awt.Color(57, 59, 70));
        panelRound11.setRoundBottomLeft(20);
        panelRound11.setRoundBottomRight(20);
        panelRound11.setRoundTopLeft(20);
        panelRound11.setRoundTopRight(20);
        panelRound11.setLayout(null);

        txtUnidades.setBackground(new java.awt.Color(37, 42, 52));
        txtUnidades.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtUnidades.setForeground(new java.awt.Color(255, 255, 255));
        txtUnidades.setText("Unidades");
        txtUnidades.setBorder(null);
        txtUnidades.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUnidadesFocusLost(evt);
            }
        });
        txtUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUnidadesMousePressed(evt);
            }
        });
        panelRound11.add(txtUnidades);
        txtUnidades.setBounds(10, 10, 280, 20);

        bg.add(panelRound11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 310, 40));
        Cursor cursorText4= new Cursor(Cursor.TEXT_CURSOR);
        panelRound6.setCursor(cursorText4);
        panelRound6.setVisible(true);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Unidades Disponibles");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 310, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
				controladorLibro.actualizarLibro(txtTitulo.getText(),
						txtAutor.getText(),
						cmbGeneros.getSelectedItem().toString().split(" ")[0],
						txtPublicacion.getText(),
						txtUnidades.getText(),
						lblIsbn.getText());
                                vistaPrincipal.controlador.insertarRegistro(vistaPrincipal.usuarioActivo.getCedula(),
                                        "Edición de libro");
                                
				this.dispose();

				vistaPrincipal.llenarTablaLibros(null, null);

				VistaNotificacion vista = new VistaNotificacion("Libro editado");
				vista.setVisible(true);

			} catch (Exception e) {
				VistaNotificacion vista = new VistaNotificacion(e.getMessage());
				vista.setVisible(true);

			}
        }//GEN-LAST:event_btnGuardarCambiosMouseClicked

        private void btnEliminarLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarLibroMouseClicked

			try {
				controladorLibro.eliminarLibro(String.valueOf(libroSeleccionado.getISBN()));
                                vistaPrincipal.controlador.insertarRegistro(vistaPrincipal.usuarioActivo.getCedula(),
                                        "Eliminación de libro");
			} catch (Exception e) {
				VistaNotificacion vista = new VistaNotificacion(e.getMessage());
				vista.setVisible(true);
				return;
			}

			this.dispose();
			vistaPrincipal.llenarTablaLibros(null, null);

			VistaNotificacion vista = new VistaNotificacion("Libro eliminado del sistema");
			vista.setVisible(true);
        }//GEN-LAST:event_btnEliminarLibroMouseClicked

        private void btnEliminarLibroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarLibroMouseEntered
			btnEliminarLibro.setBackground(new Color(204, 204, 204));
        }//GEN-LAST:event_btnEliminarLibroMouseEntered

        private void btnEliminarLibroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarLibroMouseExited
			btnEliminarLibro.setBackground(new Color(255, 255, 255));
        }//GEN-LAST:event_btnEliminarLibroMouseExited

    private void txtTituloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTituloFocusLost
		if (txtTitulo.getText().equals("")) {
			txtTitulo.setText("Título");
		}
    }//GEN-LAST:event_txtTituloFocusLost

    private void txtTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTituloMousePressed
		if (txtTitulo.getText().equals("Título")) {
			txtTitulo.setText("");
		}
    }//GEN-LAST:event_txtTituloMousePressed

    private void txtAutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAutorFocusLost
		if (txtAutor.getText().equals("")) {
			txtAutor.setText("Autor");
		}
    }//GEN-LAST:event_txtAutorFocusLost

    private void txtAutorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAutorMousePressed
		if (txtAutor.getText().equals("Autor")) {
			txtAutor.setText("");
		}
    }//GEN-LAST:event_txtAutorMousePressed

    private void txtPublicacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPublicacionFocusLost
		if (txtPublicacion.getText().equals("")) {
			txtPublicacion.setText("Año de Publicación");
		}
    }//GEN-LAST:event_txtPublicacionFocusLost

    private void txtPublicacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPublicacionMousePressed
		if (txtPublicacion.getText().equals("Año de Publicación")) {
			txtPublicacion.setText("");
		}
    }//GEN-LAST:event_txtPublicacionMousePressed

    private void txtUnidadesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnidadesFocusLost
		if (txtUnidades.getText().equals("")) {
			txtUnidades.setText("Unidades");
		}
    }//GEN-LAST:event_txtUnidadesFocusLost

    private void txtUnidadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUnidadesMousePressed
		if (txtUnidades.getText().equals("Unidades")) {
			txtUnidades.setText("");
		}
    }//GEN-LAST:event_txtUnidadesMousePressed

	public void llenarCmbGeneros() {
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
		cmbGeneros.setModel(model);

		ArrayList<Genero> generos = controladorPrincipal.obtenerListaGeneros();
		model.addElement("Seleccione un género"); // Agrega la opción predeterminada

		for (Genero genero : generos) {
			model.addElement(genero.getId() + " - " + genero.getNombre());
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private com.vistas.PanelRound btnEliminarLibro;
    private com.vistas.PanelRound btnGuardarCambios;
    private com.vistas.PanelRound btnSalir;
    private javax.swing.JComboBox<String> cmbGeneros;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblIsbn;
    private com.vistas.PanelRound panelRound10;
    private com.vistas.PanelRound panelRound11;
    private com.vistas.PanelRound panelRound6;
    private com.vistas.PanelRound panelRound7;
    private com.vistas.PanelRound panelRound8;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtPublicacion;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
}
