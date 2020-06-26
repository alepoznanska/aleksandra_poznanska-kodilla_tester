package com.kodilla.abstracts.homework;

public class JobApplication {

    public static void main(String[] args) {

        Person adam = new Person("Adam", 55, "Plumber");
        Job plumber = new Plumber();
        Job actor = new Actor();
        Job professor = new Professor();

        adam.process(plumber);
        adam.process(actor);
        adam.process(professor);
    }
}