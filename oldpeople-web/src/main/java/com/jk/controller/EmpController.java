package com.jk.controller;

import com.jk.entity.Emp;
import com.jk.entity.PageResult;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("emp")
public class EmpController {
    @Resource
    private OldPeopleService oldPeopleService;
    @RequestMapping("findPageEmp")
    public PageResult findPageEmp(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, Emp emp){
        return oldPeopleService.findPageEmp(currPage,pageSize,emp);
    }
    @RequestMapping("addEmp")
    public void addEmp(Emp emp){
        oldPeopleService.addEmp(emp);
    }
    @RequestMapping("deleteEmp")
    public void deleteEmp(Integer empId){
        oldPeopleService.deleteEmp(empId);
    }
    @RequestMapping("findEmpById")
    public Emp findEmpById(Integer empId){
        return oldPeopleService.findEmpById(empId);
    }
}