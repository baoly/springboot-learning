package com.baoly.springbootmybatis;

import com.baoly.springbootmybatis.bean.Area;
import com.baoly.springbootmybatis.bean.User;
import com.baoly.springbootmybatis.mapper1.UserMapper;
import com.baoly.springbootmybatis.mapper2.AreaMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AreaMapper areaMapper;

    @Test
    void contextLoads() {
        List<User> allUsers = userMapper.getAllUsers();
        System.out.println(allUsers);
        List<Area> allAreas = areaMapper.getAllAreas();
        System.out.println(allAreas);
    }

}
