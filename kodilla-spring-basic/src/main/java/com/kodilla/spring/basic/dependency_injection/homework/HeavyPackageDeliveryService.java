package com.kodilla.spring.basic.dependency_injection.homework;

public class HeavyPackageDeliveryService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("This heavy package is too heavy");
            return false;
        }
        System.out.println("Delivering of the heavy package in progress...");
        return true;
    }
}