package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.TurnHome;
import com.jk.dao.TurnHomeMapper;
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
    public void updateTurnHome(TurnHome turnHome) {
        turnHomeMapper.updateTurnHome(turnHome);
    }

    @Override
    public TurnHome findTurnHomeById(Integer oId) {
        return turnHomeMapper.findTurnHomeById(oId);
    }


}
