package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.People;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController //老人会员信息表
public class PeopleController {
    @Resource
    private OldPeopleService oldPeopleService;

    @RequestMapping("/findPeople")
    public PageResult findPeople(@RequestParam(value = "currPage",defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,People people){
        return oldPeopleService.findPeople(currPage,pageSize,people);
    }
    @RequestMapping("/addPeople")
    public void addPeople(@RequestBody People people){
        oldPeopleService.addPeople(people);
    }
    @RequestMapping("/onePeople")
    public People onePeople(@RequestParam Integer ids){
        return oldPeopleService.onePeople(ids);
    }
    @RequestMapping("/delOne")
    public void delOne(@RequestParam Integer ids){
        oldPeopleService.delOne(ids);
    }
}

