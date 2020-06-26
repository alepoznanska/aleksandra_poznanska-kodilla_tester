package com.kodilla.inheritance.homework;

public class Doors extends OperatingSystem {

    public Doors(int year) {
        super(year);
    }
    @Override
    public void turnOn () {
        System.out.println("Turning Doors on...");
    }

    @Override
    public void turnOff () {
        System.out.println("Turning Doors off...");
    }
}
