package com.jk.entity;

import lombok.Data;

@Data
public class LeaveBean {
    private Integer leave_id;
    private String leave_time;
    private String leave_because;
    private String leave_empname;
    private Integer leave_empsex;
    private Integer leave_empage;
    private Integer leave_status;
}
