package com.jk.dao;

import com.jk.entity.OldPeople;
import com.jk.entity.TbAreas;
import com.jk.entity.TbCities;
import com.jk.entity.TbProvinces;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OldPeopleMapper {
    Long findPageOldPeopleCount(OldPeople oldPeople);

    List<OldPeople> findPageOldPeople(Integer currPage, Integer pageSize, OldPeople oldPeople);
    @Insert("insert into t_oldpeople values(#{oldId},#{oldName},#{oldAge},#{oldSex},#{oldHobby},#{oldCard},#{oldPhone},#{oldIll},#{childrenId},#{shengId},#{shiId},#{xianId})")
    void addOldPeople(OldPeople oldPeople);
    @Delete("delete from t_oldpeople where old_id=#{oldId}")
    void deleteOldPeople(Integer oldId);
    @Select("select told.*,tp.province sheng,tc.city shi,ta.area xian,tu.user_name childrenName from t_oldpeople told,t_proence tp, t_city tc, t_area ta ,t_user tu\n" +
            "        where told.sheng_id = tp.provinceid and\n" +
            "        told.shi_id = tc.cityid and\n" +
            "        told.xian_id = ta.areaid and\n" +
            "        told.children_id = tu.user_id and told.old_id=#{oldId}")
    OldPeople findOlePeopleById(Integer oldId);
    @Update("update t_oldpeople set old_name=#{oldName},old_age=#{oldAge},old_sex=#{oldSex},old_hobby=#{oldHobby},old_card=#{oldCard},old_phone=#{oldPhone},old_ill=#{oldIll},sheng_id=#{shengId},children_id=#{childrenId},shi_id=#{shiId},xian_id=#{xianId} where old_id=#{oldId}")
    void updateOldPeople(OldPeople oldPeople);
    @Select("select * from tb_provinces")
    List<TbProvinces> getSheng();
    @Select("select * from tb_cities where provinceid=#{provinceid}")
    List<TbCities> findShi(String provinceid);
    @Select("select * from tb_areas where cityid=#{cityid}")
    List<TbAreas> findXian(String cityid);
}
