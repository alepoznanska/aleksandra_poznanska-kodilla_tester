package com.kodilla.inheritance.homework;

public class OperatingSystemApplication {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1999);
        displayInfoAboutOperatingSystem(operatingSystem);
        Windows windows = new Windows(2010);
        displayInfoAboutOperatingSystem(windows);
        Doors doors = new Doors(2020);
        displayInfoAboutOperatingSystem(doors);
    }
    private static void displayInfoAboutOperatingSystem(OperatingSystem operatingSystem) {
        operatingSystem.turnOn();
        operatingSystem.displayYearOfProduction();
        operatingSystem.turnOff();
    }
}