/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.ndrc.credit.service;

import java.util.List;
import java.util.Map;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.ndrc.credit.model.NdEnvironmentEvaluateInfo;
import com.icinfo.ndrc.credit.model.NdSafeProduceLicence;

/**
 * 描述:    nd_safe_produce_licence 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年06月21日
 */
public interface INdSafeProduceLicenceService extends BaseService {
	
	/**
	 * 描述:查找安监局许可资质详细信息
	 * @author Administrator
	 * @param map
	 * @return NdSafeProduceLicence
	 * @throws Exception 
	 */
	public List<NdSafeProduceLicence> selectDetailByMap(PageRequest pageRequest) throws Exception;

	/**
	 * Copyright© 2003-2017 浙江汇信科技有限公司, All Rights Reserved.
	 * @author  ranah
	 * @when   2017年6月30日下午3:55:03
	 * @param request
	 * @return
	 */
	public List<NdSafeProduceLicence> selectList(PageRequest request)throws Exception;
}