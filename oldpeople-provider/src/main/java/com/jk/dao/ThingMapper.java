package com.jk.dao;

import com.jk.entity.Thing;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ThingMapper {
    int deleteByPrimaryKey(Integer thingId);

    int insert(Thing record);

    int insertSelective(Thing record);

    Thing selectByPrimaryKey(@Param("ids") Integer thingId);

    int updateByPrimaryKeySelective(Thing record);

    int updateByPrimaryKey(Thing record);
    //统计总数量
    long count(@Param("thing") Thing thing);
    //查询所有信息
    List<Thing> findThing(@Param("currPage")Integer currPage,@Param("pageSize") Integer pageSize,@Param("thing") Thing thing);
}