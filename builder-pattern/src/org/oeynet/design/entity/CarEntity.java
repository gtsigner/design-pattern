package org.oeynet.design.entity;

import com.sun.jndi.toolkit.url.Uri;

import java.io.File;
import java.nio.file.Path;
import java.util.*;

public class CarEntity {
    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String iconPath) throws Exception {
        this.icon = iconPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public int getGearsType() {
        return gearsType;
    }

    public void setGearsType(int gearsType) {
        this.gearsType = gearsType;
    }

    //超过3个座位多收100块钱
    public float getTotalPrice() {
        float totalPrice = basePrice;
        if (bedCount >= 3) {
            totalPrice += (bedCount - 3) * 100;
        }
        return totalPrice;
    }

    public void setBasePrice(float price) {
        this.basePrice = price;
    }

    private String name;
    //座位数量
    private int bedCount;
    //档位种类
    private int gearsType;
    private float basePrice;
    private String icon;

    //手动挡
    public static final int GEARS_HAND = 1;
    public static final int GEARS_AUTO = 2;


    public CarEntity() {
    }
}