package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;


public class School {
    private List<Double> numberOfStudentsInClasses = new ArrayList<>();

    public School(double... classes) {
        for(double school : classes)
            this.numberOfStudentsInClasses.add(school);
    }

    public double getSum() {
        double sum = 0.0;
        for(double studentsInClass : numberOfStudentsInClasses)
            sum += studentsInClass;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "classes=" + numberOfStudentsInClasses + '}';
    }
}