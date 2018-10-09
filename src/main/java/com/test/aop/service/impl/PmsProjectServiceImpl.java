package com.test.aop.service.impl;

import com.test.aop.DataSourceConfig.DS;
import com.test.aop.model.PmsProject;
import com.test.aop.service.IPmsProjectService;
import com.test.aop.dao.IPmsProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("pmsprojectService")
public class PmsProjectServiceImpl implements IPmsProjectService {
	
	@Autowired
	IPmsProjectMapper pmsProjectMapper;
	
	@Override
	@DS("slave")
	public List<PmsProject> getPmsProjectList(int product) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("product", product);
		return pmsProjectMapper.getPmsProjectList(params);
	}

	@Override
	@DS("slave")
	public PmsProject getPmsProject(int id) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("id", id);
		return pmsProjectMapper.getPmsProject(params);
	}
}
