package com.controladores;

import com.utils.ConexionUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorBase {

	public ResultSet consultarUsuario(String argumento, boolean esConsultaCedula) {
		try {

			PreparedStatement ps = null;

			if (esConsultaCedula) {
				ps = ConexionUtils.realizarConexion().prepareStatement("SELECT * FROM usuarios WHERE cedula = ?");
			} else {
				ps = ConexionUtils.realizarConexion().prepareStatement("SELECT * FROM usuarios WHERE usuario = ?");
			}

			ps.setString(1, argumento);

			return ps.executeQuery();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
		return null;
	}

}
