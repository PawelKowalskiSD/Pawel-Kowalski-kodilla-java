package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String continent;
    private final List<Country> countryCollection = new ArrayList<>();

    public Continent(String continent) {
        this.continent = continent;
    }

    public void addCountry(Country country) {
        countryCollection.add(country);
    }

    public List<Country> getCountryCollection() {
        return countryCollection;
    }
}
