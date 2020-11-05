package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.RoomBean;

public interface RoomService {
    PageResult findRoomList(Integer currPage, Integer pageSize, RoomBean room);

    void deleteRoom(Integer id);

    RoomBean selectRoomById(Integer id);

    void addRoom(RoomBean room);

    void updateRoom(RoomBean room);
}
