package modelo;

import java.util.UUID;

public class UsuarioModelo {

	private String id;
	private String nombre;
	private String apellido;
	private String correo;
	private String clave;
	private String idTienda;
	private String nombreTienda;
	private String direccion;
	private String telefono;
	private String idRol;
	
	
	public UsuarioModelo(String nombre, String apellido, String correo, String clave, String nombreTienda, String direccion,
			String telefono) {
		super();
		this.id = UUID.randomUUID().toString();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.clave = clave;
		this.idTienda = UUID.randomUUID().toString();
		this.nombreTienda = nombreTienda;
		this.direccion = direccion;
		this.telefono = telefono;
		this.idRol = "248de3ac-9266-11eb-a8b3-0242ac130003";
	}
	
	public UsuarioModelo () {}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getIdTienda() {
		return idTienda;
	}
	public void setIdTienda(String idTienda) {
		this.idTienda = idTienda;
	}
	public String getNombreTienda() {
		return nombreTienda;
	}
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getIdRol() {
		return idRol;
	}
	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}
	
}
