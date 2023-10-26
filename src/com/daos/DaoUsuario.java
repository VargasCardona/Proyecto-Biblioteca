package com.daos;

import com.excepciones.ConexionNoInicializadaException;
import com.excepciones.UsuarioEnPrestamoException;
import com.interfaces.ControladorDao;
import com.modelos.Usuario;
import com.singleton.DatabaseSingleton;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLException;
import java.util.ArrayList;
import org.mariadb.jdbc.Connection;

public class DaoUsuario implements ControladorDao {

	private Connection connection;

	public DaoUsuario() {
		connection = DatabaseSingleton.getInstance().getConnection();
	}

	public ArrayList<Usuario> obtenerListaUsuarios(String cedulaUsuario) {
		ArrayList<Usuario> retornoUsuarios = new ArrayList<>();
                String where = cedulaUsuario == null 
                        ? "" 
                        : cedulaUsuario.charAt(cedulaUsuario.length() - 1) == '.'
                                ? " WHERE cedula = ?"
                                : " WHERE cedula LIKE CONCAT('%',?,'%')";
                
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM usuarios" + where);
                        if (cedulaUsuario != null) {
                                ps.setString(1, cedulaUsuario.replaceAll("\\.", ""));
                        }
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Usuario usuarioObtenido = new Usuario(
						rs.getString("nombre"),
						rs.getString("apellidos"),
						rs.getString("cedula"),
						rs.getString("usuario"),
						rs.getString("contrasenia"));

				retornoUsuarios.add(usuarioObtenido);
			}
			return retornoUsuarios;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public ArrayList<Usuario> buscarCoincidencias(String where) {
		ArrayList<Usuario> retornoUsuarios = new ArrayList<>();
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement("SELECT * FROM usuarios WHERE cedula LIKE CONCAT('%',?,'%')");
			ps.setString(1, where);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Usuario usuarioObtenido = new Usuario(
						rs.getString("nombre"),
						rs.getString("apellidos"),
						rs.getString("cedula"),
						rs.getString("usuario"),
						rs.getString("contrasenia"));

				retornoUsuarios.add(usuarioObtenido);
			}
			return retornoUsuarios;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}

	public Usuario consultarUsuario(String argumento, boolean esConsultaCedula) {
		try {

			PreparedStatement ps = null;

			if (esConsultaCedula) {
				ps = connection.prepareStatement("SELECT * FROM usuarios WHERE cedula = ?");
			} else {
				ps = connection.prepareStatement("SELECT * FROM usuarios WHERE usuario = ?");
			}

			ps.setString(1, argumento);

			ResultSet rs = ps.executeQuery();

			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					Usuario usuarioObtenido = new Usuario(
							rs.getString("nombre"),
							rs.getString("apellidos"),
							rs.getString("cedula"),
							rs.getString("usuario"),
							rs.getString("contrasenia"));
					return usuarioObtenido;
				}
			} else {
				return null;
			}

		} catch (ConexionNoInicializadaException e) {
			throw new ConexionNoInicializadaException();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
		return null;
	}

	public void actualizarCredenciales(String usuarioNuevo, String contrasenia, String usuario) {
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE usuarios SET usuario = ?, contrasenia = ? WHERE usuario = ?");
			ps.setString(1, usuarioNuevo);
			ps.setString(2, contrasenia);
			ps.setString(3, usuario);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	@Override
	public void insertar(Object object) {
		Usuario usuario = (Usuario) object;

		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO usuarios (cedula, nombre, apellidos, usuario, contrasenia) VALUES (?, ?, ?, ? ,?)");
			ps.setString(1, usuario.getCedula());
			ps.setString(2, usuario.getNombre());
			ps.setString(3, usuario.getApellidos());
			ps.setString(4, usuario.getUsuario());
			ps.setString(5, usuario.getContrasenia());
			ps.execute();

		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	@Override
	public void eliminar(String identificador) {
		try {
			PreparedStatement ps = connection.prepareStatement("DELETE FROM usuarios WHERE cedula = ?");
			ps.setString(1, identificador);

			ps.execute();
		} catch (SQLIntegrityConstraintViolationException x) {
			throw new UsuarioEnPrestamoException();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	@Override
	public void actualizar(Object object) {
		Usuario usuario = (Usuario) object;
		
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE usuarios SET nombre = ?, apellidos = ? WHERE cedula = ?");
			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getApellidos());
			ps.setString(3, usuario.getCedula());

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

}
