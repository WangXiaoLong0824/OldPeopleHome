package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.TurnHome;
import com.jk.service.TurnHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurnHomeController {

    @Autowired
    private TurnHomeService turnHomeService;

    @RequestMapping("findOutHome")
    public PageResult findTurnHome(@RequestParam(value="currPage",defaultValue="1") Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize){
        return turnHomeService.findTurnHome(currPage,pageSize);
    }


    @RequestMapping("addTurnHome")
    public String addOutHome(@RequestBody TurnHome turnHome){
        turnHomeService.addOutHome(turnHome);
        return "success";
    }

    @RequestMapping("deleteOutHomeById")
    public String deleteOutHomeById(@RequestParam Integer oId){
        turnHomeService.deleteOutHomeById(oId);
        return "success";
    }

    @RequestMapping("findOutHomeById")
    public TurnHome findOutHomeById(@RequestParam Integer oId){
        return turnHomeService.findOutHomeById(oId);
    }
}
