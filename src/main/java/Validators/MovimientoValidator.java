package Validators;

import java.util.*;
import Clases.*;
import ClassHelper.*;
import Services.*;

public class MovimientoValidator extends Validator {

    private Movimiento mov;
    private MovimientoService movServ;

    public MovimientoValidator(ModelStateDictionary mode, Movimiento mov, IService service) : base(mode, service)
    {
        this.mov = mov;
        movServ = (MovimientoService)this.service;
    }


    public void Validate()
    {
        ValidarIdBien();
        //ValidarIdUser();
        ValidaCantidad();
        ValidaLugar();
        //ValidaTipoMovimiento();
        ValidaTipoDocumento();
        ValidaPersonaLleva();
        //ValidaFecha();
    }

    private void ValidaPersonaLleva()
    {
        if(mov.TipoMovimiento == MovimientoAttrInfo.TipoMovimento.SALIDA)
        {
            if (String.IsNullOrEmpty(mov.PersonaLleva) || String.IsNullOrWhiteSpace(mov.PersonaLleva))
            {
                model.AddModelError(MovimientoAttrInfo.SoloNames.TIPO_LLEVA, MovimientoAttrInfo.MovimientosErrorMsg.TIPO_LLEVA);
                return;
            }

            if (mov.PersonaLleva.Length > 79)
                model.AddModelError(MovimientoAttrInfo.SoloNames.TIPO_LLEVA, MovimientoAttrInfo.MovimientosErrorMsg.TIPO_LLEVA_MAX_CHAR);

        }

    }

    private void ValidaTipoDocumento()
    {
        if (mov.TipoMovimiento == MovimientoAttrInfo.TipoMovimento.SALIDA)
        {
            switch (mov.TipoDocumento)
            {
                case MovimientoAttrInfo.TipoDocumento.ACTA:
                case MovimientoAttrInfo.TipoDocumento.PECOSA:
                    break;
                default:
                    model.AddModelError(MovimientoAttrInfo.SoloNames.TIPO_DOCUMENTO, MovimientoAttrInfo.MovimientosErrorMsg.TIPO_DOCU);
                    break;
            }
        }
    }

    private void ValidarIdBien()
    {
        if (mov.IdBien == 0)
            model.AddModelError(MovimientoAttrInfo.SoloNames.IDBIEN, MovimientoAttrInfo.MovimientosErrorMsg.ID_BIEN);
    }

    private void ValidaLugar()
    {
        if (String.IsNullOrEmpty(mov.Lugar) || String.IsNullOrWhiteSpace(mov.Lugar))
        {
            model.AddModelError(MovimientoAttrInfo.SoloNames.LUGAR, MovimientoAttrInfo.MovimientosErrorMsg.LUGAR_NULL);
            return;
        }

    }

    private void ValidaCantidad()
    {
        if (mov.Cantidad == 0)
        {
            model.AddModelError(MovimientoAttrInfo.SoloNames.CANTIDAD, MovimientoAttrInfo.MovimientosErrorMsg.CANTIDAD_NEGA);
            return;
        }
        if (mov.Cantidad > 999)
        {
            model.AddModelError(MovimientoAttrInfo.SoloNames.CANTIDAD, MovimientoAttrInfo.MovimientosErrorMsg.CANTIDAD_MAY_INGRESO);
            return;
        }
        if (mov.TipoMovimiento == MovimientoAttrInfo.TipoMovimento.SALIDA && mov.Cantidad > movServ.GetCantidadBien(mov.IdBien))
        {
            model.AddModelError(MovimientoAttrInfo.SoloNames.CANTIDAD, MovimientoAttrInfo.MovimientosErrorMsg.CANTIDAD_MAY);
        }

    }
    /*

    private void ValidaTipoMovimiento()
    {
        switch (mov.TipoMovimiento)
        {
            case AttrNames.Tipo.INGRESO:
            case AttrNames.Tipo.SALIDA:
                break;
            default:
                model.AddModelError(AttrNames.MovimientoClass.TIPO, AttrNames.MovimientoClassMsg.TIPO_MOV);
                break;
        }
    }

    private void ValidarIdUser()
    {
        if (mov.IdUsuario == 0)
            model.AddModelError(AttrNames.MovimientoClass.IDUSER, AttrNames.MovimientoClassMsg.ID_USER);
    }

    private void ValidaFecha()
    {
        if (mov.Fecha.Year == 1)
            model.AddModelError(AttrNames.MovimientoClass.FECHA, AttrNames.MovimientoClassMsg.FECHA_BAD);
    }
}*/
}
