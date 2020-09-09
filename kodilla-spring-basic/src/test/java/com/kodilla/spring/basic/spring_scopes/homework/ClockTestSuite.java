package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldReturnTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Clock firstTime = context.getBean(Clock.class);
        Clock secondTime = context.getBean(Clock.class);
        Clock thirdTime = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstTime, secondTime);
        Assertions.assertNotEquals(firstTime, thirdTime);
        Assertions.assertNotEquals(secondTime, thirdTime);
    }
}