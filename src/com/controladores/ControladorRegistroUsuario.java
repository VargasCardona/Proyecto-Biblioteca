package com.controladores;

import com.daos.DaoUsuario;
import com.excepciones.CamposVaciosException;
import com.excepciones.CedulaEnUsoException;
import com.excepciones.ContraseniasNoCoincidenException;
import com.excepciones.CuentaExistenteException;
import com.excepciones.EntradasNumericasInvalidasException;
import com.modelos.Usuario;
import com.utils.GeneralUtils;

public class ControladorRegistroUsuario extends ControladorBase{
	
	DaoUsuario daoUsuario;
	
	public ControladorRegistroUsuario() {
		this.daoUsuario = new DaoUsuario();
	}

	public void registrarUsuario(String nombre, String apellidos, String cedula, String usuario, String contrasenia, String validacionContrasenia){
		if (GeneralUtils.estaVacio(nombre, "Nombre")
				|| GeneralUtils.estaVacio(apellidos, "Apellidos")
				|| GeneralUtils.estaVacio(cedula, "Cédula")
				|| GeneralUtils.estaVacio(usuario, "Usuario")
				|| GeneralUtils.estaVacio(contrasenia, "Contraseña")
				|| GeneralUtils.estaVacio(validacionContrasenia, "Repita la Contraseña")) {
			throw new CamposVaciosException();
		}

		if (GeneralUtils.validarEntero(cedula)
                        || Integer.valueOf(cedula) < 0) {
			throw new EntradasNumericasInvalidasException();
		}

		if (!contrasenia.equals(validacionContrasenia)) {
			throw new ContraseniasNoCoincidenException();
		}

		if (daoUsuario.consultarUsuario(cedula, true) != null) {
			throw new CedulaEnUsoException();
		}

		if (daoUsuario.consultarUsuario(usuario, false) != null) {
			throw new CuentaExistenteException();
		}
		
		daoUsuario.insertarUsuario(new Usuario(nombre, apellidos, cedula, usuario, contrasenia));
	}
}
