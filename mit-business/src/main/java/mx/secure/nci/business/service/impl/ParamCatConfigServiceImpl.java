package mx.secure.nci.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.secure.nci.business.exception.ErrorCodeService;
import mx.secure.nci.business.exception.GenerateExceptionDetails;
import mx.secure.nci.business.exception.MitBusinessException;
import mx.secure.nci.business.service.IParamCatConfigService;
import mx.secure.nci.business.vo.ParamCataConfigVO;
import mx.secure.nci.business.vo.ParamCatalogoVO;
import mx.secure.nci.persistence.ParamCatConfigPersistence;

@Service("paramCatConfigService")
public class ParamCatConfigServiceImpl implements IParamCatConfigService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ParamCatConfigServiceImpl.class);
	
	@Autowired ParamCatConfigPersistence paramCatConfigPersistence;

	public  List<ParamCataConfigVO> consultar(ParamCatalogoVO param) throws MitBusinessException {
		 List<ParamCataConfigVO> regs = new ArrayList<ParamCataConfigVO>();
		try
		{
			if(param != null)
			{
				regs =  paramCatConfigPersistence.select(param);
			}
		}
		catch(Exception ex)
		{
			MitBusinessException mitBusinessException = new MitBusinessException(GenerateExceptionDetails.generate(
					ErrorCodeService.EX_EXCEPTION, "Al consultar Param TFCRXGRAL_CAT_CONFIG ",
					new Object[] { "ParamCatConfigServiceImpl", "consultar()" }, ex));
			throw mitBusinessException;			
		}
		return regs;
	}
}