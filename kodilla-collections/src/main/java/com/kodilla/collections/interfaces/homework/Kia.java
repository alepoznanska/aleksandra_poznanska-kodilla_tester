package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {

    private int speed;

    public Kia(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed = (int) (speed * 1.6);
    }

    public void decreaseSpeed() {
        speed = (int) (speed / 2.5);
    }

    public double doRace(Car car){

        for (int i = 0; i < 3; i++) car.increaseSpeed();

        for (int i = 0; i < 2; i++) car.decreaseSpeed();

        return car.getSpeed();
    }
}