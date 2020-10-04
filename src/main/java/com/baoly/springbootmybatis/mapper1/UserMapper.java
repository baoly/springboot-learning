package com.baoly.springbootmybatis.mapper1;

import com.baoly.springbootmybatis.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author baoly
 * @version 1.0
 * @date 2020/10/2 21:58
 * @description
 */
@Repository
public interface UserMapper {
    List<User> getAllUsers();
}
