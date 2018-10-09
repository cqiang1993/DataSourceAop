package com.test.aop.service.impl;

import com.test.aop.DataSourceConfig.DS;
import com.test.aop.model.PmsBugRemote;
import com.test.aop.service.IPmsBugRemoteService;
import com.test.aop.dao.IPmsBugRemoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("pmsbugremoteService")
public class PmsBugRemoteServiceImpl implements IPmsBugRemoteService {

    @Autowired
    private IPmsBugRemoteMapper pmsBugRemoteMapper;

    @Override
    @DS("slave")
    public List<PmsBugRemote> getPmsBugRemoteData(String title) {
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("title",title);
        return pmsBugRemoteMapper.getPmsBugRemoteData(params);
    }
}
