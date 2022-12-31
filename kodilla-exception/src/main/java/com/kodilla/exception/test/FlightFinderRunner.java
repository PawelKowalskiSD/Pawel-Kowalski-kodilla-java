package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("London", "Paris"));
        } catch (RouteNotFoundException e) {
            System.out.println("Not found Flight");
        }
    }
}
