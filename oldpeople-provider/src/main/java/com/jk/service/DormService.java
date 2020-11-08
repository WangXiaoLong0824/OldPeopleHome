package com.jk.service;

import com.jk.entity.Dorm;
import com.jk.entity.PageResult;

import java.util.List;

public interface DormService {
    PageResult findDormPage(Integer currPage, Integer pageSize, Dorm dorm);

    void addDorm(Dorm dorm);

    void deleteDormById(Integer dormId);

    Dorm findDormById(Integer dormId);
}
