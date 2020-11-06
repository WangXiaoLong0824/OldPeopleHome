package com.jk.service;

import com.jk.dao.OldPeopleMapper;
import com.jk.entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OldPeopleServiceImpl implements OldPeopleService{
    @Resource
    private OldPeopleMapper oldPeopleMapper;
    @Override
    public PageResult findPageOldPeople(Integer currPage, Integer pageSize, OldPeople oldPeople) {
        Long total = oldPeopleMapper.findPageOldPeopleCount(oldPeople);
        List<OldPeople> userList = oldPeopleMapper.findPageOldPeople(currPage,pageSize,oldPeople);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,userList,currPage,pageSize,totalPage);
    }

    @Override
    public void addOldPeople(OldPeople oldPeople) {
        if (oldPeople.getOldId()==null){
            oldPeopleMapper.addOldPeople(oldPeople);
        }
            oldPeopleMapper.updateOldPeople(oldPeople);
    }

    @Override
    public void deleteOldPeople(Integer oldId) {
        oldPeopleMapper.deleteOldPeople(oldId);
    }

    @Override
    public OldPeople findOlePeopleById(Integer oldId) {
        return oldPeopleMapper.findOlePeopleById(oldId);
    }

    @Override
    public List<TbProvinces> getSheng() {
        return oldPeopleMapper.getSheng();
    }

    @Override
    public List<TbCities> findShi(String provinceid) {
        return oldPeopleMapper.findShi(provinceid);
    }

    @Override
    public List<TbAreas> findXian(String cityid) {
        return oldPeopleMapper.findXian(cityid);
    }
}
