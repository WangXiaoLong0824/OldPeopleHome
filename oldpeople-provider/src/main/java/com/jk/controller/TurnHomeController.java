package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.service.TurnHomeService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
