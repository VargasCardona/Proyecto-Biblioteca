package com.controladores;

import com.daos.DaoUsuario;
import com.excepciones.CamposVaciosException;
import com.excepciones.EliminacionPropiaException;
import com.modelos.Usuario;
import com.utils.GeneralUtils;

public class ControladorGestionUsuario {
	
	private DaoUsuario daoUsuario;

	public ControladorGestionUsuario() {
		this.daoUsuario = new DaoUsuario();
	}

	public void actualizarUsuario(String nombre, String apellidos, String cedula) {
		if (GeneralUtils.estaVacio(nombre, "Nombre")
				|| GeneralUtils.estaVacio(apellidos, "Apellidos")) {
			throw new CamposVaciosException();
		}
		daoUsuario.actualizar(new Usuario(nombre, apellidos, cedula, null, null));
	}

	public void eliminarUsuario(String cedula, String cedulaUsuarioActivo) {
		if (cedula.equals(cedulaUsuarioActivo)) {
			throw new EliminacionPropiaException();
		}
		daoUsuario.eliminar(cedula);
	}
}
