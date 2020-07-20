package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    public void testAddFlight() {
    // given
    FlightFinder flightFinder = new FlightFinder();
    String departure = "Kraków";
    String arrival = "Warszawa";
    // when
    flightFinder.addFlight(departure, arrival);
    // then
    assertEquals(12, flightFinder.size());
}

    @Test
    public void testFindFlightsFrom() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightsFrom("Poznań");
        // then
        assertEquals(5, result.size());
    }

    @Test
    public void testFindFlightsTo() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightsTo("Bruksela");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warszawa", "Bruksela"));
        expectedList.add(new Flight("Poznań", "Bruksela"));
        expectedList.add(new Flight("Poznań", "Bruksela"));
        assertEquals(expectedList, result);
    }
}