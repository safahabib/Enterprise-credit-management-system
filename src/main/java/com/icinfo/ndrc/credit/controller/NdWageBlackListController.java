/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.ndrc.credit.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.ndrc.credit.model.NdWageBlackList;
import com.icinfo.ndrc.credit.service.INdWageBlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 描述:    nd_wage_black_list 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年06月27日
 */
@Controller
@RequestMapping("/credit/wageblacklist")
public class NdWageBlackListController extends BaseController {
    @Autowired
    private INdWageBlackListService ndWageBlackListService;


    /**
     *@Description 获取企业欠薪黑名单
     *@author ylr
     *@date 2017-06-27
     */
    @RequestMapping("/list")
    @ResponseBody
    public PageResponse<NdWageBlackList> doSelectWageBlackList(PageRequest request)throws Exception{
        List<NdWageBlackList> list = ndWageBlackListService.selectWageBlackList(request);
        return new PageResponse<NdWageBlackList>(list);
    }

}