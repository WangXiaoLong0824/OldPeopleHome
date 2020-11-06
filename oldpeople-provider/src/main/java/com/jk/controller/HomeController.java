package com.jk.controller;

import com.jk.entity.HomeBean;
import com.jk.entity.PageResult;
import com.jk.service.HomeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HomeController {
    @Resource
    private HomeService homeService;
    //查询 t_home
    @RequestMapping("findHomeList")
    public PageResult findHomeList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody HomeBean homeBean){
    return homeService.findHomeList(currPage,pageSize,homeBean);
    }
    //删除
    @RequestMapping("deleteHome")
    public void  deleteHome(@RequestParam Integer id){
        homeService.deleteHome(id);
    }
    //新增
    @RequestMapping("addHome")
    public void addHome(@RequestBody HomeBean homeBean){
        homeService.addHome(homeBean);
    }
    //修改
    @RequestMapping("updateHome")
    public void updateHome(@RequestBody HomeBean homeBean){
        homeService.updateHome(homeBean);
    }
    //回显
    @RequestMapping("selectHomeById")
    public HomeBean selectHomeById(@RequestParam Integer id){
     return   homeService.selectHomeById(id);
    }



}
