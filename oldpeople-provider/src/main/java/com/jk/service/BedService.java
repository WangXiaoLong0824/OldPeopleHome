package com.jk.service;

import com.jk.entity.Bed;
import com.jk.entity.PageResult;
import com.jk.entity.TurnHome;

public interface BedService {


    PageResult findBed(Integer currPage, Integer pageSize,Bed bed);

    void addBed(Bed bed);

    void deleteBedById(Integer bedId);

    Bed findBedById(Integer bedId);
}
