package com.jk.service;

import com.jk.entity.OrderBean;
import com.jk.entity.PageResult;

public interface OrderService {
    void deleteOrder(Integer id);

    PageResult findOrderList(Integer currPage, Integer pageSize, OrderBean order);

    void addOrder(OrderBean order);

    void updateOrder(OrderBean order);

    OrderBean selectOrderById(Integer id);
}
