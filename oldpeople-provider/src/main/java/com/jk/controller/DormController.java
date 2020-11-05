package com.jk.controller;

import com.jk.entity.Dorm;
import com.jk.entity.PageResult;
import com.jk.service.DormService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DormController {

    @Resource
    private DormService dormService;

    @RequestMapping("findDormPage")
    public PageResult findDormPage(@RequestParam(value="currPage",defaultValue = "1") Integer currPage,@RequestParam(value="pageSize",defaultValue = "10") Integer pageSize,@RequestBody Dorm dorm){
        return dormService.findDormPage(currPage,pageSize,dorm);
    }

    @RequestMapping("addDorm")
    public String addDorm(@RequestBody Dorm dorm){
        dormService.addDorm(dorm);
        return "success";
    }

    @RequestMapping("deleteDormById")
    public String deleteDormById(@RequestParam Integer dormId){
        dormService.deleteDormById(dormId);
        return "success";
    }

    @RequestMapping("findDormById")
    public Dorm findDormById(@RequestParam Integer dormId){
        return dormService.findDormById(dormId);
    }
}
