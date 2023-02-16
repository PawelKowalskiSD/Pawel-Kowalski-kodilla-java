package com.kodilla.good.patterns.flightSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    private final List<Flight> flightList = List.of(
            new Flight("WAW", "KRK"),
            new Flight("WAW", "ZRH"),
            new Flight("ZRH", "EIN"),
            new Flight("GDN", "WAW"),
            new Flight("WAW", "EIN"),
            new Flight("EIN", "KRK"),
            new Flight("EIN", "LAX"),
            new Flight("MAD", "ZRH"),
            new Flight("SOF", "MAD")
    );

    public List<Flight> flightFinderFrom(String from) {
        List<Flight> flightListFrom = flightList.stream()
                .filter(f -> f.getFrom().equals(from))
                .collect(Collectors.toList());
        return flightListFrom;
    }

    public List<Flight> flightFinderTo(String to) {
        List<Flight> flightListTo = flightList.stream()
                .filter(f -> f.getTo().equals(to))
                .collect(Collectors.toList());
        return flightListTo;
    }

    public List<Flight> flightFinderThrough(String from, String via, String to) {
        List<Flight> flightList1 = flightList.stream()
                .filter(f -> f.getTo().equals(to) && f.getFrom().equals(via))
                .toList();

        List<Flight> flightList2 = flightList.stream()
                .filter(f -> f.getFrom().equals(from) && f.getTo().equals(via))
                .toList();

        List<Flight> allPossibleFlight = new ArrayList<>();
            allPossibleFlight.addAll(flightList1);
            allPossibleFlight.addAll(flightList2);

        return allPossibleFlight;
    }
}
