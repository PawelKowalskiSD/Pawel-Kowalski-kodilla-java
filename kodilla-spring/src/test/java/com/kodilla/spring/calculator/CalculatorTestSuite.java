package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given

        //When
        double add = calculator.add(1,1);
        double sub = calculator.sub(2,1);
        double mul = calculator.mul(2,2);
        double div = calculator.div(4,2);

        //Then
        assertEquals(2, add);
        assertEquals(1, sub);
        assertEquals(4, mul);
        assertEquals(2, div);
    }
}
