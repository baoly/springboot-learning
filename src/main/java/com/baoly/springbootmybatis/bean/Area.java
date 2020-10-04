package com.baoly.springbootmybatis.bean;

/**
 * @author baoly
 * @version 1.0
 * @date 2020/10/2 21:37
 * @description
 */
public class Area {
    private int id;
    private String areaName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", areaName='" + areaName + '\'' +
                '}';
    }
}
