package com.siiit.domain.models;

import com.siiit.domain.brands.Samsung;

import java.util.UUID;


public class SGalaxyS10 extends Samsung {

    public final String imei;

    public SGalaxyS10(){
        this("white","plastic");
    }

    public SGalaxyS10(String color, String material) {
        super(color, material);
        this.imei = UUID.randomUUID().toString();
    }

}
