package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    public Triangle() {
        super(6, 8, 6);
    }

    @Override
    public void giveArea() {
        int area = a * h / 2;
        System.out.println("Pole powierzchni trójkąta wynosi " + area);
    }

    @Override
    public void giveCircuit() {
        int circuit = a * 3;
        System.out.println("Obwód trójkąta wynosi " + circuit);
    }
}