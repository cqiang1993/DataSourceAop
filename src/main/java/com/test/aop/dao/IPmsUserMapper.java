package com.test.aop.dao;

import com.test.aop.model.PmsUser;

import java.util.List;
import java.util.Map;

public interface IPmsUserMapper {
    List<PmsUser> getPmsUserList();

    PmsUser getPmsUserByAccount(Map<String, Object> params);
}
