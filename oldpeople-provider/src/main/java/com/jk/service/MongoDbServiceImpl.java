package com.jk.service;

import com.jk.entity.LogBean;
import com.jk.entity.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MongoDbServiceImpl implements MongoDbService{
    private static final Logger logger = LoggerFactory.getLogger(MongoDbServiceImpl.class);

    @Resource
    private MongoTemplate mongoTemplate;

    @Override//系统日志分页查询
    public PageResult findLog(Integer currPage, Integer pageSize) {
        Query query = new Query();
        long total = mongoTemplate.count(query, LogBean.class);
        int start=(currPage-1)*pageSize;
        query.skip(start).limit(pageSize);
        List<LogBean>list=mongoTemplate.find(query,LogBean.class);
        Long totalPage=total%pageSize==1?total/pageSize:(total/pageSize+1);
        return new PageResult(total,list,currPage,pageSize,totalPage);
    }
}
