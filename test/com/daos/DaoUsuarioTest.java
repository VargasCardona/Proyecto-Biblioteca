package com.daos;

import com.modelos.Usuario;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class DaoUsuarioTest {
	
	public DaoUsuarioTest() {
	}

	/**
	 * Test of obtenerListaUsuarios method, of class DaoUsuario.
	 */
	@Test
	public void testObtenerListaUsuarios() {
		System.out.println("obtenerListaUsuarios");
		String cedulaUsuario = "1.";
		DaoUsuario instance = new DaoUsuario();
		ArrayList<Usuario> expResult = null;
		ArrayList<Usuario> result = instance.obtenerListaUsuarios(cedulaUsuario);
		String expCedula = "1";
		String expPassword = "root"; 	
	
		assertEquals(expCedula, result.get(0).getCedula());
		assertEquals(expPassword, result.get(0).getContrasenia());
	}

//	/**
//	 * Test of buscarCoincidencias method, of class DaoUsuario.
//	 */
//	@Test
//	public void testBuscarCoincidencias() {
//		System.out.println("buscarCoincidencias");
//		String where = "";
//		DaoUsuario instance = new DaoUsuario();
//		ArrayList<Usuario> expResult = null;
//		ArrayList<Usuario> result = instance.buscarCoincidencias(where);
//		assertEquals(expResult, result);
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}

	/**
	 * Test of consultarUsuario method, of class DaoUsuario.
	 */
	@Test
	public void testConsultarUsuario() {
		System.out.println("consultarUsuario");
		DaoUsuario instance = new DaoUsuario();
		String expUsuario = "root";
		String expCedula = "1";
		Usuario resultUsuario = instance.consultarUsuario("1", true);
		Usuario resultCedula = instance.consultarUsuario("root", false);
		
		assertEquals(expUsuario, resultUsuario.getUsuario());
		assertEquals(expCedula, resultCedula.getCedula());
	}
	
}
