package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.TurnHome;

public interface TurnHomeService {

    PageResult findTurnHome(Integer currPage, Integer pageSize);

    void addOutHome(TurnHome turnHome);

    void deleteOutHomeById(Integer oId);

    TurnHome findOutHomeById(Integer oId);
}
