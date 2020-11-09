package com.jk.dao;

import com.jk.entity.Out;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OutMapper {
    int deleteByPrimaryKey(Integer outId);

    int insert(Out record);

    int insertSelective(Out record);

    Out selectByPrimaryKey(Integer outId);

    int updateByPrimaryKeySelective(Out record);

    int updateByPrimaryKey(Out record);
    /*
    *   统计总条数
    * */
    long count(@Param("out")Out out);
    /*
    *   查询老人外出所有信息
    * */
    List<Out> findOut(@Param("currPage")Integer currPage, @Param("pageSize")Integer pageSize,@Param("out") Out out);
}