package com.kodilla.good.patterns.flightSearch;

public class FlightDto {

    private final Flight flight;

    private final boolean isFlight;

    public FlightDto(Flight flight, boolean isFlight) {
        this.flight = flight;
        this.isFlight = isFlight;
    }

    public Flight getFlight() {
        return flight;
    }

    public boolean isFlight() {
        return isFlight;
    }
}
