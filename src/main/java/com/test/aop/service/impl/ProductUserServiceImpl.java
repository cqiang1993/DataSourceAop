package com.test.aop.service.impl;

import com.test.aop.DataSourceConfig.DS;
import com.test.aop.dao.IProductUserMapper;
import com.test.aop.model.ProductUser;
import com.test.aop.service.IProductUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("productuserService")
public class ProductUserServiceImpl implements IProductUserService {
	
	@Autowired
	IProductUserMapper productUserMapper;
	
	@Override
	@DS("master")
	public List<ProductUser> getAllList() {
		// TODO Auto-generated method stub
		return productUserMapper.getAllList();
	}

	@Override
	@DS("master")
	public List<ProductUser> getProductUser(int product_id) {
		Map<String, Object> params = new HashMap<String,Object>();
		params.put("product_id", product_id);
		return productUserMapper.getProductUser(params );
	}

}
