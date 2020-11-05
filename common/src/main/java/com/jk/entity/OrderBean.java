package com.jk.entity;

import lombok.Data;

@Data
public class OrderBean {
    private Integer orderId;
    private String orderName;
    private  String  orderTime;
    private  Integer   oldId;
    private  Integer   orderthingId;
    private   Integer   orderMoney;
    private   Integer orderqian;
    private   String orderthingname;

}
