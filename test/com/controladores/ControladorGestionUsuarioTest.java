package com.controladores;

import com.excepciones.CamposVaciosException;
import com.excepciones.EliminacionPropiaException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControladorGestionUsuarioTest {

	public ControladorGestionUsuarioTest() {
	}

	/**
	 * Test of actualizarUsuario method, of class ControladorGestionUsuario.
	 */
	@Test
	public void testActualizarUsuario() {
		System.out.println("actualizarUsuario");
		ControladorGestionUsuario instance = new ControladorGestionUsuario();
		
		assertThrows(CamposVaciosException.class,
				() -> {instance.actualizarUsuario("",
							"",
							"");
				});
	}

	/**
	 * Test of eliminarUsuario method, of class ControladorGestionUsuario.
	 */
	@Test
	public void testEliminarUsuario() {
		System.out.println("eliminarUsuario");
		String cedula = "1";
		ControladorGestionUsuario instance = new ControladorGestionUsuario();

		assertThrows(EliminacionPropiaException.class, 
				() -> {instance.eliminarUsuario(cedula,
						cedula);});
	}

}
