package com.kodilla.inheritance.homework;

public class OperatingSystemApplication {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1999);
        shorter(operatingSystem);
        OperatingSystemA operatingSystemA = new OperatingSystemA(2010);
        shorter(operatingSystemA);
        OperatingSystemB operatingSystemB = new OperatingSystemB(2020);
        shorter(operatingSystemB);
    }
    private static void shorter(OperatingSystem operatingSystem) {
        operatingSystem.turnOn();
        operatingSystem.displayYearOfProduction();
        operatingSystem.turnOff();
    }
}