package com.siiit.domain.models;

import com.siiit.domain.brands.Huawei;

import java.util.UUID;

public class HP30Pro extends Huawei {
    public final String imei;

    public HP30Pro(){
        this("black","plastic");
    }

    public HP30Pro(String color, String material) {
        super(color, material);
        this.imei = UUID.randomUUID().toString();
    }

}
