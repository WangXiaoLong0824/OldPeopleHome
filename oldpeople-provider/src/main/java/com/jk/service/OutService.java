package com.jk.service;

import com.jk.config.PageResult;
import com.jk.entity.Out;

public interface OutService {
    /*
     *  老人外出登记详细信息分页展示
     * */
    PageResult findOut(Integer currPage, Integer pageSize, Out out);
    /*
     *   老人外出登记表新增数据
     * */
    void addOut(Out out);
    /*
     *   老人外出登记表回显数据
     * */
    Out oneOut(Integer ids);
    /*
     *   老人外出登记表单删
     * */
    void delOut(Integer ids);
}
