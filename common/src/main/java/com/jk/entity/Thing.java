package com.jk.entity;

import lombok.Data;

@Data
public class Thing {
    private Integer thingId;

    private String thingBecause;

    private String thingTime;

    private String thingCometime;

    private Integer empId;

    //员工姓名
    private String cname;
}