package mx.secure.nci.web.beans;

import java.util.Date;

public class NCI_CIFDataFilter extends NCI_CIFDataBean {
	
	private Date fechaInicio;
	private Date fechaFin;
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

}
