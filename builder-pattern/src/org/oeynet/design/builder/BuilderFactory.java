package org.oeynet.design.builder;

import org.oeynet.design.entity.CarEntity;

/**
 * Created by zhaojunlike on 2016/11/13.
 */
public class BuilderFactory {
    public static CarBuilder getBuilder(String builderType) {
        CarBuilder builder = null;
        if (builderType.equals("BMW")) {
            builder = new BMWCarBuilder();
        } else if (builderType.equals("BENZ")) {
            builder = new BenZCarBuilder();
        }
        return builder;
    }

}
