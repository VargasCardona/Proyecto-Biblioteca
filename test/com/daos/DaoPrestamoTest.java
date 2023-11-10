package com.daos;

import com.modelos.Prestamo;
import org.junit.Test;
import static org.junit.Assert.*;

public class DaoPrestamoTest {
	
	public DaoPrestamoTest() {
	}

	/**
	 * Test of consultarPrestamo method, of class DaoPrestamo.
	 */
	@Test
	public void testConsultarPrestamo() {
		System.out.println("consultarPrestamo");
		String id = "P727";
		DaoPrestamo instance = new DaoPrestamo();
		String expResult = "G942";
		Prestamo result = instance.consultarPrestamo(id);
		
		assertEquals(expResult, result.getIsbnLibro());
	}
	
}
