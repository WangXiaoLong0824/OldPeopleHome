package com.jk.dao;

import com.jk.entity.Bed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface BedMapper {
    Long findBedCount(@Param("bed")Bed bed);

    List<Bed> findBed(@Param("currPage") Integer currPage, @Param("pageSize")Integer pageSize,@Param("bed") Bed bed);

    void addBed(Bed bed);

    void updateBed(Bed bed);

    void deleteBedById(Integer bedId);

    Bed findBedById(Integer bedId);
}
