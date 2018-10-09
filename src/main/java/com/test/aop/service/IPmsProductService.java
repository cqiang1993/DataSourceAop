package com.test.aop.service;

import com.test.aop.model.PmsProduct;

import java.util.List;

public interface IPmsProductService {

    public List<PmsProduct> getPmsProductList();

    public PmsProduct getPmsProductById(int id);
}
