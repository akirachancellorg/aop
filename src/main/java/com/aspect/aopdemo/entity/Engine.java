package com.aspect.aopdemo.entity;

public class Engine {

    private String type = "V4";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    private int horsePower = 79;
}
