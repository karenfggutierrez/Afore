package mx.secure.nci.business.service;

import java.util.Date;
import java.util.List;

import mx.secure.nci.business.vo.ArchivosDomiciliacionBitacoraVO;
import mx.secure.nci.business.bean.RespGeneracionArchivosDomi;
import mx.secure.nci.business.vo.ArchivoDomiVO;
import mx.secure.nci.business.vo.ArchivosDomiciliacionVO;
import mx.secure.nci.business.vo.ArchivosGeneradosDomiVO;
import mx.secure.nci.business.vo.CatalogosDomiVO;
import mx.secure.nci.business.vo.CifrasTotalesDomiVO;
import mx.secure.nci.business.vo.CtrlArchivoDomisBean;
import mx.secure.nci.business.vo.ProcesamientoDomiVO;
import mx.secure.nci.business.vo.RegistroCifrasDomiVO;
import mx.secure.nci.business.vo.RegistrosArchivoVO;
import mx.secure.nci.business.vo.TotalesRegistroDomiVO;
import mx.secure.nci.business.wrapped.ArchivoDomiciliacionfilter;
import mx.secure.nci.business.wrapped.ArchivoDomisFilter;
import mx.secure.nci.business.wrapped.ArchivosDomiBitacoraFilter;
import mx.secure.nci.business.wrapped.CatalogosDomiFilter;
import mx.secure.nci.business.wrapped.CifraDomiFilter;
import mx.secure.nci.business.wrapped.CifrasTotalesDomiFilter;
import mx.secure.nci.business.wrapped.DomiParameterMapFilter;
import mx.secure.nci.business.wrapped.FiltroArchivosDomiciliacionFilter;
import mx.secure.nci.business.wrapped.OperacionDomiBitacoraFilter;
import mx.secure.nci.business.wrapped.PeticionesDomiFilter;
import mx.secure.nci.business.wrapped.SolicitudFilter;
import mx.secure.nci.business.wrapped.TablaDinamicaArchDomiFilter;
import mx.secure.nci.business.wrapped.TipoProcesamientoDomisFilter;
import mx.secure.nci.business.wrapped.UltimosArchivosGeneradosFilter;

public interface IDomiciliacionesService {
	
	public ProcesamientoDomiVO consultarProcesamientoDomi ()  throws Exception;
	
	public Integer registrarArchivoDomiBitacora (OperacionDomiBitacoraFilter filter) throws Exception;
	
	public List <ArchivoDomiVO> consultarArchivosDomiBitacora (ArchivosDomiBitacoraFilter filter) throws Exception;
	
	public List <CatalogosDomiVO> getCatalogosControlDomi(CatalogosDomiFilter filter)  throws Exception;
	
	public List<CifrasTotalesDomiVO> getCifrasTotales (CifrasTotalesDomiFilter filter) throws Exception;
	
	public List<CifrasTotalesDomiVO> getCifrasTotalesOtrosBancos (CifrasTotalesDomiFilter filter) throws Exception;
	
	public List <TotalesRegistroDomiVO> getImportesTotalesCifra (CifraDomiFilter filter) throws Exception;
	
	public List <TotalesRegistroDomiVO> getImportesTotalesCifraOtrosBancos (CifraDomiFilter filter) throws Exception;
	
	public List <CifrasTotalesDomiVO> ordenarListaCifrasTotales (List <CifrasTotalesDomiVO> cifrasTotales);
	
	public RegistroCifrasDomiVO getCifraDomi (CifraDomiFilter filter) throws Exception;
	
	public List <ArchivosGeneradosDomiVO> ultimosArchivosGenerados(UltimosArchivosGeneradosFilter filter) throws Exception;
	
	public DomiParameterMapFilter getDomiParameterMapFilter (PeticionesDomiFilter petDomiFilter) throws Exception;
	
	public String getParametroLiberacion () throws Exception;
	
	public List <SolicitudFilter> getCustomFilter(DomiParameterMapFilter filters) throws Exception;
	
	public Integer getConsecutivoArchivoDomi (ArchivoDomiciliacionfilter filter) throws Exception;
	
	public String getNombreArchivoDomi (Short idOrigenAportacion, Short type, Integer consecutivo, Date fecha) throws Exception;
	
	public String generarArchivoDomiF4Mant (SolicitudFilter solicitudFilter,Date fecha,String archivo,Integer consecutivo, Short origenDomi, Long idArchivoGenerado) throws Exception;
	
	public List <RespGeneracionArchivosDomi> generarArchivoDomiF4MantLotes (SolicitudFilter solicitudFilter ,Date fecha ,Short origenDomi ,Long idArchivoGenerado, String contrato, ArchivoDomiciliacionfilter filter) throws Exception;
	
	public CtrlArchivoDomisBean generarIdArchivoDomis( ArchivoDomisFilter filter ) throws Exception;
	
	public CtrlArchivoDomisBean grabarArchivoDomis( ArchivoDomisFilter filter ) throws Exception;
	
	public CtrlArchivoDomisBean consultarDomis( ArchivoDomisFilter filter ) throws Exception;
	
	public String getFileGeneratedData (String archivo, SolicitudFilter solicitudFilter) throws Exception;
	
	public Boolean isNumber (String str);
	
	public String getNombreContrato (String idcontrato) throws Exception; 
	
	public List<ArchivosDomiciliacionVO> consultarArchivosDomiciliacion(FiltroArchivosDomiciliacionFilter filter) throws Exception;
	
	public List<ArchivosDomiciliacionBitacoraVO> consultarArchivosDomiciliacionBitacora(FiltroArchivosDomiciliacionFilter filter) throws Exception;

	public List<ArchivosDomiciliacionBitacoraVO> generarTablaDinamicaArchDomi(TablaDinamicaArchDomiFilter filter) throws Exception;
	
	public Integer actValorProcesamientoDomi(TipoProcesamientoDomisFilter filter) throws Exception;
	
	public List<RegistrosArchivoVO> consultarRegistrosArchivo(TablaDinamicaArchDomiFilter filter) throws Exception;
	
	public Boolean responderFinalizacionArchivosDomi (String folio) throws Exception;
}
