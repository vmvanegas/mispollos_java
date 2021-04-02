package controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.UsuarioModelo;

public class UsuarioControlador {

	
	public static boolean ingresarUsuario(UsuarioModelo usuario) {
		boolean agregado = false;
		try {
			Conexion c = new Conexion();
			Connection con = c.getConexion();
			if(con != null) {
				Statement st;
				st = con.createStatement();
				st.executeUpdate("INSERT INTO tienda (id_tienda,nombre,direccion,telefono) VALUES ('"+usuario.getIdTienda()+"','"+usuario.getNombreTienda()+"', '"+usuario.getDireccion()+"', '"+usuario.getTelefono()+"')");
				st.executeUpdate("INSERT INTO usuario (id_usuario,nombre,apellido,correo,clave,id_tienda, id_rol) VALUES ('"+usuario.getId()+"','"+usuario.getNombre()+"', '"+usuario.getApellido()+"', '"+usuario.getCorreo()+"', '"+usuario.getClave()+"', '"+usuario.getIdTienda()+"', '"+usuario.getIdRol()+"')");
				agregado = true;
				st.close();
			}
			c.cerrarConexion();			
		} catch(SQLException e) {
			agregado = false;
			e.printStackTrace();			
		}
		return agregado;
	}
	
	
	public static UsuarioModelo validarUsuario(String correo, String clave) {
		UsuarioModelo usuarioEncontrado = null;
		try {
			Conexion c = new Conexion();
			Connection con = c.getConexion();
			if(con != null) {
				Statement st;
				st = con.createStatement();
				ResultSet dbUsuario = st.executeQuery("select u.id_usuario, u.nombre,u.apellido, u.correo, u.clave, u.id_rol,  t.id_tienda, t.nombre,t.telefono, t.direccion from usuario u join tienda t on u.id_tienda = t.id_tienda where u.correo='" + correo + "' and u.clave='" + clave + "'");
				if (dbUsuario.next()==true) {				
										
					UsuarioModelo usuario = new UsuarioModelo();
					
					usuario.setId(dbUsuario.getString("u.id_usuario"));
					usuario.setNombre(dbUsuario.getString("u.nombre"));
					usuario.setApellido(dbUsuario.getString("u.apellido"));
					usuario.setCorreo(dbUsuario.getString("u.correo"));
					usuario.setClave(dbUsuario.getString("u.clave"));
					usuario.setIdRol(dbUsuario.getString("u.id_rol"));
					usuario.setIdTienda(dbUsuario.getString("t.id_tienda"));
					usuario.setNombreTienda(dbUsuario.getString("t.nombre"));
					usuario.setTelefono(dbUsuario.getString("t.telefono"));
					usuario.setDireccion(dbUsuario.getString("t.direccion"));
					
					usuarioEncontrado = usuario;
				}
				
				st.close();
			}
			c.cerrarConexion();			
		} catch(SQLException e) {
			e.printStackTrace();			
		}
		return usuarioEncontrado;
	}
}
