package com.jk.dao;

import com.jk.entity.HomeBean;
import com.jk.entity.LeaveBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LeaveMapper {
    Long findLeaveList(@Param("leave") LeaveBean leave);

    List<LeaveBean> findLeaveListPage(@Param("currPage") Integer currPage,@Param("pageSize") Integer pageSize,@Param("leave") LeaveBean leave);

    void deleteLeave(Integer id);

    void addLeave(LeaveBean leave);

    void updateLeave(LeaveBean leave);

    HomeBean selectLeaveById(Integer id);
}
