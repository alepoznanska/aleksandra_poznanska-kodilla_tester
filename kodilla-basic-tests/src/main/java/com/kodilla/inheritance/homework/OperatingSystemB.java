package com.kodilla.inheritance.homework;

public class OperatingSystemB extends OperatingSystem {
    public OperatingSystemB(int year) {
        super(year);
    }
    @Override
    public void turnOn () {
        System.out.println("Turning operating system B on...");
    }

    @Override
    public void turnOff () {
        System.out.println("Turning operating system B off...");
    }
}
