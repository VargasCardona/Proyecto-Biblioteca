package com.controladores;

import com.excepciones.CamposVaciosException;
import com.excepciones.EliminacionPropiaException;
import com.utils.ConexionUtils;
import com.utils.Utils;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorGestionUsuario {

	public void actualizarTabla(String nombre, String apellidos, String cedula) {
		if (Utils.estaVacio(nombre, "Nombre")
				|| Utils.estaVacio(apellidos, "Apellidos")) {
			throw new CamposVaciosException();
		}

		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("UPDATE usuario SET nombre = ?, apellidos = ? WHERE cedula = ?");
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
                    	PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("DELETE FROM usuario WHERE cedula = ?");
			ps.setString(1, cedula);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}
}
