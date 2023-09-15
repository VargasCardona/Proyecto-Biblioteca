package com.controladores;

import com.excepciones.CamposVaciosException;
import com.excepciones.EliminacionPropiaException;
import com.utils.ConexionUtils;
import com.utils.GeneralUtils;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorGestionUsuario {

	public void actualizarTabla(String nombre, String apellidos, String cedula) {
		if (GeneralUtils.estaVacio(nombre, "Nombre")
				|| GeneralUtils.estaVacio(apellidos, "Apellidos")) {
			throw new CamposVaciosException();
		}

		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("UPDATE usuarios SET nombre = ?, apellidos = ? WHERE cedula = ?");
			ps.setString(1, nombre);
			ps.setString(2, apellidos);
			ps.setString(3, cedula);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	public void eliminarTabla(String cedula, String cedulaUsuarioActivo) {
		if (cedula.equals(cedulaUsuarioActivo)) {
                        throw new EliminacionPropiaException();
                }
                
                try {
                    	PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("DELETE FROM usuarios WHERE cedula = ?");
			ps.setString(1, cedula);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}
}
