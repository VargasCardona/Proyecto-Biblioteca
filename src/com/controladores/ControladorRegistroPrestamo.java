package com.controladores;

import com.daos.DaoLibro;
import com.daos.DaoPrestamo;
import com.daos.DaoUsuario;
import com.excepciones.FechaInvalidaException;
import com.excepciones.NoHayUnidadesDisponiblesException;
import com.excepciones.PrestamoVencidoException;
import com.modelos.Libro;
import com.modelos.Prestamo;
import com.modelos.Usuario;
import com.utils.GeneralUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ControladorRegistroPrestamo {

	private DaoPrestamo daoPrestamo;

	private DaoUsuario daoUsuario;
	private DaoLibro daoLibro;

	public ControladorRegistroPrestamo() {
		this.daoPrestamo = new DaoPrestamo();

		this.daoUsuario = new DaoUsuario();
		this.daoLibro = new DaoLibro();
	}

	public ArrayList<Prestamo> obtenerListaPrestamos() {
		return daoPrestamo.obtenerListaPrestamos();
	}

	public ArrayList<Usuario> obtenerListaUsuarios() {
		return daoUsuario.obtenerListaUsuarios();
	}

	public Usuario obtenerUsuario(String cedula) {
		return daoUsuario.consultarUsuario(cedula, true);
	}

	public ArrayList<Libro> obtenerListaLibros() {
		return daoLibro.obtenerListaLibros();
	}

	public Libro obtenerLibro(String isbn) {
		return daoLibro.consultarLibro(isbn);
	}

	public void registrarPrestamo(String isbnLibro, String cedulaUsuario, Calendar fechaVencimiento, boolean estaActivo) {

		Calendar fechaActual = new GregorianCalendar();
		Libro libroConsultado = daoLibro.consultarLibro(isbnLibro);

		if (fechaVencimiento.before(fechaActual)) {
			throw new FechaInvalidaException();
		}
		
		if (libroConsultado.getUnidadesDisponibles() <= 0){
			throw new NoHayUnidadesDisponiblesException();
		}
		
		ArrayList<Prestamo> prestamosUsuario = daoPrestamo.obtenerListaPrestamos(cedulaUsuario);
		for (Prestamo prestamo : prestamosUsuario) {
			if (prestamo.getFechaVencimiento().before(fechaActual) && prestamo.isEstaActivo()) {
				throw new PrestamoVencidoException(prestamo.getId());
			}
		}

		daoPrestamo.insertarPrestamo(isbnLibro, cedulaUsuario,
				GeneralUtils.convertirFechaString(fechaActual),
				GeneralUtils.convertirFechaString(fechaVencimiento),
				estaActivo);
		daoLibro.modificarExistencias(-1, isbnLibro);
	}
	
	public void devolverPrestamo(Prestamo prestamoSeleccionado) {
		daoPrestamo.actualizarEstado(prestamoSeleccionado.getId());
	}

}
