package Services;

import java.util.*;
import Clases.*;
import ObjetosViews.*;

public interface IMovimientoService extends IService {
    void Guardar(Movimiento mov, int idBien, int idUsuario);
    void Guardar(Movimiento mov, int idUsuario);
    int GetCantidadBien(int idBien);
    int CalcIngresos(int idBien);
    int CalcSalidas(int idBien);
    List<Movimiento> GetMovimientos();
    Date GetFechaLastEntrada(int idBien);
    Date GetFechaLastSalida(int idBien);
    List<Movimiento> GetMovimientos(int id);
    List<Movimiento> GetMovimientos(FiltradoObj objFilt);
    List<Movimiento> GetMovimientos(int idBien, int tipo);
}
