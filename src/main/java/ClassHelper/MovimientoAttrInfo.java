package ClassHelper;

public class MovimientoAttrInfo {

    public struct SoloNames
    {
        public const String IDBIEN = "IdBien";
        public const String IDUSER = "IdUsuario";
        public const String TIPO_MOVIMIENTO = "TipoMovimiento";
        public const String LUGAR = "Lugar";
        public const String CANTIDAD = "Cantidad";
        public const String FECHA = "Fecha";
        public const String TIPO_DOCUMENTO = "TipoDocumento";
        public const String TIPO_LLEVA = "PersonaLleva";
    }

    public struct MoveObjNames
    {
        public const String IDBIEN = "Move.IdBien";
        public const String IDUSER = "Move.IdUsuario";
        public const String TIPO = "Move.TipoMovimiento";
        public const String LUGAR = "Move.Lugar";
        public const String CANTIDAD = "Move.Cantidad";
        public const String FECHA = "Move.Fecha";
        public const String TIPO_DOCUMENTO = "Move.TipoDocumento";
        public const String TIPO_LLEVA = "Move.PersonaLleva";
    }

    public struct MovimientosErrorMsg
    {
        public const String CANTIDAD_MAY = "No se puede extraer ya que la cantidad es mayor de lo que hay!";
        public const String CANTIDAD_MAY_INGRESO = "No se puede ingresar mucho!";
        public const String CANTIDAD_NEGA = "La cantidad no puede ser negativa o igual a 0!";
        public const String FECHA_BAD = "El formáto de fecha es incorrecto!";
        public const String LUGAR_NULL = "El lugar es obligatorio!";
        public const String ID_BIEN = "Al parecer no hay bien :( !";
        public const String ID_USER = "Al parecer no hay persona que use el soft!";
        public const String TIPO_MOV = "Pare de parecerse hacker que luce ridiculo!";
        public const String TIPO_DOCU = "Tipo de documento inválido!";
        public const String TIPO_LLEVA = "Quien se lo lleva es obligatorio!";
        public const String TIPO_LLEVA_MAX_CHAR = "Se aceptan solo máximo 80 caracteres!";
    }

    public struct LugarValuesAndNames
    {
        public const String MUNICIPALIDAD_ = "Municipalidad";
        public const String GOBIERNO_REGIONAL = "Gobierno Regional";
        public const String OTROS = "Otro";
    }

    public struct TipoMovimento
    {
        public const int INGRESO = 0;
        public const int SALIDA = 1;
        public const int NONE = 2;
    }

    public struct TipoDocumento
    {
        public const int NONE = 0;
        public const int ACTA = 1;
        public const int PECOSA = 2;
    }


    public static String GetRepresentacionTipoMovimiento(int tipoMov)
    {
        switch (tipoMov)
        {
            case TipoMovimento.INGRESO:
                return "Ingreso";
            case TipoMovimento.SALIDA:
                return "Salida";
            case TipoMovimento.NONE:
                return "Ninguno";
            default:
                return "";
        }
    }
    public static String GetRepresentacionTipoDocumento(int tipoDocumento)
    {
        switch (tipoDocumento)
        {
            case TipoDocumento.NONE:
                return "Ninguno";
            case TipoDocumento.ACTA:
                return "Acta";
            case TipoDocumento.PECOSA:
                return "Pecosa";
            default:
                return "";
        }
    }
}