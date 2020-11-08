package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.Room;

public interface RoomService {
    PageResult findRoomPage(Integer currPage, Integer pageSize, Room room);

    void addRoom(Room room);

    void deleteByRoomId(Integer roomId);

    Room findRoomById(Integer roomId);
}
