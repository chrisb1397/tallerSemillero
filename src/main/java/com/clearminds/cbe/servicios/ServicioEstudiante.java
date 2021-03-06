package com.clearminds.cbe.servicios;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.clearminds.cbe.bdd.ConexionBDD;
import com.clearminds.cbe.dtos.DateUtil;
import com.clearminds.cbe.dtos.Estudiante;
import com.clearminds.cbe.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		String fecha = DateUtil.obtenerFecha(new Date());
		Connection con = ConexionBDD.obtenerConexion();
		ServicioBase srvb = new ServicioBase();
		srvb.abrirConexion();
		System.out.println("Insertando estudiante: " + estudiante);
		Statement stmt = null;

		try {
			stmt = con.createStatement();
			String sql = "insert into estudiantes(nombre,apellido,edad,fecha_modificacion)values('" + estudiante.getNombre() + "','"
					+ estudiante.getApellido() + "', "+estudiante.getEdad()+", '"+fecha+"')";
			System.out.println("Script: " + sql);
			stmt.execute(sql);
			srvb.cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}

	}

	public void actualizarEstudiante(Estudiante estudiante) throws BDDException {
		String fecha = DateUtil.obtenerFecha(new Date());
		Connection con = ConexionBDD.obtenerConexion();
		ServicioBase srvb = new ServicioBase();
		srvb.abrirConexion();
		System.out.println("Actualizando estudiante: " + estudiante);
		Statement stmt = null;

		try {
			stmt = con.createStatement();
			String sql = "update estudiantes set nombre='"+estudiante.getNombre()+"', apellido='"+estudiante.getApellido()+"', edad="+estudiante.getEdad()+", fecha_modificacion='"+fecha+"' where id="+estudiante.getId();
			System.out.println("Script: " + sql);
			stmt.execute(sql);
			srvb.cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al actualizar estudiante");
		}

	}
}
