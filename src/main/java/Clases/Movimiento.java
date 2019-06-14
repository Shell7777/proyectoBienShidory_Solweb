package Clases;

import java.util.Date;

public class Movimiento {

    public int IdMovimiento;
    public int IdBien;
    public int IdUsuario;

    public int TipoMovimiento;
    public String Lugar;
    public int Cantidad;
    public Date Fecha;

    public Bien Biene;
    public Usuario User;

    public int TipoDocumento;
    public String PersonaLleva;
    
	public Movimiento() {
		
	}

	public Movimiento(int idMovimiento, int idBien, int idUsuario, int tipoMovimiento, String lugar, int cantidad,
			Date fecha, Bien biene, Usuario user, int tipoDocumento, String personaLleva) {
		super();
		IdMovimiento = idMovimiento;
		IdBien = idBien;
		IdUsuario = idUsuario;
		TipoMovimiento = tipoMovimiento;
		Lugar = lugar;
		Cantidad = cantidad;
		Fecha = fecha;
		Biene = biene;
		User = user;
		TipoDocumento = tipoDocumento;
		PersonaLleva = personaLleva;
	}

	public int getIdMovimiento() {
		return IdMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		IdMovimiento = idMovimiento;
	}

	public int getIdBien() {
		return IdBien;
	}

	public void setIdBien(int idBien) {
		IdBien = idBien;
	}

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	public int getTipoMovimiento() {
		return TipoMovimiento;
	}

	public void setTipoMovimiento(int tipoMovimiento) {
		TipoMovimiento = tipoMovimiento;
	}

	public String getLugar() {
		return Lugar;
	}

	public void setLugar(String lugar) {
		Lugar = lugar;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public Bien getBiene() {
		return Biene;
	}

	public void setBiene(Bien biene) {
		Biene = biene;
	}

	public Usuario getUser() {
		return User;
	}

	public void setUser(Usuario user) {
		User = user;
	}

	public int getTipoDocumento() {
		return TipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}

	public String getPersonaLleva() {
		return PersonaLleva;
	}

	public void setPersonaLleva(String personaLleva) {
		PersonaLleva = personaLleva;
	}    
}