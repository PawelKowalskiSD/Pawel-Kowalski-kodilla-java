package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void startProgram() {
        logger = new Logger();
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

    @Test
    void testGetLastLog() {
        //Given

        //When
        String lastLog = logger.getLastLog();
        System.out.println("Last log: " + lastLog);

        //Then
        assertEquals("Connected", lastLog);

    }
}
