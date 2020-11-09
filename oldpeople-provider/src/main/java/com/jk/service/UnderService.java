package com.jk.service;

import com.jk.entity.OldPeople;
import com.jk.entity.PageResult;
import com.jk.entity.Room;
import com.jk.entity.Under;

import java.util.List;

public interface UnderService {
    PageResult findPageUnder(Integer currPage, Integer pageSize, Under under);

    void addUnder(Under under);

    void deleteUnder(Integer underId);

    Under findUnderById(Integer underId);

    List<OldPeople> getOld();

    List<Room> getRoom();
}
