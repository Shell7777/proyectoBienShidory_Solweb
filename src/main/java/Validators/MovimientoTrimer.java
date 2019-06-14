package Validators;

import java.util.*;
import Clases.*;
import ClassHelper.*;
import Services.*;

public class MovimientoTrimer {

    private Movimiento mov;

    public MovimientoTrimer(Movimiento mov)
    {
        this.mov = mov;
    }

    public Object GetClearData()
    {
        switch (mov.TipoMovimiento)
        {
            case MovimientoAttrInfo.TipoMovimento.INGRESO:
                {
                    mov.Lugar = mov.Lugar == null ? "" : mov.Lugar.trim();
                    return mov;
                }
            case MovimientoAttrInfo.TipoMovimento.SALIDA:
                {
                    mov.Lugar = mov.Lugar == null ? "" : mov.Lugar.trim();
                    mov.PersonaLleva = mov.PersonaLleva == null ? "" : mov.PersonaLleva.trim();
                    return mov;
                }
            default:
                return mov;
        }
    }
}