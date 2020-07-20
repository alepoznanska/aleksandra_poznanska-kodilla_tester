package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
     List<Flight> flights = FlightRepository.getFlightsTable();

    public void addFlight(String departure, String arrival) {
    flights.add(new Flight(departure, arrival));
    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightsFrom = new ArrayList<>();
        for(Flight departures : flights) {
            if (departures.getDeparture().equals(departure)) {
                flightsFrom.add(departures);
            }
        }
        return flightsFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightsTo = new ArrayList<>();
        for(Flight arrivals : flights) {
            if (arrivals.getArrival().equals(arrival)) {
                flightsTo.add(arrivals);
            }
        }
        return flightsTo;
    }

    public int size() {
        return flights.size();
    }
}