package com.jk.entity;

import lombok.Data;

@Data
public class LeaveBean {
    private Integer leaveId;
    private String leaveTime;
    private String leaveBecause;
    private String leaveEmpname;
    private Integer leaveEmpsex;
    private Integer leaveEmpage;
    private Integer leaveStatus;
}
