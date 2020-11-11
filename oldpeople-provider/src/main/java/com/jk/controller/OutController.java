package com.jk.controller;

import com.jk.entity.Out;
import com.jk.entity.PageResult;
import com.jk.service.OutService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OutController {
    private static final Logger logger = LoggerFactory.getLogger(OutController.class);

    @Resource
    private OutService outService;

    /*
    *  老人外出登记详细信息分页展示
    * */
    @RequestMapping("/findOut")
    public PageResult findOut(@RequestParam(value = "currPage",defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize, @RequestBody Out out){
        return outService.findOut(currPage,pageSize,out);
    }
    /*
    *   老人外出登记表新增数据
    * */
    @RequestMapping("/addOut")
    public void addOut(@RequestBody Out out){
        outService.addOut(out);
    }
    /*
    *   老人外出登记表回显数据
    * */
    @RequestMapping("/oneOut")
    public Out oneOut(@RequestParam Integer ids){
        return outService.oneOut(ids);
    }
    /*
    *   老人外出登记表单删
    * */
    @RequestMapping("/delOut")
    public void delOut(@RequestParam Integer ids){
        outService.delOut(ids);
    }
}
