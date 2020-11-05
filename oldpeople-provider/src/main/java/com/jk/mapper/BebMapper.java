package com.jk.mapper;

import com.jk.entity.Bed;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BebMapper {
    Long findBedCount();

    List<Bed> findBed(Integer currPage, Integer pageSize);

    void addBed(Bed bed);

    void updateBed(Bed bed);

    void deleteBedById(Integer bedId);

    Bed findBedById(Integer bedId);
}
