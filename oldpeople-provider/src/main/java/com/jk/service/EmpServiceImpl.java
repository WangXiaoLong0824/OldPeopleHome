package com.jk.service;

import com.jk.dao.EmpMapper;
import com.jk.entity.Emp;
import com.jk.entity.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empMapper;
    @Override
    public PageResult findPageEmp(Integer currPage, Integer pageSize, Emp emp) {
        Long total = empMapper.findPageEmpCount(emp);
        List<Emp> userList = empMapper.findPageEmp(currPage,pageSize,emp);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,userList,currPage,pageSize,totalPage);
    }

    @Override
    public void addEmp(Emp emp) {
        if (emp.getEmpId()==null){
            empMapper.addEmp(emp);
        }else{
            empMapper.updateEmp(emp);
        }
    }

    @Override
    public void deleteEmp(Integer empId) {
        empMapper.deleteEmp(empId);
    }

    @Override
    public Emp findEmpById(Integer empId) {
        return empMapper.findEmpById(empId);
    }
}