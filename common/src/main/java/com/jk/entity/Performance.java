package com.jk.entity;

import lombok.Data;

@Data
public class Performance {
    private Integer performanceId;
    private Integer performanceWorkTime;
    private Integer performanceQuanQin;
    private Integer performanceLateTime;
    private Integer performanceEmpId;
    private String empName;
}
