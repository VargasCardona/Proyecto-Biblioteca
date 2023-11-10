package com.daos;

import com.modelos.Libro;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class DaoLibroTest {
	
	public DaoLibroTest() {
	}

	/**
	 * Test of obtenerListaLibrosFiltro method, of class DaoLibro.
	 */
	@Test
	public void testObtenerListaLibrosFiltro() {
		System.out.println("obtenerListaLibrosFiltro");
		String isbn = "H678";
		String idGenero = null;
		DaoLibro instance = new DaoLibro();
		String expResult = "Heat";
		ArrayList<Libro> result = instance.obtenerListaLibrosFiltro(isbn, idGenero);
		
		assertEquals(expResult, result.get(0).getTitulo());
	}

	/**
	 * Test of obtenerListaLibrosFiltroAvanzado method, of class DaoLibro.
	 */
	@Test
	public void testObtenerListaLibrosFiltroAvanzado() {
		System.out.println("obtenerListaLibrosFiltroAvanzado");
		String atributoTabla = "ISBN";
		String clave = "H678";
		DaoLibro instance = new DaoLibro();
		String expResult = "Heat";
		ArrayList<Libro> result = instance.obtenerListaLibrosFiltroAvanzado(atributoTabla, clave);
		assertEquals(expResult, result.get(0).getTitulo());
	}

	/**
	 * Test of consultarLibro method, of class DaoLibro.
	 */
	@Test
	public void testConsultarLibro() {
		System.out.println("consultarLibro");
		String isbn = "H678";
		DaoLibro instance = new DaoLibro();
		String expResult = "Heat";
		Libro result = instance.consultarLibro(isbn);
		assertEquals(expResult, result.getTitulo());
	}
	
}
