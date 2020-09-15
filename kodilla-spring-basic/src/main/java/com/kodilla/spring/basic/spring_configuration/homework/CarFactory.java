package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CarFactory {

    Car car;


    @Bean
    @Scope("prototype")
    public Car chooseCarForSeason(String season) {

        switch (season) {
            case "spring":
            case "fall":
                car = new Sedan();
                break;
            case "summer":
                car = new Cabrio();
                break;
            case "winter":
                car = new SUV();
                break;
        }
        return car;
    }

    @Bean
    @Scope("prototype")
    public boolean areLightsOn(Car car) {
        return car.hasHeadLightsTurnedOn();
    }




//        if (season == "fall" || season == "spring") {
//            car = new Sedan();
//        } else if (season == "summer") {
//            car = new Cabrio();
//        } else if (season == "winter") {
//            car = new SUV();
//        } else {
//            return null;
//        }
//        return car;
}