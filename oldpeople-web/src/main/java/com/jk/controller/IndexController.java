package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class IndexController {
    @RequestMapping("toLaoRenXinXi")
    public String toLaoRenXinXi(){
        return "laorenguanli/laorenxinxi";
    }
    @RequestMapping("toEmp")
    public String toEmp(){
        return "laorenguanli/emp";
    }
    @RequestMapping("toPerformance")
    public String toPerformance(){
        return "laorenguanli/performance";
    }
    @RequestMapping("toUnder")
    public String toUnder(){
        return "laorenguanli/under";
    }

    @RequestMapping("toDormList")
    public String toDormList(){
        return "dorm/DormList";
    }

    @RequestMapping("toCarefulList")
    public String toCarefulList(){
        return "careful/CarefulList";
    }

    @RequestMapping("toRoomList")
    public String toRoomList(){ return "room/RoomList"; }
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
    @RequestMapping("leave")
    public String leave() {
        return "leave/leave";
    }
    //t_order
    @RequestMapping("toOrder")
    public String toOrder() {
        return "order/orderList";
    }
    @RequestMapping("toHello")
    public String toHello() {
        return "hello/hello";
    }
}
