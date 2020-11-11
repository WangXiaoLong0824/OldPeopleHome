package com.jk.service;

import com.jk.dao.PeopleMapper;
import com.jk.entity.PageResult;
import com.jk.entity.People;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService{
    private static final Logger logger = LoggerFactory.getLogger(PeopleServiceImpl.class);

    @Resource
    private PeopleMapper peopleMapper;
    /*
     *   老人会员信息表分页
     * */
    @Override
    public PageResult findPeople(Integer currPage, Integer pageSize, People people) {

        long total=peopleMapper.count(people);
        List<People>list=peopleMapper.findPeople(currPage,pageSize,people);

        Long totalPage=total%pageSize==1? total/pageSize : (total/pageSize+1) ;
        return new PageResult(total,list,currPage,pageSize,totalPage);
    }
    /*
    *   新增数据
    * */
    @Override
    public void addPeople(People people) {
        if (people==null){
            //ID为空新增数据
            peopleMapper.insert(people);
        }else{
            //ID不为空则修改数据
            peopleMapper.updateByPrimaryKeySelective(people);
        }

    }
    /*
     *   回显数据
     * */
    @Override
    public People onePeople(Integer ids) {
        return peopleMapper.selectByPrimaryKey(ids);
    }
    /*
    *  单删
    * */
    @Override
    public void delOne(Integer ids) {
        peopleMapper.deleteByPrimaryKey(ids);
    }
}
