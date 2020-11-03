package com.jk.entity;

import lombok.Data;

@Data
public class OrderBean {
    private Integer order_id;
    private String order_name;
    private  String  order_time;
    private  Integer   old_id;
    private  Integer   orderthing_id;
    private   Integer   order_money;
}
