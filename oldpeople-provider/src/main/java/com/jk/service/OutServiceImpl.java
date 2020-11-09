package com.jk.service;

import com.jk.dao.OutMapper;
import com.jk.entity.Out;
import com.jk.entity.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OutServiceImpl implements OutService{
         @Resource
       private OutMapper outMapper;

    /*
     *  老人外出登记详细信息分页展示
     * */
    @Override
    public PageResult findOut(Integer currPage, Integer pageSize, Out out) {
        long total=outMapper.count(out);
        List<Out>list=outMapper.findOut(currPage,pageSize,out);
        Long totalPage=total%pageSize==1? total/pageSize : (total/pageSize+1);
        return new PageResult(total,list,currPage,pageSize,totalPage);
    }
    /*
     *   老人外出登记表新增数据
     * */
    @Override
    public void addOut(Out out) {
        if (out.getOutId()==null){
            //id为空执行新增
            outMapper.insert(out);
        }else{
            //id不为空执行修改
            outMapper.updateByPrimaryKeySelective(out);
        }

    }
    /*
     *   老人外出登记表回显数据
     * */
    @Override
    public Out oneOut(Integer ids) {
        return outMapper.selectByPrimaryKey(ids);
    }
    /*
     *   老人外出登记表单删
     * */
    @Override
    public void delOut(Integer ids) {
        outMapper.deleteByPrimaryKey(ids);
    }
}
