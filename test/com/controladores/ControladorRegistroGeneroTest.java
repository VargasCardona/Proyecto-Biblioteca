package com.controladores;

import com.excepciones.CamposVaciosException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControladorRegistroGeneroTest {
	
	public ControladorRegistroGeneroTest() {
	}

	/**
	 * Test of registrarGenero method, of class ControladorRegistroGenero.
	 */
	@Test
	public void testRegistrarGenero() {
		System.out.println("registrarGenero");
		String nombre = "";
		ControladorRegistroGenero instance = new ControladorRegistroGenero();
		
		assertThrows(CamposVaciosException.class, 
				() -> {instance.registrarGenero(nombre);});
	}
	
}
