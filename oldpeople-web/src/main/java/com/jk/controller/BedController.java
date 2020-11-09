package com.jk.controller;

import com.jk.entity.Bed;
import com.jk.entity.PageResult;
import com.jk.service.OldPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BedController {

    @Autowired
    private OldPeopleService bedService;

    @RequestMapping("/findBed")
    public PageResult findBed(@RequestParam(value="currPage",defaultValue="1") Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize,Bed bed){
        return bedService.findBed(currPage,pageSize,bed);
    }


    @RequestMapping("/addBed")
    public void addBed(Bed bed){
        bedService.addBed(bed);
    }

    @RequestMapping("/deleteBedById")
    public void deleteBedById(Integer bedId){
        bedService.deleteBedById(bedId);
    }

    @RequestMapping("/findBedById")
    public Bed findBedById(Integer bedId){
        return bedService.findBedById(bedId);
    }

}
