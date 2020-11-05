package com.jk.service;

import com.jk.entity.SysUser;
import com.jk.entity.Tree;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(value = "shiro-provider")
public interface ShiroService {
    //shiro
    @RequestMapping("selectPowerKeyList")
    public List<String> selectPowerKeyList(@RequestParam Integer id);
    @RequestMapping("selectUserInfoByCode")
    public  SysUser selectUserInfoByCode(@RequestParam String usercode);
    @RequestMapping("selectTreeList")
    public List<Tree> selectTreeList(@RequestParam Integer id);
}
