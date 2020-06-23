package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Shape square = new Square();
        shapes(square);
        Shape triangle = new Triangle();
        shapes(triangle);
        Shape circle = new Circle();
        shapes(circle);
    }

    private static void shapes(Shape circle) {
        circle.giveArea();
        circle.giveCircuit();
    }
}