package com.test.aop.controller.base;

import com.test.aop.model.PmsModule;
import com.test.aop.model.PmsProduct;
import com.test.aop.model.PmsUser;
import com.test.aop.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ServiceFactory {

    @Autowired
    public IPmsBugRemoteService pmsBugRemoteService;

    @Autowired
    public IPmsBugService pmsBugService;

    @Autowired
    public IPmsBugDetailService pmsBugDetailService;

    @Autowired
    public IPmsModuleService pmsModuleService;

    @Autowired
    public IPmsProductService pmsProductService;

    @Autowired
    public IPmsProjectService pmsProjectService;

    @Autowired
    public IPmsUserService pmsUserService;

    @Autowired
    public IProductUserService productUserService;
}
