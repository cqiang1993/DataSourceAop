package com.test.aop.service;

import com.test.aop.model.PmsModule;

import java.util.List;

public interface IPmsModuleService {

    public List<PmsModule> getModuleByRoot(int root);

    public PmsModule getModuleById(int id);

    public List<PmsModule> getPmsModuleList();

}
