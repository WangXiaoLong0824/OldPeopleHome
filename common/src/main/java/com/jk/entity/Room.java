package com.jk.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Room implements Serializable {

    private Integer roomId;
    private String roomName;
    private Integer cleanerId;
    private Integer typeId;
    private Integer dormId;
    private Integer storeyId;

    private String dormName;
    private String storeyName;
    private String typeName;
    private String empName;
}
