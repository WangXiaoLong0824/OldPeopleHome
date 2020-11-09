package com.jk.controller;

import com.jk.entity.OrderBean;
import com.jk.entity.PageResult;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("order")
public class OrderController {
    @Resource
    private OldPeopleService oldPeopleService;
    //查询 t_order
    @RequestMapping("findOrderList")
    public PageResult findOrderList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize,  OrderBean order){
        return oldPeopleService.findOrderList(currPage,pageSize,order);
    }
    //删除
    @RequestMapping("deleteOrder")
    public void  deleteOrder(Integer id){
        oldPeopleService.deleteOrder(id);
    }
    //新增
    @RequestMapping("addOrder")
    public void addOrder(OrderBean order){
        oldPeopleService.addOrder(order);
    }
    //修改
    @RequestMapping("updateOrder")
    public void updateOrder(OrderBean order){
        oldPeopleService.updateOrder(order);
    }
    //回显
    @RequestMapping("selectOrderById")
    public OrderBean selectOrderById(Integer id){
        return   oldPeopleService.selectOrderById(id);
    }
}
