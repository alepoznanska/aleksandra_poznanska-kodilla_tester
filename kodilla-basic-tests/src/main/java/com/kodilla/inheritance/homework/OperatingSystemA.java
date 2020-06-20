package com.kodilla.inheritance.homework;

public class OperatingSystemA extends OperatingSystem {
    public OperatingSystemA(int year) {
        super(year);
    }
    @Override
    public void turnOn () {
        System.out.println("Turning operating system A on...");
    }

    @Override
    public void turnOff () {
        System.out.println("Turning operating system A off...");
    }
}
