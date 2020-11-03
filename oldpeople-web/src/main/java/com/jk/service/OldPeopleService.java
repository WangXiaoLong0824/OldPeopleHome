package com.jk.service;

import com.jk.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "oldpeople-provider")
public interface OldPeopleService {
    //老人基本信息  WXL
    @RequestMapping("findPageOldPeople")
    public PageResult findPageOldPeople(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody OldPeople oldPeople);
    @RequestMapping("addOldPeople")
    public void addOldPeople(@RequestBody OldPeople oldPeople);
    @RequestMapping("deleteOldPeople")
    public void deleteOldPeople(@RequestParam Integer oldId);
    @RequestMapping("findOlePeopleById")
    public OldPeople findOlePeopleById(@RequestParam  Integer oldId);

    //员工基本信息  WXL
    @RequestMapping("findPageEmp")
    public PageResult findPageEmp(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody  Emp emp);
    @RequestMapping("addEmp")
    public void addEmp(@RequestBody Emp emp);
    @RequestMapping("deleteEmp")
    public void deleteEmp(@RequestParam Integer empId);
    @RequestMapping("findEmpById")
    public Emp findEmpById(@RequestParam Integer empId);
    
    //员工绩效 WXL
    @RequestMapping("findPagePerformance")
    public PageResult findPagePerformance(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody  Performance performance);
    @RequestMapping("addPerformance")
    public void addPerformance(@RequestBody Performance performance);
    @RequestMapping("deletePerformance")
    public void deletePerformance(@RequestParam Integer performanceId);
    @RequestMapping("findPerformanceById")
    public Emp findPerformanceById(@RequestParam Integer performanceId);

    //线下访客登记 WXL
    @RequestMapping("findPageUnder")
    public PageResult findPageUnder(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody  Under under);
    @RequestMapping("addUnder")
    public void addUnder(@RequestBody Under under);
    @RequestMapping("deleteUnder")
    public void deleteUnder(@RequestParam Integer underId);
    @RequestMapping("findUnderById")
    public Under findUnderById(@RequestParam Integer underId);
}
