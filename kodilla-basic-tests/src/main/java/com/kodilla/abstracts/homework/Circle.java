package com.kodilla.abstracts.homework;

public class Circle extends Shape{

    public Circle() {
        super(6, 6, 6);
    }

    @Override
    public void giveArea() {
       double area = PI * r * r;
       System.out.println("Pole powierzchni koła wynosi " + area);
    }

    @Override
    public void giveCircuit() {
        double circuit = 2 * PI * r;
        System.out.println("Obwód koła wynosi " + circuit);
    }
}