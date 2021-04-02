package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private Connection con = null;

	public Conexion() {
		try {						
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mispollos_java", "root", "");
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("fallo al conectar " + e);
		}
	}	
	
	public Connection getConexion() {		
		return con;
	}
	
	public void cerrarConexion() {
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
