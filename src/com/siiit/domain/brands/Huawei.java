package com.siiit.domain.brands;

import com.siiit.domain.phone.Phone;

public abstract class Huawei extends Phone {
    public Huawei(String color, String material) {
        super(color, material);
    }


    public int drainBattery(int batteryLife){

        return batteryLife - 3;

    }
    @Override
    public int drainBatteryLife4Message(){
        return 2;
    }
    @Override
    public int drainBatteryLife4Calls(){
        return 3;
    }

}
