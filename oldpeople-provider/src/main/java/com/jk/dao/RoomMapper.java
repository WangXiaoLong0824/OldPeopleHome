package com.jk.dao;

import com.jk.entity.RoomBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoomMapper {
    Long findRoomList(@Param("room") RoomBean room);

    List<RoomBean> findRoomListPage(@Param("currPage") Integer currPage,@Param("pageSize") Integer pageSize,@Param("room") RoomBean room);

    void deleteRoom(Integer id);

    void addRoom(RoomBean room);

    void updateRoom(RoomBean room);

    RoomBean selectRoomById(Integer id);
}
