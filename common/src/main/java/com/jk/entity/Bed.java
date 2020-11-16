package com.jk.entity;

import lombok.Data;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import java.io.Serializable;

@Data
public class Bed implements Serializable  {
    private Integer bedId;
    private Integer oldId;
    private Integer bedStatus;
    private Integer storeyId;
    private Integer roomId;
    private Integer personId;
    private Integer dormId;
    private String oldName;
    private String storeyName;
    private String roomName;
    private String personName;
    private String dormName;
}
