package com.clearminds.cbe.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConexionBDD {
	
	public static String leerPropiedad(String propiedad){
		Properties p = new Properties();
		String propiedadA = null;
		try {
			if (p != null) {
				p.load(new FileReader("conexion.properties"));
				// System.out.println("uno="+p.getProperty("uno"));
				propiedadA = p.getProperty(propiedad);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
		return propiedadA;

		

	}

}
