package com.test.aop.service;

import com.test.aop.model.PmsBugDetail;

public interface IPmsBugDetailService {

    public PmsBugDetail getPmsDetailByPmsId(int pms_bug_id);

    public void insertPmsBugDetail(int product_id, int module_id, int project_id, int pms_bug_id, String open_time, String resolved_time, String closed_time,
                                   int state, String actions, int level, String response_time, String resolved_method, String last_assgined);

    public void updatePmsBugDetail(int pms_bug_id, String resolved_time, String closed_time,
                                   int state, String actions, int level, String response_time, String resolved_method, String last_assgined);
}
