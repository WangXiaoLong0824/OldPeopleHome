package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    //老人会员页面跳转
    @RequestMapping("/people")
    public String find() {
        return "People/vip";
    }
    //老人外出登记页面跳转
    @RequestMapping("/out")
    public String out(){
        return "Out/OutList";
    }
    //员工请假详细信息表
    @RequestMapping("/thing")
    public String thing(){
        return "Thing/ThingList";
    }
    //老人床位详细登记表
    @RequestMapping("/bed")
    public String bed(){
        return "Bed/BedList";
    }
    //线上预约表跳转
    @RequestMapping("/top")
    public String top(){
        return "Top/TopList";
    }
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


    @RequestMapping("toBed")
    public  String toBed(){

        return "bed/bed";
    }
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
}
