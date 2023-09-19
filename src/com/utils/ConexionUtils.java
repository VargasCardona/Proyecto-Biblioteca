package com.utils;

import com.conexion.ConexionDB;
import com.excepciones.ConexionNoInicializadaException;
import org.mariadb.jdbc.Connection;

public class ConexionUtils {

	/**
	 * Realiza una conexion con la base de datos activa
	 *
	 * @return conexion a base de datos solicitada
	 * @throws SQLException {@inheritDoc}
	 */
	public static Connection realizarConexion() {
		try {
			ConexionDB conexionD = new ConexionDB();
			return conexionD.getConexion();
		} catch (ConexionNoInicializadaException ex) {
                        throw new ConexionNoInicializadaException();
                } catch (Exception ex) {
			System.err.println("Conexión fallida");
		}
		return null;
	}
}
