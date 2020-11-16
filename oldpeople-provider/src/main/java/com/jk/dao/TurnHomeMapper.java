package com.jk.dao;

import com.jk.entity.TurnHome;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TurnHomeMapper {
    List<TurnHome> findTurnHome(@Param("currPage") Integer currPage, @Param("pageSize")Integer pageSize);


    Long findTurnHomeCount();

@Update("update t_turnhome set because=#{because},person_id=#{personId},dorm_id=#{dormId},storey_id=#{storeyId},room_id=#{roomId} where turn_id=#{turnId}")
    void updateTurnHome(TurnHome turnHome);
@Select("select * from t_turnhome t where t.turn_id=#{oId}")
    TurnHome findTurnHomeById(Integer oId);
}
