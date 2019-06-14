package ObjetosViews;
import Clases.*;

public class BienDataFind {
    public String Nombre;
    public String Codigo;
    public int Cantidad;
    public int IdBien;

    public BienDataFind(String nomb, String cod, int cant, int idBien)
    {
        Nombre = nomb;
        Codigo = cod;
        Cantidad = cant;
        IdBien = idBien;
    }

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public int getIdBien() {
		return IdBien;
	}

	public void setIdBien(int idBien) {
		IdBien = idBien;
	}
}