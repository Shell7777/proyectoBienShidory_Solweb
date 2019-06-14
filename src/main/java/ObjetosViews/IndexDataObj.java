package ObjetosViews;

import java.util.*;

import Clases.*;
import ClassHelper.*;
import Services.*;

public class IndexDataObj {

    private List<Bien> bienes;
    //private List<Movimiento> movs;
    private BienService bnServ;

    private MovimientoService movServ;

    public IndexDataObj(IService movServ, IService bnServ)
    {
        this.movServ = (MovimientoService)movServ;
        this.bnServ = (BienService)bnServ;

        bienes = (List<Bien>)this.bnServ.GetBienes();
        //movs = (List<Movimiento>)this.movServ.GetMovimientos();
    }

    public List<Bien> GetBienes()
    {
        return bienes;
    }

    public int getCantidadActualBien(int idBien)
    {
        return movServ.GetCantidadBien(idBien);
    }

    public string getLastEntrada(int idBien)
    {

        return movServ.GetFechaLastEntrada(idBien).ToString();
    }

    public string getLastSalida(int idBien)
    {
        var fecha = movServ.GetFechaLastSalida(idBien);
        return  fecha.Year == 1000 ? "No hay salidas, aún" : fecha.ToString();
    }
}

