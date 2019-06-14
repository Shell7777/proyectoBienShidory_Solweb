package ClassHelper;

import java.sql.Struct;

public class ContrVwName {
    public Struct FormAttr
    {
        public const String GET = "get";
        public const String POST = "post";
    }

    public Struct LoginVws
    {
        public const String CERRAR_SESION = "/Login/CerrarSesion";
        public const String FORM_INICIAR_SESION_POST = "/Login/InicioSesion";
    }

    public Struct SharedViews
    {
        public const String GEN_LAYOUT_FP = "~/Views/Shared/_Layout.cshtml";
        public const String GEN_LAYOUT_NA = "_Layout";
        public const String BUSCAR_BIEN_PARTIAL = "~/Views/Shared/BuscarBienPartial.cshtml";
        public const String MODAL_LAYOUT = "~/Views/Shared/ModalLayout.cshtml";
        public const String ERROR_NAME_VIEW = "Error";

    }

    public Struct BienViews
    {
        public const String INGRE_BIEN_NR_CP = "/Bien/IngresarBienNoRegistrado";
        public const String INGRE_BIEN_R_CP = "/Bien/IngresarBienRegistrado";
        public const String BIEN_INDEX_CP = "/Bien/Index";
        public const String FORM_FILTRADO_MOV = "/Bien/GetMovimientosBien";
        public const String DATA_MOVI_BIEN = "~/Views/Bien/DataMovimientoBien.cshtml";
        public const String DATA_MOVI_BIEN_NAME = "DataMovimientoBien";

    }
    public Struct MovViews
    {
        public const String FORM_INGRESO_AJAX = "/Movimiento/FormMovimientoRegis";
        public const String FORM_INGRESO_MODAL_AJAX = "/Movimiento/ModalIngresarBienes";
        public const String FORM_RETIRAR_MODAL_AJAX = "/Movimiento/ModalRetirarBienes";
        public const String FORM_RETIRAR_AJAX = "/Movimiento/FormMovimientoRetirar";
        public const String RETIRAR_BIEN_VW_FP = "/Movimiento/RetirarBien";
      
    }
}
