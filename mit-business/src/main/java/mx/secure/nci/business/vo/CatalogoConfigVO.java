package mx.secure.nci.business.vo;

import java.math.BigDecimal;
import java.util.Date;

public class CatalogoConfigVO extends AbstractAuditoriaVO
{
	private Integer idConciliacion;
	private String folio;
	private String cveSolicitud;
	private String noOrden;
	private GenericCatalogoVO origenAportacion;
	private Long numCtaInvdual;
	private Integer noPago;
	private GenericCatalogoVO banco;
	private String ctaBanco;
	private BigDecimal importe;
	private GenericCatalogoVO subctasecure;
	private Date fechaCargaArchivo;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String curp;
	private String rfc;
	private String nss;
	private String correo;
	private Long celular;
	private GenericCatalogoVO empresa;
	private GenericCatalogoVO tipoNomina;
	private Integer noEmpleado;
	private Date fechaPagosecure;
	private Date fechaValorsecure;
	private String folioTransaccion;
	private String folioProcesar;
	private GenericCatalogoVO claveRedComercial;
	private Long idSucursal;
	private Short tipoAportacion;
	private Short regAcreditado;
	private Long identificadorMov;
	
	public Integer getIdConciliacion() {
		return idConciliacion;
	}
	
	public void setIdConciliacion(Integer idConciliacion) {
		this.idConciliacion = idConciliacion;
	}
	
	public String getFolio() {
		return folio;
	}
	
	public void setFolio(String folio) {
		this.folio = folio;
	}

	public String getCveSolicitud() {
		return cveSolicitud;
	}

	public void setCveSolicitud(String cveSolicitud) {
		this.cveSolicitud = cveSolicitud;
	}

	public String getNoOrden() {
		return noOrden;
	}

	public void setNoOrden(String noOrden) {
		this.noOrden = noOrden;
	}

	public GenericCatalogoVO getOrigenAportacion() {
		return origenAportacion;
	}

	public void setOrigenAportacion(GenericCatalogoVO origenAportacion) {
		this.origenAportacion = origenAportacion;
	}

	public Long getNumCtaInvdual() {
		return numCtaInvdual;
	}

	public void setNumCtaInvdual(Long numCtaInvdual) {
		this.numCtaInvdual = numCtaInvdual;
	}

	public Integer getNoPago() {
		return noPago;
	}

	public void setNoPago(Integer noPago) {
		this.noPago = noPago;
	}

	public GenericCatalogoVO getBanco() {
		return banco;
	}

	public void setBanco(GenericCatalogoVO banco) {
		this.banco = banco;
	}

	public String getCtaBanco() {
		return ctaBanco;
	}

	public void setCtaBanco(String ctaBanco) {
		this.ctaBanco = ctaBanco;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public GenericCatalogoVO getSubctasecure() {
		return subctasecure;
	}

	public void setSubctasecure(GenericCatalogoVO subctasecure) {
		this.subctasecure = subctasecure;
	}

	public Date getFechaCargaArchivo() {
		return fechaCargaArchivo;
	}

	public void setFechaCargaArchivo(Date fechaCargaArchivo) {
		this.fechaCargaArchivo = fechaCargaArchivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public Long getCelular() {
		return celular;
	}
	
	public void setCelular(Long celular) {
		this.celular = celular;
	}
	
	public GenericCatalogoVO getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(GenericCatalogoVO empresa) {
		this.empresa = empresa;
	}
	
	public GenericCatalogoVO getTipoNomina() {
		return tipoNomina;
	}
	
	public void setTipoNomina(GenericCatalogoVO tipoNomina) {
		this.tipoNomina = tipoNomina;
	}
	
	public Integer getNoEmpleado() {
		return noEmpleado;
	}

	public void setNoEmpleado(Integer noEmpleado) {
		this.noEmpleado = noEmpleado;
	}

	public Date getFechaPagosecure() {
		return fechaPagosecure;
	}

	public void setFechaPagosecure(Date fechaPagosecure) {
		this.fechaPagosecure = fechaPagosecure;
	}

	public Date getFechaValorsecure() {
		return fechaValorsecure;
	}

	public void setFechaValorsecure(Date fechaValorsecure) {
		this.fechaValorsecure = fechaValorsecure;
	}

	public String getFolioTransaccion() {
		return folioTransaccion;
	}

	public void setFolioTransaccion(String folioTransaccion) {
		this.folioTransaccion = folioTransaccion;
	}

	public String getFolioProcesar() {
		return folioProcesar;
	}

	public void setFolioProcesar(String folioProcesar) {
		this.folioProcesar = folioProcesar;
	}

	public GenericCatalogoVO getClaveRedComercial() {
		return claveRedComercial;
	}

	public void setClaveRedComercial(GenericCatalogoVO claveRedComercial) {
		this.claveRedComercial = claveRedComercial;
	}

	public Long getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Long idSucursal) {
		this.idSucursal = idSucursal;
	}

	public Short getTipoAportacion() {
		return tipoAportacion;
	}

	public void setTipoAportacion(Short tipoAportacion) {
		this.tipoAportacion = tipoAportacion;
	}
	
	public Short getRegAcreditado() {
		return regAcreditado;
	}
	
	public void setRegAcreditado(Short regAcreditado) {
		this.regAcreditado = regAcreditado;
	}
	
	public Long getIdentificadorMov() {
		return identificadorMov;
	}
	
	public void setIdentificadorMov(Long identificadorMov) {
		this.identificadorMov = identificadorMov;
	}
	
	@Override
	public String toString() {
		return "PrincipalVO [idConciliacion=" + idConciliacion + ", folio=" + folio + ", cveSolicitud=" + cveSolicitud
				+ ", noOrden=" + noOrden + ", origenAportacion=" + origenAportacion + ", numCtaInvdual=" + numCtaInvdual
				+ ", noPago=" + noPago + ", banco=" + banco + ", ctaBanco=" + ctaBanco + ", importe=" + importe
				+ ", subctasecure=" + subctasecure + ", fechaCargaArchivo=" + fechaCargaArchivo + ", nombre="
				+ nombre + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno + ", curp=" + curp + ", rfc=" + rfc
				+ ", nss=" + nss + ", correo=" + correo + ", celular=" + celular + ", empresa=" + empresa
				+ ", tipoNomina=" + tipoNomina + ", noEmpleado=" + noEmpleado + ", fechaPagosecure="
				+ fechaPagosecure + ", fechaValorsecure=" + fechaValorsecure + ", folioTransaccion=" + folioTransaccion
				+ ", folioProcesar=" + folioProcesar + ", claveRedComercial=" + claveRedComercial + ", idSucursal="
				+ idSucursal + ", tipoAportacion=" + tipoAportacion + ", regAcreditado=" + regAcreditado
				+ ", identificadorMov=" + identificadorMov + "]";
	}		
}