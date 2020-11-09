package com.jk.dao;

<<<<<<< HEAD
import com.jk.entity.Room;
=======
import com.jk.entity.RoomBean;
>>>>>>> 1665bfe85afa8ab31c0b0d54ec25d351924a0705
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoomMapper {
<<<<<<< HEAD
    Long findRoomCount(@Param("room")Room room);

    List<Room> findRoomPage(@Param("currPage") Integer currPage,@Param("pageSize")  Integer pageSize,@Param("room") Room room);

    void addRoom(Room room);

    void updateRoom(Room room);

    void deleteByRoomId(Integer roomId);

    Room findRoomById(Integer roomId);
=======
    Long findRoomList(@Param("room") RoomBean room);

    List<RoomBean> findRoomListPage(@Param("currPage") Integer currPage,@Param("pageSize") Integer pageSize,@Param("room") RoomBean room);

    void deleteRoom(Integer id);

    void addRoom(RoomBean room);

    void updateRoom(RoomBean room);

    RoomBean selectRoomById(Integer id);
>>>>>>> 1665bfe85afa8ab31c0b0d54ec25d351924a0705
}
