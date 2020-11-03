package com.jk.dao;

import com.jk.entity.Dorm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DormMapper {
    List<Dorm> findDormPage();

    void addDorm(Dorm dorm);

    void updateDorm(Dorm dorm);

    void deleteDormById(Integer dormId);

    Dorm findDormById(Integer dormId);
}
