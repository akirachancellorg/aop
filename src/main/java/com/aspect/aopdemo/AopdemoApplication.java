package com.aspect.aopdemo;

import com.aspect.aopdemo.entity.Car;
import com.aspect.aopdemo.entity.SteeringWheel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopdemoApplication.class, args);

        Car car = new Car();

        car.setSteeringWheel(new SteeringWheel());

    }

}
