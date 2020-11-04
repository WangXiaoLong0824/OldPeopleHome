package com.jk.dao;

import com.jk.entity.Top;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TopMapper {
    int deleteByPrimaryKey(Integer topId);

    int insert(Top record);

    int insertSelective(Top record);

    Top selectByPrimaryKey(Integer topId);

    int updateByPrimaryKeySelective(Top record);

    int updateByPrimaryKey(Top record);
    //统计总条数
    long count(@Param("top") Top top);
    //查询所有数据
    List<Top> findTop(@Param("currPage") Integer currPage,@Param("pageSize") Integer pageSize,@Param("top") Top top);
}