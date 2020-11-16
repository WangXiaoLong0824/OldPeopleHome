package com.jk.service;

import com.jk.entity.*;

import java.util.List;

public interface BedService {


    PageResult findBed(Integer currPage, Integer pageSize,Bed bed);

    void addBed(Bed bed);

    void deleteBedById(Integer bedId);

    Bed findBedById(Integer bedId);

    List<Dorm> getDorm();

    List<Person> getPerson();

    List<Storey> getStorey();
}
