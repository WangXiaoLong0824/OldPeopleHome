package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.Room;
import com.jk.service.RoomService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RoomController {

    @Resource
    private RoomService roomService;

    @RequestMapping("findRoomPage")
    public PageResult findRoomPage(@RequestParam(value="currPage",defaultValue = "1") Integer currPage, @RequestParam(value="pageSize",defaultValue = "10") Integer pageSize,@RequestBody Room room){
        return roomService.findRoomPage(currPage,pageSize,room);
    }

    @RequestMapping("addRoom")
    public String addRoom(@RequestBody Room room){
        roomService.addRoom(room);
        return "success";
    }

    @RequestMapping("deleteByRoomId")
    public String deleteByRoomId(@RequestParam Integer roomId){
        roomService.deleteByRoomId(roomId);
        return "success";
    }

    @RequestMapping("findRoomById")
    public Room findRoomById(@RequestParam Integer roomId){
        return roomService.findRoomById(roomId);
    }
}
