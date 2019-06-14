package Validators;

public class ModelDataTrimer {

    private ITrimer objTrimer;

    public ModelDataTrimer(ITrimer trimer)
    {
        objTrimer = trimer;
    }

    public Object GetDataClean()
    {
        return objTrimer.GetClearData();
    }
}