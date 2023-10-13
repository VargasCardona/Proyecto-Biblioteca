package com.daos;

import com.interfaces.ControladorDao;
import com.modelos.Prestamo;
import com.singleton.DatabaseSingleton;
import com.utils.GeneralUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.mariadb.jdbc.Connection;

public class DaoPrestamo implements ControladorDao {

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
						null,
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
			modelo.setColumnIdentifiers(new Object[]{"ID", "Vencimiento", "Libro", "Usuario", "Préstamo Activo"});

			PreparedStatement ps = connection.prepareStatement("SELECT p.id, p.fechaVencimiento, l.titulo, u.usuario, p.estaActivo from prestamos as p INNER JOIN libros as l ON p.isbnLibro = l.isbn INNER JOIN usuarios as u ON p.cedulaUsuario = u.cedula");
			ResultSet rs = ps.executeQuery();

			Object[] tabla = new Object[5];
			while (rs.next()) {
				for (int i = 0; i < 5; i++) {
					if (i == 4) {
						tabla[i] = (rs.getObject(i + 1)).equals(false) ? "No" : "Si";
					} else {
						tabla[i] = rs.getObject(i + 1);
					}
				}
				modelo.addRow(tabla);
			}
			return modelo;
		} catch (SQLException ex) {
			Logger.getLogger(DaoPrestamo.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
        
	public DefaultTableModel obtenerTablaPrestamos(String id) {
		try {
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.setColumnIdentifiers(new Object[]{"ID", "Vencimiento", "Libro", "Usuario", "Préstamo Activo"});

			PreparedStatement ps = connection.prepareStatement("SELECT p.id, p.fechaVencimiento, l.titulo, u.usuario, p.estaActivo from prestamos as p INNER JOIN libros as l ON p.isbnLibro = l.isbn INNER JOIN usuarios as u ON p.cedulaUsuario = u.cedula WHERE p.id LIKE CONCAT('%',?,'%')");
			ps.setString(1, id);
                        ResultSet rs = ps.executeQuery();

			Object[] tabla = new Object[5];
			while (rs.next()) {
				for (int i = 0; i < 5; i++) {
					if (i == 4) {
						tabla[i] = (rs.getObject(i + 1)).equals(false) ? "No" : "Si";
					} else {
						tabla[i] = rs.getObject(i + 1);
					}
				}
				modelo.addRow(tabla);
			}
			return modelo;
		} catch (SQLException ex) {
			Logger.getLogger(DaoPrestamo.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
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
							rs.getString("fechaRetorno") == null ? null : GeneralUtils.convertirStringFecha(rs.getString("fechaRetorno")),
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

	@Override
	public void insertar(Object object) {
		Prestamo prestamo = (Prestamo) object;
		
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO prestamos (id, isbnLibro, cedulaUsuario, fechaPrestamo, fechaVencimiento, fechaRetorno, estaActivo) VALUES (?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, GeneralUtils.generarSku("P"));
			ps.setString(2, prestamo.getIsbnLibro());
			ps.setString(3, prestamo.getCedulaUsuario());
			ps.setString(4, GeneralUtils.convertirFechaString(prestamo.getFechaPrestamo()));
			ps.setString(5, GeneralUtils.convertirFechaString(prestamo.getFechaVencimiento()));
			ps.setString(6, null);
			ps.setString(7, prestamo.isEstaActivo() ? "1" : "0");

			ps.execute();

		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	@Override
	public void eliminar(String identificador) {
		
	}

	@Override
	public void actualizar(Object object) {
		String id = (String) object;
		
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE prestamos SET estaActivo = ?, fechaRetorno = ? WHERE id = ?");
			ps.setString(1, "0");
			ps.setString(2, GeneralUtils.convertirFechaString(new GregorianCalendar()));
			ps.setString(3, id);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
		
	}

}
