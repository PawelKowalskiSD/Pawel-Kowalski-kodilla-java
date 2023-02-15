package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Logger test suite")
public class LoggerTestSuite {

    private static Logger logger;

    private static int count = 0;

    @BeforeAll
    public static void startProgram() {
        logger = Logger.LOG;
        logger.log("Starting program.....");
        logger.log("Please wait........");
        logger.log("It will take a few minutes");
        logger.log("Connected");
    }

    @AfterAll
    public static void closeProgram() {
        logger.log("closing the program....");
        logger.log("Please wait....");
        logger.log("Program closed");
    }

    @BeforeEach
    public void counter() {
        count++;
        System.out.println("\n=========================");
        System.out.println("Test nr " + count);
    }
    @AfterEach
    public void end() {
        System.out.println("=========================\n");
    }

    @Test
    @DisplayName("Test get last log")
    void testGetLastLog() {
        //Given

        //When
        String lastLog = logger.getLastLog();
        System.out.println("Last log: " + lastLog);

        //Then
        assertEquals("Connected", lastLog);

    }
}
