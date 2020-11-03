package com.jk.mapper;

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
}
