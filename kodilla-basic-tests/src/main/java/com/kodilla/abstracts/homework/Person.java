package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public int age;
    public Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showPersonDetails() {
        System.out.println("Name: " + firstName);
        System.out.println("Age: " + age);
        System.out.println("Responsibilities: " + job.showResponsibilities());
        System.out.println("Salary: " + job.showSalary());
        System.out.println("---------------------------------------------");
    }
}