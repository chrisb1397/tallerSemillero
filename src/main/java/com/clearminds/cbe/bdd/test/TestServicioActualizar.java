package com.clearminds.cbe.bdd.test;

import com.clearminds.cbe.dtos.Estudiante;
import com.clearminds.cbe.excepciones.BDDException;
import com.clearminds.cbe.servicios.ServicioEstudiante;

public class TestServicioActualizar {

	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.actualizarEstudiante(new Estudiante(2, "Pedro", "Navaja", 20));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

}
