package com.controladores;

import com.utils.ConexionUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorBase {

	public ResultSet consultarUsuario(String cedula, boolean esConsultaCedula) {
		try {

			PreparedStatement ps = null;

			if (esConsultaCedula) {
				ps = ConexionUtils.realizarConexion().prepareStatement("SELECT * FROM usuario WHERE cedula = ?");
			} else {
				ps = ConexionUtils.realizarConexion().prepareStatement("SELECT * FROM usuario WHERE usuario = ?");
			}

			ps.setString(1, cedula);

			return ps.executeQuery();
		} catch (SQLException ex) {
			System.err.print(ex);
		}
		return null;
	}

}
