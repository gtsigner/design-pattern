package org.oeynet.design.builder;

import org.oeynet.design.entity.CarEntity;

/**
 * 抽象建造者
 */
public abstract class CarBuilder {
    protected CarEntity carEntity;

    public abstract CarEntity autoBuild();

    public String getUserRequest() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name:").append(carEntity.getName()).append("\n");
        stringBuilder.append("BenCount:").append(carEntity.getName()).append("\n");
        String gearsType = "";
        if (carEntity.getGearsType() == CarEntity.GEARS_AUTO) {
            gearsType = "Auto Dang";
        }
        if (carEntity.getGearsType() == CarEntity.GEARS_HAND) {
            gearsType = "Hand Dang";
        }
        stringBuilder.append("DangType:").append(gearsType).append("\n");
        stringBuilder.append("NeedPrice:").append(carEntity.getTotalPrice()).append("\n");
        return stringBuilder.toString();
    }
}
