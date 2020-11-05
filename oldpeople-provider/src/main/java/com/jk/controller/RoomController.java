package com.jk.controller;

import com.jk.entity.HomeBean;
import com.jk.entity.PageResult;
import com.jk.entity.RoomBean;
import com.jk.service.HomeService;
import com.jk.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RoomController {
    @Resource
    private RoomService roomService;
    //查询 t_room
    @RequestMapping("findRoomList")
    public PageResult findRoomList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody RoomBean room){
        return roomService.findRoomList(currPage,pageSize,room);
    }
    //删除
    @RequestMapping("deleteRoom")
    public void  deleteRoom(@RequestParam Integer id){
        roomService.deleteRoom(id);
    }
    //新增
    @RequestMapping("addRoom")
    public void addRoom(@RequestBody RoomBean room){
        roomService.addRoom(room);
    }
    //修改
    @RequestMapping("updateRoom")
    public void updateRoom(@RequestBody RoomBean room){
        roomService.updateRoom(room);
    }
    //回显
    @RequestMapping("selectRoomById")
    public RoomBean selectRoomById(@RequestParam Integer id){
        return   roomService.selectRoomById(id);
    }


}
