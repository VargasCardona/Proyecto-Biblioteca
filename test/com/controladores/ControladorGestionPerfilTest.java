package com.controladores;

import com.excepciones.CamposVaciosException;
import com.excepciones.CuentaExistenteException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControladorGestionPerfilTest {
	
	public ControladorGestionPerfilTest() {
	}

	/**
	 * Test of actualizarCredenciales method, of class ControladorGestionPerfil.
	 */
	@Test
	public void testActualizarCredenciales() throws Exception {
		System.out.println("actualizarCredenciales");
		String usuario = "root";
		String contrasenia = "root";
		ControladorGestionPerfil instance = new ControladorGestionPerfil();

		assertThrows(CamposVaciosException.class, 
				() -> {instance.actualizarCredenciales("",
						"",
						"");});
		assertThrows(CuentaExistenteException.class, 
				() -> {instance.actualizarCredenciales(usuario,
						usuario,
						contrasenia);});
	}
}
