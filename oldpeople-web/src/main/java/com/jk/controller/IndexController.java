package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping("toBed")
    public  String toBed(){

        return "bed";
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
