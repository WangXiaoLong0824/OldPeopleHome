package com.jk.entity;

import lombok.Data;

@Data
public class Under {
    private Integer underId;
    private String underName;
    private String createTime;
    private String endTime;
    private Integer oldId;
    private Integer roomId;
    private String underCom;
    private String underStatus;

    private String oldName;
    private String roomName;

}
