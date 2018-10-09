package com.test.aop.dao;

import com.test.aop.model.PmsBug;

import java.util.List;
import java.util.Map;

public interface IPmsBugMapper {
    /**
     * 添加pmsbug
     */
    public void insertPmsBug(Map<String, Object> param);

    /**
     * 查询pmsbug
     */
    public List<PmsBug> getPmsBugList();
    public List<PmsBug> getPmsBugListByState(Map<String, Object> param);
    public List<PmsBug> getPmsBugListByProId(Map<String, Object> param);
    /**
     * 更新bug状态
     */
    public void updatePmsBugState(Map<String, Object> param);
    /**
     * 更新bug出现次数
     */
    public void updatePmsBugCount(Map<String, Object> param);

    public void updatePmsBugId(Map<String, Object> param);
    public void updatePmsBugTaskId(Map<String, Object> param);
    public void updatePmsBugCreateTime(Map<String, Object> param);
    /**
     * 根据id查询pmsbug
     */
    public PmsBug getPmsBugById(Map<String, Object> param);
    /**
     * 根据条件查询PMSBUG list
     * @param param
     * @return
     */
    public List<PmsBug> getPmsBugListForOption(Map<String, Object> param);
    public int getPmsBugListForOptionCount(Map<String, Object> param);
    public List<PmsBug> getPmsBugByCase(Map<String, Object> param);
    public void updatePmsStateByPmsId(Map<String, Object> param);
    public List<PmsBug> getPmsBugListByStateAndPmsState(Map<String, Object> param);

    public void deletePmsBugByTaskId(Map<String, Object> param);

    public int getPmsBugCountByTaskId(Map<String, Object> param);

    public List<PmsBug> getPmsBugListByStateAndTime(Map<String, Object> param);
}
