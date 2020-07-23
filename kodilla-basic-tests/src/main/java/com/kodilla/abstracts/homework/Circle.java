package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double giveSurfaceArea() {
       surfaceArea = Math.PI * radius * radius;
       System.out.println("Pole powierzchni koła wynosi " + surfaceArea);
        return surfaceArea;
    }

    @Override
    public double givePerimeter () {
        perimeter = 2 * Math.PI * radius;
        System.out.println("Obwód koła wynosi " + perimeter);
        return perimeter;
    }
}