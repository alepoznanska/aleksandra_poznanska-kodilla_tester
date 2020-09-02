package com.kodilla.spring.basic.dependency_injection.homework;

public class HeavyPackageNotificationService implements NotificationService {

    @Override
    public void success(String address) {
        System.out.println("Heavy package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Heavy package not delivered to: " + address);
    }
}