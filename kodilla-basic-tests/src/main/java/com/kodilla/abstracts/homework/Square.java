package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super(7, 0, 0);
    }

    @Override
    public void giveArea() {
        int area = a * a;
        System.out.println("Pole powierzchni kwadratu wynosi " + area);
    }

    @Override
    public void giveCircuit() {
        int circuit = 4 * a;
        System.out.println("Obwód kwadratu wynosi " + circuit);
    }
}