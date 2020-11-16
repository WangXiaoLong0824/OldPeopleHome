package com.jk.service;

import com.jk.dao.BedMapper;
import com.jk.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedServiceImpl implements BedService{

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

    @Override
    public List<Dorm> getDorm() {
        return bedMapper.getDorm();
    }

    @Override
    public List<Person> getPerson() {
        return bedMapper.getPerson();
    }

    @Override
    public List<Storey> getStorey() {
        return bedMapper.getStorey();
    }
}
