package com.daos;

import com.excepciones.GeneroEnUsoException;
import com.interfaces.ControladorDao;
import com.modelos.Genero;
import com.singleton.DatabaseSingleton;
import com.utils.GeneralUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import org.mariadb.jdbc.Connection;

public class DaoGenero implements ControladorDao {

	private Connection connection;

	public DaoGenero() {
		connection = DatabaseSingleton.getInstance().getConnection();
	}

	public ArrayList<Genero> obtenerListaGeneros() {
		ArrayList<Genero> retornoGeneros = new ArrayList<>();

		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM generos");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Genero generoObtenido = new Genero(
						rs.getString("id"),
						rs.getString("nombre"));

				retornoGeneros.add(generoObtenido);
			}
			return retornoGeneros;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public Genero consultarGenero(String idGenero) {
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM generos WHERE id = ?");

			ps.setString(1, idGenero);

			ResultSet rs = ps.executeQuery();

			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					Genero generoObtenido = new Genero(
							rs.getString("id"),
							rs.getString("nombre"));
					return generoObtenido;
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
		Genero genero = (Genero) object;

		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO generos (id, nombre) VALUES (?, ?)");
			ps.setString(1, GeneralUtils.generarSku(genero.getNombre()));
			ps.setString(2, genero.getNombre());

			ps.execute();

		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	@Override
	public void eliminar(String identificador) {
		try {
			PreparedStatement ps = connection.prepareStatement("DELETE FROM generos WHERE id = ?");
			ps.setString(1, identificador);

			ps.execute();
		} catch (SQLIntegrityConstraintViolationException x) {
			throw new GeneroEnUsoException();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	@Override
	public void actualizar(Object object) {
		Genero genero = (Genero) object;

		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE generos SET nombre = ? WHERE id = ?");
			ps.setString(1, genero.getNombre());
			ps.setString(2, genero.getId());

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

}
