package com.kodilla.good.patterns.flightSearch;

import java.util.HashMap;
import java.util.Map;

public class Flight {

    Map<String, String> flights;

    public Flight() {
        this.flights = new HashMap<>();
    }

    public Map<String, String> getFlights() {
        return flights;
    }
}
