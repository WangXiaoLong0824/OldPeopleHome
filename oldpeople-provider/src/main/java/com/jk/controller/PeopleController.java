package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.People;
import com.jk.service.PeopleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class PeopleController {
        @Resource
    private PeopleService peopleService;

    /*
    *   老人会员信息表分页
    * */
    @RequestMapping("/findPeople")
    public PageResult findPeople(@RequestParam(value = "currPage",defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize, @RequestBody People people){
            return peopleService.findPeople(currPage,pageSize,people);
        }

    /*
    *  老人会员新增数据
    * */
    @RequestMapping("/addPeople")
    public void addPeople(@RequestBody People people){
        peopleService.addPeople(people);
    }
    /*
    *   老人会员回显数据
    * */
    @RequestMapping("/onePeople")
    public People onePeople(@RequestParam Integer ids){
        return peopleService.onePeople(ids);
    }
    /*
    *   老人会员单删
    * */
    @RequestMapping("/delOne")
    public void delOne(@RequestParam Integer ids){
        peopleService.delOne(ids);
    }
}
