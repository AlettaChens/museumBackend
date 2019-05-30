package com.graduate.museum.repo;

import com.graduate.museum.entity.User;
import com.graduate.museum.mapper.UserMapper;
import com.graduate.museum.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class UserRepo implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public int register(String username, String password, String type) {
        return userMapper.register(username, password, type);
    }

    @Override
    public User login(String username, String password, String type) {
        return userMapper.login(username, password, type);
    }

    @Override
    public int getUserCount(String type) {
        return userMapper.getUserCount(type);
    }

    @Override
    public List<User> getUserInfoByPage(Integer offset, Integer pageSize) {
        return userMapper.getUserInfoByPage((offset - 1) * pageSize, pageSize,"游客");
    }

    @Override
    public int updateAvatar(String avatar, long id) {
        return userMapper.updateAvatar(avatar, id);
    }

    @Override
    public int updateUserInfo(String username, String sex, String age, String address, long id) {
        return userMapper.updateUserInfo(username, sex, age, address, id);
    }
}
