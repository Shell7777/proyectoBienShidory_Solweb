package Services;
import java.util.*;

import Clases.*;

public class UsuarioService extends Service, IUsuarioService{

    public override void Guardar(object obj)
    {
        throw new NotImplementedException();
    }

    public List<Usuario> GetAllUsers()
    {
        return db.Usuarios.ToList();
    }

    public Usuario GetUser(Usuario user)
    {
        return db.Usuarios.Where(o => o.User == user.User && user.Pass == user.Pass).FirstOrDefault();
    }
}