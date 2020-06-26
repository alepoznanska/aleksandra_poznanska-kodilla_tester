package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    String job;

    public Person(String firstName, int age, String job) {
          this.firstName = firstName;
          this.age = age;
          this.job = job;

       }
    public void process(Job job) {
        System.out.println("Your job responsibilities include " + job.showResponsibilities());
    }
}