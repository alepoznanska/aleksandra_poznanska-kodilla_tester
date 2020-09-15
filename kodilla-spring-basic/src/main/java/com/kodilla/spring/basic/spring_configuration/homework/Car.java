package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {
    LocalTime currentHour = LocalTime.now();

    default boolean hasHeadLightsTurnedOn() {
        return currentHour.isAfter(LocalTime.of(19, 59)) || currentHour.isBefore(LocalTime.of(6, 0));
    }

    String carType();
}