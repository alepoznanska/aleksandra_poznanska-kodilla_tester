package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    private int side;
    private int height;

    public Triangle(int side, int height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double giveSurfaceArea() {
        surfaceArea = (side * height) / 2;
        System.out.println("Pole powierzchni trójkąta wynosi " + surfaceArea);
        return surfaceArea;
    }

    @Override
    public double givePerimeter() {
        perimeter = side * 3;
        System.out.println("Obwód trójkąta wynosi " + perimeter);
        return perimeter;
    }
}