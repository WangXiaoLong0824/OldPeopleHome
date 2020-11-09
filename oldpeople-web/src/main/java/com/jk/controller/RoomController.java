package com.jk.controller;

import com.jk.entity.PageResult;
<<<<<<< HEAD
import com.jk.entity.Room;
=======
import com.jk.entity.RoomBean;
>>>>>>> 1665bfe85afa8ab31c0b0d54ec25d351924a0705
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("room")
public class RoomController {
<<<<<<< HEAD

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
=======
    @Resource
    private OldPeopleService oldPeopleService;
    //查询 t_room
    @RequestMapping("findRoomList")
    public PageResult findRoomList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize,  RoomBean room){
        return oldPeopleService.findRoomList(currPage,pageSize,room);
    }
    //删除
    @RequestMapping("deleteRoom")
    public void  deleteRoom(Integer id){
        oldPeopleService.deleteRoom(id);
    }
    //新增
    @RequestMapping("addRoom")
    public void addRoom(RoomBean room){
        oldPeopleService.addRoom(room);
    }
    //修改
    @RequestMapping("updateRoom")
    public void updateRoom(RoomBean room){
        oldPeopleService.updateRoom(room);
    }
    //回显
    @RequestMapping("selectRoomById")
    public RoomBean selectRoomById(Integer id){
        return   oldPeopleService.selectRoomById(id);
    }


>>>>>>> 1665bfe85afa8ab31c0b0d54ec25d351924a0705
}
