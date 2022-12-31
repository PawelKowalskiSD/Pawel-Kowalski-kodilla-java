package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> fly = new HashMap<>();
        fly.put("London", true);
        fly.put("Amsterdam", false);

        for(Map.Entry<String, Boolean> entry : fly.entrySet()) {
            if(entry.getValue() == true) {
                System.out.println(flight);
            }
                throw new RouteNotFoundException();
        }


//        if() {
//            System.out.println(flight);
//        } else {
//            throw new RouteNotFoundException();
//       }
    }
}
