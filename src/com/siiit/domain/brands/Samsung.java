package com.siiit.domain.brands;

import com.siiit.domain.phone.Phone;


public abstract class Samsung  extends Phone {
    public Samsung(String color, String material) {
        super(color, material);
    }


    public int drainBattery(int batteryLife){

        return batteryLife - 2;

    }
    @Override
    public int drainBatteryLife4Message(){
        return 1;
    }

    @Override
    public int drainBatteryLife4Calls(){
        return 2;
    }

}
