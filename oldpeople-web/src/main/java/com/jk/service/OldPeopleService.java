package com.jk.service;

import com.jk.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "oldpeople-provider")
public interface OldPeopleService {
    //老人基本信息  WXL
    @RequestMapping("findPageOldPeople")
    public PageResult findPageOldPeople(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize, @RequestBody OldPeople oldPeople);
    @RequestMapping("addOldPeople")
    public void addOldPeople(@RequestBody OldPeople oldPeople);
    @RequestMapping("deleteOldPeople")
    public void deleteOldPeople(@RequestParam Integer oldId);
    @RequestMapping("findOlePeopleById")
    public OldPeople findOlePeopleById(@RequestParam  Integer oldId);

    //员工基本信息  WXL
    @RequestMapping("findPageEmp")
    public PageResult findPageEmp(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize, @RequestBody  Emp emp);
    @RequestMapping("addEmp")
    public void addEmp(@RequestBody Emp emp);
    @RequestMapping("deleteEmp")
    public void deleteEmp(@RequestParam Integer empId);
    @RequestMapping("findEmpById")
    public Emp findEmpById(@RequestParam Integer empId);
    //子女 WXL
    @RequestMapping("findChildren")
    public List<SysUser> findChildren(@RequestParam Integer userid);
    //员工绩效 WXL
    @RequestMapping("findPagePerformance")
    public PageResult findPagePerformance(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize, @RequestBody  Performance performance);
    @RequestMapping("addPerformance")
    public void addPerformance(@RequestBody Performance performance);
    @RequestMapping("deletePerformance")
    public void deletePerformance(@RequestParam Integer performanceId);
    @RequestMapping("findPerformanceById")
    public Performance findPerformanceById(@RequestParam Integer performanceId);
    //员工部门 WXL
    @RequestMapping("getEmple")
    public List<Emple> getEmple();
    //员工职位 WXL
    @RequestMapping("getPosition")
    public List<Position> getPosition(@RequestParam Integer empleId);

    //线下访客登记 WXL
    @RequestMapping("findPageUnder")
    public PageResult findPageUnder(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize, @RequestBody  Under under);
    @RequestMapping("addUnder")
    public void addUnder(@RequestBody Under under);
    @RequestMapping("deleteUnder")
    public void deleteUnder(@RequestParam Integer underId);
    @RequestMapping("findUnderById")
    public Under findUnderById(@RequestParam Integer underId);
<<<<<<< HEAD
   //地区 WXl
    @RequestMapping("getSheng")
    public List<TbProvinces> getSheng();
    @RequestMapping("findShi")
    public List<TbCities> findShi(@RequestParam String provinceid);
    @RequestMapping("findXian")
    public List<TbAreas> findXian(@RequestParam String cityid);




    //住宿楼 ww
    @RequestMapping("findDormPage")
    public PageResult findDormPage(@RequestParam(value="currPage",defaultValue = "1") Integer currPage,@RequestParam(value="pageSize",defaultValue = "10") Integer pageSize,@RequestBody Dorm dorm);
    @RequestMapping("addDorm")
    public String addDorm(@RequestBody Dorm dorm);
    @RequestMapping("deleteDormById")
    public String deleteDormById(@RequestParam Integer dormId);
    @RequestMapping("findDormById")
    public Dorm findDormById(@RequestParam Integer dormId);


    //老人缴费信息 ww
    @RequestMapping("findCarefulPage")
    public PageResult findCarefulPage(@RequestParam(value="currPage",defaultValue = "1") Integer currPage,@RequestParam(value="pageSize",defaultValue = "10") Integer pageSize,@RequestBody Careful careFul);
    @RequestMapping("addCareful")
    public String addCareful(@RequestBody Careful careful);
    @RequestMapping("deleteCarefulById")
    public String deleteCarefulById(@RequestParam Integer carefulId);
    @RequestMapping("findCarefulById")
    public Careful findCarefulById(@RequestParam Integer carefulId);

    //房间 ww
    @RequestMapping("findRoomPage")
    public PageResult findRoomPage(@RequestParam(value="currPage",defaultValue = "1") Integer currPage, @RequestParam(value="pageSize",defaultValue = "10") Integer pageSize,@RequestBody Room room);
    @RequestMapping("addRoom")
    public String addRoom(@RequestBody Room room);
    @RequestMapping("deleteByRoomId")
    public String deleteByRoomId(@RequestParam Integer roomId);
    @RequestMapping("findRoomById")
    public Room findRoomById(@RequestParam Integer roomId);
}
=======

    //老人入住信息表 t_hoom wkp
    @RequestMapping("findHomeList")
    public PageResult findHomeList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody HomeBean homeBean);
    @RequestMapping("deleteHome")
    public void  deleteHome(@RequestParam Integer id);
    @RequestMapping("addHome")
    public void addHome(@RequestBody HomeBean homeBean);
    @RequestMapping("updateHome")
    public void updateHome(@RequestBody HomeBean homeBean);
    @RequestMapping("selectHomeById")
    public HomeBean selectHomeById(@RequestParam Integer id);

    //员工离职表 t_leave wkp
    @RequestMapping("findLeaveList")
    public PageResult findLeaveList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody LeaveBean leave);
    @RequestMapping("deleteLeave")
    public void  deleteLeave(@RequestParam Integer id);
    @RequestMapping("addLeave")
    public void addLeave(@RequestBody LeaveBean leave);
    @RequestMapping("updateLeave")
    public void updateLeave(@RequestBody LeaveBean leave);
    @RequestMapping("selectLeaveById")
    public LeaveBean selectLeaveById(@RequestParam Integer id);

    //订单表 t_order wkp
    @RequestMapping("findOrderList")
    public PageResult findOrderList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody OrderBean order);
    @RequestMapping("deleteOrder")
    public void  deleteOrder(@RequestParam Integer id);
    @RequestMapping("addOrder")
    public void addOrder(@RequestBody OrderBean order);
    @RequestMapping("updateOrder")
    public void updateOrder(@RequestBody OrderBean order);
    @RequestMapping("selectOrderById")
    public OrderBean selectOrderById(@RequestParam Integer id);

    //老人退房登记表 t_outhome wkp
    @RequestMapping("findOutHomeList")
    public PageResult findOutHomeList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody OutHomeBean outHomeBean);
    @RequestMapping("deleteOutHome")
    public void  deleteOutHome(@RequestParam Integer id);
    @RequestMapping("addOutHome")
    public void addOutHome(@RequestBody OutHomeBean outHomeBean);
    @RequestMapping("updateOutHome")
    public void updateOutHome(@RequestBody OutHomeBean outHomeBean);
    @RequestMapping("selectOutHomeById")
    public OutHomeBean selectOutHomeById(@RequestParam Integer id);

    }
>>>>>>> 4fb2eab26575eadac0c951813ebd649c0ea94ea5
