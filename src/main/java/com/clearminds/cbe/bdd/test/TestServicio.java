package com.clearminds.cbe.bdd.test;

import com.clearminds.cbe.dtos.Estudiante;
import com.clearminds.cbe.excepciones.BDDException;
import com.clearminds.cbe.servicios.ServicioEstudiante;

public class TestServicio {

	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.insertarEstudiante(new Estudiante("Juan", "Perez"));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

}
