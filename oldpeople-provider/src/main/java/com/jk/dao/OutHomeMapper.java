package com.jk.dao;

import com.jk.entity.HomeBean;
import com.jk.entity.OutHomeBean;
import com.jk.entity.PageResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface OutHomeMapper {
    void deleteOutHome(Integer id);

    void addOutHome(OutHomeBean outHomeBean);

    void updateOutHome(OutHomeBean outHomeBean);

    HomeBean selectOutHomeById(Integer id);

    Long findOutHomeList(@Param("outHomeBean") OutHomeBean outHomeBean);

    List<OutHomeBean> findOutHomeListPage(@Param("currPage")  Integer currPage,@Param("pageSize") Integer pageSize,@Param("outHomeBean") OutHomeBean outHomeBean);
}
