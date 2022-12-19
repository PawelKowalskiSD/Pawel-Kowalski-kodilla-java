package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europa");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        Continent southAmerica = new Continent("South America");
        Country poland = new Country("Poland", new BigDecimal("38014000"));
        Country greatBritain = new Country("GreatBritain", new BigDecimal("67791400"));
        Country france = new Country("France", new BigDecimal("68305148"));
        Country brazil = new Country("Brazil", new BigDecimal("217240060"));
        Country argentina = new Country("Argentina", new BigDecimal("46245668"));
        Country peru = new Country("Peru", new BigDecimal("32275736"));
        Country china = new Country("China", new BigDecimal("1410539758"));
        Country russia = new Country("Russia", new BigDecimal("142010981"));
        Country tunisia = new Country("Tunisia", new BigDecimal("11896972"));
        Country ghana = new Country("Ghana", new BigDecimal("33107275"));
        europe.addCountry(poland);
        World world = new World();
        world.addContinent(europe);
        //When


        //Then


    }
}
