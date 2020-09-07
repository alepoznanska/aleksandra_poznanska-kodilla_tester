package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FedExDeliveryService implements DeliveryService {

    public boolean deliverPackage(String address, double weight) {
        if (address != null && !address.trim().isEmpty()) {
            if (weight > 20) {
                return false;
            } else return weight != 0;
        }
        return false;
    }
}