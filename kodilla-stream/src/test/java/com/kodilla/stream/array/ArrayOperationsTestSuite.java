package com.kodilla.stream.array;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Array operations")
public class ArrayOperationsTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    void testGetAverage() {
        //given
        int[] numbers = {1, 2, 3, 5, 6, 8, 12, 11, 15, 18, 12, 22, 66, 17, 19, 20, 23, 99, 77, 29};

        //when
        double result = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(23.25, result);
    }
}
