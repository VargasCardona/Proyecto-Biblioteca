package com.controladores;

import com.daos.DaoLibro;
import com.daos.DaoPrestamo;
import com.modelos.Prestamo;

public class ControladorRetornoPrestamo {

	private DaoPrestamo daoPrestamo;
	private DaoLibro daoLibro;

	public ControladorRetornoPrestamo() {
		this.daoPrestamo = new DaoPrestamo();
		this.daoLibro = new DaoLibro();
	}

	public void devolverPrestamo(Prestamo prestamoSeleccionado) {
		daoPrestamo.actualizarEstado(prestamoSeleccionado.getId());
		daoLibro.modificarExistencias(1, prestamoSeleccionado.getIsbnLibro());
	}

}
