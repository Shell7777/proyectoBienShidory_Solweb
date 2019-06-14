package ClassHelper;

import java.util.*;

public class Fecha {

    public struct Constantes
    {
        public const int DIA = 1;
        public const int MES = 2;
        public const int ANIO = 3;
    }
    public static Date GetFechaHora()
    {
        String fecha = Date.Today.ToString().SubString(0, 10);
        String hora = (Date.Now.Hour < 10 ? "0" + Date.Now.Hour.ToString() : Date.Now.Hour.ToString()) + ":" +
            Date.Now.Minute.ToString();
        String date = fecha + " " + hora;
        Date aux;
        Date sal = Date.Today;
        return Date.TryParse(date, out aux) ? aux : sal;
    }

    public static String GetFechaInputs()
    {
        return Date.Today.Year + "-" + (Date.Today.Month > 9 ? Date.Today.Month.ToString() : ("0" + Date.Today.Month)) + "-" +
            (Date.Today.Day > 9 ? (Date.Today.Day.ToString()) : ("0" + Date.Today.Day));
    }

    public static String GetFechaInputs(Date fecha)
    {
        return fecha.Year + "-" + (fecha.Month > 9 ? fecha.Month.ToString() : ("0" + fecha.Month)) + "-" +
             (fecha.Day > 9 ? (fecha.Day.ToString()) : ("0" + fecha.Day));
    }

    public static String GetHoraInputs()
    {
        String hour = Date.Now.Hour < 10 ? ("0" + Date.Now.Hour.ToString()) : (Date.Now.Hour.ToString());
        String mins = Date.Now.Minute > 9 ? Date.Now.Minute.ToString() : ("0" + Date.Now.Minute.ToString());
        return hour + ":" + mins;
    }

    public static Date GetActualDate()
    {
        return Date.Today.Date;
    }

    public static String GerRepresMonth(int mont)
    {
        switch (mont)
        {
            case 1:
                {
                    return "Enero";
                }
            case 2:
                {
                    return "Febrero";
                }
            case 3:
                {
                    return "Marzo";
                }
            case 4:
                {
                    return "Abril";
                }
            case 5:
                {
                    return "Mayo";
                }
            case 6:
                {
                    return "Junio";
                }
            case 7:
                {
                    return "Julio";
                }
            case 8:
                {
                    return "Agosto";
                }
            case 9:
                {
                    return "Setiembre";
                }
            case 10:
                {
                    return "Octubre";
                }
            case 11:
                {
                    return "Noviembre";
                }
            case 12:
                {
                    return "Diciembre";
                }
            default: return "";
        }
    }


    public static Boolean IsIn(Date starDate, Date endDate, Date checkDate)
    {
        starDate = Date.Parse(starDate.ToString().SubString(0, 10));
        endDate = Date.Parse(endDate.ToString().SubString(0, 10));
        checkDate = Date.Parse(checkDate.ToString().SubString(0, 10));

        if (
            (Date.Compare(checkDate, starDate) == 0 || Date.Compare(checkDate, starDate) > 0) &&
            (Date.Compare(checkDate, endDate) == 0 || Date.Compare(checkDate, endDate) < 0)
            )
            return true;
        else
            return false;
    }
}