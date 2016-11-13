package org.oeynet.design.builder;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.oeynet.design.entity.CarEntity;

import javax.swing.*;
import java.awt.*;


public class BenZCarBuilder extends CarBuilder {

    private String iconPath = "";

    public BenZCarBuilder() {
        iconPath = this.getClass().getClassLoader().getResource("").getPath() + "benz.jpg";
        System.out.println(iconPath);
    }


    @Override
    public CarEntity autoBuild() {
        this.carEntity = new CarEntity();
        this._buildFrameWork();
        this._buildIcon();
        this._buildBed();
        return carEntity;
    }

    //构造骨架
    public void _buildFrameWork() {
        this.carEntity.setName("I am benZ");
        System.out.println("build framework end");
        this.carEntity.setBasePrice(100000);
    }

    public void _buildIcon() {
        try {
            this.carEntity.setIcon(this.iconPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void _buildBed() {
        this.carEntity.setBedCount(4);
    }

}// end class

