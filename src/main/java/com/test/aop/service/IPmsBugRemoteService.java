package com.test.aop.service;

import com.test.aop.model.PmsBugRemote;

import java.util.List;

public interface IPmsBugRemoteService {

    public List<PmsBugRemote> getPmsBugRemoteData(String title);

}
