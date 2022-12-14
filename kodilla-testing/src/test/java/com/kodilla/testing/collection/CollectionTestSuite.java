package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
        System.out.println("=================");
    }

    @AfterEach
    public void after() {
        System.out.println("=================");
        System.out.println("Test Case: end"  + "\n");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
        System.out.println("=================" + "\n");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("=================");
        System.out.println("Test Suite: end");
    }

    @DisplayName(" test empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> newEmptyList = new ArrayList<>();
        //When
        List<Integer> emptyList = oddNumbersExterminator.exterminate(newEmptyList);
        //Then
        System.out.println("Empty list is: " + emptyList.size());
        Assertions.assertTrue(emptyList.isEmpty());
    }

    @DisplayName("test checks the method whether it splits the numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> newList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("All number on the list: " + newList);
        //When
        List<Integer> evenNumbers = oddNumbersExterminator.exterminate(newList);
        //Then
        System.out.println("After filtering out the odd numbers: " + evenNumbers);
        Assertions.assertNotEquals(newList,evenNumbers);
        Assertions.assertNotSame(newList,evenNumbers);
        Assertions.assertEquals(evenNumbers, Arrays.asList(2, 4, 6, 8));
    }
}
