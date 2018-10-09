package com.test.aop.service;

import com.test.aop.model.PmsProject;

import java.util.List;

public interface IPmsProjectService {

    List<PmsProject> getPmsProjectList(int product_id);

    PmsProject getPmsProject(int id);
}
