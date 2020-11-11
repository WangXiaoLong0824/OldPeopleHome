package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.Under;
import com.jk.service.UnderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UnderController {
    private static final Logger logger = LoggerFactory.getLogger(UnderController.class);

    @Resource
    private UnderService underService;
    @RequestMapping("findPageUnder")
    public PageResult findPageUnder(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody Under under){
      return underService.findPageUnder(currPage,pageSize,under);
    }
    @RequestMapping("addUnder")
    public void addUnder(@RequestBody Under under){
        underService.addUnder(under);
    }
    @RequestMapping("deleteUnder")
    public void deleteUnder(@RequestParam Integer underId){
        underService.deleteUnder(underId);
    }
    @RequestMapping("findUnderById")
    public Under findUnderById(@RequestParam Integer underId){
      return underService.findUnderById(underId);
    }
}
