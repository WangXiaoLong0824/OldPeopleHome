package com.jk.dao;

import com.jk.entity.Under;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UnderMapper {
    Long findPageUnderCount(Under under);

    List<Under> findPageUnder(Integer currPage, Integer pageSize, Under under);
    @Insert("insert into t_under values (#{underId},#{underName},#{createTime},#{endTime},#{oldId},#{roomId},#{underCom},#{underStatus})")
    void addUnder(Under under);
    @Update("update t_under set under_name=#{underName},create_time=#{createTime},end_time=#{endTime},old_id=#{oldId},room_id=#{roomId},under_com=#{underCom},under_status=#{underStatus} where under_id=#{underId}")
    void updateUnder(Under under);
    @Delete("delete from t_under where under_id=#{underId}")
    void deleteUnder(Integer underId);
    @Select("select a.*,b.old_name oldName,c.room_name roomName from t_under a,t_oldpeople b,t_room c\n" +
            " where a.old_id = b.old_id and \n" +
            "       a.room_id = c.room_id and under_id=#{underId}")
    Under findUnderById(Integer underId);
}
