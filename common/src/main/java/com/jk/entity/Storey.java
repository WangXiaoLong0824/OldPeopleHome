package com.jk.entity;

import lombok.Data;

@Data
public class Storey {
    private Integer storeyId;
    private String storeyName;
    private Integer roomId;
    private String roomName;
}
