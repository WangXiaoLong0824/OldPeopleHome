package com.jk.controller;

import com.jk.entity.HomeBean;
import com.jk.entity.PageResult;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("home")
public class HomeController {
    @Resource
    private OldPeopleService oldPeopleService;
    //查询 t_home
    @RequestMapping("findHomeList")
    public PageResult findHomeList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize,HomeBean homeBean){
    return oldPeopleService.findHomeList(currPage,pageSize,homeBean);
    }
    //删除
    @RequestMapping("deleteHome")
    public void  deleteHome(Integer id){
        oldPeopleService.deleteHome(id);
    }
    //新增
    @RequestMapping("addHome")
    public void addHome(HomeBean homeBean){
        oldPeopleService.addHome(homeBean);
    }
    //修改
    @RequestMapping("updateHome")
    public void updateHome(HomeBean homeBean){
        oldPeopleService.updateHome(homeBean);
    }
    //回显
    @RequestMapping("selectHomeById")
    public HomeBean selectHomeById(Integer id){
     return   oldPeopleService.selectHomeById(id);
    }



}
