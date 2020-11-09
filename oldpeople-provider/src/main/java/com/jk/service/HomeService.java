package com.jk.service;

import com.jk.entity.HomeBean;
import com.jk.entity.PageResult;

public interface HomeService {
    PageResult findHomeList(Integer currPage, Integer pageSize, HomeBean homeBean);

    void deleteHome(Integer id);

    void addHome(HomeBean homeBean);

    void updateHome(HomeBean homeBean);

    HomeBean selectHomeById(Integer id);
}
