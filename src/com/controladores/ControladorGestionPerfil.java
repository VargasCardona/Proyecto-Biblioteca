package com.controladores;

import com.excepciones.CamposVaciosException;
import com.utils.ConexionUtils;
import com.utils.Utils;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorGestionPerfil {

	public void actualizarTabla(String usuario, String usuarioNuevo, String contrasenia) {
		if (Utils.estaVacio(usuario, "Nombre")
				|| Utils.estaVacio(contrasenia, "Contraseña")) {
			throw new CamposVaciosException();
		}

		try {
			PreparedStatement ps = ConexionUtils.realizarConexion().prepareStatement("UPDATE usuario SET usuario = ?, contrasenia = ? WHERE usuario = ?");
			ps.setString(1, usuarioNuevo);
			ps.setString(2, contrasenia);
			ps.setString(3, usuario);

			ps.execute();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}
}
