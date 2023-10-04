package com.controladores;

import com.daos.DaoPrestamo;
import com.excepciones.FechaInvalidaException;
import com.modelos.Prestamo;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ControladorRegistroPrestamo {

	private DaoPrestamo daoPrestamo;

	public ControladorRegistroPrestamo() {
		this.daoPrestamo = new DaoPrestamo();
	}

	public void registrarPrestamo(String isbnLibro, String cedulaUsuario, Calendar fechaPrestamo, Calendar fechaVencimiento, boolean estaActivo) {

		Calendar fechaActual = new GregorianCalendar();

		if (fechaVencimiento.before(fechaActual)) {
			throw new FechaInvalidaException();
		}

		daoPrestamo.insertarPrestamo(isbnLibro, cedulaUsuario, cedulaUsuario, cedulaUsuario, cedulaUsuario, estaActivo);
	}

	public void devolverPrestamo(Prestamo prestamoSeleccionado) {
		daoPrestamo.actualizarEstado(prestamoSeleccionado.isEstaActivo(), prestamoSeleccionado.getId());
	}

}
