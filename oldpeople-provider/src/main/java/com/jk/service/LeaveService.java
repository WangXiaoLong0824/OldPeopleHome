package com.jk.service;

import com.jk.entity.HomeBean;
import com.jk.entity.LeaveBean;
import com.jk.entity.PageResult;

public interface LeaveService {
    PageResult findLeaveList(Integer currPage, Integer pageSize, LeaveBean leave);

    void deleteLeave(Integer id);

    void addLeave(LeaveBean leave);

    void updateLeave(LeaveBean leave);

    LeaveBean selectLeaveById(Integer id);
}
