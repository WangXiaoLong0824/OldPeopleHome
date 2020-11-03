package com.jk.service;

import com.jk.entity.Emp;
import com.jk.entity.PageResult;

public interface EmpService {
    PageResult findPageEmp(Integer currPage, Integer pageSize, Emp emp);

    void addEmp(Emp emp);

    void deleteEmp(Integer empId);

    Emp findEmpById(Integer empId);
}
