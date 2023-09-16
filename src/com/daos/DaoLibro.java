package com.daos;

import com.modelos.Libro;
import com.utils.ConexionUtils;
import com.utils.GeneralUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoLibro {
        
	public ArrayList<Libro> obtenerListaLibros() {
		ArrayList<Libro> retornoLibros = new ArrayList<>();

		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("SELECT l.isbn, l.titulo, l.autor, g.nombre, l.anioPublicacion, l.unidadesDisponibles FROM libros as l INNER JOIN generos g ON l.idGenero = g.id");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Libro libroObtenido = new Libro(
						rs.getString("l.isbn"),
						rs.getString("l.titulo"),
						rs.getString("l.autor"),
						rs.getString("g.nombre"),
						rs.getString("l.anioPublicacion"),
						rs.getInt("l.unidadesDisponibles"));
				retornoLibros.add(libroObtenido);
			}
			return retornoLibros;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
        
	public ArrayList<Libro> obtenerListaLibrosFiltro(String isbn, String idGenero) {
		ArrayList<Libro> retornoLibros = new ArrayList<>();
                
                String where = "";
                String aux = " WHERE ";
                int i = 1;
                if (idGenero != null) {
                        where += aux + "g.id = ?";
                        aux = " AND ";
                }
                if (isbn != null) {
                        where += aux + "l.isbn LIKE CONCAT('%',?,'%')";
                }
                
		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("SELECT l.isbn, l.titulo, l.autor, g.nombre, l.anioPublicacion, l.unidadesDisponibles FROM libros as l INNER JOIN generos g ON l.idGenero = g.id"+where);
                        if (idGenero != null) {
                                ps.setString(i, idGenero);
                                i++;
                        }
                        if (isbn != null) {
                                ps.setString(i, isbn);
                        }
                        ResultSet rs = ps.executeQuery();
                        
			while (rs.next()) {
				Libro libroObtenido = new Libro(
						rs.getString("l.isbn"),
						rs.getString("l.titulo"),
						rs.getString("l.autor"),
						rs.getString("g.nombre"),
						rs.getString("l.anioPublicacion"),
						rs.getInt("l.unidadesDisponibles"));
				retornoLibros.add(libroObtenido);
			}
			return retornoLibros;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public void insertarLibro(String titulo, String autor, String idGenero, String anioPublicacion, String unidadesDisponibles) {
		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("INSERT INTO libros (isbn, titulo, autor, idGenero, anioPublicacion, unidadesDisponibles) VALUES (?, ?, ?, ?, ?, ?)");
			ps.setString(1, GeneralUtils.generarSku(titulo));
			ps.setString(2, titulo);
			ps.setString(3, autor);
			ps.setString(4, idGenero);
			ps.setString(5, anioPublicacion);
			ps.setString(6, unidadesDisponibles);

			ps.execute();

		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	public Libro consultarLibro(String isbn) {
		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("SELECT * FROM libros WHERE isbn = ?");

			ps.setString(1, isbn);

			ResultSet rs = ps.executeQuery();

			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					Libro libroObtenido = new Libro(
						rs.getString("isbn"),
						rs.getString("titulo"),
						rs.getString("autor"),
						rs.getString("idGenero"),
						rs.getString("anioPublicacion"),
						rs.getInt("unidadesDisponibles"));
					return libroObtenido;
				}

			} else {
				return null;
			}

		} catch (SQLException ex) {
			System.err.print(ex);
		}
		return null;
	}

	public void actualizarLibro(String titulo, String autor, String idGenero, String anioPublicacion, String unidadesDisponibles, String isbn) {

		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("UPDATE libros SET titulo = ?, autor = ?, idGenero = ?, anioPublicacion = ?, unidadesDisponibles = ? WHERE isbn = ?");
			ps.setString(1, titulo);
			ps.setString(2, autor);
			ps.setString(3, idGenero);
			ps.setString(4, anioPublicacion);
			ps.setString(5, unidadesDisponibles);
			ps.setString(6, isbn);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	public void eliminarLibro(String isbn) {
		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("DELETE FROM libros WHERE isbn = ?");
			ps.setString(1, isbn);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

}
