package com.ly.dala.mapper;

import com.ly.dala.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HelloMapper {

    @Select("select * from user_info")
    User selectUserById(int id);
}
