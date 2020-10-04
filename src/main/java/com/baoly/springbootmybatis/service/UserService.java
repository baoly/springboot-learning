package com.baoly.springbootmybatis.service;

import com.baoly.springbootmybatis.bean.User;
import com.baoly.springbootmybatis.mapper1.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author baoly
 * @version 1.0
 * @date 2020/10/3 17:45
 * @description
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }
}
