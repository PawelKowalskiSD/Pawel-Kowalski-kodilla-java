package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("Lisbon", "Paris"));
            flightFinder.findFlight(new Flight("Lisbon", "London"));
            flightFinder.findFlight(new Flight("London", "Amsterdam"));
            flightFinder.findFlight(new Flight("London", "Amsterdam"));
        } catch (RouteNotFoundException e) {
            System.out.println("Not found Flight");
        }
    }
}
