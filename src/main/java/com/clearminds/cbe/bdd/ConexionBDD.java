package com.clearminds.cbe.bdd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.cbe.excepciones.BDDException;

public class ConexionBDD {
	
	public static String leerPropiedad(String propiedad){
		Properties p = new Properties();
		String propiedadA = null;
		File f=new File("conexion.properties");
		System.out.println("ruta:"+f.getAbsoluteFile());

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
	
	
	public static Connection obtenerConexion() throws BDDException{
		Connection con = null;
		String url = leerPropiedad("urlConexion");
		String user = leerPropiedad("usuario");
		String password = leerPropiedad("password");
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("No se pudo conectar a la base de datos!!!");
		}
		
		return con;
	}

}
