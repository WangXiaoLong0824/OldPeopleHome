package com.jk.service;

import com.jk.dao.OrderMapper;
import com.jk.entity.OrderBean;
import com.jk.entity.OutHomeBean;
import com.jk.entity.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements  OrderService{
    private static final Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Resource
    private OrderMapper orderMapper;

    @Override
    public void deleteOrder(Integer id) {
        orderMapper.deleteOrder(id);   }

    @Override
    public PageResult findOrderList(Integer currPage, Integer pageSize, OrderBean order) {
        Long total = orderMapper.findOrderList(order);
        List<OrderBean> orderList = orderMapper.findOrderListPage(currPage,pageSize,order);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,orderList,currPage,pageSize,totalPage);
    }

    @Override
    public void addOrder(OrderBean order) {
        if(order.getOrderId()==null){
            orderMapper.addOrder(order);
        }else {
            orderMapper.updateOrder(order);
        }

    }

    @Override
    public void updateOrder(OrderBean order) {
        orderMapper.updateOrder(order);
    }

    @Override
    public OrderBean selectOrderById(Integer id) {
        return orderMapper.selectOrderById(id);
    }
}
