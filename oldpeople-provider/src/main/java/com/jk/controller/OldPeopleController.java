package com.jk.controller;

import com.jk.entity.*;
import com.jk.service.OldPeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class OldPeopleController {
    private static final Logger logger = LoggerFactory.getLogger(OldPeopleController.class);

    @Resource
    private OldPeopleService oldPeopleService;
    @RequestMapping("findPageOldPeople")
    public PageResult findPageOldPeople(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody OldPeople oldPeople){
        return oldPeopleService.findPageOldPeople(currPage,pageSize,oldPeople);
    }
    @RequestMapping("addOldPeople")
    public void addOldPeople(@RequestBody OldPeople oldPeople){
        oldPeopleService.addOldPeople(oldPeople);
    }
    @RequestMapping("deleteOldPeople")
    public void deleteOldPeople(@RequestParam Integer oldId){
        oldPeopleService.deleteOldPeople(oldId);
    }
    @RequestMapping("findOlePeopleById")
    public OldPeople findOlePeopleById(@RequestParam  Integer oldId){
        return oldPeopleService.findOlePeopleById(oldId);
    }
    @RequestMapping("getSheng")
    public List<TbProvinces> getSheng(){
        return oldPeopleService.getSheng();
    }
    @RequestMapping("findShi")
    public List<TbCities> findShi(@RequestParam String provinceid){
        return oldPeopleService.findShi(provinceid);
    }
    @RequestMapping("findXian")
    public List<TbAreas> findXian(@RequestParam String cityid){
        return oldPeopleService.findXian(cityid);
    }
    @RequestMapping("findChildren")
    public List<SysUser> findChildren(@RequestParam Integer userid){
        return  oldPeopleService.findChildren(userid);
    }
}
