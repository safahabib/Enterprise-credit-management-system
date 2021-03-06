/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.ndrc.credit.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.ndrc.credit.service.ITempPeopleQualiInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 描述:  temp_people_quali_info 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年06月29日
 */
@Controller
public class TempPeopleQualiInfoController extends BaseController {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(TempPeopleQualiInfoController.class);

    @Autowired
    private ITempPeopleQualiInfoService tempPeopleQualiInfoService;
}