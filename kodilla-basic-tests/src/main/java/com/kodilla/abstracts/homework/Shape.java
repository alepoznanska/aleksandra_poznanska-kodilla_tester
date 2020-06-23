package com.kodilla.abstracts.homework;

public abstract class Shape {
    int a;
    int h;
    int r;
    static final double PI = 3.14;

    public Shape(int a, int h, int r) {
        this.a = a;
        this.h = h;
        this.r = r;
    }

    public abstract void giveArea();

    public abstract void giveCircuit();
 }