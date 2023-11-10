package com.daos;

import com.modelos.Genero;
import org.junit.Test;
import static org.junit.Assert.*;

public class DaoGeneroTest {
	
	public DaoGeneroTest() {
	}

	/**
	 * Test of consultarGenero method, of class DaoGenero.
	 */
	@Test
	public void testConsultarGenero() {
		System.out.println("consultarGenero");
		String idGenero = "A454";
		DaoGenero instance = new DaoGenero();
		String expResult = "Acción";
		Genero result = instance.consultarGenero(idGenero);
		
		assertEquals(expResult, result.getNombre());
	}
	
}
