package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.Top;
import com.jk.entity.TurnHome;
import com.jk.entity.Under;
import com.jk.service.OldPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TurnHomeController {

    @Autowired
    private OldPeopleService turnHomeService;

    @RequestMapping("/findTurnHome")
    public PageResult findTurnHome(@RequestParam(value="currPage",defaultValue="1") Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize){
        return turnHomeService.findTurnHome(currPage,pageSize);
    }
    @RequestMapping("/updateTurnHome")
    public void updateTurnHome(TurnHome turnHome){
        turnHomeService.updateTurnHome(turnHome);
    }
    @RequestMapping("/findTurnHomeById")
    public TurnHome findTurnHomeById(Integer oId){
        return turnHomeService.findTurnHomeById(oId);
    }

}
