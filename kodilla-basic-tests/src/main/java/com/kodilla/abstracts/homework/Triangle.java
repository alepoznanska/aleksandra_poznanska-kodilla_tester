package com.kodilla.abstracts.homework;

public class Triangle extends Shape{

    public Triangle() {
        super(4, 5, 0);
    }

    @Override
    public void giveArea() {
        int area = side * height / 2;
        System.out.println("Pole powierzchni trójkąta wynosi " + area);
    }

    @Override
    public void givePerimeter() {
        int perimeter = side * 3;
        System.out.println("Obwód trójkąta wynosi " + perimeter);
    }
}