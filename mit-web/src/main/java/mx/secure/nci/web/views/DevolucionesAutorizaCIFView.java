package mx.secure.nci.web.views;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

import org.primefaces.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.secure.nci.business.exception.ErrorCodeService;
import mx.secure.nci.business.exception.GenerateExceptionDetails;
import mx.secure.nci.business.exception.MitBusinessException;
import mx.secure.nci.business.util.Constantes;
import mx.secure.nci.business.vo.ReporteVO;
import mx.secure.nci.business.vo.cif.DevolucionesCabeceraCifVO;
import mx.secure.nci.business.vo.cif.DevolucionesDetalleCifVO;
import mx.secure.nci.business.vo.cif.DevolucionesEnvioCifCabeceraVO;
import mx.secure.nci.business.vo.cif.DevolucionesEnvioCifDetalleVO;
import mx.secure.nci.business.vo.cif.DevolucionesReporteCDCifVO;
import mx.secure.nci.web.beans.DevolucionesCIFParamBean;
import mx.secure.nci.web.service.IMovimientosCifWebService;

@ManagedBean(name = "devolucionesAutorizaCifView")
@ViewScoped
public class DevolucionesAutorizaCIFView implements Serializable{

	private static final long serialVersionUID = 2362129345693514200L;
	private static final Logger LOGGER = LoggerFactory.getLogger(DevolucionesAutorizaCIFView.class);
	private static final String XLS_MIME_TYPE= "application/xls";
	
	private DevolucionesCIFParamBean paramDevBean;
	
	@ManagedProperty(value="#{movimientosCifService}")
	IMovimientosCifWebService movimientosCifService;
	
	@PostConstruct
	public void init() {
		LOGGER.info("::::::::::FOP::::::Inicializando::::::");
		paramDevBean = new DevolucionesCIFParamBean();
		paramDevBean.setFechaInicio(new Date());
		paramDevBean.setFechaFin(new Date());
		
	}
	
	public void selectMov() {
		FacesContext context = FacesContext.getCurrentInstance();
		Map<String, String> map = context.getExternalContext().getRequestParameterMap();
		String idItem = (String) map.get("idItem");
		paramDevBean.setMovDetalle(this.getItemData(idItem));
		paramDevBean.setMovCabecera(movimientosCifService.getListaEnvioCIFCabecera(idItem));
		RequestContext.getCurrentInstance().update("formDetallesCargosCIFDev");
		RequestContext.getCurrentInstance().execute("PF('dialogDetallesCargosCIFDev').show()");
	}
	
	public void buscarXcriterio(){
		LOGGER.info("::::::::::FOP::::::buscarXcriterio::::::" + paramDevBean.getIdConciliacion());
		List<DevolucionesEnvioCifDetalleVO> ltsDev = null;
		if(paramDevBean.getIdConciliacion() > 0) {
			paramDevBean.setMsgMsg("No se identificaron registros con el folio capturado.");
			ltsDev = movimientosCifService.getListaEnvioCIFDetalle(String.valueOf(paramDevBean.getIdConciliacion()));
		}else {
			paramDevBean.setMsgMsg("No se identificaron registros con el rango de fechas seleccionado.");
			ltsDev = movimientosCifService.getListaEnvioCIFDetalle(paramDevBean.getFechaInicio(), paramDevBean.getFechaFin());
		}
		if(ltsDev.isEmpty()) {
			RequestContext.getCurrentInstance().update("idDialogIdentificadorCiError");
			RequestContext.getCurrentInstance().execute("PF('dialogIdentificadorCiError').show()");
		} else {
			paramDevBean.setResultados(ltsDev);
			RequestContext.getCurrentInstance().update("formResultadosCargosCIFDev");
		}
		
	}	
	
	public void getReportPrev() {
		try {
			List<DevolucionesReporteCDCifVO> reportePrev = this.setLtsByReporte();
			ReporteVO reporteVoPrev = movimientosCifService.generaReportePrevDev(reportePrev);
			responseReport(reporteVoPrev.getArchivo(),reporteVoPrev.getNombre(),XLS_MIME_TYPE);
		} catch (Exception e) {
			paramDevBean.setMsgMsg(e.getMessage());
			LOGGER.error(e.getMessage(),e);
			RequestContext.getCurrentInstance().update("idDialogIdentificadorCiError");
			RequestContext.getCurrentInstance().execute("PF('dialogIdentificadorCiError').show()");
		}

	}	
	
	public void send2CIF() {
		String rgs = "";
		for(DevolucionesEnvioCifDetalleVO bean: paramDevBean.getCuentasAenviar()) {
			String usu = FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
			bean.setUsuActualizacion(usu);
			bean.setFtcSelecc(Constantes.ESTATUS_AUTORIZADO);
			bean.setUsoAutorizo(usu);
			if(movimientosCifService.actualizaDevolCif(bean) == 0){
				rgs = rgs + " | Sin cambio de estatus " + bean.getItemDevolucion() + ", ";
			}
		}
		
		if(!"".equals(rgs)) {
			rgs = rgs.trim();
			paramDevBean.setMsgMsg("No se pudieron enviar los siguientes folios: " + rgs.substring(0, rgs.length()-1) + ".");			
		}else {
			paramDevBean.setMsgMsg("Se completo la Autorización del envio al CIF.");
		}
		this.recarga();
		RequestContext.getCurrentInstance().execute("PF('cargandoDialog').hide();");
		RequestContext.getCurrentInstance().update("idDialogIdentificadorCiError");
		RequestContext.getCurrentInstance().execute("PF('dialogIdentificadorCiError').show()");
		
	}
	
