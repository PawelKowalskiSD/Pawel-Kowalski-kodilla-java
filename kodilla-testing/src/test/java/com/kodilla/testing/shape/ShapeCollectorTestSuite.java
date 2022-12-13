package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Figure tests")
    class  FigureTests {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("Square", 1);

            //When
            shapeCollector.addFigure(square);

            //Then
            shapeCollector.showFigure();
            assertEquals(square, shapeCollector.getFigure(0));
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle("Triangle", 1, 4);
            Circle circle = new Circle("Circle", 3);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);

            //When
            boolean result = shapeCollector.removeFigure(triangle);

            //Then
            shapeCollector.showFigure();
            assertTrue(result);
            assertEquals(circle, shapeCollector.getFigure(0));
        }

        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("Circle", 1);
            shapeCollector.addFigure(circle);

            //When
            Shape retrievedSharp;
            retrievedSharp = shapeCollector.getFigure(0);

            //Then
            shapeCollector.showFigure();
            assertEquals(circle, retrievedSharp);
        }
    }
}
