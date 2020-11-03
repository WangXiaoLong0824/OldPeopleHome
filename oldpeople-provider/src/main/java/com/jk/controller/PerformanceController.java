package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.Performance;
import com.jk.service.PerformanceService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PerformanceController {
    @Resource
    private PerformanceService performanceService;
    @RequestMapping("findPagePerformance")
    public PageResult findPagePerformance(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody Performance performance){
        return performanceService.findPagePerformance(currPage,pageSize,performance);
    }
    @RequestMapping("addPerformance")
    public void addPerformance(@RequestBody Performance performance){
        performanceService.addPerformance(performance);
    }
    @RequestMapping("deletePerformance")
    public void deletePerformance(@RequestParam Integer performanceId){
        performanceService.deletePerformance(performanceId);
    }
    @RequestMapping("findPerformanceById")
    public Performance findPerformanceById(@RequestParam Integer performanceId){
        return performanceService.findPerformanceById(performanceId);
    }
}
