package com.jk.controller;

import com.jk.entity.HomeBean;
import com.jk.entity.OrderBean;
import com.jk.entity.PageResult;
import com.jk.service.OrderService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Resource
    private OrderService orderService;
    //查询 t_order
    @RequestMapping("findOrderList")
    public PageResult findOrderList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody OrderBean order){
        return orderService.findOrderList(currPage,pageSize,order);
    }
    //删除
    @RequestMapping("deleteOrder")
    public void  deleteOrder(@RequestParam Integer id){
        orderService.deleteOrder(id);
    }
    //新增
    @RequestMapping("addOrder")
    public void addOrder(@RequestBody OrderBean order){
        orderService.addOrder(order);
    }
    //修改
    @RequestMapping("updateOrder")
    public void updateOrder(@RequestBody OrderBean order){
        orderService.updateOrder(order);
    }
    //回显
    @RequestMapping("selectOrderById")
    public OrderBean selectOrderById(@RequestParam Integer id){
        return   orderService.selectOrderById(id);
    }
}
