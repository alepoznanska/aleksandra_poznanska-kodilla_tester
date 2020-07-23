package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double giveSurfaceArea() {
        surfaceArea = Math.pow(side, 2);
        System.out.println("Pole powierzchni kwadratu wynosi " + surfaceArea);
        return surfaceArea;
    }

    @Override
    public double givePerimeter() {
        perimeter = 4 * side;
        System.out.println("Obwód kwadratu wynosi " + perimeter);
        return perimeter;
    }
}