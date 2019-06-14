package Services;

import java.util.*;
import Clases.*;

public interface IUsuarioService extends IService {

    List<Usuario> GetAllUsers();
    Usuario GetUser(Usuario user);
}