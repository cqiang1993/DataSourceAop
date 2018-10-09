package com.test.aop.dao;

import com.test.aop.model.PmsProduct;

import java.util.List;
import java.util.Map;

public interface IPmsProductMapper {
    public List<PmsProduct> getPmsProductList();

    public PmsProduct getPmsProductById(Map<String, Object> params);
}
