package com.jk.service;

import com.jk.dao.DormMapper;
import com.jk.entity.Careful;
import com.jk.entity.Dorm;
import com.jk.entity.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DormServiceImpl implements DormService{

    @Resource
    private DormMapper dormMapper;

    @Override
    public PageResult findDormPage(Integer currPage, Integer pageSize, Dorm dorm) {
        Long total = dormMapper.findDormCount(dorm);
        List<Dorm> dormList = dormMapper.findDormPage(currPage,pageSize,dorm);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,dormList,currPage,pageSize,totalPage);
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
