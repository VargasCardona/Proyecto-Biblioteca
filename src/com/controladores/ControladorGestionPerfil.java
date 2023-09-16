package com.controladores;

import com.daos.DaoUsuario;
import com.excepciones.CamposVaciosException;
import com.excepciones.CuentaExistenteException;
import com.utils.GeneralUtils;
import com.modelos.Usuario;
import java.sql.SQLException;

public class ControladorGestionPerfil extends ControladorBase {

	private DaoUsuario daoUsuario;

	public ControladorGestionPerfil() {
		this.daoUsuario = new DaoUsuario();
	}

	public void actualizarCredenciales(String usuario, String usuarioNuevo, String contrasenia) throws SQLException {
		if (GeneralUtils.estaVacio(usuario, "Nombre")
				|| GeneralUtils.estaVacio(contrasenia, "Contraseña")) {
			throw new CamposVaciosException();
		}

		Usuario usuarioObtenido = daoUsuario.consultarUsuario(usuarioNuevo, false);

		if (usuarioObtenido != null) {
			throw new CuentaExistenteException();
		}

		daoUsuario.actualizarCredenciales(usuarioNuevo, contrasenia, usuario);
	}
}
