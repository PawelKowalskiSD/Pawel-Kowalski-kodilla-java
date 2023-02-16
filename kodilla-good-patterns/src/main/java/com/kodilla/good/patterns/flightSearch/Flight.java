package com.kodilla.good.patterns.flightSearch;

import java.util.Objects;

public class Flight {

    private final String from;
    private final String to;

    public Flight(String form, String to) {
        this.from = form;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!Objects.equals(from, flight.from)) return false;
        return Objects.equals(to, flight.to);
    }

    @Override
    public int hashCode() {
        int result = from != null ? from.hashCode() : 0;
        result = 31 * result + (to != null ? to.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "form='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
