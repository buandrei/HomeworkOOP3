package com.siiit.domain.models;

import com.siiit.domain.brands.Samsung;

import java.util.UUID;

public class SGalaxyS9 extends Samsung {
    public final String imei;

    public SGalaxyS9(){
        this("black","metal");
    }

    public SGalaxyS9(String color, String material) {
        super(color, material);
        this.imei = UUID.randomUUID().toString();
    }
}
