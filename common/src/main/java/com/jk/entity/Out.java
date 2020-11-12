package com.jk.entity;

import lombok.Data;

@Data
public class Out {
    //老人外出登记详细信息表
    private Integer outId;

    private String gotime;

    private String cometime;

    private String outDetails;

    private String outName;

    private String userName;

}