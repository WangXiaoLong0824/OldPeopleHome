package com.jk.service;

import com.jk.controller.UnderController;
import com.jk.dao.BedMapper;
import com.jk.entity.Bed;
import com.jk.entity.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BedServiceImpl implements BedService{
    private static final Logger logger = LoggerFactory.getLogger(BedServiceImpl.class);


    @Autowired
    private BedMapper bedMapper;


    @Override
    public PageResult findBed(Integer currPage, Integer pageSize,Bed bed) {
        Long total = bedMapper.findBedCount(bed);
        List<Bed> list = bedMapper.findBed(currPage,pageSize,bed);
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
