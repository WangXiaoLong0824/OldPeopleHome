package com.jk.dao;

import com.jk.entity.Emp;
import com.jk.entity.Emple;
import com.jk.entity.Position;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface EmpMapper {
    Long findPageEmpCount(Emp emp);

    List<Emp> findPageEmp(Integer currPage, Integer pageSize, Emp emp);
    @Insert("insert into t_emp values (#{empId},#{empName},#{empSex},#{empAge},#{empTell},now(),#{empleId},#{empThing},#{empLeave},#{empPosition},#{shengId},#{shiId},#{xianId})")
    void addEmp(Emp emp);
    @Update("update t_emp set emp_name=#{empName},emp_sex=#{empSex},emp_age=#{empAge},emp_tell=#{empTell},emp_time=#{empTime},emple_id=#{empleId},emp_thing=#{empThing},emp_leave=#{empLeave},emp_position=#{empPosition},sheng_id=#{shengId},shi_id=#{shiId},xian_id=#{xianId} where emp_id=#{empId}")
    void updateEmp(Emp emp);
    @Delete("delete from t_emp where emp_id=#{empId}")
    void deleteEmp(Integer empId);
    @Select("select a.*,b.emple_name empleName,c.position_name positionName,e.province shengName,f.city shiName,g.area xianName from t_emp a , t_emple b,t_position c ,t_proence e ,t_city f, t_area g\n" +
            "  where a.emple_id = b.emple_id and \n" +
            "        a.emp_position = c.position_id and\n" +
            "        a.sheng_id = e.provinceid and \n" +
            "        a.shi_id = f.cityid and \n" +
            "        a.xian_id = g.areaid and a.emp_id=#{empId}")
    Emp findEmpById(Integer empId);
    @Select("select * from t_emple")
    List<Emple> getEmple();
    @Select("select * from t_position where emple_id=#{empleId}")
    List<Position> getPosition(Integer empleId);
}
