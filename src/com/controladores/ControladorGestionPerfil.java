package com.controladores;

import com.excepciones.CamposVaciosException;
import com.excepciones.CuentaExistenteException;
import com.modelos.Usuario;
import com.utils.ConexionUtils;
import com.utils.Utils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorGestionPerfil extends ControladorBase {

	public void actualizarTabla(String usuario, String usuarioNuevo, String contrasenia) throws SQLException {
		if (Utils.estaVacio(usuario, "Nombre")
				|| Utils.estaVacio(contrasenia, "Contraseña")) {
			throw new CamposVaciosException();
		}

                ResultSet rs = consultarUsuario(usuarioNuevo, false);
		
		if (rs.next()) {
			throw new CuentaExistenteException();
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
