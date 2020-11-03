package com.jk.dao;

import com.jk.entity.Careful;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarefulMapper {
    Long findCarefulCount(Careful careFul);

    List<Careful> findCarefulPage(Integer currPage, Integer pageSize, Careful careFul);

    void addCareful(Careful careful);

    void updateCareful(Careful careful);

    void deleteCarefulById(Integer carefulId);

    Careful findCarefulById(Integer carefulId);
}
