package com.baoly.springbootmybatis.controller;

import com.baoly.springbootmybatis.bean.Area;
import com.baoly.springbootmybatis.bean.User;
import com.baoly.springbootmybatis.service.AreaService;
import com.baoly.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author baoly
 * @version 1.0
 * @date 2020/10/3 17:44
 * @description
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private AreaService areaService;

    @GetMapping("/allUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/allAreas")
    public List<Area> getAllAreas() {
        return areaService.getAllAreas();
    }

}
