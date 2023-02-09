package com.kodilla.spring.calculator;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayName("Calculator test suite")
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\n Preparing to execute test #" + testCounter);
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Nested
    @DisplayName("Test calculations")
    class testCalculations {

        @Test
        void testAddingNumbers() {
            //Given

            //When
            System.out.println("Adding numbers: " );
            double add = calculator.add(1, 1);

            //Then
            assertEquals(2, add);
        }

        @Test
        void testSubtractingNumbers() {
            //Given

            //When
            System.out.println("Subtracting numbers: ");
            double sub = calculator.sub(2, 1);

            //Then
            assertEquals(1, sub);
        }

        @Test
        void testMultiplicationOfNumbers() {
            //Given

            //When
            System.out.println("Multiplication by 0: ");
            double mulBy0 = calculator.mul(2, 0);
            System.out.println("Multiplication by a number other than zero: ");
            double mul = calculator.mul(2, 6);

            //Then
            assertEquals(0, mulBy0);
            assertEquals(12, mul);
        }
        @Test
        void testDivisionOfNumbers() {
            //Given

            //When
            System.out.println("Division by zero: ");
            double divByZero = calculator.div(4, 0);
            System.out.println("Division by a number other than zero: ");
            double div = calculator.div(40, 5);
            System.out.println("Division zero by a number other than zero: ");
            double divZeroByNumbers = calculator.div(0, 5);

            //Then
            assertEquals(8, div);
            assertEquals(0, divZeroByNumbers);
            assertTrue(Double.isInfinite(divByZero));
            assertFalse(Double.isInfinite(divZeroByNumbers));
        }
    }
}
