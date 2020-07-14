package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> education = new HashMap<>();
        Principal john = new Principal("John Johnson", "Harvard");
        Principal jessie = new Principal("Jessie James", "Princeton");
        Principal bart = new Principal("Bart Simpson", "Brown");

        School johnSchool = new School(31, 44, 56, 70, 12);
        School jessieSchool = new School(32, 14, 52, 20);
        School bartSchool = new School(35, 23, 54, 19);

        education.put(john, johnSchool);
        education.put(jessie, jessieSchool);
        education.put(bart, bartSchool);

        for(Map.Entry<Principal, School> principalSchoolEntry : education.entrySet())
            System.out.println(principalSchoolEntry.getKey().getFullName() + "'s school (" + principalSchoolEntry.getKey().getSchoolName() + ") has " + principalSchoolEntry.getValue().getSum() + " students.");
    }
}