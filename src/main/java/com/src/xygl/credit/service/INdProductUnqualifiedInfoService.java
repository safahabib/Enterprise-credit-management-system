/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.ndrc.credit.service;

import java.util.List;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.ndrc.credit.model.NdEnvironmentEvaluateInfo;
import com.icinfo.ndrc.credit.model.NdProductUnqualifiedInfo;

/**
 * 描述:    nd_product_unqualified_info 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年06月30日
 */
public interface INdProductUnqualifiedInfoService extends BaseService {

	/**
	 * Copyright© 2003-2017 浙江汇信科技有限公司, All Rights Reserved.
	 * @author  ranah
	 * @when   2017年6月30日下午2:06:50
	 * @param request
	 * @return
	 */
	public List<NdProductUnqualifiedInfo> selectList(PageRequest request)throws Exception;
}