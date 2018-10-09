package com.test.aop.dao;

import com.test.aop.model.PmsProject;

import java.util.List;
import java.util.Map;

public interface IPmsProjectMapper {
    List<PmsProject> getPmsProjectList(Map<String, Object> params);

    PmsProject getPmsProject(Map<String, Object> params);
}
