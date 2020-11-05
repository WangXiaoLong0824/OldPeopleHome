package com.jk.service;

import com.jk.entity.OldPeople;
import com.jk.entity.PageResult;

public interface OldPeopleService {
    PageResult findPageOldPeople(Integer currPage, Integer pageSize, OldPeople oldPeople);

    void addOldPeople(OldPeople oldPeople);

    void deleteOldPeople(Integer oldId);

    OldPeople findOlePeopleById(Integer oldId);
}
