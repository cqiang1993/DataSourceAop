package com.test.aop.service;

import com.test.aop.model.PmsUser;

import java.util.List;

public interface IPmsUserService {

    List<PmsUser> getPmsUserList();

    PmsUser getPmsUserByAccount(String account);
}
