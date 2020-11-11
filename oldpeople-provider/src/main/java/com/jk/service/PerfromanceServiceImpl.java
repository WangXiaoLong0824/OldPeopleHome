package com.jk.service;

import com.jk.dao.PerformanceMapper;
import com.jk.entity.PageResult;
import com.jk.entity.Performance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PerfromanceServiceImpl implements PerformanceService{
    private static final Logger logger = LoggerFactory.getLogger(PerfromanceServiceImpl.class);

    @Resource
    private PerformanceMapper performanceMapper;
    @Override
    public PageResult findPagePerformance(Integer currPage, Integer pageSize, Performance performance) {
        Long total = performanceMapper.findPagePerformanceCount(performance);
        List<Performance> userList = performanceMapper.findPagePerformance(currPage,pageSize,performance);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,userList,currPage,pageSize,totalPage);
    }

    @Override
    public void addPerformance(Performance performance) {
        if (performance.getPerformanceId()==null){
            performanceMapper.addPerformance(performance);
        }else{
            performanceMapper.updatePerformance(performance);
        }

    }

    @Override
    public void deletePerformance(Integer performanceId) {
        performanceMapper.deletePerformance(performanceId);
    }

    @Override
    public Performance findPerformanceById(Integer performanceId) {
        return performanceMapper.findPerformanceById(performanceId);
    }
}
