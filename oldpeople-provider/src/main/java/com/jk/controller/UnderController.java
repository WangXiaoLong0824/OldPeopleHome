package com.jk.controller;

import com.jk.entity.OldPeople;
import com.jk.entity.PageResult;
import com.jk.entity.Room;
import com.jk.entity.Under;
import com.jk.service.UnderService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UnderController {
    @Resource
    private UnderService underService;
    @RequestMapping("findPageUnder")
    public PageResult findPageUnder(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize, @RequestBody Under under){
      return underService.findPageUnder(currPage,pageSize,under);
    }
    @RequestMapping("addUnder")
    public void addUnder(@RequestBody Under under){
        underService.addUnder(under);
    }
    @RequestMapping("deleteUnder")
    public void deleteUnder(@RequestParam Integer underId){
        underService.deleteUnder(underId);
    }
    @RequestMapping("findUnderById")
    public Under findUnderById(@RequestParam Integer underId){
      return underService.findUnderById(underId);
    }
    @RequestMapping("getOld")
    public List<OldPeople> getOld(){
        return underService.getOld();
    }
    @RequestMapping("getRoom")
    public List<Room> getRoom(){
        return underService.getRoom();
    }
}
