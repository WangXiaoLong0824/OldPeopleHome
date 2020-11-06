package com.jk.dao;

import com.jk.entity.Careful;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarefulMapper {
    Long findCarefulCount(@Param("careFul") Careful careFul);

    List<Careful> findCarefulPage(@Param("currPage") Integer currPage,@Param("pageSize") Integer pageSize,@Param("careFul") Careful careFul);

    void addCareful(Careful careful);

    void updateCareful(Careful careful);

    void deleteCarefulById(Integer carefulId);

    Careful findCarefulById(Integer carefulId);
}
