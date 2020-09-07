package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FedExNotificationService implements NotificationService {


    public String success(String address) {
        return "Package delivered to: " + address + " by FedEx";
    }

    public String fail(String address) {
        return "Package not delivered to: " + address + " by FedEx";
    }
}
