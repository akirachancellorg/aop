package com.aspect.aopdemo.entity;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Car {
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    private String make = "Toyota";
    private String model = "LC300";
    private String variant = "Prado";
    private String color = "Blue";
    private Engine engine;
    private SteeringWheel steeringWheel;
    private Transmission transmission;

    public Car() {
        setEngine(new Engine());
        setSteeringWheel(new SteeringWheel());
        setTransmission(new Transmission());
    }
}
