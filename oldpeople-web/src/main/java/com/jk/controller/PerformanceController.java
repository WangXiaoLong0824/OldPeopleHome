package com.jk.controller;

import com.jk.entity.Emp;
import com.jk.entity.PageResult;
import com.jk.entity.Performance;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("performance")
public class PerformanceController {
    @Resource
    private OldPeopleService oldPeopleService;
    @RequestMapping("findPagePerformance")
    public PageResult findPagePerformance(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize, Performance performance){
        return oldPeopleService.findPagePerformance(currPage,pageSize,performance);
    }
    @RequestMapping("addPerformance")
    public void addPerformance(Performance performance){
        oldPeopleService.addPerformance(performance);
    }
    @RequestMapping("deletePerformance")
    public void deletePerformance(Integer performanceId){
        oldPeopleService.deletePerformance(performanceId);
    }
    @RequestMapping("findPerformanceById")
    public Performance findPerformanceById(Integer performanceId){
        return oldPeopleService.findPerformanceById(performanceId);
    }
}
