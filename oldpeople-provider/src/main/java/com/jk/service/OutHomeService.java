package com.jk.service;

import com.jk.entity.HomeBean;
import com.jk.entity.OutHomeBean;
import com.jk.entity.PageResult;

public interface OutHomeService {
    void deleteOutHome(Integer id);

    void addOutHome(OutHomeBean outHomeBean);

    void updateOutHome(OutHomeBean outHomeBean);

    OutHomeBean selectOutHomeById(Integer id);

    PageResult findOutHomeList(Integer currPage, Integer pageSize, OutHomeBean outHomeBean);
}
