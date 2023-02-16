package com.kodilla.good.patterns.flightSearch;

public class App {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        System.out.println(flightFinder.flightFinderFrom("WAW"));
        System.out.println(flightFinder.flightFinderTo("MAD"));
        System.out.println(flightFinder.flightFinderThrough("ZRH", "EIN", "KRK"));
    }
}
