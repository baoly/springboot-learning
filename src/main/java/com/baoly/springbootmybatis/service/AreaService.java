package com.baoly.springbootmybatis.service;

import com.baoly.springbootmybatis.bean.Area;
import com.baoly.springbootmybatis.mapper2.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author baoly
 * @version 1.0
 * @date 2020/10/4 17:12
 * @description
 */
@Service
public class AreaService {
    @Autowired
    private AreaMapper areaMapper;

    public List<Area> getAllAreas() {
        return areaMapper.getAllAreas();
    }

}
