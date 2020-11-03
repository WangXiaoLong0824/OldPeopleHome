package com.jk.service;

import com.jk.dao.DormMapper;
import com.jk.entity.Dorm;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DormServiceImpl implements DormService{

    @Resource
    private DormMapper dormMapper;

    @Override
    public List<Dorm> findDormPage() {
        return dormMapper.findDormPage();
    }

    @Override
    public void addDorm(Dorm dorm) {
        if (dorm.getDormId() == null){
            dormMapper.addDorm(dorm);
        }else{
            dormMapper.updateDorm(dorm);
        }
    }

    @Override
    public void deleteDormById(Integer dormId) {
        dormMapper.deleteDormById(dormId);
    }

    @Override
    public Dorm findDormById(Integer dormId) {
        return dormMapper.findDormById(dormId);
    }
}
