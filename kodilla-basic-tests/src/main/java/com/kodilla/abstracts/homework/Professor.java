package com.kodilla.abstracts.homework;

public class Professor extends Job {

    public Professor(int salary, String responsibilities) {
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