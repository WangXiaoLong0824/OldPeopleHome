package com.jk.service;

import com.jk.dao.RoomMapper;
<<<<<<< HEAD
import com.jk.entity.Careful;
import com.jk.entity.PageResult;
import com.jk.entity.Room;
=======
import com.jk.entity.OutHomeBean;
import com.jk.entity.PageResult;
import com.jk.entity.RoomBean;
>>>>>>> 1665bfe85afa8ab31c0b0d54ec25d351924a0705
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
<<<<<<< HEAD
public class RoomServiceImpl implements RoomService{

=======
public class RoomServiceImpl implements  RoomService {
>>>>>>> 1665bfe85afa8ab31c0b0d54ec25d351924a0705
    @Resource
    private RoomMapper roomMapper;

    @Override
<<<<<<< HEAD
    public PageResult findRoomPage(Integer currPage, Integer pageSize, Room room) {
        Long total = roomMapper.findRoomCount(room);
        List<Room> roomList = roomMapper.findRoomPage(currPage,pageSize,room);
=======
    public PageResult findRoomList(Integer currPage, Integer pageSize, RoomBean room) {
        Long total = roomMapper.findRoomList(room);
        List<RoomBean> roomList = roomMapper.findRoomListPage(currPage,pageSize,room);
>>>>>>> 1665bfe85afa8ab31c0b0d54ec25d351924a0705
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,roomList,currPage,pageSize,totalPage);
    }

    @Override
<<<<<<< HEAD
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
=======
    public void deleteRoom(Integer id) {
        roomMapper.deleteRoom(id);
    }


    @Override
    public RoomBean selectRoomById(Integer id) {
        return roomMapper.selectRoomById(id);
    }

    @Override
    public void addRoom(RoomBean room) {
        roomMapper.addRoom(room);
    }

    @Override
    public void updateRoom(RoomBean room) {
        roomMapper.updateRoom(room);
>>>>>>> 1665bfe85afa8ab31c0b0d54ec25d351924a0705
    }
}
