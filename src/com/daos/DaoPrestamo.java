package com.daos;

import com.modelos.Prestamo;
import com.singleton.DatabaseSingleton;
import com.utils.GeneralUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.mariadb.jdbc.Connection;

public class DaoPrestamo {

	private Connection connection;

	public DaoPrestamo() {
		connection = DatabaseSingleton.getInstance().getConnection();
	}

	public ArrayList<Prestamo> obtenerListaPrestamos() {
		ArrayList<Prestamo> retornoPrestamos = new ArrayList<>();

		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM prestamos");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Prestamo prestamoObtenido = new Prestamo(
						rs.getString("id"),
						rs.getString("isbnLibro"),
						rs.getString("cedulaUsuario"),
						GeneralUtils.convertirStringFecha(rs.getString("fechaPrestamo")),
						GeneralUtils.convertirStringFecha(rs.getString("fechaVencimiento")),
						GeneralUtils.convertirStringFecha(rs.getString("fechaRetorno")),
						rs.getString("estaActivo").equals("1"));
				retornoPrestamos.add(prestamoObtenido);
			}
			return retornoPrestamos;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
        
	public ArrayList<Prestamo> obtenerListaPrestamos(String cedulaUsuario) {
		ArrayList<Prestamo> retornoPrestamos = new ArrayList<>();

		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM prestamos WHERE cedulaUsuario = ?");
                        ps.setString(1, cedulaUsuario);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Prestamo prestamoObtenido = new Prestamo(
						rs.getString("id"),
						rs.getString("isbnLibro"),
						rs.getString("cedulaUsuario"),
						GeneralUtils.convertirStringFecha(rs.getString("fechaPrestamo")),
						GeneralUtils.convertirStringFecha(rs.getString("fechaVencimiento")),
						GeneralUtils.convertirStringFecha(rs.getString("fechaRetorno")),
						rs.getString("estaActivo").equals("1"));
				retornoPrestamos.add(prestamoObtenido);
			}
			return retornoPrestamos;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public DefaultTableModel obtenerTablaPrestamos() {
		try {
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.setColumnIdentifiers(new Object[]{"ID", "Fecha de Vencimiento", "Libro", "Usuario Responsable"});
			
			PreparedStatement ps = connection.prepareStatement("SELECT p.id, p.fechaVencimiento, l.titulo, u.usuario from prestamos as p INNER JOIN libros as l ON p.isbnLibro = l.isbn INNER JOIN usuarios as u ON p.cedulaUsuario = u.cedula");
			ResultSet rs = ps.executeQuery();

			Object[] tabla = new Object[4];
			while (rs.next()) {
				for (int i = 0; i < 4; i++) {
					tabla[i] = rs.getObject(i + 1);
				}
				modelo.addRow(tabla);
			}
			return modelo;
		} catch (SQLException ex) {
			Logger.getLogger(DaoPrestamo.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	public void insertarPrestamo(String isbnLibro, String cedulaUsuario, String fechaPrestamo, String fechaVencimiento, String fechaRetorno, boolean estaActivo) {
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO prestamos (id, isbnLibro, cedulaUsuario, fechaPrestamo, fechaVencimiento, fechaRetorno, estaActivo) VALUES (?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, GeneralUtils.generarSku("P"));
			ps.setString(2, isbnLibro);
			ps.setString(3, cedulaUsuario);
			ps.setString(4, fechaPrestamo);
			ps.setString(5, fechaVencimiento);
			ps.setString(6, fechaRetorno);
			ps.setString(7, estaActivo ? "1" : "0");

			ps.execute();

		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	public Prestamo consultarPrestamo(String idPrestamo) {
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM prestamos WHERE id = ?");

			ps.setString(1, idPrestamo);

			ResultSet rs = ps.executeQuery();

			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					Prestamo prestamoObtenido = new Prestamo(
							rs.getString("id"),
							rs.getString("isbnLibro"),
							rs.getString("cedulaUsuario"),
							GeneralUtils.convertirStringFecha(rs.getString("fechaPrestamo")),
							GeneralUtils.convertirStringFecha(rs.getString("fechaVencimiento")),
							GeneralUtils.convertirStringFecha(rs.getString("fechaRetorno")),
							rs.getString("estaActivo").equals("1"));
					return prestamoObtenido;
				}

			} else {
				return null;
			}

		} catch (SQLException ex) {
			System.err.print(ex);
		}
		return null;
	}

	public void actualizarEstado(boolean estaActivo, String idPrestamo) {
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE prestamos SET estaActivo = ? WHERE id = ?");
			ps.setString(1, estaActivo ? "1" : "0");
			ps.setString(2, idPrestamo);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

}
