package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> fly = new HashMap<>();
        fly.put("Paris", true);
        fly.put("Lisbon", true);
        fly.put("Amsterdam", true);

           for (Map.Entry<String, Boolean> entry : fly.entrySet())
               if (flight.getArrivalAirport().equals(entry.getKey())) {
                   System.out.println(entry.getValue() + entry.getKey());
               } else {
                 throw new RouteNotFoundException();
               }







//            fly.entrySet().stream()
//                    .filter(entry -> entry.getKey().equals(flight.getArrivalAirport()))
//                    .forEach(s -> System.out.println(s.getKey()));
//
//            throw new RouteNotFoundException();

    }
}
