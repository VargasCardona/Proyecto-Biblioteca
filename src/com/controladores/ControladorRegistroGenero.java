package com.controladores;

import com.daos.DaoGenero;
import com.excepciones.CamposVaciosException;
import com.modelos.Genero;
import com.utils.GeneralUtils;

public class ControladorRegistroGenero {

	private DaoGenero daoGenero;

	public ControladorRegistroGenero() {
		this.daoGenero = new DaoGenero();
	}
	
	public void registrarGenero(String nombre){
		if (GeneralUtils.estaVacio(nombre, "Nombre")) {
			throw new CamposVaciosException();
		}
		
		daoGenero.insertar(new Genero(null, nombre));
	}
}
