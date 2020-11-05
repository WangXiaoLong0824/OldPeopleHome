package com.jk.controller;

import com.jk.entity.OldPeople;
import com.jk.entity.PageResult;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OldPeopleController {
    @Resource
    private OldPeopleService oldPeopleService;
    @RequestMapping("findPageOldPeople")
    public PageResult findPageOldPeople(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody OldPeople oldPeople){
        return oldPeopleService.findPageOldPeople(currPage,pageSize,oldPeople);
    }
    @RequestMapping("addOldPeople")
    public void addOldPeople(@RequestBody OldPeople oldPeople){
        oldPeopleService.addOldPeople(oldPeople);
    }
    @RequestMapping("deleteOldPeople")
    public void deleteOldPeople(@RequestParam Integer oldId){
        oldPeopleService.deleteOldPeople(oldId);
    }
    @RequestMapping("findOlePeopleById")
    public OldPeople findOlePeopleById(@RequestParam  Integer oldId){
        return oldPeopleService.findOlePeopleById(oldId);
    }

}
