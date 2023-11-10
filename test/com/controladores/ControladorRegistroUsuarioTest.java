package com.controladores;

import com.excepciones.CamposVaciosException;
import com.excepciones.CedulaEnUsoException;
import com.excepciones.ContraseniasNoCoincidenException;
import com.excepciones.CuentaExistenteException;
import com.excepciones.EntradasNumericasInvalidasException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControladorRegistroUsuarioTest {
	
	public ControladorRegistroUsuarioTest() {
	}

	/**
	 * Test of registrarUsuario method, of class ControladorRegistroUsuario.
	 */
	@Test
	public void testRegistrarUsuario() {
		System.out.println("registrarUsuario");
		String nombre = "root";
		String apellidos = "root";
		String cedula = "123456";
		String cedulaExceptionNoNumerico = "test";
		String cedulaExceptionEnUso = "1";
		String usuario = "root";
		String contrasenia = "root";
		String validacionContrasenia = "rootDiferente";
		ControladorRegistroUsuario instance = new ControladorRegistroUsuario();
		
		assertThrows(CamposVaciosException.class, 
				() -> {instance.registrarUsuario("",
						"",
						"",
						"",
						"",
						"");});
		assertThrows(EntradasNumericasInvalidasException.class, 
				() -> {instance.registrarUsuario(nombre,
						apellidos,
						cedulaExceptionNoNumerico,
						usuario,
						contrasenia,
						validacionContrasenia);});
		assertThrows(ContraseniasNoCoincidenException.class, 
				() -> {instance.registrarUsuario(nombre,
						apellidos,
						cedula,
						usuario,
						contrasenia,
						validacionContrasenia);});
		assertThrows(CedulaEnUsoException.class, 
				() -> {instance.registrarUsuario(nombre,
						apellidos,
						cedulaExceptionEnUso,
						usuario,
						contrasenia,
						contrasenia);});
		assertThrows(CuentaExistenteException.class, 
				() -> {instance.registrarUsuario(usuario,
						apellidos,
						cedula,
						usuario,
						contrasenia,
						contrasenia);});
	}
	
}
