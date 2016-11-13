package org.oeynet.design.entity;

import org.oeynet.design.builder.CarBuilder;

/**
 * 指挥者
 */
public class CarDirector {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder builder) {
        this.carBuilder = builder;
    }


    public CarEntity buildCar() {
        return carBuilder.autoBuild();
    }
}




