package com.test.aop.service.impl;

import com.test.aop.DataSourceConfig.DS;
import com.test.aop.model.PmsUser;
import com.test.aop.service.IPmsUserService;
import com.test.aop.dao.IPmsUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("pmsuserService")
public class PmsUserServiceImpl implements IPmsUserService {
	
	@Autowired
	IPmsUserMapper pmsUserMapper;
	
	@Override
	@DS("slave")
	public List<PmsUser> getPmsUserList() {
		return pmsUserMapper.getPmsUserList();
	}

	@Override
	@DS("slave")
	public PmsUser getPmsUserByAccount(String account) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("account", account);
		return pmsUserMapper.getPmsUserByAccount(params);
	}

}
