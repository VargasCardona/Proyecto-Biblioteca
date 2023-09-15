package com.controladores;

import com.excepciones.CamposVaciosException;
import com.excepciones.ContraseniaIncorrectaException;
import com.excepciones.UsuarioNoEncontradoException;
import com.modelos.Usuario;
import com.utils.GeneralUtils;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ControladorAcceso extends ControladorBase {

	public Usuario validarLogin(String usuario, String contrasenia) throws SQLException {

		if (GeneralUtils.estaVacio(usuario, "Usuario")
				|| GeneralUtils.estaVacio(contrasenia, "Contraseña")) {
			throw new CamposVaciosException();
		}

		ResultSet rs = consultarUsuario(usuario, false);
		Usuario usuarioEncontrado = new Usuario(null, null, null, null, null);
		
		if (rs.next()) {
			usuarioEncontrado.setCedula(rs.getString(1));
			usuarioEncontrado.setNombre(rs.getString(2));
			usuarioEncontrado.setApellidos(rs.getString(3));
			usuarioEncontrado.setUsuario(rs.getString(4));
			usuarioEncontrado.setContrasenia(rs.getString(5));
		}

                if (usuarioEncontrado.getUsuario() == null) {
                        throw new UsuarioNoEncontradoException();
                }
                
//		if (usuarioEncontrado.getUsuario().equals(usuario)) {
			if (usuarioEncontrado.getContrasenia().equals(contrasenia)) {
				return usuarioEncontrado;
			}
			throw new ContraseniaIncorrectaException();
//		}
		
	}
}
