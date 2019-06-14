package Auth;

public interface IAutenticacion {

    void Login(String correo, Boolean persistente);
    void Login(String correo);
    void LogOut();
}