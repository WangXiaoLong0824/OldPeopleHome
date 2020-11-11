package com.jk.service;

import com.jk.dao.RoomMapper;
import com.jk.entity.Careful;
import com.jk.entity.PageResult;
import com.jk.entity.Room;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService{
    private static final Logger logger = LoggerFactory.getLogger(RoomServiceImpl.class);


    @Resource
    private RoomMapper roomMapper;

    @Override
    public PageResult findRoomPage(Integer currPage, Integer pageSize, Room room) {
        Long total = roomMapper.findRoomCount(room);
        List<Room> roomList = roomMapper.findRoomPage(currPage,pageSize,room);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,roomList,currPage,pageSize,totalPage);
    }

    @Override
    public void addRoom(Room room) {
        if (room.getRoomId() == null){
            roomMapper.addRoom(room);
        }else{
            roomMapper.updateRoom(room);
        }
    }

    @Override
    public void deleteByRoomId(Integer roomId) {
        roomMapper.deleteByRoomId(roomId);
    }

    @Override
    public Room findRoomById(Integer roomId) {
        return roomMapper.findRoomById(roomId);
    }
}
