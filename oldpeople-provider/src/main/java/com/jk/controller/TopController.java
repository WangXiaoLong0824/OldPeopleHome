package com.jk.controller;

import com.jk.config.PageResult;
import com.jk.entity.Top;
import com.jk.service.TopService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TopController {
        @Resource
    private TopService topService;

    /*
    *   预约线上表分页 查询
    * */
    @RequestMapping("/findTop")
    public PageResult findTop(@RequestParam Integer currPage, @RequestParam Integer pageSize,@RequestBody Top top){
        return topService.findTop(currPage,pageSize,top);
    }
    /*
    *   预约线上表新增
    * */
    @RequestMapping("/addTop")
    public void addTop(@RequestBody Top top){
        topService.addTop(top);
    }
}
