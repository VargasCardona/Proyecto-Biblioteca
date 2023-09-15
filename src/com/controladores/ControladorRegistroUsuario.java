package com.controladores;

import com.excepciones.CamposVaciosException;
import com.excepciones.CedulaEnUsoException;
import com.excepciones.ContraseniasNoCoincidenException;
import com.excepciones.CuentaExistenteException;
import com.excepciones.EntradasNumericasInvalidasException;
import com.utils.ConexionUtils;
import com.utils.GeneralUtils;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorRegistroUsuario extends ControladorBase{

	public void registrarUsuario(String nombre, String apellidos, String cedula, String usuario, String contrasenia, String validacionContrasenia) throws SQLException {
		if (GeneralUtils.estaVacio(nombre, "Nombre")
				|| GeneralUtils.estaVacio(apellidos, "Apellidos")
				|| GeneralUtils.estaVacio(cedula, "Cédula")
				|| GeneralUtils.estaVacio(usuario, "Usuario")
				|| GeneralUtils.estaVacio(contrasenia, "Contraseña")
				|| GeneralUtils.estaVacio(validacionContrasenia, "Repita la Contraseña")) {
			throw new CamposVaciosException();
		}

		if (GeneralUtils.validarDouble(cedula)) {
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
}
