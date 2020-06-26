package com.kodilla.abstracts.homework;

public abstract class Shape {

    int side, height, radius;

    static final double PI = 3.14;

    public Shape(int side, int height, int radius) {
        this.side = side;
        this.height = height;
        this.radius = radius;
    }

    public abstract void giveArea();

    public abstract void givePerimeter();
 }