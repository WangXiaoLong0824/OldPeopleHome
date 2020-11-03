package com.jk.service;

import com.jk.entity.Dorm;

import java.util.List;

public interface DormService {
    List<Dorm> findDormPage();

    void addDorm(Dorm dorm);

    void deleteDormById(Integer dormId);

    Dorm findDormById(Integer dormId);
}
