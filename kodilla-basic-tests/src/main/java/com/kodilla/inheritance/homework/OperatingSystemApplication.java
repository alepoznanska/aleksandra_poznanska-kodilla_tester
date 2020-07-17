package com.kodilla.inheritance.homework;

public class OperatingSystemApplication {

    public static void main(String[] args) {

    OperatingSystem operatingSystem = new OperatingSystem(1999);
    displayInfoAboutOperatingSystem(operatingSystem);

    Windows windows = new Windows();
    displayInfoAboutOperatingSystem(windows);

    Doors doors = new Doors();
    displayInfoAboutOperatingSystem(doors);
 }

    private static void displayInfoAboutOperatingSystem(OperatingSystem operatingSystem) {
        operatingSystem.turnOn();
        operatingSystem.displayYearOfProduction();
        operatingSystem.turnOff();
    }
}