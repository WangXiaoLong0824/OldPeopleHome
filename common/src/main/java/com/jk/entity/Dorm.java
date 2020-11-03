package com.jk.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dorm implements Serializable {

    private Integer dormId;
    private String dormName;
    private Integer personId;
    private Integer storeyId;
}
