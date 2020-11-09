package com.jk.controller;

import com.jk.entity.Dorm;
import com.jk.entity.PageResult;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("dorm")
public class DormController {

    @Resource
    private OldPeopleService oldPeopleService;

    @RequestMapping("findDormPage")
    public PageResult findDormPage(@RequestParam(value="currPage",defaultValue = "1") Integer currPage, @RequestParam(value="pageSize",defaultValue = "10") Integer pageSize,Dorm dorm){
        return oldPeopleService.findDormPage(currPage,pageSize,dorm);
    }

    @RequestMapping("addDorm")
    public void addDorm(Dorm dorm){
        oldPeopleService.addDorm(dorm);
    }

    @RequestMapping("deleteDormById")
    public void deleteDormById(Integer dormId){
        oldPeopleService.deleteDormById(dormId);
    }

    @RequestMapping("findDormById")
    public Dorm findDormById(Integer dormId){
        return oldPeopleService.findDormById(dormId);
    }
}
