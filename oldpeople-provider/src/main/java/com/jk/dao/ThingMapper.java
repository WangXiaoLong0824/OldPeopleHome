package com.jk.dao;

import com.jk.entity.Thing;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ThingMapper {
    int deleteByPrimaryKey(Integer thingId);

    int insert(Thing record);

    int insertSelective(Thing record);

    Thing selectByPrimaryKey(Integer thingId);

    int updateByPrimaryKeySelective(Thing record);

    int updateByPrimaryKey(Thing record);
    //统计总数量
    long count(Thing thing);
    //查询所有信息
    List<Thing> findThing(Integer currPage, Integer pageSize, Thing thing);
}