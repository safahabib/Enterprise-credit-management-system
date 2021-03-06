/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.ndrc.credit.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.ndrc.credit.mapper.NdRewardInfoMapper;
import com.icinfo.ndrc.credit.model.NdRewardInfo;
import com.icinfo.ndrc.credit.service.INdRewardInfoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:    nd_reward_info 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年06月29日
 */
@Service
public class NdRewardInfoServiceImpl extends MyBatisServiceSupport implements INdRewardInfoService {

	@Autowired
	NdRewardInfoMapper ndRewardInfoMapper;
	@Override
	public List<NdRewardInfo> selectList(PageRequest request) throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		return ndRewardInfoMapper.selectList(request.getParams());
	}
}