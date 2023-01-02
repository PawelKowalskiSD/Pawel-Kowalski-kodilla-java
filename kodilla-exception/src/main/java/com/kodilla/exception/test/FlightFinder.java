package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> fly = new HashMap<>();
        fly.put("Paris", true);
        fly.put("Lisbon", true);
        fly.put("Amsterdam", true);
        fly.put("Warsaw", false);
        fly.put("Moscow", false);
        fly.put("Madrid", true);

        if (fly.containsKey(flight.getArrivalAirport())) {
            return fly.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}
