package com.jk.service;

import com.jk.entity.Emp;
import com.jk.entity.Emple;
import com.jk.entity.PageResult;
import com.jk.entity.Position;

import java.util.List;

public interface EmpService {
    PageResult findPageEmp(Integer currPage, Integer pageSize, Emp emp);

    void addEmp(Emp emp);

    void deleteEmp(Integer empId);

    Emp findEmpById(Integer empId);

    List<Emple> getEmple();

    List<Position> getPosition(Integer empleId);
}
