package com.controladores;

import com.excepciones.AnioInvalidoException;
import com.excepciones.CamposVaciosException;
import com.excepciones.EntradasNumericasInvalidasException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControladorGestionLibroTest {
	
	public ControladorGestionLibroTest() {
	}

	/**
	 * Test of actualizarLibro method, of class ControladorGestionLibro.
	 */
	@Test
	public void testActualizarLibro() {
		System.out.println("actualizarLibro");
		ControladorGestionLibro instance = new ControladorGestionLibro();
		String titulo = "Test";
		String autor = "Test";
		String isbn = "L123";
		String idGenero = "T123";
		String anioPublicacion = "-1";
		String unidadesDisponiblesException = "-1";
		String unidadesDisponibles = String.valueOf(1);
		
		assertThrows(CamposVaciosException.class, 
				() -> {instance.actualizarLibro("",
						"",
						"",
						"",
						"",
						"");});
		assertThrows(EntradasNumericasInvalidasException.class, 
				() -> {instance.actualizarLibro(titulo,
						autor,
						idGenero,
						anioPublicacion,
						unidadesDisponiblesException,
						isbn);});
		assertThrows(AnioInvalidoException.class, 
				() -> {instance.actualizarLibro(titulo,
						autor,
						idGenero,
						anioPublicacion,
						unidadesDisponibles,
						isbn);});
	}
}
