package ClassHelper;

import java.sql.Struct;
import Clases.*;
import java.io.*;

public class BienAttrInfo {

    public Struct SoloNames
    {
        public const String ID_BIEN = "IdBien";
        public const String NOMBRE = "Nombre";
        public const String MARCA = "Marca";
        public const String CODIGO = "Codigo";
        public const String UNIDAD_MEDIDA = "UnidadMedida";
        public const String TIPO = "Tipo";
    }

    public Struct BieneObjNames
    {
        public const String ID_BIEN = "Biene.IdBien";
        public const String NOMBRE = "Biene.Nombre";
        public const String MARCA = "Biene.Marca";
        public const String CODIGO = "Biene.Codigo";
        public const String UNIDAD_MEDIDA = "Biene.UnidadMedida";
        public const String TIPO = "Biene.Tipo";
    }

    public struct BienErrorMsg
    {
        public const String NOMBRE_NULL = "El nombre es obligatorio!";
        public const String NOMBRE_MENOR_CHARS = "El debe tener más de 3 caracteres y ser menor que 80!";
        public const String NOMBRE_ESPE = "El nombre no debe contener caracteres especiales!";
        public const String CODIGO = "El código del producto no debe ser nulo!";
        public const String CODIGO_MASCH = "El código del producto debe tener 4 caracteres!";
        public const String CODIGO_IGUAL = "Este código ya esta registrado!";
        public const String UNIDAD_MEDIDA = "La unidad de medida es obligatoria!";
        public const String MARCA_NULL = "La marca es obligatoria!";
        public const String TIPO_BIEN = "El valor del tipo de bien es incorrecto!";
    }


    public Struct TipoBienValues
    {
        public const int HERRAMIENTAS = 0;
        public const int MATERIAL_CONSTRUCCION = 1;
        public const int CALZADO = 2;
        public const int ELEMENTOS_COCINA = 3;
        public const int OTRO = 4;
    }
    
    public Struct TipoBienNames
    {
        public const String HERRAMIENTAS = "Herramientas";
        public const String MATERIAL_CONSTRUCCION = "Material de construcción";
        public const String CALZADO = "Calzado";
        public const String ELEMENTOS_COCINA = "Elementos de cocina";
        public const String OTRO = "Otros";
    }

    public static String GetRepresentacionValue(int value)
    {
        switch (value)
        {
            case TipoBienValues.HERRAMIENTAS:
                return TipoBienNames.HERRAMIENTAS;
            case TipoBienValues.MATERIAL_CONSTRUCCION:
                return TipoBienNames.MATERIAL_CONSTRUCCION;
            case TipoBienValues.CALZADO:
                return TipoBienNames.CALZADO;
            case TipoBienValues.ELEMENTOS_COCINA:
                return TipoBienNames.ELEMENTOS_COCINA;
            case TipoBienValues.OTRO:
                return TipoBienNames.OTRO;
            default: return "";
        }
    }
}