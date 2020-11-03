package com.jk.dao;

import com.jk.entity.SysUser;
import com.jk.entity.Tree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShiroMapper {
    List<String> selectPowerKeyList(Integer id);
    @Select("select * from t_user where user_code=#{usercode}")
    SysUser selectUserInfoByCode(String usercode);

    List<Tree> selectTreeList(@Param("pid") Integer pid, @Param("userId") Integer userId);
}
