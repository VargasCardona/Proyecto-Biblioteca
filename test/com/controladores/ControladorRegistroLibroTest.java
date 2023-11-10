package com.controladores;

import com.excepciones.AnioInvalidoException;
import com.excepciones.CamposVaciosException;
import com.excepciones.EntradasNumericasInvalidasException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControladorRegistroLibroTest {
	
	public ControladorRegistroLibroTest() {
	}

	/**
	 * Test of registrarLibro method, of class ControladorRegistroLibro.
	 */
	@Test
	public void testRegistrarLibro() {
		System.out.println("registrarLibro");
		String titulo = "Test";
		String autor = "Test";
		String idGenero = "T123";
		String anioPublicacion = "-1";
		String unidadesDisponiblesException = "-1";
		String unidadesDisponibles = String.valueOf(1);
		ControladorRegistroLibro instance = new ControladorRegistroLibro();
		
		assertThrows(CamposVaciosException.class, 
				() -> {instance.registrarLibro("",
						"",
						"",
						"",
						"");});
		assertThrows(EntradasNumericasInvalidasException.class, 
				() -> {instance.registrarLibro(titulo,
						autor,
						idGenero,
						anioPublicacion,
						unidadesDisponiblesException);});
		assertThrows(AnioInvalidoException.class, 
				() -> {instance.registrarLibro(titulo,
						autor,
						idGenero,
						anioPublicacion,
						unidadesDisponibles);});
	}
	
}
