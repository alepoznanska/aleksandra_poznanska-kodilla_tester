package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Shape square = new Square(5);
        displayShapesParameters(square);
        Shape triangle = new Triangle(6, 5);
        displayShapesParameters(triangle);
        Shape circle = new Circle(7);
        displayShapesParameters(circle);
    }

    private static void displayShapesParameters(Shape shape) {
        shape.giveSurfaceArea();
        shape.givePerimeter();
    }
}