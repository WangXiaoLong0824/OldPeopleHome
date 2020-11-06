package com.jk.controller;

import com.jk.entity.HomeBean;
import com.jk.entity.OutHomeBean;
import com.jk.entity.PageResult;
import com.jk.service.HomeService;
import com.jk.service.OutHomeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OutHomeController {

    @Resource
    private OutHomeService outHomeService;
    //查询 t_outhome
    @RequestMapping("findOutHomeList")
    public PageResult findOutHomeList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody OutHomeBean outHomeBean){
        return outHomeService.findOutHomeList(currPage,pageSize,outHomeBean);
    }
    //删除
    @RequestMapping("deleteOutHome")
    public void  deleteOutHome(@RequestParam Integer id){
        outHomeService.deleteOutHome(id);
    }
    //新增
    @RequestMapping("addOutHome")
    public void addOutHome(@RequestBody OutHomeBean outHomeBean){
        outHomeService.addOutHome(outHomeBean);
    }
    //修改
    @RequestMapping("updateOutHome")
    public void updateOutHome(@RequestBody OutHomeBean outHomeBean){
        outHomeService.updateOutHome(outHomeBean);
    }
    //回显
    @RequestMapping("selectOutHomeById")
    public OutHomeBean selectOutHomeById(@RequestParam Integer id){
        return   outHomeService.selectOutHomeById(id);
    }
}
