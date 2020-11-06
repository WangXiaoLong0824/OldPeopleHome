package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.TurnHome;
import com.jk.service.OldPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("turnHome")
public class TurnHomeController {

    @Autowired
    private OldPeopleService turnHomeService;

    @RequestMapping("findOutHome")
    public PageResult findTurnHome(@RequestParam(value="currPage",defaultValue="1") Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize){
        return turnHomeService.findTurnHome(currPage,pageSize);
    }


    @RequestMapping("addOutHome")
    public String addOutHome(TurnHome turnHome){
        turnHomeService.addOutHome(turnHome);
        return "success";
    }

    @RequestMapping("deleteOutHomeById")
    public String deleteOutHomeById(Integer oId){
        turnHomeService.deleteOutHomeById(oId);
        return "success";
    }

    @RequestMapping("findOutHomeById")
    public TurnHome findOutHomeById(Integer oId){
        return turnHomeService.findOutHomeById(oId);
    }

}
