package com.jk.controller;

import com.jk.entity.Out;
import com.jk.entity.PageResult;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OutController {
        @Resource
    private OldPeopleService oldPeopleService;

      //老人外出登记表
    @RequestMapping("/findOut")
    public PageResult findOut(@RequestParam(value = "currPage",defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize, Out out){
        return oldPeopleService.findOut(currPage,pageSize,out);
    }
    @RequestMapping("/addOut")
    public void addOut(@RequestBody Out out){
        oldPeopleService.addOut(out);
    }
    @RequestMapping("/oneOut")
    public Out oneOut(@RequestParam Integer ids){
        return oldPeopleService.oneOut(ids);
    }
    @RequestMapping("/delOut")
    public void delOut(@RequestParam Integer ids){
        oldPeopleService.delOut(ids);
    }
}
