package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    //t_home
    @RequestMapping("toHome")
    public String tohome() {
        return "home/hoomList";
    }

    //t_outhomt
    @RequestMapping("toOuthome")
    public String toOuthome() {
        return "outHome/outHomeLIst";
    }

    //t_leave
    @RequestMapping("toLeave")
    public String toLeave() {
        return "leave/leaveList";
    }
    //t_order
    @RequestMapping("toOrder")
    public String toOrder() {
        return "order/orderList";
    }
}
