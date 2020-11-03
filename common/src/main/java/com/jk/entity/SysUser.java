package com.jk.entity;

import lombok.Data;

@Data
public class SysUser {

    private Integer userid;

    private String usercode;

    private String username;

    private String userpassword;

    private String salt;

}
