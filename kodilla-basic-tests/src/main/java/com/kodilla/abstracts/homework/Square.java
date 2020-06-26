package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super(5, 0, 0);
    }

    @Override
    public void giveArea() {
        int area = (int) Math.pow(side, 2);
        System.out.println("Pole powierzchni kwadratu wynosi " + area);
    }

    @Override
    public void giveCircuit() {
        int circuit = 4 * side;
        System.out.println("Obwód kwadratu wynosi " + circuit);
    }
}