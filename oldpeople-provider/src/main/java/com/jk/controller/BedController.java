package com.jk.controller;

import com.jk.entity.*;
import com.jk.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BedController {

    @Autowired
    private BedService bedService;

    @RequestMapping("/findBed")
    public PageResult findBed(@RequestParam(value="currPage",defaultValue="1") Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize,@RequestBody Bed bed){
        return bedService.findBed(currPage,pageSize,bed);
    }


    @RequestMapping("/addBed")
    public void addBed(@RequestBody  Bed bed){
        bedService.addBed(bed);
    }

    @RequestMapping("/deleteBedById")
    public void deleteBedById(@RequestParam Integer bedId){
        bedService.deleteBedById(bedId);
    }

    @RequestMapping("/findBedById")
    public Bed findBedById(@RequestParam Integer bedId){
        return bedService.findBedById(bedId);
    }


    @RequestMapping("/getDorm")
    public List<Dorm> getDorm(){
        return bedService.getDorm();
    }

    @RequestMapping("/getPerson")
    public List<Person> getPerson(){
        return bedService.getPerson();
    }

    @RequestMapping("/getStorey")
    public List<Storey> getStorey(){
        return bedService.getStorey();
    }

}
