package Services;
import Database.*;

public interface IService {
	
    DBEntities GetDBEntities();
    void Guardar(object obj);
}