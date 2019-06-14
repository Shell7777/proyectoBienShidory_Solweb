package Services;

import java.util.*;
import Clases.*;
import ClassHelper.*;
import ObjetosViews.*;
import Database.*;

public class MovimientoService extends Service, IMovimientoService{

    public MovimientoService(DBEntities db) : base(db)
    {

    }

    public MovimientoService() : base()
    {

    }

    public override void Guardar(object obj)
    {
        db.Movimientos.Add((Movimiento)obj);
        db.SaveChanges();
    }

    public void Guardar(Movimiento mov, int idBien, int idUsuario)
    {
        mov.IdBien = idBien;
        mov.IdUsuario = idUsuario;
        var aux = Date.Now;
        mov.Fecha = new Date(aux.Year, aux.Month, aux.Day,
                            Date.Now.Hour, Date.Now.Minute, Date.Now.Second);
        Guardar(mov);
    }

    public int GetCantidadBien(int idBien)
    {
        return CalcIngresos(idBien) - CalcSalidas(idBien);
    }

    public int CalcIngresos(int idBien)
    {
        int sum = 0;
        var movs = db.Movimientos.Where(o => o.IdBien == idBien && 
                                        o.TipoMovimiento == MovimientoAttrInfo.TipoMovimento.INGRESO).ToList();
        for (int i = 0; i < movs.Count; sum += movs.ElementAt(i).Cantidad, i++) ;

        return sum;
    }

    public int CalcSalidas(int idBien)
    {
        int sum = 0;
        var movs = db.Movimientos.Where(o => o.IdBien == idBien &&
                                        o.TipoMovimiento == MovimientoAttrInfo.TipoMovimento.SALIDA).ToList();

        for (int i = 0; i < movs.Count; sum += movs.ElementAt(i).Cantidad, i++) ;

        return sum;
    }

    public IList<Movimiento> GetMovimientos()
    {
        return db.Movimientos.ToList();
    }

    public Date GetFechaLastEntrada(int idBien)
    {
        var mov = db.Movimientos.Where(o => o.IdBien == idBien &&
                                o.TipoMovimiento == MovimientoAttrInfo.TipoMovimento.INGRESO).
                                    OrderByDescending(o => o.Fecha).FirstOrDefault();

        return mov.Fecha;
    }

    public Date GetFechaLastSalida(int idBien)
    {
        var mov = db.Movimientos.Where(o => o.IdBien == idBien &&
                                o.TipoMovimiento == MovimientoAttrInfo.TipoMovimento.SALIDA)
                                .OrderByDescending(o => o.Fecha).FirstOrDefault();

        return mov == null ? new Date(1000,1,1): mov.Fecha;
    }

    public List<Movimiento> GetMovimientos(int id)
    {
        return db.Movimientos.Where(o => o.IdBien == id)
            .OrderByDescending(o => o.Fecha).ToList();
    }

    public List<Movimiento> GetMovimientos(FiltradoObj objFilt)
    {
        var movs = GetMovimientos(objFilt.IdBien, objFilt.TipoMov);

        movs = GetMovimientosTipoDocumento(movs, objFilt.TipoDocumento);

        var aux = new List<Movimiento>();

        for (int i = 0; i < movs.Count; i++)
            if (Fecha.IsIn(objFilt.FechaInicio, objFilt.FechaFin, movs.ElementAt(i).Fecha))
                aux.Add(movs.ElementAt(i));
        
        return aux;
    }

    public List<Movimiento> GetMovimientosTipoDocumento(List<Movimiento> movs, int tipo)
    {

        if (tipo == MovimientoAttrInfo.TipoDocumento.ACTA)
            movs = movs.Where(o => o.TipoDocumento == MovimientoAttrInfo.TipoDocumento.ACTA).ToList();
        if(tipo == MovimientoAttrInfo.TipoDocumento.PECOSA)
            movs = movs.Where(o => o.TipoDocumento == MovimientoAttrInfo.TipoDocumento.PECOSA).ToList();

        return movs;
    }

    public List<Movimiento> GetMovimientos(int idBien, int tipo)
    {
        var movs = GetMovimientos(idBien);
        if (tipo == MovimientoAttrInfo.TipoMovimento.INGRESO)
            movs = movs.Where(o => o.TipoMovimiento == MovimientoAttrInfo.TipoMovimento.INGRESO).ToList();
        if (tipo == MovimientoAttrInfo.TipoMovimento.SALIDA)
            movs = movs.Where(o => o.TipoMovimiento == MovimientoAttrInfo.TipoMovimento.SALIDA).ToList();

        return movs;
    }

    public void Guardar(Movimiento mov, int idUsuario)
    {
        mov.IdUsuario = idUsuario;
        var aux = Date.Now;
        mov.Fecha = new Date(aux.Year, aux.Month, aux.Day,
                            Date.Now.Hour, Date.Now.Minute, Date.Now.Second);
        Guardar(mov);
    }
}

