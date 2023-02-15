package com.kodilla.good.patterns.flightSearch;

import java.util.Map;
import java.util.stream.Collectors;

public class FlightRequest {

    private final  Flight flight;

    public FlightRequest(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public Flight departureSearch() {
       return null;


    }

    public Flight arrivalSearch() {
        return null;
    }
}
