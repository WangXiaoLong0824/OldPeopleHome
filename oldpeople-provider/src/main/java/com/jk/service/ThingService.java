package com.jk.service;

import com.jk.config.PageResult;
import com.jk.entity.Thing;

public interface ThingService {
    /*
     *   员工请假表信息
     * */
    PageResult findThing(Integer currPage, Integer pageSize, Thing thing);
    /*
     *   员工请假新增数据
     * */
    void addThing(Thing thing);
    /*
     *   员工请假单删表
     * */
    void delThing(Integer ids);
    /*
     *   员工请假表回显数据
     * */
    Thing oneThing(Integer ids);
}
