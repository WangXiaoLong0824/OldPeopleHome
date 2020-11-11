package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.TurnHome;
import com.jk.dao.TurnHomeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnHomeServiceImpl implements TurnHomeService{
    private static final Logger logger = LoggerFactory.getLogger(TurnHomeServiceImpl.class);


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
