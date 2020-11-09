package com.jk.controller;

import com.jk.entity.Careful;
import com.jk.entity.PageResult;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("careful")
public class CarefulController {

    @Resource
    private OldPeopleService oldPeopleService;

    @RequestMapping("findCarefulPage")
    public PageResult findCarefulPage(@RequestParam(value="currPage",defaultValue = "1") Integer currPage, @RequestParam(value="pageSize",defaultValue = "10") Integer pageSize,Careful careFul){
        return oldPeopleService.findCarefulPage(currPage,pageSize,careFul);
    }

    @RequestMapping("addCareful")
    public void addCareful(Careful careful){
        oldPeopleService.addCareful(careful);
    }

    @RequestMapping("deleteCarefulById")
    public void deleteCarefulById(Integer carefulId){
        oldPeopleService.deleteCarefulById(carefulId);
    }

    @RequestMapping("findCarefulById")
    public Careful findCarefulById(Integer carefulId){
        return oldPeopleService.findCarefulById(carefulId);
    }
}
