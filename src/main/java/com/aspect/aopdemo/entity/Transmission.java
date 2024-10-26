package com.aspect.aopdemo.entity;

public class Transmission {
    private String type = "automatic";  // manual or automatic

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type == "manual" ||  type == "automatic") {
            this.type = type;
        } else {
            setTypeAutomatic();
        }
    }

    public void setTypeAutomatic() {
        this.type = "automatic";
    }
}
