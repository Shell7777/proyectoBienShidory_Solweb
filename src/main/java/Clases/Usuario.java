package Clases;

import java.util.Collection;

public class Usuario {

	public int IdUsuario;
	public String Nombre;
	public String User;
	public String Pass;
	
	public Collection <Movimiento> Movimientos;
	
	private Usuario() {

	}

	private Usuario(int idUsuario, String nombre, String user, String pass) {
		super();
		IdUsuario = idUsuario;
		Nombre = nombre;
		User = user;
		Pass = pass;
	}

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}

	public String getPass() {
		return Pass;
	}

	public void setPass(String pass) {
		Pass = pass;
	}
}