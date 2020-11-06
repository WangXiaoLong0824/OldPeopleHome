package com.jk.service;

import com.jk.entity.*;

import java.util.List;

public interface OldPeopleService {
    PageResult findPageOldPeople(Integer currPage, Integer pageSize, OldPeople oldPeople);

    void addOldPeople(OldPeople oldPeople);

    void deleteOldPeople(Integer oldId);

    OldPeople findOlePeopleById(Integer oldId);

    List<TbProvinces> getSheng();

    List<TbCities> findShi(String provinceid);

    List<TbAreas> findXian(String cityid);
}
