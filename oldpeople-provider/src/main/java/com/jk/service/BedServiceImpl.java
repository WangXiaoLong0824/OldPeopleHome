package com.jk.service;

import com.jk.entity.Bed;
import com.jk.entity.PageResult;
import com.jk.entity.TurnHome;
import com.jk.mapper.BebMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedServiceImpl implements BedService{

    @Autowired
    private BebMapper bedMapper;


    @Override
    public PageResult findBed(Integer currPage, Integer pageSize) {
        Long total = bedMapper.findBedCount();
        List<Bed> list = bedMapper.findBed(currPage,pageSize);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,list,currPage,pageSize,totalPage);
    }

    @Override
    public void addBed(Bed bed) {
        if (bed.getBedId()==null){
            bedMapper.addBed(bed);
        }else {
            bedMapper.updateBed(bed);
        }
    }

    @Override
    public void deleteBedById(Integer bedId) {
        bedMapper.deleteBedById(bedId);
    }

    @Override
    public Bed findBedById(Integer bedId) {
        return bedMapper.findBedById(bedId);
    }
}
