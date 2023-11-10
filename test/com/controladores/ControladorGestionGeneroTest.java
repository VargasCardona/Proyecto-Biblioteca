package com.controladores;

import com.excepciones.CamposVaciosException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 57320
 */
public class ControladorGestionGeneroTest {
	
	public ControladorGestionGeneroTest() {
	}

	/**
	 * Test of actualizarGenero method, of class ControladorGestionGenero.
	 */
	@Test
	public void testActualizarGenero() {
		System.out.println("actualizarGenero");
		ControladorGestionGenero instance = new ControladorGestionGenero();

		assertThrows(CamposVaciosException.class, 
				() -> {instance.actualizarGenero("",
						"");});
	}
}
