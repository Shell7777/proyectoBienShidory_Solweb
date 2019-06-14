package Validators;

import java.util.*;
import Clases.*;
import ClassHelper.*;
import Services.*;

public class FiltradoObjValidator extends Validator {

    private FiltradoObj obj;
    private BienService serv;
    public FiltradoObjValidator(ModelStateDictionary model, IService service, FiltradoObj obj) : base(model, service)
    {
        this.obj = obj;
        serv = (BienService)service;
    }


    public void Validate()
    {
        ValidarIdBien();
        ValidarPagina();
    }

    private void ValidarIdBien()
    {
        if (obj.IdBien == 0)
        {
            model.AddModelError(FiltradoObjAttrInfo.SoloNames.ID_BIEN, FiltradoObjAttrInfo.ErrorMsg.ID_BIEN_CERO);
            return;
        }

        var bien = serv.FindBien(obj.IdBien);
        if(bien == null)
            model.AddModelError(FiltradoObjAttrInfo.SoloNames.ID_BIEN, FiltradoObjAttrInfo.ErrorMsg.ID_BIEN_NO_EXISTE);

    }

    private void ValidarPagina()
    {
        if(obj.Pagina == 0 || obj.Pagina < 0)
            model.AddModelError(FiltradoObjAttrInfo.SoloNames.PAGINA, FiltradoObjAttrInfo.ErrorMsg.PAGINA_INCORRECTA);
    }
}