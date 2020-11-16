package com.jk.dao;

import com.jk.entity.Bed;
import com.jk.entity.Dorm;
import com.jk.entity.Person;
import com.jk.entity.Storey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface BedMapper {
    Long findBedCount(@Param("bed")Bed bed);

    List<Bed> findBed(@Param("currPage") Integer currPage, @Param("pageSize")Integer pageSize,@Param("bed") Bed bed);

    void addBed(Bed bed);

    void updateBed(Bed bed);

    void deleteBedById(Integer bedId);

    Bed findBedById(Integer bedId);

    @Select("select * from t_dorm")
    List<Dorm> getDorm();
    @Select("select * from t_person")
    List<Person> getPerson();
    @Select("select * from t_storey")
    List<Storey> getStorey();
}
