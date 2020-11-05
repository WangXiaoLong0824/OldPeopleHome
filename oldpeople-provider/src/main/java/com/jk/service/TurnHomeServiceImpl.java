package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.TurnHome;
import com.jk.mapper.TurnHomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnHomeServiceImpl implements TurnHomeService{

    @Autowired
    private TurnHomeMapper turnHomeMapper;

    @Override
    public PageResult findTurnHome(Integer currPage, Integer pageSize) {
        Long total = turnHomeMapper.findTurnHomeCount();
        List<TurnHome> list = turnHomeMapper.findTurnHome(currPage,pageSize);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,list,currPage,pageSize,totalPage);
    }

    @Override
    public void addOutHome(TurnHome turnHome) {
        if (turnHome.getOId()==null){
            turnHomeMapper.addOutHome(turnHome);
        }else {
            turnHomeMapper.updateOutHome(turnHome);
        }

    }

    @Override
    public void deleteOutHomeById(Integer oId) {
        turnHomeMapper.deleteOutHomeById(oId);
    }

    @Override
    public TurnHome findOutHomeById(Integer oId) {
        return turnHomeMapper.findOutHomeById(oId);
    }

}
