package com.jk.controller;

import com.jk.entity.Dorm;
import com.jk.entity.PageResult;
import com.jk.service.DormService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("dorm")
public class DormController {

    @Resource
    private DormService dormService;

    @RequestMapping("findDormPage")
    public List<Dorm> findDormPage(){
        return dormService.findDormPage();
    }

    @RequestMapping("addDorm")
    public String addDorm(Dorm dorm){
        dormService.addDorm(dorm);
        return "success";
    }

    @RequestMapping("deleteDormById")
    public String deleteDormById(Integer dormId){
        dormService.deleteDormById(dormId);
        return "success";
    }

    @RequestMapping("findDormById")
    public Dorm findDormById(Integer dormId){
        return dormService.findDormById(dormId);
    }
}
