package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Actor actor = new Actor(55000, "acting");
        Professor professor = new Professor(12000, "teaching");
        Plumber plumber = new Plumber(7000, "fixing toilets and sinks");

        Person[] person = new Person[3];

        person[0] = new Person("Adam", 29, actor);
        person[1] = new Person("Henry", 55, professor);
        person[2] = new Person("Scott", 44, plumber);

        for (int i = 0; i < person.length; i++){
            person[i].showPersonDetails();
        }
    }
}