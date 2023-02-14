package com.kodilla.good.patterns.flightSearch;

import java.util.Objects;

public final class Town {

    private final String cityName;

    public Town(final String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Town town = (Town) o;

        return Objects.equals(cityName, town.cityName);
    }

    @Override
    public int hashCode() {
        return cityName != null ? cityName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return cityName;
    }
}
