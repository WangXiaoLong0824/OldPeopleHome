package com.jk.dao;

import com.jk.entity.TurnHome;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TurnHomeMapper {
    List<TurnHome> findTurnHome(@Param("currPage") Integer currPage, @Param("pageSize")Integer pageSize);


    Long findTurnHomeCount();

    void addOutHome(TurnHome turnHome);

    void updateOutHome(TurnHome turnHome);

    void deleteOutHomeById(Integer oId);

    TurnHome findOutHomeById(Integer oId);

}
