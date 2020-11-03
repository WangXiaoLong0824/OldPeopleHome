package com.jk.service;

import com.jk.dao.HomeMapper;
import com.jk.entity.HomeBean;
import com.jk.entity.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {
    @Resource
    private HomeMapper homeMapper;

    @Override
    public PageResult findHomeList(Integer currPage, Integer pageSize, HomeBean homeBean) {
        Long total = homeMapper.findHomeList(homeBean);
        List<HomeBean> homeBeanList = homeMapper.findHomeListPage(currPage,pageSize,homeBean);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,homeBeanList,currPage,pageSize,totalPage);
    }

    @Override
    public void deleteHome(Integer id) {
        homeMapper.deleteHome(id);
    }

    @Override
    public void addHome(HomeBean homeBean) {
        homeMapper.addHome(homeBean);
    }

    @Override
    public void updateHome(HomeBean homeBean) {
        homeMapper.updateHome(homeBean);
    }

    @Override
    public HomeBean selectHomeById(Integer id) {
        return homeMapper.selectHomeById(id);
    }
}
