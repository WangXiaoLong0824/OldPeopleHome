package com.jk.service;

import com.jk.dao.RoomMapper;
import com.jk.entity.OutHomeBean;
import com.jk.entity.PageResult;
import com.jk.entity.RoomBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoomServiceImpl implements  RoomService {
    @Resource
    private RoomMapper roomMapper;

    @Override
    public PageResult findRoomList(Integer currPage, Integer pageSize, RoomBean room) {
        Long total = roomMapper.findRoomList(room);
        List<RoomBean> roomList = roomMapper.findRoomListPage(currPage,pageSize,room);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total,roomList,currPage,pageSize,totalPage);
    }

    @Override
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
    }
}
