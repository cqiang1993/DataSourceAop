package com.test.aop.service;

import com.test.aop.model.ProductUser;

import java.util.List;

public interface IProductUserService {

    public List<ProductUser> getAllList();

    public List<ProductUser> getProductUser(int product_id);

}
