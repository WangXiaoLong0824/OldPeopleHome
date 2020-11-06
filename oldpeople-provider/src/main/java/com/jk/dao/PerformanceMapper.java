package com.jk.dao;

import com.jk.entity.Performance;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PerformanceMapper {
    Long findPagePerformanceCount(Performance performance);

    List<Performance> findPagePerformance(Integer currPage, Integer pageSize, Performance performance);
    @Insert("insert into t_performance values(#{performanceId},#{performanceWorkTime},#{performanceQuanQin},#{performanceLateTime},#{performanceEmpId})")
    void addPerformance(Performance performance);
    @Update("update t_performance set performance_worktime=#{performanceWorkTime},performance_quanqin=#{performanceQuanQin},performance_latetime=#{performanceLateTime},performance_empid=#{performanceEmpId} where performance_id=#{performanceId}")
    void updatePerformance(Performance performance);
    @Delete("delete from t_performance where performance_id=#{performanceId}")
    void deletePerformance(Integer performanceId);
    @Select(" select a.*,b.emp_name empName from t_performance a,t_emp b" +
            "        where a.performance_empid = b.emp_id and a.performance_id=#{performanceId}")
    Performance findPerformanceById(Integer performanceId);
}
