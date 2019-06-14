package Validators;

import java.util.*;
import Clases.*;
import ClassHelper.*;
import Services.*;

public class UserValidator extends Validator{

    private Usuario user;
    private UsuarioService userServ;

    public UserValidator(ModelStateDictionary model, IService service, Usuario user) : base(model, service)
    {
        this.user = user;
        userServ = (UsuarioService)service;
    }


    public void Validate()
    {       
        if (String.IsNullOrEmpty(this.user.User) || String.IsNullOrWhiteSpace(this.user.User))
        {
            model.AddModelError(UserAttrInfo.SoloNames.USER, UserAttrInfo.UserErrorMsg.USER_NULL);
            return;
        }

        var userdb = userServ.GetAllUsers().Where(o => o.User == this.user.User &&
                                                o.Pass == this.user.Pass).FirstOrDefault();

        if (userdb == null)
            model.AddModelError(UserAttrInfo.SoloNames.GENERAL_, UserAttrInfo.UserErrorMsg.GENERAL);
        
    }
}

