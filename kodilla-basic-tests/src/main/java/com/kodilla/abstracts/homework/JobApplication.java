package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.AnimalProcessor;

public class JobApplication {

    public static void main(String[] args) {

        Person adam = new Person("Adam", 55, "Plumber");
        Job plumber = new Plumber();

        adam.process(plumber);
    }
}