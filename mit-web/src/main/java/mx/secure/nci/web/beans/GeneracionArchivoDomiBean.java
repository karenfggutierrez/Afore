package mx.secure.nci.web.beans;
import java.util.List;

public class GeneracionArchivoDomiBean {
	private String nombreArchivo;
	private Boolean generated;
	private List<String> errors;
	public String getNombreArchivo() {
		return nombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	public Boolean getGenerated() {
		return generated;
	}
	public void setGenerated(Boolean generated) {
		this.generated = generated;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
}
