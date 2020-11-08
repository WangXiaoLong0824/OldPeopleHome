package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.Room;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("room")
public class RoomController {

    @Resource
    private OldPeopleService oldPeopleService;

    @RequestMapping("findRoomPage")
    public PageResult findRoomPage(@RequestParam(value="currPage",defaultValue = "1") Integer currPage, @RequestParam(value="pageSize",defaultValue = "10") Integer pageSize, Room room){
        return oldPeopleService.findRoomPage(currPage,pageSize,room);
    }

    @RequestMapping("addRoom")
    public void addRoom(Room room){
        oldPeopleService.addRoom(room);
    }

    @RequestMapping("deleteByRoomId")
    public void deleteByRoomId(Integer roomId){
        oldPeopleService.deleteByRoomId(roomId);
    }

    @RequestMapping("findRoomById")
    public Room findRoomById(Integer roomId){
        return oldPeopleService.findRoomById(roomId);
    }
}
