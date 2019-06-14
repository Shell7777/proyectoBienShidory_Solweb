package ObjetosViews;
import Clases.*;

public class BienMovObj {

    public Bien Biene;
    public Movimiento Move;

    public int Cantidad;
    public BienMovObj()
    {
        Biene = new Bien();
        Move = new Movimiento();
    }

    public BienMovObj(Bien bien, int cant) 
    {
        Biene = bien;
        Cantidad = cant;
        Move = new Movimiento();
    }
    
    public Bien getBiene() {
		return Biene;
	}

	public void setBiene(Bien biene) {
		Biene = biene;
	}

	public Movimiento getMove() {
		return Move;
	}

	public void setMove(Movimiento move) {
		Move = move;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public Bien GetFreshBien()
    {

        Biene.Nombre = Biene.Nombre == null ? "" : Biene.Nombre.trim();
        Biene.Marca = Biene.Marca == null ? "" : Biene.Marca.trim();
        Biene.UnidadMedida = Biene.UnidadMedida == null ? "" : Biene.UnidadMedida.trim();

        return Biene;
    }

    public Movimiento GetFreshMovimiento()
    {
        Move.Lugar = Move.Lugar == null ? "" : Move.Lugar.trim();

        return Move;
    }    
}
