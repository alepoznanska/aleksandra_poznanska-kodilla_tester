package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldDeliverPackageWhenWeightIsBelow20() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        FedExDeliveryService bean = context.getBean(FedExDeliveryService.class);
        boolean delivery = bean.deliverPackage("Washington st. 654", 10);
        Assertions.assertTrue(delivery);
    }

    @Test
    public void shouldNotDeliverPackageWhenWeightIsAbove20() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        FedExDeliveryService bean = context.getBean(FedExDeliveryService.class);
        boolean delivery = bean.deliverPackage("address", 345);
        Assertions.assertFalse(delivery);
    }

    @Test
    public void shouldSendSuccessMessageWhenTheDeliverySucceeded(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        FedExNotificationService bean = context.getBean(FedExNotificationService.class);
        String successMessage = bean.success("sample address");
        Assertions.assertEquals("Package delivered to: sample address by FedEx", successMessage);
    }

    @Test
    public void shouldNotSendSuccessMessageWhenTheDeliveryFailed() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        FedExNotificationService bean = context.getBean(FedExNotificationService.class);
        String successMessage = bean.fail("sample address");
        Assertions.assertNotEquals("Package delivered to: sample address by FedEx", successMessage);
    }

    @Test
    public void shouldSendFailMMessageWhenTheDeliveryFailed(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        FedExNotificationService bean = context.getBean(FedExNotificationService.class);
        String failMessage = bean.fail("sample address");
        Assertions.assertEquals("Package not delivered to: sample address by FedEx", failMessage);
    }

    @Test
    public void shouldNotSendFailMMessageWhenTheDeliverySucceded(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        FedExNotificationService bean = context.getBean(FedExNotificationService.class);
        String failMessage = bean.success("sample address");
        Assertions.assertNotEquals("Package not delivered to: sample address by FedEx", failMessage);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    public void shouldAssertFalseIfPackageNameIsMissing(String address) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        FedExDeliveryService bean = context.getBean(FedExDeliveryService.class);
        boolean delivery = bean.deliverPackage(address, 4);
        Assertions.assertFalse(delivery);
    }

    @Test
    public void shouldAssertFalseIfWeightIsZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        FedExDeliveryService bean = context.getBean(FedExDeliveryService.class);
        boolean delivery = bean.deliverPackage("address", 0);
        Assertions.assertFalse(delivery);
    }
}