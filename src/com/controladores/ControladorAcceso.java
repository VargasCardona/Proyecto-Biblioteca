package com.controladores;

import com.daos.DaoUsuario;
import com.excepciones.CamposVaciosException;
import com.excepciones.ContraseniaIncorrectaException;
import com.excepciones.UsuarioNoEncontradoException;
import com.modelos.Usuario;
import com.utils.GeneralUtils;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ControladorAcceso extends ControladorBase {

	private DaoUsuario daoUsuario;

	public ControladorAcceso() {
		this.daoUsuario = new DaoUsuario();
	}

	public Usuario validarLogin(String usuario, String contrasenia) throws SQLException {

		if (GeneralUtils.estaVacio(usuario, "Usuario")
				|| GeneralUtils.estaVacio(contrasenia, "Contraseña")) {
			throw new CamposVaciosException();
		}

		Usuario usuarioEncontrado = daoUsuario.consultarUsuario(usuario, false);

		if (usuarioEncontrado.getUsuario() == null) {
			throw new UsuarioNoEncontradoException();
		}

		if (usuarioEncontrado.getContrasenia().equals(contrasenia)) {
			return usuarioEncontrado;
		}
		throw new ContraseniaIncorrectaException();

	}
}
