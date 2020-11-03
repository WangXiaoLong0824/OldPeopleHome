package com.jk.service;

import com.jk.entity.PageResult;

public interface TurnHomeService {

    PageResult findTurnHome(Integer currPage, Integer pageSize);
}
