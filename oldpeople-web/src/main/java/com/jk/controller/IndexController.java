package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("toDormList")
    public String toDormList(){
        return "dorm/DormList";
    }

    @RequestMapping("toCarefulList")
    public String toCarefulList(){
        return "careful/CarefulList";
    }
}
