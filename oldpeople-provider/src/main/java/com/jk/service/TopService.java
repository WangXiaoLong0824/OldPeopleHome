package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.Top;

public interface TopService {
    /*
     *   预约线上表分页 查询
     * */
    PageResult findTop(Integer currPage, Integer pageSize, Top top);
    /*
     *   预约线上表新增
     * */
    void addTop(Top top);
}
