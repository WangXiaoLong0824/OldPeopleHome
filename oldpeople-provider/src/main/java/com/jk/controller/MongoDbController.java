package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.service.MongoDbService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MongoDbController {
        @Resource
    private MongoDbService mongoDbService;
    private static final Logger logger = LoggerFactory.getLogger(MongoDbController.class);

    //系统日志分页查询
        @RequestMapping("/findLog")
        public PageResult findLog(@RequestParam Integer currPage,@RequestParam Integer pageSize){
            return mongoDbService.findLog(currPage,pageSize);
        }
}
