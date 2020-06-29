package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Suzuki;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Speed of the car: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Suzuki)
            return "Suzuki";
        else if (car instanceof Kia)
            return "Kia";
        else
            return "unknown car";
    }
}