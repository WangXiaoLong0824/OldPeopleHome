package com.jk.controller;

import com.jk.entity.Careful;
import com.jk.entity.PageResult;
import com.jk.service.CarefulService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("careful")
public class CarefulController {

    @Resource
    private CarefulService carefulService;

    @RequestMapping("findCarefulPage")
    public PageResult findCarefulPage(@RequestParam(value="currPage",defaultValue = "1") Integer currPage,@RequestParam(value="pageSize",defaultValue = "2") Integer pageSize, Careful careFul){
        return carefulService.findCarefulPage(currPage,pageSize,careFul);
    }

    @RequestMapping("addCareful")
    public String addCareful(Careful careful){
        carefulService.addCareful(careful);
        return "success";
    }

    @RequestMapping("deleteCarefulById")
    public String deleteCarefulById(Integer carefulId){
        carefulService.deleteCarefulById(carefulId);
        return "sucess";
    }

    @RequestMapping("findCarefulById")
    public Careful findCarefulById(Integer carefulId){
        return carefulService.findCarefulById(carefulId);
    }
}
