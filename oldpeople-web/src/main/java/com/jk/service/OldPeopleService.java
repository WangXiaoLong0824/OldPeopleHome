package com.jk.service;

import com.jk.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "oldpeople-provider")
public interface OldPeopleService {
    //老人基本信息  WXL
    @RequestMapping("findPageOldPeople")
    public PageResult findPageOldPeople(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody OldPeople oldPeople);
    @RequestMapping("addOldPeople")
    public void addOldPeople(@RequestBody OldPeople oldPeople);
    @RequestMapping("deleteOldPeople")
    public void deleteOldPeople(@RequestParam Integer oldId);
    @RequestMapping("findOlePeopleById")
    public OldPeople findOlePeopleById(@RequestParam  Integer oldId);

    //员工基本信息  WXL
    @RequestMapping("findPageEmp")
    public PageResult findPageEmp(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody  Emp emp);
    @RequestMapping("addEmp")
    public void addEmp(@RequestBody Emp emp);
    @RequestMapping("deleteEmp")
    public void deleteEmp(@RequestParam Integer empId);
    @RequestMapping("findEmpById")
    public Emp findEmpById(@RequestParam Integer empId);
    
    //员工绩效 WXL
    @RequestMapping("findPagePerformance")
    public PageResult findPagePerformance(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody  Performance performance);
    @RequestMapping("addPerformance")
    public void addPerformance(@RequestBody Performance performance);
    @RequestMapping("deletePerformance")
    public void deletePerformance(@RequestParam Integer performanceId);
    @RequestMapping("findPerformanceById")
    public Emp findPerformanceById(@RequestParam Integer performanceId);

    //线下访客登记 WXL
    @RequestMapping("findPageUnder")
    public PageResult findPageUnder(@RequestParam(value = "currPage", defaultValue = "1") Integer currPage, @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, @RequestBody  Under under);
    @RequestMapping("addUnder")
    public void addUnder(@RequestBody Under under);
    @RequestMapping("deleteUnder")
    public void deleteUnder(@RequestParam Integer underId);
    @RequestMapping("findUnderById")
    public Under findUnderById(@RequestParam Integer underId);

    //老人入住信息表 t_hoom wkp
    @RequestMapping("findHomeList")
    public PageResult findHomeList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody HomeBean homeBean);
    @RequestMapping("deleteHome")
    public void  deleteHome(Integer id);
    @RequestMapping("addHome")
    public void addHome(HomeBean homeBean);
    @RequestMapping("updateHome")
    public void updateHome(HomeBean homeBean);
    @RequestMapping("selectHomeById")
    public HomeBean selectHomeById(Integer id);

    //员工离职表 t_leave wkp
    @RequestMapping("findLeaveList")
    public PageResult findLeaveList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody LeaveBean leave);
    @RequestMapping("deleteLeave")
    public void  deleteLeave(Integer id);
    @RequestMapping("addLeave")
    public void addLeave(LeaveBean leave);
    @RequestMapping("updateLeave")
    public void updateLeave(LeaveBean leave);
    @RequestMapping("selectLeaveById")
    public HomeBean selectLeaveById(Integer id);

    //订单表 t_order wkp
    @RequestMapping("findOrderList")
    public PageResult findOrderList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody OrderBean order);
    @RequestMapping("deleteOrder")
    public void  deleteOrder(Integer id);
    @RequestMapping("addOrder")
    public void addOrder(OrderBean order);
    @RequestMapping("updateOrder")
    public void updateOrder(OrderBean order);
    @RequestMapping("selectOrderById")
    public OrderBean selectOrderById(Integer id);

    //老人退房登记表 t_outhome wkp
    @RequestMapping("findOutHomeList")
    public PageResult findOutHomeList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody OutHomeBean outHomeBean);
    @RequestMapping("deleteOutHome")
    public void  deleteOutHome(Integer id);
    @RequestMapping("addOutHome")
    public void addOutHome(OutHomeBean outHomeBean);
    @RequestMapping("updateOutHome")
    public void updateOutHome(OutHomeBean outHomeBean);
    @RequestMapping("selectOutHomeById")
    public HomeBean selectOutHomeById(Integer id);

    //房间表 t_room wkp
    @RequestMapping("findRoomList")
    public PageResult findRoomList(@RequestParam(value = "currPage",defaultValue = "1")Integer currPage, @RequestParam(value="pageSize",defaultValue="10") Integer pageSize, @RequestBody RoomBean room);
    @RequestMapping("deleteRoom")
    public void  deleteRoom(Integer id);
    @RequestMapping("addRoom")
    public void addRoom(RoomBean room);
    @RequestMapping("updateRoom")
    public void updateRoom(RoomBean room);
    @RequestMapping("selectRoomById")
    public RoomBean selectRoomById(Integer id);

    }
