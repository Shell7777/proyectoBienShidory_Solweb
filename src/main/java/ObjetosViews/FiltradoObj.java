package ObjetosViews;

import java.util.*;

public class FiltradoObj {

    public int IdBien;
    public int TipoMov;
    public int TipoDocumento;
    public Date FechaInicio;
    public Date FechaFin;
    public int Pagina;

    public FiltradoObj()
    {

    }
    
    public int getIdBien() {
		return IdBien;
	}

	public void setIdBien(int idBien) {
		IdBien = idBien;
	}

	public int getTipoMov() {
		return TipoMov;
	}

	public void setTipoMov(int tipoMov) {
		TipoMov = tipoMov;
	}

	public int getTipoDocumento() {
		return TipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}

	public Date getFechaInicio() {
		return FechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		FechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return FechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		FechaFin = fechaFin;
	}

	public int getPagina() {
		return Pagina;
	}

	public void setPagina(int pagina) {
		Pagina = pagina;
	}

	public FiltradoObj(int idBien, int tipoMov, int tipoDoc)
    {
        IdBien = idBien;
        TipoMov = tipoMov;
        TipoDocumento = tipoDoc;

        FechaInicio = DateTime.Now;
        FechaFin = DateTime.Now;

        Pagina = 1;
    }
}