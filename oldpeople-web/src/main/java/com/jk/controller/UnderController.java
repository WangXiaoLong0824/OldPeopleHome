package com.jk.controller;

import com.jk.entity.OldPeople;
import com.jk.entity.PageResult;
import com.jk.entity.Room;
import com.jk.entity.Under;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("under")
public class UnderController {
    @Resource
    private OldPeopleService oldPeopleService;
    @RequestMapping("findPageUnder")
    public PageResult findPageUnder(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize, Under under){
        return oldPeopleService.findPageUnder(currPage,pageSize,under);
    }
    @RequestMapping("addUnder")
    public void addUnder(Under under){
        oldPeopleService.addUnder(under);
    }
    @RequestMapping("deleteUnder")
    public void deleteUnder(Integer underId){
        oldPeopleService.deleteUnder(underId);
    }
    @RequestMapping("findUnderById")
    public Under findUnderById(Integer underId){
        return oldPeopleService.findUnderById(underId);
    }
    @RequestMapping("getOld")
    public List<OldPeople> getOld( ){
        return oldPeopleService.getOld();
    }
    @RequestMapping("getRoom")
    public List<Room> getRoom( ){
        return oldPeopleService.getRoom();
    }
}
