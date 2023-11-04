package com.daos;

import com.interfaces.ControladorDao;
import com.modelos.Libro;
import com.singleton.DatabaseSingleton;
import com.utils.GeneralUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.mariadb.jdbc.Connection;

public class DaoLibro implements ControladorDao {

	private Connection connection;

	public DaoLibro() {
		connection = DatabaseSingleton.getInstance().getConnection();
	}

	public ArrayList<Libro> obtenerListaLibros() {
		ArrayList<Libro> retornoLibros = new ArrayList<>();

		try {
			PreparedStatement ps = connection.prepareStatement("SELECT l.isbn, l.titulo, l.autor, g.nombre, l.anioPublicacion, l.unidadesDisponibles FROM libros as l INNER JOIN generos g ON l.idGenero = g.id");
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
			PreparedStatement ps = connection.prepareStatement("SELECT l.isbn, l.titulo, l.autor, g.nombre, l.anioPublicacion, l.unidadesDisponibles FROM libros as l INNER JOIN generos g ON l.idGenero = g.id" + where);
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

	public ArrayList<Libro> obtenerListaLibrosFiltroAvanzado(String atributoTabla, String clave) {
		ArrayList<Libro> retornoLibros = new ArrayList<>();

                String atributo = null;
                switch (atributoTabla) {
			case "ISBN" ->
				atributo = "l.isbn";
			case "Título" ->
				atributo = "l.titulo";
			case "Autor" ->
				atributo = "l.autor";
			case "Género" ->
				atributo = "g.nombre";
			case "Año de publicación" ->
				atributo = "l.anioPublicacion";
		}
                
		String where = "";
		if (atributo != null && clave != null) {
			where += " WHERE " + atributo + " LIKE CONCAT('%',?,'%')";
		}

		try {
			String query = "SELECT l.isbn, l.titulo, l.autor, g.nombre, l.anioPublicacion, l.unidadesDisponibles FROM libros as l INNER JOIN generos g ON l.idGenero = g.id";
			PreparedStatement ps = connection.prepareStatement(query + where);
			if (atributo != null && clave != null) {
				ps.setString(1, clave);
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

	public Libro consultarLibro(String isbn) {
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM libros WHERE isbn = ?");

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

	public void modificarExistencias(int valorModificacion, String isbn) {

		try {
			Libro libroObtenido = consultarLibro(isbn);

			PreparedStatement ps = connection.prepareStatement("UPDATE libros SET unidadesDisponibles = ? WHERE isbn = ?");
			ps.setString(1, String.valueOf(libroObtenido.getUnidadesDisponibles() + valorModificacion));
			ps.setString(2, isbn);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	@Override
	public void insertar(Object object) {
		Libro libro = (Libro) object;

		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO libros (isbn, titulo, autor, idGenero, anioPublicacion, unidadesDisponibles) VALUES (?, ?, ?, ?, ?, ?)");
			ps.setString(1, GeneralUtils.generarSku(libro.getTitulo()));
			ps.setString(2, libro.getTitulo());
			ps.setString(3, libro.getAutor());
			ps.setString(4, libro.getGenero());
			ps.setString(5, libro.getAnioPublicacion());
			ps.setString(6, String.valueOf(libro.getUnidadesDisponibles()));

			ps.execute();

		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	@Override
	public void eliminar(String identificador) {
		try {
			PreparedStatement ps = connection.prepareStatement("DELETE FROM libros WHERE isbn = ?");
			ps.setString(1, identificador);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	@Override
	public void actualizar(Object object) {
		Libro libro = (Libro) object;

		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE libros SET titulo = ?, autor = ?, idGenero = ?, anioPublicacion = ?, unidadesDisponibles = ? WHERE isbn = ?");
			ps.setString(1, libro.getTitulo());
			ps.setString(2, libro.getAutor());
			ps.setString(3, libro.getGenero());
			ps.setString(4, libro.getAnioPublicacion());
			ps.setString(5, String.valueOf(libro.getUnidadesDisponibles()));
			ps.setString(6, libro.getISBN());

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

}
