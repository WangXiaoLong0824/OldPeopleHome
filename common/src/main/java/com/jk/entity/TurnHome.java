package com.jk.entity;

import lombok.Data;

@Data
public class TurnHome {

    private Integer turnId;
    private String createTime;
    private String because;
    private Integer oldId;
    private Integer homeId;
    private Integer personId;
    private Integer dormId;
    private Integer roomId;
    private Integer storeyId;
    private String storeyName;
    private String roomName;
    private String dormName;
    private String oldName;
    private String homeName;
    private String personName;
    private String startTime;
    private String endTime;
}
