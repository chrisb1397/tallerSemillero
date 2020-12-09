package com.clearminds.cbe.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.cbe.bdd.ConexionBDD;
import com.clearminds.cbe.excepciones.BDDException;

public class ServicioBase {
	private Connection conexion;

	public void abrirConexion() throws BDDException {
		conexion = ConexionBDD.obtenerConexion();
	}

	public void cerrarConexion() {

		try {
			if (conexion != null) {
				conexion.close();
				System.out.println("Conexión cerrada");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al cerrar conexión");
		}

	}
}
