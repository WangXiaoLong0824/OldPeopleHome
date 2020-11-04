package com.jk.controller;

import com.jk.config.PageResult;
import com.jk.entity.Thing;
import com.jk.service.ThingService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ThingController {
        @Resource
    private ThingService thingService;

    /*
    *   员工请假表信息
    * */
    @RequestMapping("/findThing")
    public PageResult findThing(@RequestParam Integer currPage,@RequestParam Integer pageSize,@RequestBody Thing thing){
        return thingService.findThing(currPage,pageSize,thing);
    }
    /*
    *   员工请假新增数据
    * */
    @RequestMapping("/addThing")
    public void addThing(@RequestBody Thing thing){
        thingService.addThing(thing);
    }
    /*
    *   员工请假单删表
    * */
    @RequestMapping("/delThing")
    public void delThing(@RequestParam Integer ids){
        thingService.delThing(ids);
    }
    /*
    *   员工请假表回显数据
    * */
    @RequestMapping("/oneThing")
    public Thing oneThing(@RequestParam Integer ids){
        return thingService.oneThing(ids);
    }
}