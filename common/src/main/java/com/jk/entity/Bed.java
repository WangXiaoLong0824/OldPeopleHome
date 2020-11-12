package com.jk.entity;

import lombok.Data;

@Data
public class Bed {
    private Integer bedId;
    private Integer oldId;
    private Integer bedStatus;
    private Integer storeyId;
    private Integer roomId;
    private Integer personId;

    private String oldName;
    private String storeyName;
    private String roomName;
    private String personName;

}
