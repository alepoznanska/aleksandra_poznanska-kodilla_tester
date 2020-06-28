package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Kia kia = new Kia(70);
        Ford ford = new Ford(80);
        Suzuki suzuki = new Suzuki(90);

        carParameters(kia, ford, suzuki);
    }

    private static void carParameters(Kia kia, Ford ford, Suzuki suzuki) {

        System.out.println("Ford hamuje do " + ford.doRace(ford) + " km/h.");
        System.out.println("Kia hamuje do " + kia.doRace(kia) + " km/h.");
        System.out.println("Suzuki hamuje do " + suzuki.doRace(suzuki) + " km/h.");
    }
}