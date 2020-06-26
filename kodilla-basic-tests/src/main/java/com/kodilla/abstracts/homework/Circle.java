package com.kodilla.abstracts.homework;

public class Circle extends Shape{

    public Circle() {
        super(0, 0, 10);
    }

    @Override
    public void giveArea() {
       double area = PI * radius * radius;
       System.out.println("Pole powierzchni koła wynosi " + area);
    }

    @Override
    public void givePerimeter() {
        double perimeter = 2 * PI * radius;
        System.out.println("Obwód koła wynosi " + perimeter);
    }
}