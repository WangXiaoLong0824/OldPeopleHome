package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.Top;
import com.jk.service.TopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TopController {
    private static final Logger logger = LoggerFactory.getLogger(TopController.class);

    @Resource
    private TopService topService;

    /*
    *   预约线上表分页 查询
    * */
    @RequestMapping("/findTop")
    public PageResult findTop(@RequestParam(value = "currPage",defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize, @RequestBody Top top){
        return topService.findTop(currPage,pageSize,top);
    }
    /*
    *   预约线上表新增
    * */
    @RequestMapping("/addTop")
    public void addTop(@RequestBody Top top){
        topService.addTop(top);
    }
    /*
    *   删除
    * */
    @RequestMapping("/delTop")
    public void delTop(@RequestParam Integer ids){
        topService.delTop(ids);
    }
}
