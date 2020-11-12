package com.jk.entity;

import lombok.Data;

@Data
public class TurnHome {

    private Integer oId;
    private String createTime;
    private String because;

    private Integer oldId;
    private Integer homeId;
    private Integer personId;

    private String oldName;
    private String homeName;
    private String personName;
}
