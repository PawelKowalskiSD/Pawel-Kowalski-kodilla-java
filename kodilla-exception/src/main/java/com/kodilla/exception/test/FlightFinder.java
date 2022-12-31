package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> fly = new HashMap<>();
       fly.put("Amsterdam", true);
        fly.put("Paris", true);

        for(Map.Entry<String, Boolean> entry : fly.entrySet()) {
            if(entry.getKey().equals(flight.getArrivalAirport())) {
                System.out.println(flight);
            }
                throw new RouteNotFoundException();
        }
    }
}
