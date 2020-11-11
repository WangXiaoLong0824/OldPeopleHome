package com.jk.service;

import com.jk.dao.LeaveMapper;
import com.jk.entity.HomeBean;
import com.jk.entity.LeaveBean;
import com.jk.entity.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LeaveServiceImpl implements  LeaveService{
    private static final Logger logger = LoggerFactory.getLogger(LeaveServiceImpl.class);

    @Resource
    private LeaveMapper leaveMapper;

    @Override
    public PageResult findLeaveList(Integer currPage, Integer pageSize, LeaveBean leave) {
        Long total = leaveMapper.findLeaveList(leave);
        List<LeaveBean> leaveList = leaveMapper.findLeaveListPage(currPage,pageSize,leave);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,leaveList,currPage,pageSize,totalPage);
    }

    @Override
    public void deleteLeave(Integer id) {
        leaveMapper.deleteLeave(id);
    }

    @Override
    public void addLeave(LeaveBean leave) {
        if(leave.getLeaveId()==null){
            leaveMapper.addLeave(leave);
        }else {
            leaveMapper.updateLeave(leave);
        }

    }

    @Override
    public void updateLeave(LeaveBean leave) {
        leaveMapper.updateLeave(leave);
    }

    @Override
    public LeaveBean selectLeaveById(Integer id) {
        return leaveMapper.selectLeaveById(id);
    }
}