package com.graduate.museum.service;

import com.graduate.museum.entity.User;

import java.util.List;

public interface UserService {
    int register(String username, String password,String type);

    User login(String username, String password, String type);

    int getUserCount(String type);

    List<User> getUserInfoByPage(Integer offset, Integer pageSize);

    int updateAvatar(String avatar, long id);

    int updateUserInfo(String username, String sex, String age, String address, long id);
}
