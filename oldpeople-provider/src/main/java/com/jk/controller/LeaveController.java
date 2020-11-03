package com.jk.controller;

import com.jk.entity.HomeBean;
import com.jk.entity.LeaveBean;
import com.jk.entity.PageResult;
import com.jk.service.LeaveService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LeaveController {
    @Resource
    private LeaveService leaveService;

    //查询 t_leave
    @RequestMapping("findLeaveList")
    public PageResult findLeaveList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody LeaveBean leave){
        return leaveService.findLeaveList(currPage,pageSize,leave);
    }
    //删除
    @RequestMapping("deleteLeave")
    public void  deleteLeave(Integer id){
        leaveService.deleteLeave(id);
    }
    //新增
    @RequestMapping("addLeave")
    public void addLeave(LeaveBean leave){
        leaveService.addLeave(leave);
    }
    //修改
    @RequestMapping("updateLeave")
    public void updateLeave(LeaveBean leave){
        leaveService.updateLeave(leave);
    }
    //回显
    @RequestMapping("selectLeaveById")
    public HomeBean selectLeaveById(Integer id){
        return   leaveService.selectLeaveById(id);
    }

}
