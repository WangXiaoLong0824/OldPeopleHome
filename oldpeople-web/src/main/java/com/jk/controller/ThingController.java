package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.Thing;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ThingController {
        @Resource
    private OldPeopleService oldPeopleService;
    //员工请假详细信息表
    @RequestMapping("/findThing")
    public PageResult findThing(@RequestParam(value = "currPage",defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize, Thing thing){
        return oldPeopleService.findThing(currPage,pageSize,thing);
    }
    @RequestMapping("/addThing")
    public void addThing(@RequestBody Thing thing){
        oldPeopleService.addThing(thing);
    }
    @RequestMapping("/delThing")
    public void delThing(@RequestParam Integer ids){
        oldPeopleService.delThing(ids);
    }
    @RequestMapping("/oneThing")
    public Thing oneThing(@RequestParam Integer ids){
        return oldPeopleService.oneThing(ids);
    }
}
