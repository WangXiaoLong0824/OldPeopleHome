package com.jk.controller;

import com.jk.entity.*;
import com.jk.service.OldPeopleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("oldPeople")
public class OldPeopleController {
    @Resource
    private OldPeopleService oldPeopleService;
    @RequestMapping("findPageOldPeople")
    public PageResult findPageOldPeople(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize, OldPeople oldPeople){
        return oldPeopleService.findPageOldPeople(currPage,pageSize,oldPeople);
    }
    @RequestMapping("addOldPeople")
    public void addOldPeople(OldPeople oldPeople){
         oldPeopleService.addOldPeople(oldPeople);
    }
    @RequestMapping("deleteOldPeople")
    public void deleteOldPeople(Integer oldId){
         oldPeopleService.deleteOldPeople(oldId);
    }
    @RequestMapping("findOldPeopleById")
    public OldPeople findOlePeopleById(Integer oldId){
        return oldPeopleService.findOlePeopleById(oldId);
    }
    @RequestMapping("getSheng")
    public List<TbProvinces> getSheng(){
        return oldPeopleService.getSheng();
    }
    @RequestMapping("getSheng1")
    public List<TbProvinces> getSheng1(String provinceid){
        return oldPeopleService.getSheng1(provinceid);
    }
    @RequestMapping("findShi")
    public List<TbCities> findShi(String provinceid){
        return oldPeopleService.findShi(provinceid);
    }
    @RequestMapping("findXian")
    public List<TbAreas> findXian(String cityid){
        return oldPeopleService.findXian(cityid);
    }
    @RequestMapping("findChildren")
    public List<SysUser> findChildren(Integer userid){
        return oldPeopleService.findChildren(userid);
    }

    @RequestMapping("findChildrenAll")
    public List<SysUser> findChildrenAll(){
        return oldPeopleService.findChildrenAll();
    }

}
