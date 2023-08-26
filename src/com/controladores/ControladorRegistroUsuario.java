package com.controladores;

import com.excepciones.CamposVaciosException;
import com.excepciones.CedulaEnUsoException;
import com.excepciones.ContraseniasNoCoincidenException;
import com.excepciones.CuentaExistenteException;
import com.excepciones.EntradasNumericasInvalidasException;
import com.utils.ConexionUtils;
import com.utils.Utils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorRegistroUsuario {

	public void registrarUsuario(String nombre, String apellidos, String cedula, String usuario, String contrasenia, String validacionContrasenia) throws SQLException {
		if (Utils.estaVacio(nombre, "Nombre")
				|| Utils.estaVacio(apellidos, "Apellidos")
				|| Utils.estaVacio(cedula, "Cédula")
				|| Utils.estaVacio(usuario, "Usuario")
				|| Utils.estaVacio(contrasenia, "Contraseña")
				|| Utils.estaVacio(validacionContrasenia, "Repita la Contraseña")) {
			throw new CamposVaciosException();
		}

		if (Utils.validarDouble(cedula)) {
			throw new EntradasNumericasInvalidasException();
		}

		if (!contrasenia.equals(validacionContrasenia)) {
			throw new ContraseniasNoCoincidenException();
		}

		if (consultarUsuario(cedula, true).isBeforeFirst()) {
			throw new CedulaEnUsoException();
		}

		if (consultarUsuario(usuario, false).isBeforeFirst()) {
			throw new CuentaExistenteException();
		}

		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("INSERT INTO usuario (cedula, nombre, apellidos	, usuario, contrasenia) VALUES (?, ?, ?, ? ,?)");
			ps.setString(1, cedula);
			ps.setString(2, nombre);
			ps.setString(3, apellidos);
			ps.setString(4, usuario);
			ps.setString(5, contrasenia);

			ps.execute();

		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	public ResultSet consultarUsuario(String cedula, boolean esConsultaCedula) {
		try {

			PreparedStatement ps = null;

			if (esConsultaCedula) {
				ps = ConexionUtils.realizarConexion().prepareStatement("SELECT * FROM usuario WHERE cedula = ?");
			} else {
				ps = ConexionUtils.realizarConexion().prepareStatement("SELECT * FROM usuario WHERE usuario = ?");
			}

			ps.setString(1, cedula);

			return ps.executeQuery();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
		return null;
	}

}
