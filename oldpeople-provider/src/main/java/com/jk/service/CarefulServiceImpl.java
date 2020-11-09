package com.jk.service;

import com.jk.dao.CarefulMapper;
import com.jk.entity.Careful;
import com.jk.entity.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarefulServiceImpl implements CarefulService{

    @Resource
    private CarefulMapper carefulMapper;

    @Override
    public PageResult findCarefulPage(Integer currPage, Integer pageSize, Careful careFul) {
        Long total = carefulMapper.findCarefulCount(careFul);
        List<Careful> careFulList = carefulMapper.findCarefulPage(currPage,pageSize,careFul);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,careFulList,currPage,pageSize,totalPage);
    }

    @Override
    public void addCareful(Careful careful) {
        if (careful.getCarefulId() == null){
            carefulMapper.addCareful(careful);
        }else{
            carefulMapper.updateCareful(careful);
        }
    }

    @Override
    public void deleteCarefulById(Integer carefulId) {
        carefulMapper.deleteCarefulById(carefulId);
    }

    @Override
    public Careful findCarefulById(Integer carefulId) {
        return carefulMapper.findCarefulById(carefulId);
    }
}
