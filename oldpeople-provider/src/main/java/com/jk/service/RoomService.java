package com.jk.service;

import com.jk.entity.PageResult;
<<<<<<< HEAD
import com.jk.entity.Room;

public interface RoomService {
    PageResult findRoomPage(Integer currPage, Integer pageSize, Room room);

    void addRoom(Room room);

    void deleteByRoomId(Integer roomId);

    Room findRoomById(Integer roomId);
=======
import com.jk.entity.RoomBean;

public interface RoomService {
    PageResult findRoomList(Integer currPage, Integer pageSize, RoomBean room);

    void deleteRoom(Integer id);

    RoomBean selectRoomById(Integer id);

    void addRoom(RoomBean room);

    void updateRoom(RoomBean room);
>>>>>>> 1665bfe85afa8ab31c0b0d54ec25d351924a0705
}
