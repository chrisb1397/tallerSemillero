package com.clearminds.cbe.servicios;

import com.clearminds.cbe.dtos.Estudiante;
import com.clearminds.cbe.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase{

	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		ServicioBase srvb = new ServicioBase();
			srvb.abrirConexion();
			System.out.println("Insertando estudiante: " + estudiante);
			srvb.cerrarConexion();
	}
}
