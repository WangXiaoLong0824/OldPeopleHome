package com.jk.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Careful implements Serializable {

    private Integer carefulId;
    private Integer carefulSum;
    private Integer carefulCare;
    private Integer carefulRoom;
    private Integer carefulLeft;
    private Integer carefulType;
    private Integer oldId;

    private String oldManName;
}
