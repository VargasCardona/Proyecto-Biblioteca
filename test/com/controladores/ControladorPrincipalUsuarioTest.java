package com.controladores;

import com.excepciones.CamposVaciosException;
import com.excepciones.FechaInformeInvalidaException;
import com.excepciones.TipoInformeNoSeleccionadoException;
import com.modelos.Genero;
import com.modelos.Libro;
import com.modelos.Prestamo;
import com.modelos.Usuario;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControladorPrincipalUsuarioTest {
	
	public ControladorPrincipalUsuarioTest() {
	}

	/**
	 * Test of obtenerListaUsuarios method, of class ControladorPrincipalUsuario.
	 */
	@Test
	public void testObtenerListaUsuarios_String() {
		System.out.println("obtenerListaUsuarios");
		String cedulaUsuario = "1.";
		ControladorPrincipalUsuario instance = new ControladorPrincipalUsuario();
		String expCedula = "1";
		String expPassword = "root"; 	
		ArrayList<Usuario> result = instance.obtenerListaUsuarios(cedulaUsuario);
	
		assertEquals(expCedula, result.get(0).getCedula());
		assertEquals(expPassword, result.get(0).getContrasenia());
	}

//	/**
//	 * Test of buscarCoincidencias method, of class ControladorPrincipalUsuario.
//	 */
//	@Test
//	public void testBuscarCoincidencias() {
//		System.out.println("buscarCoincidencias");
//		String where = "";
//		ControladorPrincipalUsuario instance = new ControladorPrincipalUsuario();
//		ArrayList<Usuario> expResult = null;
//		ArrayList<Usuario> result = instance.buscarCoincidencias(where);
//		assertEquals(expResult, result);
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}

	/**
	 * Test of consultarUsuario method, of class ControladorPrincipalUsuario.
	 */
	@Test
	public void testConsultarUsuario() {
		System.out.println("consultarUsuario");
		ControladorPrincipalUsuario instance = new ControladorPrincipalUsuario();
		String expUsuario = "root";
		String expCedula = "1";
		Usuario resultUsuario = instance.consultarUsuario("1", true);
		Usuario resultCedula = instance.consultarUsuario("root", false);
		
		assertEquals(expUsuario, resultUsuario.getUsuario());
		assertEquals(expCedula, resultCedula.getCedula());
	}

	/**
	 * Test of consultarGenero method, of class ControladorPrincipalUsuario.
	 */
	@Test
	public void testConsultarGenero() {
		System.out.println("consultarGenero");
		String idGenero = "A454";
		ControladorPrincipalUsuario instance = new ControladorPrincipalUsuario();
		String expResult = "Acción";
		Genero result = instance.consultarGenero(idGenero);
		
		assertEquals(expResult, result.getNombre());
	}

	/**
	 * Test of consultarLibro method, of class ControladorPrincipalUsuario.
	 */
	@Test
	public void testConsultarLibro() {
		System.out.println("consultarLibro");
		String idLibro = "H678";
		ControladorPrincipalUsuario instance = new ControladorPrincipalUsuario();
		String expResult = "Heat";
		Libro result = instance.consultarLibro(idLibro);
		
		assertEquals(expResult, result.getTitulo());
	}

	/**
	 * Test of consultarPrestamo method, of class ControladorPrincipalUsuario.
	 */
	@Test
	public void testConsultarPrestamo() {
		System.out.println("consultarPrestamo");
		String id = "P727";
		ControladorPrincipalUsuario instance = new ControladorPrincipalUsuario();
		String expResult = "G942";
		Prestamo result = instance.consultarPrestamo(id);
		
		assertEquals(expResult, result.getIsbnLibro());
	}

	/**
	 * Test of generarInformeGeneral method, of class ControladorPrincipalUsuario.
	 */
	@Test
	public void testGenerarInformeGeneral() {
		System.out.println("generarInformeGeneral");
		
		String cedulaUsuario = "No seleccionado";
		String tipoInformeException = "Seleccione un tipo de informe";
		String fechaInicioException = "AAAA-MM-DD";
		String fechaFinException = "AAAA-MM-DD";
		
		String tipoInforme = "Prestamos Realizados";
		String fechaInicio = "2023-01-01";
		String fechaFin = "2040-01-01";
		
		ControladorPrincipalUsuario instance = new ControladorPrincipalUsuario();
		
		instance.generarInformeGeneral(cedulaUsuario, tipoInforme, fechaInicio, fechaFin);
		assertThrows(TipoInformeNoSeleccionadoException.class, 
				() -> {instance.generarInformeGeneral(cedulaUsuario, tipoInformeException, fechaInicio, fechaFin);});
		assertThrows(FechaInformeInvalidaException.class, 
				() -> {instance.generarInformeGeneral(cedulaUsuario, tipoInforme, fechaFin, fechaInicio);});
		assertThrows(CamposVaciosException.class, 
				() -> {instance.generarInformeGeneral(cedulaUsuario, tipoInforme, fechaInicioException, fechaFinException);});
	}

	/**
	 * Test of generarInformeRegistros method, of class ControladorPrincipalUsuario.
	 */
	@Test
	public void testGenerarInformeRegistros() {
		System.out.println("generarInformeRegistros");
		
		String cedulaUsuario = "No seleccionado";
		String fechaInicioException = "AAAA-MM-DD";
		String fechaFinException = "AAAA-MM-DD";
		
		String tipoInforme = "General";
		String fechaInicio = "2023-01-01";
		String fechaFin = "2040-01-01";
		
		ControladorPrincipalUsuario instance = new ControladorPrincipalUsuario();
		
		instance.generarInformeRegistros(cedulaUsuario, tipoInforme, fechaInicio, fechaFin);
		assertThrows(FechaInformeInvalidaException.class, 
				() -> {instance.generarInformeGeneral(cedulaUsuario, tipoInforme, fechaFin, fechaInicio);});
		assertThrows(CamposVaciosException.class, 
				() -> {instance.generarInformeGeneral(cedulaUsuario, tipoInforme, fechaInicioException, fechaFinException);});
	}
	
}
