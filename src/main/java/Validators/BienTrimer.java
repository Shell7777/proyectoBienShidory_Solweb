package Validators;

import Clases.*;

public class BienTrimer implements ITrimer {

    private Bien bien;

    public BienTrimer(Bien bien)
    {
        this.bien = bien;
    }

    public Object GetClearData()
    {
        bien.Nombre = bien.Nombre == null ? "" : bien.Nombre.trim();
        bien.Marca = bien.Marca == null ? "" : bien.Marca.trim();
        bien.UnidadMedida = bien.UnidadMedida == null ? "" : bien.UnidadMedida.trim();

        return bien;
    }
}
