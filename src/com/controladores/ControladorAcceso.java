package com.controladores;

import com.daos.DaoRegistro;
import com.daos.DaoUsuario;
import com.excepciones.CamposVaciosException;
import com.excepciones.ContraseniaIncorrectaException;
import com.excepciones.UsuarioNoEncontradoException;
import com.modelos.Registro;
import com.modelos.Usuario;
import com.utils.GeneralUtils;
import java.sql.SQLException;

public class ControladorAcceso {

	private DaoUsuario daoUsuario;
	private DaoRegistro daoRegistro;

	public ControladorAcceso() {
		this.daoUsuario = new DaoUsuario();
		this.daoRegistro = new DaoRegistro();
	}

	public Usuario validarLogin(String usuario, String contrasenia) throws SQLException {

		if (GeneralUtils.estaVacio(usuario, "Usuario")
				|| GeneralUtils.estaVacio(contrasenia, "Contraseña")) {
			throw new CamposVaciosException();
		}

		Usuario usuarioEncontrado = daoUsuario.consultarUsuario(usuario, false);

		if (usuarioEncontrado == null) {
			throw new UsuarioNoEncontradoException();
		}

		if (usuarioEncontrado.getContrasenia().equals(contrasenia)) {
			return usuarioEncontrado;
		}
		throw new ContraseniaIncorrectaException();

	}

        public void insertarRegistro(String cedulaUsuarioActivo, String detalles) {
                Registro registro = new Registro(0, cedulaUsuarioActivo, detalles);
                daoRegistro.insertar(registro);
        }
}
