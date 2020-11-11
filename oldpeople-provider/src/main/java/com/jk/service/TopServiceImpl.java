package com.jk.service;

import com.jk.dao.TopMapper;
import com.jk.entity.PageResult;
import com.jk.entity.Top;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TopServiceImpl implements TopService{
    private static final Logger logger = LoggerFactory.getLogger(TopServiceImpl.class);

    @Resource
    private TopMapper topMapper;
    /*
     *   预约线上表分页 查询
     * */
    @Override
    public PageResult findTop(Integer currPage, Integer pageSize, Top top) {
        long total=topMapper.count(top);
        List<Top>list=topMapper.findTop(currPage,pageSize,top);
        Long totalPage=total%pageSize==1? total/pageSize : (total/pageSize+1);
        return new PageResult(total,list,currPage,pageSize,totalPage);
    }
    /*
     *   预约线上表新增
     * */
    @Override
    public void addTop(Top top) {
        topMapper.insert(top);
    }
    /*
    *   删除
    * */
    @Override
    public void delTop(Integer ids) {
        topMapper.deleteByPrimaryKey(ids);
    }
}