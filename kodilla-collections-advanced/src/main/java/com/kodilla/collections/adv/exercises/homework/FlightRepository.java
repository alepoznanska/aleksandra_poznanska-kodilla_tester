package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
      List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Poznań", "Barcelona"));
        flights.add(new Flight("Wrocław", "Londyn"));
        flights.add(new Flight("Warszawa", "Bruksela"));
        flights.add(new Flight("Poznań", "Bruksela"));
        flights.add(new Flight("Rzym", "Budapeszt"));
        flights.add(new Flight("Kraków", "Granada"));
        flights.add(new Flight("Aarhus", "Poznań"));
        flights.add(new Flight("Lille", "Gdynia"));
        flights.add(new Flight("Poznań", "Barcelona"));
        flights.add(new Flight("Poznań", "Londyn"));
        flights.add(new Flight("Poznań", "Bruksela"));
      return flights;
    }
}