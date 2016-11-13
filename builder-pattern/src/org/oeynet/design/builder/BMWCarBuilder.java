package org.oeynet.design.builder;

import org.oeynet.design.builder.CarBuilder;
import org.oeynet.design.entity.CarEntity;

import java.awt.*;
import javax.swing.*;


public class BMWCarBuilder extends CarBuilder {
    private CarEntity car;
    private String iconPath = "";

    public BMWCarBuilder() {
        iconPath = this.getClass().getClassLoader().getResource("").getPath() + "bmw.jpg";
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
        this.carEntity.setName("I am BMW");
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

