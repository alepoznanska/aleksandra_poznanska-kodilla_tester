package com.kodilla.abstracts.homework;

public class Plumber extends Job {

    public Plumber(int salary, String responsibilities) {
        super(salary, responsibilities);
    }
    @Override
    public String showResponsibilities() {
        return responsibilities;
    }

    @Override
    public int showSalary() {
        return salary;
    }
}