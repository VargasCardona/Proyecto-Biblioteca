package com.controladores;

import com.daos.DaoLibro;
import com.daos.DaoPrestamo;
import com.daos.DaoUsuario;
import com.excepciones.FechaInvalidaException;
import com.modelos.Libro;
import com.modelos.Prestamo;
import com.modelos.Usuario;
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
        
	public void registrarPrestamo(String isbnLibro, String cedulaUsuario, Calendar fechaPrestamo, Calendar fechaVencimiento, boolean estaActivo) {

		Calendar fechaActual = new GregorianCalendar();

		if (fechaVencimiento.before(fechaActual)) {
			throw new FechaInvalidaException();
		}
                
                ArrayList<Prestamo> prestamosUsuario = daoPrestamo.obtenerListaPrestamos(cedulaUsuario);
                for (Prestamo prestamo : prestamosUsuario) {
                        if (prestamo.getFechaVencimiento().before(fechaActual)) {
                        	//Aquí excepción si el usuario tiene faltas
                                //Lo chistoso es que no se como aún, se me ocurre
                                //Simplemente mandar la excepcion con el id del primer 
                                //Prestamo vencido que encuentre
                        }
                }
                
		daoPrestamo.insertarPrestamo(isbnLibro, cedulaUsuario, cedulaUsuario, cedulaUsuario, cedulaUsuario, estaActivo);
	}

	public void devolverPrestamo(Prestamo prestamoSeleccionado) {
		daoPrestamo.actualizarEstado(prestamoSeleccionado.isEstaActivo(), prestamoSeleccionado.getId());
	}

}
