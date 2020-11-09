package com.jk.controller;

import com.jk.entity.Careful;
import com.jk.entity.PageResult;
import com.jk.service.CarefulService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CarefulController {

    @Resource
    private CarefulService carefulService;

    @RequestMapping("findCarefulPage")
    public PageResult findCarefulPage(@RequestParam(value="currPage",defaultValue = "1") Integer currPage,@RequestParam(value="pageSize",defaultValue = "10") Integer pageSize,@RequestBody Careful careFul){
        return carefulService.findCarefulPage(currPage,pageSize,careFul);
    }

    @RequestMapping("addCareful")
    public String addCareful(@RequestBody Careful careful){
        carefulService.addCareful(careful);
        return "success";
    }

    @RequestMapping("deleteCarefulById")
    public String deleteCarefulById(@RequestParam Integer carefulId){
        carefulService.deleteCarefulById(carefulId);
        return "sucess";
    }

    @RequestMapping("findCarefulById")
    public Careful findCarefulById(@RequestParam Integer carefulId){
        return carefulService.findCarefulById(carefulId);
    }
}
