package com.jk.controller;

import com.jk.entity.HomeBean;
import com.jk.entity.LeaveBean;
import com.jk.entity.PageResult;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("leave")
public class LeaveController {
    @Resource
    private OldPeopleService oldPeopleService;

    //查询 t_leave
    @RequestMapping("findLeaveList")
    public PageResult findLeaveList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize,  LeaveBean leave){
        return oldPeopleService.findLeaveList(currPage,pageSize,leave);
    }
    //删除
    @RequestMapping("deleteLeave")
    public void  deleteLeave(Integer id){
        oldPeopleService.deleteLeave(id);
    }
    //新增
    @RequestMapping("addLeave")
    public void addLeave(LeaveBean leave){
        oldPeopleService.addLeave(leave);
    }
    //修改
    @RequestMapping("updateLeave")
    public void updateLeave(LeaveBean leave){
        oldPeopleService.updateLeave(leave);
    }
    //回显
    @RequestMapping("selectLeaveById")
    public LeaveBean selectLeaveById(Integer id){
        return   oldPeopleService.selectLeaveById(id);
    }

}
