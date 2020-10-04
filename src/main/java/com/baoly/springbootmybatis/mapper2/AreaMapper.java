package com.baoly.springbootmybatis.mapper2;

import com.baoly.springbootmybatis.bean.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author baoly
 * @version 1.0
 * @date 2020/10/2 22:01
 * @description
 */
@Repository
public interface AreaMapper {
    List<Area> getAllAreas();
}
