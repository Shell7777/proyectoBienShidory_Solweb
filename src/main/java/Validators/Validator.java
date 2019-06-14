package Validators;
import Clases.*;
import Services.*;

public abstract class Validator {
    protected ModelStateDictionary model;
    protected IService service;

    public Validator(ModelStateDictionary model, IService service)
    {
        this.model = model;
        this.service = service;
    }

    public Validator(ModelStateDictionary model)
    {
        this.model = model;
    }

    public Validator()
    {

    }

    public abstract void Validate();
}
