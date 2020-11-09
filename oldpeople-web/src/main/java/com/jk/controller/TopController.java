package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.Top;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TopController {
        @Resource
    private OldPeopleService oldPeopleService;

    //预约线上信息表
    @RequestMapping("/findTop")
    public PageResult findTop(@RequestParam(value = "currPage",defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,Top top){
        return oldPeopleService.findTop(currPage,pageSize,top);
    }
    @RequestMapping("/addTop")
    public void addTop(@RequestBody Top top){
        oldPeopleService.addTop(top);
    }
    @RequestMapping("/delTop")
    public void delTop(@RequestParam Integer ids){
        oldPeopleService.delTop(ids);
    }
}
