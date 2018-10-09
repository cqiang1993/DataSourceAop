package com.test.aop.service.impl;

import com.test.aop.DataSourceConfig.DS;
import com.test.aop.dao.IPmsBugDetailMapper;
import com.test.aop.model.PmsBugDetail;
import com.test.aop.service.IPmsBugDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("pmsbugdetailService")
public class PmsBugDetailServiceImpl implements IPmsBugDetailService {

	@Autowired
	IPmsBugDetailMapper pmsBugDetailMapper;

	@Override
	@DS("master")
	public PmsBugDetail getPmsDetailByPmsId(int pms_bug_id) {
		Map<String, Object> param = new HashMap<>();
		param.put("pms_bug_id", pms_bug_id);
		return pmsBugDetailMapper.getPmsDetailByPmsId(param);
	}


	@Override
	@DS("master")
	public void insertPmsBugDetail(int product_id,int module_id,int project_id,int pms_bug_id,String open_time,String resolved_time,String closed_time,
			int state,String actions,int level,String response_time,String resolved_method,String last_assgined) {
		Map<String, Object> param = new HashMap<>();
		param.put("product_id", product_id);
		param.put("module_id", module_id);
		param.put("project_id", project_id);
		param.put("pms_bug_id", pms_bug_id);
		param.put("open_time", open_time);
		param.put("resolved_time", resolved_time);
		param.put("closed_time", closed_time);
		param.put("state", state);
		param.put("actions", actions);
		param.put("level", level);
		param.put("response_time", response_time);
		param.put("resolved_method", resolved_method);
		param.put("last_assgined", last_assgined);
		System.out.println("insert: "+last_assgined);
		pmsBugDetailMapper.insertPmsBugDetail(param);
		
	}

	@Override
	@DS("master")
	public void updatePmsBugDetail(int pms_bug_id,String resolved_time,String closed_time,
			int state,String actions,int level,String response_time,String resolved_method,String last_assgined) {
		Map<String, Object> param = new HashMap<>();
		param.put("pms_bug_id", pms_bug_id);
		param.put("resolved_time", resolved_time);
		param.put("closed_time", closed_time);
		param.put("state", state);
		param.put("actions", actions);
		param.put("level", level);
		param.put("response_time", response_time);
		param.put("resolved_method", resolved_method);
		param.put("last_assgined", last_assgined);
		System.out.println("update: "+last_assgined);
		pmsBugDetailMapper.updatePmsBugDetail(param);
	}
}
