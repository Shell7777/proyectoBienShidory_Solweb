package Auth;

public class Autenticador {
	public Autenticador()
    {

    }
    public void Login(String correo, Boolean persistente)
    {
        FormsAuthentication.SetAuthCookie(correo, persistente);
    }

    public void Login(String correo)
    {
        FormsAuthentication.SetAuthCookie(correo, false);
    }

    public void LogOut()
    {
        FormsAuthentication.SignOut();
    }
}