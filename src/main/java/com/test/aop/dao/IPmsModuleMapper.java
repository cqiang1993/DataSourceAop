package com.test.aop.dao;

import com.test.aop.model.PmsModule;

import java.util.List;
import java.util.Map;

public interface IPmsModuleMapper {
    public List<PmsModule> getModuleByRoot(Map<String, Object> params);

    public PmsModule getModuleById(Map<String, Object> params);

    public List<PmsModule> getPmsModuleList();
}
