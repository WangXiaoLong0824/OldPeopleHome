package com.jk.controller;

import com.jk.entity.HomeBean;
import com.jk.entity.OutHomeBean;
import com.jk.entity.PageResult;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("outHome")
public class OutHomeController {

    @Resource
    private OldPeopleService oldPeopleService;
    //查询 t_outhome
    @RequestMapping("findOutHomeList")
    public PageResult findOutHomeList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, OutHomeBean outHomeBean){
        return oldPeopleService.findOutHomeList(currPage,pageSize,outHomeBean);
    }
    //删除
    @RequestMapping("deleteOutHome")
    public void  deleteOutHome(Integer id){
        oldPeopleService.deleteOutHome(id);
    }
    //新增
    @RequestMapping("addOutHome")
    public void addOutHome(OutHomeBean outHomeBean){
        oldPeopleService.addOutHome(outHomeBean);
    }
    //修改
    @RequestMapping("updateOutHome")
    public void updateOutHome(OutHomeBean outHomeBean){
        oldPeopleService.updateOutHome(outHomeBean);
    }
    //回显
    @RequestMapping("selectOutHomeById")
    public HomeBean selectOutHomeById(Integer id){
        return   oldPeopleService.selectOutHomeById(id);
    }
}
