package com.jk.service;

import com.jk.config.PageResult;
import com.jk.entity.People;

public interface PeopleService {
    /*
     *   老人会员信息表分页
     * */
    PageResult findPeople(Integer currPage, Integer pageSize, People people);
    /*
    *   新增数据
    * */
    void addPeople(People people);
    /*
    *   回显数据
    * */
    People onePeople(Integer ids);
    /*
    *   单删
    * */
    void delOne(Integer ids);
}
