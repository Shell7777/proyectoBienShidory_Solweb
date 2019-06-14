package Validators;

import java.util.*;
import ClassHelper.*;
import Clases.*;
import Services.*;

public class BienValidator extends Validator {

    private Bien bien;
    private BienService serv;
   
    public BienValidator(ModelStateDictionary model, IService service, Bien bien) : base(model, service)
    {
        this.bien = bien;
        serv = (BienService)service;
    }

    public void Validate()
    {
        //ValidaCode();
        //ValidaMarca();
        ValidaNombre();
        //ValidaUnidadMedida();
        ValidaTipoBien();
     
    }

    private void ValidaTipoBien()
    {
        switch (bien.Tipo)
        {
            case BienAttrInfo.TipoBienValues.HERRAMIENTAS:
            case BienAttrInfo.TipoBienValues.MATERIAL_CONSTRUCCION:
            case BienAttrInfo.TipoBienValues.CALZADO:
            case BienAttrInfo.TipoBienValues.ELEMENTOS_COCINA:
            case BienAttrInfo.TipoBienValues.OTRO:
                break;
            default:
                model.AddModelError(BienAttrInfo.SoloNames.TIPO, BienAttrInfo.BienErrorMsg.TIPO_BIEN);
                break;
        }
    }

    private void ValidaNombre()
    {

        if (String.IsNullOrEmpty(bien.Nombre) || String.IsNullOrWhiteSpace(bien.Nombre))
        {
            model.AddModelError(BienAttrInfo.SoloNames.NOMBRE, BienAttrInfo.BienErrorMsg.NOMBRE_NULL);
            return;
        }
        if (bien.Nombre.length() < 3 || bien.Nombre.length() > 70)
            model.AddModelError(BienAttrInfo.SoloNames.NOMBRE, BienAttrInfo.BienErrorMsg.NOMBRE_MENOR_CHARS);

    }


    /*
    private void ValidaUnidadMedida()
    {

        if (String.IsNullOrEmpty(bien.UnidadMedida) || String.IsNullOrWhiteSpace(bien.UnidadMedida))
        {
            model.AddModelError(AttrNames.BienClass.UNIDAD_MEDIDA, AttrNames.BienMsg.UNIDAD_MEDIDA);
            return;
        }
    }
    private void ValidaMarca()
    {
        if (String.IsNullOrEmpty(bien.Marca) || String.IsNullOrWhiteSpace(bien.Marca))
        {
            model.AddModelError(AttrNames.BienClass.MARCA, AttrNames.BienMsg.MARCA_NULL);
            return;
        }
    }

    private void ValidaCode()
    {
        if (String.IsNullOrEmpty(bien.Codigo) || String.IsNullOrWhiteSpace(bien.Codigo))
        {
            model.AddModelError(AttrNames.BienClass.CODIGO, AttrNames.BienMsg.CODIGO);
            return;
        }
        if(bien.Codigo.Length > 4)
        {
            model.AddModelError(AttrNames.BienClass.CODIGO, AttrNames.BienMsg.CODIGO_MASCH);
            return;
        }
        if (serv.YaExisteCodigo(bien.Codigo))
            model.AddModelError(AttrNames.BienClass.CODIGO, AttrNames.BienMsg.CODIGO_IGUAL);
    }*/
}