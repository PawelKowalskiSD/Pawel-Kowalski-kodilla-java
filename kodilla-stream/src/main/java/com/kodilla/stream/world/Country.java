package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;
    private final BigDecimal people;

    public Country(String countryName, BigDecimal people) {
        this.countryName = countryName;
        this.people = people;
    }

    public BigDecimal getPeopleQuantity() {
        return people;
    }
}
