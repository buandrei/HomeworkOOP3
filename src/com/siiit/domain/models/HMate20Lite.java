package com.siiit.domain.models;

import com.siiit.domain.brands.Huawei;

import java.util.UUID;

public class HMate20Lite extends Huawei {
    public final String imei;

    public HMate20Lite(){
        this("black","plastic");
    }

    public HMate20Lite(String color, String material) {
        super(color, material);
        this.imei = UUID.randomUUID().toString();
    }
}
