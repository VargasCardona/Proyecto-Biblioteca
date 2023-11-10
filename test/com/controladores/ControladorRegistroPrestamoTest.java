package com.controladores;

import com.excepciones.EntradasNumericasInvalidasException;
import com.excepciones.FechaInvalidaException;
import com.modelos.Libro;
import com.modelos.Prestamo;
import com.modelos.Usuario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControladorRegistroPrestamoTest {
	
	public ControladorRegistroPrestamoTest() {
	}

	/**
	 * Test of obtenerUsuario method, of class ControladorRegistroPrestamo.
	 */
	@Test
	public void testObtenerUsuario() {
		System.out.println("obtenerUsuario");
		String cedula = "1";
		ControladorRegistroPrestamo instance = new ControladorRegistroPrestamo();
		String expResult = "root";
		Usuario result = instance.obtenerUsuario(cedula);
		
		assertEquals(expResult, result.getUsuario());
	}

	/**
	 * Test of obtenerLibro method, of class ControladorRegistroPrestamo.
	 */
	@Test
	public void testObtenerLibro() {
		System.out.println("obtenerLibro");
		String isbn = "H678";
		ControladorRegistroPrestamo instance = new ControladorRegistroPrestamo();
		String expResult = "Heat";
		Libro result = instance.obtenerLibro(isbn);
		
		assertEquals(expResult, result.getTitulo());
	}

	/**
	 * Test of registrarPrestamo method, of class ControladorRegistroPrestamo.
	 */
	@Test
	public void testRegistrarPrestamo() {
		System.out.println("registrarPrestamo");
		String isbnLibro = "H678";
		String cedulaUsuario = "1";
		Calendar fechaVencimiento = new GregorianCalendar();
		
		fechaVencimiento.set(Calendar.YEAR, 2022);
		fechaVencimiento.set(Calendar.MONTH, 1);
		fechaVencimiento.add(Calendar.MONTH, -1);
		fechaVencimiento.set(Calendar.DAY_OF_MONTH, 1);
		
		boolean estaActivo = false;
		ControladorRegistroPrestamo instance = new ControladorRegistroPrestamo();
		
		assertThrows(FechaInvalidaException.class, 
				() -> {instance.registrarPrestamo(isbnLibro,
						cedulaUsuario,
						fechaVencimiento,
						true);});
	}
	
}
