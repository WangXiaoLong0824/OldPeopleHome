package com.jk.service;

import com.jk.dao.ThingMapper;
import com.jk.entity.PageResult;
import com.jk.entity.Thing;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ThingServiceImpl implements ThingService{
    @Resource
    private ThingMapper thingMapper;
    /*
     *   员工请假表信息
     * */
    @Override
    public PageResult findThing(Integer currPage, Integer pageSize, Thing thing) {
        long total=thingMapper.count(thing);
        List<Thing>list=thingMapper.findThing(currPage,pageSize,thing);
        Long totalPage= total%pageSize==1? total/pageSize : (total/pageSize+1);
        return new PageResult(total,list,currPage,pageSize,totalPage);
    }
    /*
     *   员工请假新增数据
     * */
    @Override
    public void addThing(Thing thing) {
        if (thing.getThingId()==null){
            //id为空执行新增
            thingMapper.insert(thing);
        }else{
            //id不为空时
            thingMapper.updateByPrimaryKeySelective(thing);
        }
    }
    /*
     *   员工请假单删表
     * */
    @Override
    public void delThing(Integer ids) {
        thingMapper.deleteByPrimaryKey(ids);
    }
    /*
     *   员工请假表回显数据
     * */
    @Override
    public Thing oneThing(Integer ids) {
        return thingMapper.selectByPrimaryKey(ids);
    }
}
