package com.jk.controller;

import com.jk.entity.Emp;
import com.jk.entity.Emple;
import com.jk.entity.PageResult;
import com.jk.entity.Position;
import com.jk.service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmpController {
    private static final Logger logger = LoggerFactory.getLogger(EmpController.class);

    @Resource
    private EmpService empService;
    @RequestMapping("findPageEmp")
    public PageResult findPageEmp(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody Emp emp){
        return empService.findPageEmp(currPage,pageSize,emp);
    }
    @RequestMapping("addEmp")
    public void addEmp(@RequestBody Emp emp){
        empService.addEmp(emp);
    }
    @RequestMapping("deleteEmp")
    public void deleteEmp(@RequestParam Integer empId){
        empService.deleteEmp(empId);
    }
    @RequestMapping("findEmpById")
    public Emp findEmpById(@RequestParam Integer empId){
        return empService.findEmpById(empId);
    }
    @RequestMapping("getEmple")
    public List<Emple> getEmple(){
        return empService.getEmple();
    }
    @RequestMapping("getPosition")
    public List<Position> getPosition(@RequestParam Integer empleId){
        return  empService.getPosition(empleId);
    }
}
