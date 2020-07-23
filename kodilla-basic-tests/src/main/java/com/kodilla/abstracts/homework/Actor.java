package com.kodilla.abstracts.homework;

public class Actor extends Job {

    public Actor(int salary, String responsibilities) {
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