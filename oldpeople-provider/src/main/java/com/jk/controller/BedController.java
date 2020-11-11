package com.jk.controller;

import com.jk.entity.Bed;
import com.jk.entity.PageResult;
import com.jk.service.BedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BedController {
    private static final Logger logger = LoggerFactory.getLogger(BedController.class);
    @Autowired
    private BedService bedService;

    @RequestMapping("/findBed")
    public PageResult findBed(@RequestParam(value="currPage",defaultValue="1") Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize,@RequestBody Bed bed){
        return bedService.findBed(currPage,pageSize,bed);
    }


    @RequestMapping("/addBed")
    public String addBed(@RequestBody  Bed bed){
        bedService.addBed(bed);
        return "success";
    }

    @RequestMapping("/deleteBedById")
    public String deleteBedById(@RequestParam Integer bedId){
        bedService.deleteBedById(bedId);
        return "success";
    }

    @RequestMapping("/findBedById")
    public Bed findBedById(@RequestParam Integer bedId){
        return bedService.findBedById(bedId);
    }

}
