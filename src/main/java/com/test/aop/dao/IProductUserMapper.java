package com.test.aop.dao;

import com.test.aop.model.ProductUser;

import java.util.List;
import java.util.Map;

public interface IProductUserMapper {

    public List<ProductUser> getAllList();

    public List<ProductUser> getProductUser(Map<String, Object> params);
}
