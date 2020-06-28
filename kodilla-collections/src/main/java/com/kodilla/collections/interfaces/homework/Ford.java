package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed = (int) (speed * 1.2);
    }

    public void decreaseSpeed() {
        speed = (int) (speed / 2.6);
    }

    public double doRace(Car car){

        for (int i = 0; i < 3; i++) car.increaseSpeed();

        for (int i = 0; i < 2; i++) car.decreaseSpeed();

        return car.getSpeed();
    }
}