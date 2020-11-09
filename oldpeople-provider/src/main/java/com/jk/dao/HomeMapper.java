package com.jk.dao;

import com.jk.entity.HomeBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HomeMapper {

    Long findHomeList(@Param("homeBean") HomeBean homeBean);

    List<HomeBean> findHomeListPage(@Param("currPage")  Integer currPage,@Param("pageSize") Integer pageSize,@Param("homeBean") HomeBean homeBean);

    void deleteHome(Integer id);

    void addHome(HomeBean homeBean);

    void updateHome(HomeBean homeBean);

    HomeBean selectHomeById(Integer id);
}
