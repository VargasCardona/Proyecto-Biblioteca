package com.controladores;

import com.daos.DaoGenero;

public class ControladorRegistroGenero extends ControladorBase{

	private DaoGenero daoGenero;

	public ControladorRegistroGenero() {
		this.daoGenero = new DaoGenero();
	}
	
	public void registrarGenero(String nombre){
		daoGenero.insertarGenero(nombre);
	}
}
