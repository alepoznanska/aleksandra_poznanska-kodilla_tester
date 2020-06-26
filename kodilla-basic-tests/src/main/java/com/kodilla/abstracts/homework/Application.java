package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Shape square = new Square();
        displayShapesParameters(square);
        Shape triangle = new Triangle();
        displayShapesParameters(triangle);
        Shape circle = new Circle();
        displayShapesParameters(circle);
    }

    private static void displayShapesParameters(Shape circle) {
        circle.giveArea();
        circle.givePerimeter();
    }
}