package com.aspect.aopdemo.entity;

public class SteeringWheel {

    public boolean isHasPaddleShift() {
        return hasPaddleShift;
    }

    public void setHasPaddleShift(boolean hasPaddleShift) {
        this.hasPaddleShift = hasPaddleShift;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private boolean hasPaddleShift = false;
    private int size = 14; // inches
}
