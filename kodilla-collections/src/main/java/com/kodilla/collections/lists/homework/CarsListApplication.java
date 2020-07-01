package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Suzuki;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Suzuki> suzukis = new ArrayList<>();
        suzukis.add(new Suzuki(60));
        suzukis.add(new Suzuki(70));
        suzukis.add(new Suzuki(6560));
        suzukis.add(new Suzuki(89));

        suzukis.remove(3);
        suzukis.remove(new Suzuki(6560));

        System.out.println(suzukis.size());

        for(Suzuki suzuki : suzukis)
            System.out.println(suzuki + " changes speed to " + suzuki.doRace(suzuki));
    }
}