package com.jk.service;

import com.jk.dao.OutHomeMapper;
import com.jk.entity.HomeBean;
import com.jk.entity.OutHomeBean;
import com.jk.entity.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OutHomeServiceImpl implements  OutHomeService {
    @Resource
    private OutHomeMapper outHomeMapper;
    @Override
    public void deleteOutHome(Integer id) {
        outHomeMapper.deleteOutHome(id);
    }

    @Override
    public void addOutHome(OutHomeBean outHomeBean) {
        outHomeMapper.addOutHome(outHomeBean);
    }

    @Override
    public void updateOutHome(OutHomeBean outHomeBean) {
        outHomeMapper.updateOutHome(outHomeBean);
    }

    @Override
    public HomeBean selectOutHomeById(Integer id) {
        return outHomeMapper.selectOutHomeById(id);
    }

    @Override
    public PageResult findOutHomeList(Integer currPage, Integer pageSize, OutHomeBean outHomeBean) {
        Long total = outHomeMapper.findOutHomeList(outHomeBean);
        List<OutHomeBean> outHomeList = outHomeMapper.findOutHomeListPage(currPage,pageSize,outHomeBean);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,outHomeList,currPage,pageSize,totalPage);
    }
}
