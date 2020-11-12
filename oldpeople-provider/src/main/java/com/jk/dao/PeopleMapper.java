package com.jk.dao;

import com.jk.entity.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PeopleMapper {
    int deleteByPrimaryKey(Integer peopleId);

    int insert(People record);

    int insertSelective(People record);

    People selectByPrimaryKey(Integer peopleId);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);
    //统计总条数
    long count(@Param("people") People people);
    //查询所有数据
    List<People> findPeople(@Param("currPage") Integer currPage,@Param("pageSize")Integer pageSize,@Param("people")People people);
}