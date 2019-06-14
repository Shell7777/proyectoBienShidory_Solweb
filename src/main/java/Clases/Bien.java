package Clases;

import java.util.Collection;

public class Bien {

    public int IdBien;
    public String Nombre;
    public String Marca;
    public String Codigo;
    public String UnidadMedida;
    public int Tipo; 

    public Collection<Movimiento> Movimientos;

	public Bien() {
		super();
	}

	public Bien(int idBien, String nombre, String marca, String codigo, String unidadMedida, int tipo) {
		super();
		IdBien = idBien;
		Nombre = nombre;
		Marca = marca;
		Codigo = codigo;
		UnidadMedida = unidadMedida;
		Tipo = tipo;
	}

	public int getIdBien() {
		return IdBien;
	}

	public void setIdBien(int idBien) {
		IdBien = idBien;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getUnidadMedida() {
		return UnidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		UnidadMedida = unidadMedida;
	}

	public int getTipo() {
		return Tipo;
	}

	public void setTipo(int tipo) {
		Tipo = tipo;
	}

	public Collection<Movimiento> getMovimientos() {
		return Movimientos;
	}

	public void setMovimientos(Collection<Movimiento> movimientos) {
		Movimientos = movimientos;
	}    
}