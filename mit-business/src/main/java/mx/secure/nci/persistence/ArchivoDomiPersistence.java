package mx.secure.nci.persistence;

import java.util.List;

import mx.secure.nci.business.vo.ArchivosDomiciliacionBitacoraVO;
import mx.secure.nci.business.vo.ArchivosDomiciliacionVO;
import mx.secure.nci.business.vo.ArchivosGeneradosVO;
import mx.secure.nci.business.vo.CatPrioridadesDiversificacionesVO;
import mx.secure.nci.business.vo.ConsecutivosDomiVO;
import mx.secure.nci.business.vo.FechaArchivoDomiVO;
import mx.secure.nci.business.vo.RegistrosArchivoVO;
import mx.secure.nci.business.vo.RegistrosMaxArchVO;
import mx.secure.nci.business.wrapped.ArchivoDomiciliacionfilter;
import mx.secure.nci.business.wrapped.FiltroArchivosDomiciliacionFilter;
import mx.secure.nci.business.wrapped.TablaDinamicaArchDomiFilter;
import mx.secure.nci.business.wrapped.TipoProcesamientoDomisFilter;
import mx.secure.nci.business.wrapped.TipoRegistrosMaxFilter;
import mx.secure.nci.stereotype.Mapper;

@Mapper
public interface ArchivoDomiPersistence {
	List<ArchivosGeneradosVO> selectFechasArchivo(ArchivoDomiciliacionfilter archivoDomiciliacionfilter);
	Integer selectConsecutivoHoy(ArchivoDomiciliacionfilter filter);
	Integer insertArchivoDomiGenerado(ArchivosGeneradosVO archivoGen);
	Integer insert(ArchivosGeneradosVO archivoGen);
	Integer insertPar(ArchivosGeneradosVO archivoGen);
	Integer update(ArchivosGeneradosVO archivoGen);
	Integer updatePar(ArchivosGeneradosVO archivoGen);
	//FOP 2229 obtener Prioridad de Diversificaciones
	List<CatPrioridadesDiversificacionesVO> selectCatPrioridadDiversificaciones();
	
	public FechaArchivoDomiVO consultarFechaFormatoDomiBancomer ();
	public FechaArchivoDomiVO consultarFechaFormatoDomisecure ();
	
	public ConsecutivosDomiVO consultarConsecutivosecureOrdinario();
	public ConsecutivosDomiVO consultarConsecutivosecureTraspasos();
	public ConsecutivosDomiVO consultarConsecutivoBancomerOrdinario();
	public ConsecutivosDomiVO consultarConsecutivoBancomerTraspasos();
	
	List<ArchivosDomiciliacionVO> consultarArchivosDomiciliacion(FiltroArchivosDomiciliacionFilter filter) throws Exception;
	List<ArchivosDomiciliacionBitacoraVO> consultarArchivosDomiciliacionBitacora(FiltroArchivosDomiciliacionFilter filter) throws Exception;
	
	RegistrosMaxArchVO obtenerRegistrosMaximosArchivo(TipoRegistrosMaxFilter filter);
	
	List<ArchivosDomiciliacionBitacoraVO> consultarArchivosDomiBitacora(TablaDinamicaArchDomiFilter filter) throws Exception;
	
	Integer actValorProcesamientoDomi(TipoProcesamientoDomisFilter filter) throws Exception;
	
	List<RegistrosArchivoVO> consultarRegistrosArchivo(TablaDinamicaArchDomiFilter filter) throws Exception;
}
