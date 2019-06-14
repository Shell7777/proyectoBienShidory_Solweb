package Validators;

import ObjetosViews.*;
public class FiltradoObjTrimer implements ITrimer {
    private FiltradoObj obj;

    public FiltradoObjTrimer(FiltradoObj obj)
    {
        this.obj = obj;
    }

    public Object GetClearData()
    {
        if (obj.FechaInicio != null)
            obj.FechaInicio = obj.FechaInicio.Year == 1 ? Date.Now : obj.FechaInicio;
        else
            obj.FechaInicio = Date.Now;

        if (obj.FechaFin != null)
            obj.FechaFin = obj.FechaFin.Year == 1 ? Date.Now : obj.FechaFin;
        else
            obj.FechaFin = Date.Now;

        return obj;
    }
}

