package com.test.aop.dao;

import com.test.aop.model.PmsBugDetail;

import java.util.Map;

public interface IPmsBugDetailMapper {
    /**
     * 获取详情记录通过PMS_ID
     * @param param
     * @return
     */
    public PmsBugDetail getPmsDetailByPmsId(Map<String, Object> param);

    /**
     * 插入详情记录
     * @param param
     * @return
     */
    public void insertPmsBugDetail(Map<String, Object> param);

    /**
     * 更新详情记录
     * @param param
     * @return
     */
    public void updatePmsBugDetail(Map<String, Object> param);
}
