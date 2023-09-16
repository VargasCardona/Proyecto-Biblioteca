package com.daos;

import com.modelos.Genero;
import com.utils.ConexionUtils;
import com.utils.GeneralUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoGenero {

	public ArrayList<Genero> obtenerListaGeneros() {
		ArrayList<Genero> retornoGeneros = new ArrayList<>();

		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("SELECT * FROM generos");
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

	public void insertarGenero(String nombreGenero) {
		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("INSERT INTO generos (id, nombre) VALUES (?, ?)");
			ps.setString(1, GeneralUtils.generarSku(nombreGenero));
			ps.setString(2, nombreGenero);

			ps.execute();

		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	public Genero consultarGenero(String idGenero) {
		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("SELECT * FROM generos WHERE id = ?");

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

	public void actualizarGenero(String nombre, String idGenero) {

		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("UPDATE generos SET nombre = ? WHERE id = ?");
			ps.setString(1, nombre);
			ps.setString(2, idGenero);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	public void eliminarGenero(String idGenero) {
		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("DELETE FROM generos WHERE id = ?");
			ps.setString(1, idGenero);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

}
