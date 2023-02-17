package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User adam = new Millennials("Adam Smith");
        User john = new YGeneration("John Nowak");
        User pablo = new ZGeneration("Pablo Alvaro");

        //When
        String adamChooses = adam.sharePost();
        System.out.println("Adam chooses: " + adamChooses);
        String johnChooses = john.sharePost();
        System.out.println("John chooses: " + johnChooses);
        String pabloChooses = pablo.sharePost();
        System.out.println("Pablo chooses: " + pabloChooses);

        //Then
        assertEquals("Twitter" , pabloChooses);
        assertEquals("Snapchat" , johnChooses);
        assertEquals("Facebook" , adamChooses);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User adam = new Millennials("Adam Smith");

        //When
        String adamChooses = adam.sharePost();
        System.out.println("Adam chooses: " + adamChooses);
        adam.setSocialPublisher(new TwitterPublisher());
        adamChooses = adam.sharePost();
        System.out.println("Adam chooses: " + adamChooses);

        //Then
        assertEquals("Twitter", adamChooses);
    }
}
