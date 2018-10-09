package com.test.aop.service.impl;

import com.test.aop.DataSourceConfig.DS;
import com.test.aop.model.PmsModule;
import com.test.aop.service.IPmsModuleService;
import com.test.aop.dao.IPmsModuleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("pmsmoduleService")
public class PmsModuleServiceImpl implements IPmsModuleService {
	
	@Autowired
	IPmsModuleMapper pmsModuleMapper;
	
	@Override
	@DS("slave")
	public List<PmsModule> getModuleByRoot(int root) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("root", root);
		return pmsModuleMapper.getModuleByRoot(params);
	}

	@Override
	@DS("slave")
	public PmsModule getModuleById(int id) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("id", id);
		return pmsModuleMapper.getModuleById(params);
	}

	@Override
	@DS("slave")
	public List<PmsModule> getPmsModuleList() {
		return pmsModuleMapper.getPmsModuleList();
	}

}
