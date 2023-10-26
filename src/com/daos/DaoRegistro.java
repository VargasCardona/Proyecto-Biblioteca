package com.daos;

import com.interfaces.ControladorDao;
import com.modelos.Registro;
import com.singleton.DatabaseSingleton;
import com.utils.GeneralUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.mariadb.jdbc.Connection;

public class DaoRegistro implements ControladorDao {

	private Connection connection;

	public DaoRegistro() {
		connection = DatabaseSingleton.getInstance().getConnection();
	}

	public ArrayList<Registro> obtenerListaRegistros(String cedulaUsuario) {
		ArrayList<Registro> retornoRegistros = new ArrayList<>();

                String where = cedulaUsuario == null ? "" : " WHERE u.cedula LIKE CONCAT('%',?,'%')";
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT r.id, u.usuario, r.detalles, r.fechaRealizacion FROM registros as r INNER JOIN usuarios as u ON r.cedulaUsuario = u.cedula" + where);
			if (cedulaUsuario != null) {
                            ps.setString(1, cedulaUsuario);
                        }
                        ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Registro registroObtenido = new Registro(
						rs.getInt("id"),
						rs.getString("usuario"),
						rs.getString("detalles"),
						GeneralUtils.convertirStringFechaHora(rs.getString("fechaRealizacion")));

				retornoRegistros.add(registroObtenido);
			}
			return retornoRegistros;

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
        
        public DefaultTableModel obtenerTablaRegistros(String cedulaUsuario) {
		String where = cedulaUsuario == null 
                        ? "" 
                        : cedulaUsuario.charAt(cedulaUsuario.length() - 1) == '.'
                                ? " WHERE r.cedulaUsuario = ?"
                                : " WHERE r.cedulaUsuario LIKE CONCAT('%',?,'%')";
                try {
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.setColumnIdentifiers(new Object[]{"Cédula", "Usuario", "Detalles", "Fecha Realización"});

			PreparedStatement ps = connection.prepareStatement("SELECT r.id, r.cedulaUsuario, u.usuario, r.detalles, r.fechaRealizacion FROM registros as r INNER JOIN usuarios as u ON r.cedulaUsuario = u.cedula" + where + " ORDER BY r.id");
			if (cedulaUsuario != null) {
                            ps.setString(1, cedulaUsuario.replaceAll("\\.", ""));
                        }
                        ResultSet rs = ps.executeQuery();

			Object[] tabla = new Object[4];
			while (rs.next()) {
				for (int i = 0; i < 4; i++) {
                                        tabla[i] = rs.getObject(i + 2);	
				}
				modelo.addRow(tabla);
			}
			return modelo;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public void insertar(Object object) {
		Registro registro = (Registro) object;

		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO registros VALUES (?, ?, ?, ?)");
			ps.setString(1, registro.getId() + "");
			ps.setString(2, registro.getCedulaUsuario());
			ps.setString(3, registro.getDetalles());
			ps.setString(4, GeneralUtils.convertirFechaString(registro.getFechaRealizacion()));

			ps.execute();

		} catch (SQLException ex) {
			System.err.print(ex);
		}
	}

	@Override
	public void eliminar(String identificador) {
		
	}

	@Override
	public void actualizar(Object object) {
		
	}

}
