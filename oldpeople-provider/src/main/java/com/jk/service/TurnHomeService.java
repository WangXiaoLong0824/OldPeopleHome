package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.TurnHome;

public interface TurnHomeService {

    PageResult findTurnHome(Integer currPage, Integer pageSize);

    void updateTurnHome(TurnHome turnHome);

    TurnHome findTurnHomeById(Integer oId);
}
