package com.jk.dao;

import com.jk.entity.OrderBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {
    Long findOrderList(@Param("order") OrderBean order);

    List<OrderBean> findOrderListPage(@Param("currPage") Integer currPage,@Param("pageSize") Integer pageSize,@Param("order") OrderBean order);

    void deleteOrder(Integer id);

    void addOrder(OrderBean order);

    void updateOrder(OrderBean order);

    OrderBean selectOrderById(Integer id);
}
