package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.Performance;

public interface PerformanceService {
    PageResult findPagePerformance(Integer currPage, Integer pageSize, Performance performance);

    void addPerformance(Performance performance);

    void deletePerformance(Integer performanceId);

    Performance findPerformanceById(Integer performanceId);
}
