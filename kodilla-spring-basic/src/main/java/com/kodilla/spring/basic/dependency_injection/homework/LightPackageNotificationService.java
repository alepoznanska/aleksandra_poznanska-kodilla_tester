package com.kodilla.spring.basic.dependency_injection.homework;

public class LightPackageNotificationService implements NotificationService {

    @Override
    public void success(String address) {
        System.out.println("Light package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Light package not delivered to: " + address);
    }
}