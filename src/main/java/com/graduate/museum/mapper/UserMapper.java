package com.graduate.museum.mapper;

import com.graduate.museum.entity.User;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
    @Insert("insert into t_user(username,password,type)values(#{username},#{password},#{type})")
    int register(@Param(value = "username") String username, @Param(value = "password") String password, @Param(value = "type") String type);

    @Select("select * from t_user where username=#{username}and password=#{password}and type=#{type}")
    User login(@Param(value = "username") String username, @Param(value = "password") String password, @Param(value = "type") String type);

    @Select("select count(*) from t_user where type=#{type}")
    int getUserCount(@Param(value = "type") String type);

    @Select("select * from t_user where type=#{type} limit #{offset},#{pageSize}")
    List<User> getUserInfoByPage(@Param(value = "offset") Integer offset, @Param(value = "pageSize") Integer pageSize, @Param(value = "type") String type);

    @Update("update t_user set avatar =#{avatar} where id=#{id}")
    int updateAvatar(@Param(value = "avatar") String avatar, @Param(value = "id") long id);

    @Update("update t_user set username=#{username},sex=#{sex},age=#{age},address=#{address}where id=#{id}")
    int updateUserInfo(@Param(value = "username") String username, @Param(value = "sex") String sex, @Param(value = "age") String age, @Param(value = "address") String address, @Param(value = "id") long id);
}
