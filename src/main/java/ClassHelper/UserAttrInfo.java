package ClassHelper;

public class UserAttrInfo {

    public struct SoloNames
    {
        public const String ID_USER = "IdUsuario";
        public const String GENERAL_ = "General";
        public const String USER = "User";
        public const String PASS = "Pass";
    }

    public struct UserObjNames
    {
        public const String ID_USER = "user.IdUsuario";
        public const String GENERAL_ = "user.General";
        public const String USER = "user.User";
        public const String PASS = "user.Pass";
    }

    public struct UserErrorMsg
    {
        public const String USER_NULL = "El campo de user esta vacío!";
        public const String GENERAL = "Al parecer no existe el usuario y/o contraseña ingresados!";
    }
}
