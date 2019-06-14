package Services;
import Database.*;

public class Service extends IService  {
    protected DBEntities db;
    protected IService service;

    public Service()
    {
        db = new DBEntities();

    }
    public Service(DBEntities db)
    {
        this.db = db;
    }

    public DBEntities GetDBEntities()
    {
        return db;
    }

    public abstract void Guardar(object obj);
}