	private void recarga() {
		List<DevolucionesEnvioCifDetalleVO> ltsDev = null;
		if(paramDevBean.getIdConciliacion() > 0) {
			ltsDev = movimientosCifService.getListaEnvioCIFDetalle(String.valueOf(paramDevBean.getIdConciliacion()));
		}else{
			ltsDev = movimientosCifService.getListaEnvioCIFDetalle(paramDevBean.getFechaInicio(), paramDevBean.getFechaFin());
		}
		paramDevBean.setResultados(ltsDev);
		paramDevBean.setCuentasAenviar(null);
	}

	public void delete2CIF() {
		String rgs = "";
		for(DevolucionesEnvioCifDetalleVO bean: paramDevBean.getCuentasAenviar()) {
			paramDevBean.setMovDetalle(bean);
			paramDevBean.getMovDetalle().setUsuActualizacion(FacesContext.getCurrentInstance().getExternalContext().getRemoteUser());
			paramDevBean.getMovDetalle().setFtcSelecc(Constantes.ESTATUS_ELIMINADO);
			try {
				if(movimientosCifService.actualizaDevolCif(bean) == 0) {
					rgs = rgs + bean.getItemDevolucion() + ", ";
				}
			} catch (Exception e) {
				rgs = e.getMessage();
				paramDevBean.setMsgMsg(e.getMessage());
			}			
		}		
		if("".equals(rgs)) {
			this.recarga();
			paramDevBean.setMsgMsg("Los folios fueron eliminados.");	
			RequestContext.getCurrentInstance().update("formResultadosCargosCIFDev");
		}else {
			rgs = rgs.trim();
			paramDevBean.setMsgMsg("No se pudieron elimiar los folios: " + rgs.substring(0, rgs.length()-1) + ".");
		}
		RequestContext.getCurrentInstance().update("idDialogIdentificadorCiError");
		RequestContext.getCurrentInstance().execute("PF('dialogIdentificadorCiError').show()");
	}
	
	public void limpiarBusqueda(){
		paramDevBean.setFechaInicio(new Date());
		paramDevBean.setFechaFin(new Date());
		paramDevBean.setIdConciliacion(null);
		paramDevBean.setResultados(null);
		paramDevBean.setCuentasAenviar(null);
	}	
	/*
	 * Setear la fecha selecionada por el usuario
	 */
	public void setFechaFin()  {
		LOGGER.info("::::::::::FOP::::::FechaInicio::::::"+paramDevBean.getFechaInicio());
		paramDevBean.setFechaFin(paramDevBean.getFechaInicio());
	}
	
	private DevolucionesEnvioCifDetalleVO getItemData(String item) {
		DevolucionesEnvioCifDetalleVO rgs = null;
		for (DevolucionesEnvioCifDetalleVO data : paramDevBean.getResultados()) {
			if(item.equals(data.getItemDevolucion())) {
				rgs = data;
				break;
			}
		}
		return rgs;
	}	
	
	private List<DevolucionesReporteCDCifVO> setLtsByReporte(){
		List<DevolucionesReporteCDCifVO> rgs = new ArrayList<DevolucionesReporteCDCifVO>();
		for(DevolucionesEnvioCifDetalleVO bean: paramDevBean.getCuentasAenviar()) {
			DevolucionesEnvioCifCabeceraVO cab = movimientosCifService.getListaEnvioCIFCabecera(bean.getItemDevolucion());
			DevolucionesReporteCDCifVO data = new DevolucionesReporteCDCifVO(bean.getFolio(), bean.getItemDevolucion(), cab.getNombreBeneficiario(),
					bean.getUnidadNegocio(), bean.getOrigen(), cab.getCtaBeneficiario(), cab.getNumCtaIndividual(), cab.getFechaPago(), bean.getMonto(),
					cab.getFechaContable(), bean.getFechaCreacion(), cab.getIdBcoDestino(), cab.getDigitoVerificador());
			rgs.add(data);
			
		}
		return rgs;
	}	
	
	private void responseReport(final byte[] byteArray, final String fileNameReport, final String type)throws MitBusinessException {
		
		 try{
			 final HttpServletResponse response  = (HttpServletResponse )FacesContext.getCurrentInstance().getExternalContext().getResponse();
			 response.setContentType(type);
			 response.setContentLength(byteArray.length);
			 response.setHeader("Content-Disposition", "attachment; filename=" + fileNameReport);
			 response.getOutputStream().write(byteArray);
			 LOGGER.debug(""+byteArray);
			 FacesContext.getCurrentInstance().responseComplete();
		 } catch(final IOException ex){
			 final MitBusinessException mitBusinessException = new MitBusinessException(
					 GenerateExceptionDetails.generate(
							 ErrorCodeService.EX_IOEXCEPTION,"Al Responder Reporte:"+ex.getMessage(), 
							 new Object[] { getClass().getName(), "responseReport()" }, ex));

			 LOGGER.error(mitBusinessException.getMessage(),ex);

			 throw mitBusinessException;
		 } catch(final Exception ex)	      {
			 final MitBusinessException mitBusinessException = new MitBusinessException(
					 GenerateExceptionDetails.generate(
							 ErrorCodeService.EX_EXCEPTION,"Al enviar Reporte:"+ex.getMessage(), 
							 new Object[] { getClass().getName(), "responseReport()" }, ex));

			 LOGGER.error(mitBusinessException.getMessage(),ex);
			 paramDevBean.setMsgMsg(ex.getMessage());
			 throw mitBusinessException;
		 }
	 }	
	
	public DevolucionesCIFParamBean getParamDevBean() {
		return paramDevBean;
	}

	public void setParamDevBean(DevolucionesCIFParamBean paramDevBean) {
		this.paramDevBean = paramDevBean;
	}
	
	public void setMovimientosCifService(IMovimientosCifWebService movimientosCifService) {
		this.movimientosCifService = movimientosCifService;
	}	
	
}
