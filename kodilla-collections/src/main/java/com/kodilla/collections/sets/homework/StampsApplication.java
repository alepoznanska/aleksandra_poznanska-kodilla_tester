package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("stamp1", 2.0, 2.0, true));
        stamps.add(new Stamp("stamp2", 3.0, 4.0, false));
        stamps.add(new Stamp("stamp3", 4.5, 1.1, false));
        stamps.add(new Stamp("stamp1", 2.0, 2.0, true));
        stamps.add(new Stamp("stamp1", 2.0, 2.0, true));
        stamps.add(new Stamp("stamp4", 2.0, 2.0, true));
        stamps.add(new Stamp("stamp5", 4.0, 2.0, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}