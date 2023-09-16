package com.controladores;

import com.daos.DaoGenero;
import com.excepciones.CamposVaciosException;
import com.excepciones.EliminacionPropiaException;
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
		daoGenero.actualizarGenero(nombre, idGenero);
	}

	public void eliminarGenero(String idGenero) {
		daoGenero.eliminarGenero(idGenero);
	}
}
