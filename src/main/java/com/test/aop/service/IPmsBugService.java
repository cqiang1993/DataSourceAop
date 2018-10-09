package com.test.aop.service;

import com.test.aop.model.PmsBug;

import java.util.List;

public interface IPmsBugService {

    public void insertPmsBug(int product_id, int module_id, int project_id, String assigned_to, int env,
                             int platform, String bug_title, String error_info_detail, String error_type, int severity,
                             int discovery_probe, String linked_product, String linked_module, int state, String submit_user,
                             String create_time);

    public List<PmsBug> getPmsBugListForOption(int product_id, int module_id, int state, String startTime, String endTime, int start, int rows, int sort);

    public int getPmsBugListForOptionCount(int product_id, int module_id, int state, String startTime, String endTime);

    public PmsBug getPmsBugById(int id);

    public void updatePmsBugState(int id, int state, String pms_reason, String operator_user);

    public void updatePmsStateByPmsId(Integer pms_bug_id, int state, String pms_update_time);

    public void updatePmsBugId(int id, int bugid);

    public List<PmsBug> getPmsBugListByStateAndTime(int state, String date);

    public List<PmsBug> getPmsBugListByStateAndPmsState(int state, int pms_state);
}
