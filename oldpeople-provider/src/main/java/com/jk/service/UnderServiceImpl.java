package com.jk.service;

import com.jk.dao.UnderMapper;
import com.jk.entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UnderServiceImpl implements UnderService{
    @Resource
    private UnderMapper underMapper;

    @Override
    public PageResult findPageUnder(Integer currPage, Integer pageSize, Under under) {
        Long total = underMapper.findPageUnderCount(under);
        List<Under> userList = underMapper.findPageUnder(currPage,pageSize,under);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,userList,currPage,pageSize,totalPage);
    }

    @Override
    public void addUnder(Under under) {
        if (under.getUnderId()==null){
            underMapper.addUnder(under);
        }else{
            underMapper.updateUnder(under);
        }

    }

    @Override
    public void deleteUnder(Integer underId) {
        underMapper.deleteUnder(underId);
    }

    @Override
    public Under findUnderById(Integer underId) {
        return underMapper.findUnderById(underId);
    }

    @Override
    public List<OldPeople> getOld() {
        return underMapper.getOld();
    }

    @Override
    public List<Room> getRoom() {
        return underMapper.getRoom();
    }
}
