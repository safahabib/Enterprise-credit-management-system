/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.ndrc.credit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.ndrc.credit.model.NdEnvironmentEvaluateInfo;
import com.icinfo.ndrc.credit.model.NdGaAdminForceInfo;
import com.icinfo.ndrc.credit.service.INdEnvironmentEvaluateInfoService;
import com.icinfo.ndrc.credit.service.INdGaAdminForceInfoService;

/**
 * 描述:    nd_ga_admin_force_info 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年06月30日
 */
@Controller
@RequestMapping("/credit/ndGaAdminForceInfo")
public class NdGaAdminForceInfoController extends BaseController {
	@Autowired
	INdGaAdminForceInfoService ndGaAdminForceInfoService;
	/**
	 * 获取数据
	 * @author rah
	 */

	@RequestMapping({ "/data.json" })
	@ResponseBody
	public PageResponse<NdGaAdminForceInfo> doGetList(PageRequest request) throws Exception {
		List<NdGaAdminForceInfo> data = ndGaAdminForceInfoService.selectList(request);
		return new PageResponse<NdGaAdminForceInfo>(data);
	}
}