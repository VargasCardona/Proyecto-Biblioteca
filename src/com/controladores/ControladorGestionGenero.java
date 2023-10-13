package com.controladores;

import com.daos.DaoGenero;
import com.excepciones.CamposVaciosException;
import com.modelos.Genero;
import com.utils.GeneralUtils;

public class ControladorGestionGenero {
	
	private DaoGenero daoGenero;

	public ControladorGestionGenero() {
		this.daoGenero = new DaoGenero();
	}

	public void actualizarGenero(String nombre, String idGenero) {
		if (GeneralUtils.estaVacio(nombre, "Nombre")) {
			throw new CamposVaciosException();
		}
		daoGenero.actualizar(new Genero(idGenero, nombre));
	}

	public void eliminarGenero(String idGenero) {
		daoGenero.eliminar(idGenero);
	}
}
