package com.daos;

import com.excepciones.ConexionNoInicializadaException;
import com.modelos.Usuario;
import com.utils.ConexionUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLNonTransientConnectionException;
import java.util.ArrayList;

public class DaoUsuario {

	public ArrayList<Usuario> obtenerListaUsuarios() {
		ArrayList<Usuario> retornoUsuarios = new ArrayList<>();

		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("SELECT * FROM usuarios");
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
			ps = ConexionUtils.realizarConexion().prepareStatement("SELECT * FROM usuarios WHERE cedula LIKE CONCAT('%',?,'%')");
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

	public void insertarUsuario(Usuario usuario) {
		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("INSERT INTO usuarios (cedula, nombre, apellidos, usuario, contrasenia) VALUES (?, ?, ?, ? ,?)");
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

	public Usuario consultarUsuario(String argumento, boolean esConsultaCedula) {
		try {

			PreparedStatement ps = null;

			if (esConsultaCedula) {
				ps = ConexionUtils.realizarConexion().prepareStatement("SELECT * FROM usuarios WHERE cedula = ?");
			} else {
				ps = ConexionUtils.realizarConexion().prepareStatement("SELECT * FROM usuarios WHERE usuario = ?");
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
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("UPDATE usuarios SET usuario = ?, contrasenia = ? WHERE usuario = ?");
			ps.setString(1, usuarioNuevo);
			ps.setString(2, contrasenia);
			ps.setString(3, usuario);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	public void actualizarUsuario(String nombre, String apellidos, String cedula) {

		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("UPDATE usuarios SET nombre = ?, apellidos = ? WHERE cedula = ?");
			ps.setString(1, nombre);
			ps.setString(2, apellidos);
			ps.setString(3, cedula);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	public void eliminarUsuario(String cedula, String cedulaUsuarioActivo) {
		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("DELETE FROM usuarios WHERE cedula = ?");
			ps.setString(1, cedula);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

}
