package com.controladores;

import com.excepciones.CamposVaciosException;
import com.excepciones.ContraseniaIncorrectaException;
import com.excepciones.UsuarioNoEncontradoException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControladorAccesoTest {
	
	public ControladorAccesoTest() {
	}

	/**
	 * Test of validarLogin method, of class ControladorAcceso.
	 */
	@Test
	public void testValidarLogin() throws Exception {
		System.out.println("validarLogin");
		String usuario = "root";
		String usuarioException = "rootInexistented";
		String contrasenia = "root";
		String contraseniaException = "rootIncorrecto";
		ControladorAcceso instance = new ControladorAcceso();
		
		assertThrows(CamposVaciosException.class, 
				() -> {instance.validarLogin("",
						"");});
		assertThrows(UsuarioNoEncontradoException.class, 
				() -> {instance.validarLogin(usuarioException,
						contrasenia);});
		assertThrows(ContraseniaIncorrectaException.class, 
				() -> {instance.validarLogin(usuario,
						contraseniaException);});
	}
	
}
