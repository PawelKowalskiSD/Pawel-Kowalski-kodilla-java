package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            System.out.println(flightFinder.findFlight(new Flight("Lisbon", "Paris")));
            System.out.println(flightFinder.findFlight(new Flight("Lisbon", "Moscow")));
            System.out.println(flightFinder.findFlight(new Flight("Lisbon", "Warsaw")));
            System.out.println(flightFinder.findFlight(new Flight("Lisbon", "Amsterdam")));
            System.out.println(flightFinder.findFlight(new Flight("Lisbon", "London")));
        } catch (RouteNotFoundException e) {
            System.out.println("Not found Flight");
        }
    }
}
