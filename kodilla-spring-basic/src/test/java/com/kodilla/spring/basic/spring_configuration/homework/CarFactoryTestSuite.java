package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
public class CarFactoryTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");

    @Test
    public void shouldReturnCorrectCar() {
        Car sedan1 = (Car) context.getBean("chooseCarForSeason", "spring");
        Car sedan2 = (Car) context.getBean("chooseCarForSeason", "fall");
        Car cabrio = (Car) context.getBean("chooseCarForSeason", "summer");
        Car suv = (Car) context.getBean("chooseCarForSeason", "winter");
        String suvType = suv.carType();
        String cabrioType = cabrio.carType();
        String sedanType1 = sedan1.carType();
        String sedanType2 = sedan2.carType();
        Assertions.assertEquals("SUV", suvType);
        Assertions.assertEquals("Cabrio", cabrioType);
        Assertions.assertEquals("Sedan", sedanType1);
        Assertions.assertEquals("Sedan", sedanType2);
    }

    @Test
    public void shouldReturnLightsOff() {
        Car suv = (Car) context.getBean("chooseCarForSeason", "winter");
        boolean time = suv.hasHeadLightsTurnedOn();
        LocalTime now = LocalTime.now();
        if (now.isAfter(LocalTime.of(19, 59)) || now.isBefore(LocalTime.of(6, 0))) {
            Assertions.assertTrue(time);
        } else {
            Assertions.assertFalse(time);
        }
    }
}