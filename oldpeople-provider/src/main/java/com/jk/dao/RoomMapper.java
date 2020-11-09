package com.jk.dao;

import com.jk.entity.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoomMapper {
    Long findRoomCount(@Param("room")Room room);

    List<Room> findRoomPage(@Param("currPage") Integer currPage,@Param("pageSize")  Integer pageSize,@Param("room") Room room);

    void addRoom(Room room);

    void updateRoom(Room room);

    void deleteByRoomId(Integer roomId);

    Room findRoomById(Integer roomId);
}
