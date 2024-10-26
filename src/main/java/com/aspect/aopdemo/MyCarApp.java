package com.aspect.aopdemo;

import com.aspect.aopdemo.entity.Car;
import com.aspect.aopdemo.entity.ErrorThrower;
import com.aspect.aopdemo.entity.SteeringWheel;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyCarApp {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);


//        Car car = context.getBean(Car.class);
//        car.setSteeringWheel(new SteeringWheel());
//        car.setColor("Black");
//        System.out.println(car.getColor());
        ;
        ErrorThrower errorThrower = context.getBean(ErrorThrower.class);

        try {
            errorThrower.error();
        } catch (Exception e){

        } finally {

            // close objects database connection, socket connection etc
        }
        context.close();
    }
}
