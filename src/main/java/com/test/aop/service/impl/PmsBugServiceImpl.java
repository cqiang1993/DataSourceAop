package com.test.aop.service.impl;

import com.test.aop.DataSourceConfig.DS;
import com.test.aop.dao.IPmsBugMapper;
import com.test.aop.model.PmsBug;
import com.test.aop.service.IPmsBugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("pmsbugService")
public class PmsBugServiceImpl implements IPmsBugService {

    @Autowired
    private IPmsBugMapper pmsBugMapper;

    @Override
    @DS("master")
    public void insertPmsBug(int product_id, int module_id, int project_id, String assigned_to, int env, int platform, String bug_title, String error_info_detail, String error_type, int severity, int discovery_probe, String linked_product, String linked_module, int state, String submit_user, String create_time) {
        Map<String, Object> param = new HashMap<>();
        param.put("product_id", product_id);
        param.put("module_id", module_id);
        param.put("project_id", project_id);
        param.put("assigned_to", assigned_to);
        param.put("env", env);
        param.put("platform", platform);
        param.put("bug_title", bug_title);
        param.put("error_info_detail", error_info_detail);
        param.put("error_type", error_type);
        param.put("severity", severity);
        param.put("discovery_probe", discovery_probe);
        param.put("linked_product", linked_product);
        param.put("linked_module", linked_module);
        param.put("state", state);
        param.put("submit_user", submit_user);
        param.put("create_time", create_time);
        pmsBugMapper.insertPmsBug(param);
    }

    @Override
    @DS("master")
    public List<PmsBug> getPmsBugListForOption(int product_id, int module_id, int state, String startTime, String endTime, int start, int rows, int sort) {
        Map<String, Object> param = new HashMap<>();
        param.put("product_id", product_id);
        param.put("module_id", module_id);
        param.put("state", state);
        param.put("rows", rows);
        param.put("start",start);
        param.put("sort", sort);
        param.put("startTime", startTime);
        param.put("endTime", endTime);
        return pmsBugMapper.getPmsBugListForOption(param);
    }

    @Override
    @DS("master")
    public int getPmsBugListForOptionCount(int product_id, int module_id, int state, String startTime, String endTime) {
        Map<String, Object> param = new HashMap<>();
        param.put("product_id", product_id);
        param.put("module_id", module_id);
        param.put("state", state);
        param.put("startTime", startTime);
        param.put("endTime", endTime);
        return pmsBugMapper.getPmsBugListForOptionCount(param);
    }

    @Override
    @DS("master")
    public PmsBug getPmsBugById(int id) {
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("id",id);
        return pmsBugMapper.getPmsBugById(params);
    }

    @Override
    @DS("master")
    public void updatePmsBugState(int id, int state, String pms_reason, String operator_user) {
        Map<String, Object> param = new HashMap<>();
        param.put("id", id);
        param.put("state", state);
        param.put("pms_reason", pms_reason);
        param.put("operator_user", operator_user);
        pmsBugMapper.updatePmsBugState(param);
    }

    @Override
    @DS("master")
    public void updatePmsStateByPmsId(Integer pms_bug_id, int state, String pms_update_time) {
        Map<String, Object> param = new HashMap<>();
        param.put("pms_bug_id", pms_bug_id);
        param.put("pms_state", state);
        param.put("pms_update_time", pms_update_time);
        pmsBugMapper.updatePmsStateByPmsId(param);
    }

    @Override
    @DS("master")
    public void updatePmsBugId(int id, int bugid) {
        Map<String, Object> param = new HashMap<>();
        param.put("id", id);
        param.put("pms_bug_id", bugid);
        pmsBugMapper.updatePmsBugId(param);
    }

    @Override
    @DS("master")
    public List<PmsBug> getPmsBugListByStateAndTime(int state, String date) {
        Map<String, Object> param = new HashMap<>();
        param.put("state", state);
        param.put("create_time", date);
        return pmsBugMapper.getPmsBugListByStateAndTime(param);
    }

    @Override
    @DS("master")
    public List<PmsBug> getPmsBugListByStateAndPmsState(int state, int pms_state) {
        Map<String, Object> param = new HashMap<>();
        param.put("state", state);
        param.put("pms_state", pms_state);
        return pmsBugMapper.getPmsBugListByStateAndPmsState(param);
    }
}
