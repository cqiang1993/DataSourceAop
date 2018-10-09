package com.test.aop.service.impl;

import com.test.aop.DataSourceConfig.DS;
import com.test.aop.model.PmsProduct;
import com.test.aop.service.IPmsProductService;
import com.test.aop.dao.IPmsProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("pmsproductService")
public class PmsProductServiceImpl implements IPmsProductService{
	
	@Autowired
	IPmsProductMapper pmsProductMapper;
	
	@Override
	@DS("slave")
	public List<PmsProduct> getPmsProductList() {
		return pmsProductMapper.getPmsProductList();
	}

	@Override
	@DS("slave")
	public PmsProduct getPmsProductById(int id) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("id", id);
		return pmsProductMapper.getPmsProductById(params);
	}

}
