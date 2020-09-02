package com.kodilla.spring.basic.dependency_injection.homework;

public class LightPackageDeliveryService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 10) {
            System.out.println("Light package is too heavy");
            return false;
        }
        System.out.println("Delivering of the light package in progress...");
        return true;
    }
}
