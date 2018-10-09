package com.test.aop.dao;

import com.test.aop.model.PmsBugRemote;

import java.util.List;
import java.util.Map;

public interface IPmsBugRemoteMapper {
    public List<PmsBugRemote> getPmsBugRemoteData(Map<String, Object> params);
}
